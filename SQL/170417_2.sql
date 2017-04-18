# subquery
# steven, king이 근무하는 부서원의 정보를 출력

use hr;
desc departments;

select e.department_id
from employees e
where e.first_name = 'Steven' and e.last_name = 'king';

# 90번 부서에 있는 부서원
select e.first_name
from employees e
where e.department_id = (select e2.department_id
						from employees e2
						where e2.first_name = 'Steven' and e2.last_name = 'king');
                        
# 부서의 평균 급여보다 많은 급여를 받는 사원들의 성과 급여와 입사일을 출력하시오

select emp.first_name, round(emp.salary), emp.hire_date
from employees emp
where salary > (select avg(emp.salary)		# from절에서 선택한 row 내부의 부서번호에 해당하는 부서의 평균급여를 계산
				from employees emp			# correlated subquery 라고 한다.
				where department_id = emp.department_id); 

# 90번 부서의 평균 급여
select avg(emp.salary)
from employees emp
where department_id = 90;

# from절에 subquery를 써보자 - Inline view subquery
select employee_id, last_name, salary
from employees	join (	select department_id, avg(salary) dept_avg_sal
							from employees
							group by department_id) da using (department_id)
where salary > da.dept_avg_sal;
                
        
# 부서별 평균 급여
select department_id, avg(emp.salary) dept_avg_sal
from employees emp
group by department_id;



select * from employees;
select * from countries;
select * from regions;
select * from departments;
select * from locations;
select * from jobs;
select * from job_history;



# sales 부서에 소속 직원의 이름(first_name), 급여(salary), 부서이름(department_name),
# 직무명(job_name)을 조회하시오
# 단, 급여는 100번 부서의 평균보다 적게 받는 직원 정보만 출력되어야 합니다.

select	emp.first_name		as 이름,
		emp.salary			as 급여,
        dep.department_name	as 부서이름,
        job.job_title 		as 직업이름
        
from	employees emp, 
		departments dep, 
		jobs job
        
where	emp.salary < (	select avg(emp2.salary)
						from employees emp2
						where emp2.department_id = 100)
		and job.job_id = emp.job_id
		and dep.department_name = 'sales';


/*
한 번이라도 직무나 부서를 변경해본 적이 있는 사원들의 
이름, 현직무번호, 부서번호, 급여, 입사일을 출력하시오
*/
        
select	distinct
		emp.first_name 		as 이름, 
		emp.job_id 			as 현직무번호,
		emp.department_id 	as 부서번호,
        emp.salary 			as 급여,
        emp.hire_date 		as 입사일
        
from	employees emp
        
where	emp.employee_id in (select his.employee_id
							from job_history his);

# 누포스 코드
select e.first_name '이름', e.job_id '현직무번호', e.department_id '부서번호', e.salary '급여', e.hire_date '입사일'
from employees e
  join (select distinct employee_id from job_history
  ) jh using(employee_id);
#########################################
  
  
/*
급여등급별로 인원수를 출력함
4000미만은 초금, 7000미만은 중급, 10000미만은 고급, 10000초과는 특급
*/

select employee_id, salary
from employees;

# decode, case ~ end

select	employee_id, 
		salary,
	case when salary < 4000 then '초급'
		when salary < 7000 then '중급'
		when salary < 10000 then '고급'
		else '특급'
	end as 등급
from	employees;

select 등급, count(*)
from (select	employee_id, 
		salary,
	case when salary < 4000 then '초급'
		when salary < 7000 then '중급'
		when salary < 10000 then '고급'
		else '특급'
	end as 등급
from	employees) ta
group by 등급;

select	count(*),
	case when salary < 4000 then '초급'
		when salary < 7000 then '중급'
		when salary < 10000 then '고급'
		else '특급'
	end as 등급
from	employees
group by case when salary < 4000 then '초급'
		when salary < 7000 then '중급'
		when salary < 10000 then '고급'
		else '특급'
        end
order by case 등급 when '특급' then 1
				when '고급' then 2
				when '중급' then 3
				else 4
        end;

/*
	연도별 입사자 수와 평균급여를 출력하시오
*/

select	round(avg(salary),2) as 평균급여, 
		case when hire_date < 19880101 then '1987'
			when hire_date < 19890101 then '1988'
			when hire_date < 19900101 then '1989'
			when hire_date < 19910101 then '1990'
			when hire_date < 19920101 then '1991'
			when hire_date < 19930101 then '1992'
			when hire_date < 19940101 then '1993'
			when hire_date < 19950101 then '1994'
			when hire_date < 19960101 then '1995'
			when hire_date < 19970101 then '1996'
			when hire_date < 19980101 then '1997'
			when hire_date < 19990101 then '1998'
			when hire_date < 20000101 then '1999'
			else '2000'
		end 입사년도,
        count(*) as 입사자수
from employees
group by 입사년도;