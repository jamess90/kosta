use hr;

select * from employees;

#직원의 이름, 성, 급여, 입사일을 출력하시오
explain
SELECT first_name, last_name, salary, hire_date 
FROM employees
WHERE substring(last_name, 1, 2) = 'Ki';
#where last_name like 'Ki%';

CREATE index emp_last_first_idx
on employees(last_name, first_name);

#급여와 연봉, 커미션이 반영된 급여를 출력하시오
select last_name, first_name, salary, salary*12, commission_pct, 
      ifnull(commission_pct,0) 커미션, ((1+commission_pct)*salary*12) 커미션반영연봉
from employees;

#type을 맞춰야 한다. 달라도 문제되지 않을 때가 많지만
# 내부적인 형변환이 일어나므로 조심해야 한다.

select *
from employees
where employee_id = 100;

select *
from departments;

select *
from employees
where employee_id = 200;

select *
from employees;

#부서번호, 부서명, 부서장이름, 부서가 위치한 도시 이름을 출력하시오.


/*
	직원의 이름, 성, 급여, 입사일을 출력하시오
    단, 커미션을 받는 사원이어야 합니다.
    단, 2000년대 입사자여아 합니다.
    입사일이 빠른 순서로 정렬하시오.
    컬럼의 alias도 부여하시오.
*/

select first_name 이름, last_name 성, salary 연봉, hire_date 입사일
from employees
where commission_pct is not null and hire_date > '2000-01-01'
order by hire_date;


select *
from employees
where department_id = 100
order by employee_id;


select employee_id, salary, hire_date
from employees
where department_id = 100
group by department_id
having count(*) > 5
order by 2 desc;

# 문자열을 2번째 파라미터에서 지정한 위치부터 3번째 파라미터의 값의 갯수만큼 불러온다.
select substring('java programming', 1,8);		

select round(123.456);					#소숫점 자리를 버림
select round(123.456,2);				#소숫점 자리를 2번째 파라미터 다음 자리부터 버림

#1$ = 1150
select last_name, round(salary * 1150,-3) 원화급여
from employees
order by 2;


select salary
from employees;

# 입사 후 1000일 되는 날짜, 10주년 기념일, 20주년 기념 수상일을 출력하시오
# 20주년이 지난 다음 달 첫 월요일이 수상 기념일이다.

select first_name, last_name
	, date_format(hire_date, '%Y')
	, date_format(hire_date, '%M')
	, date_format(hire_date, '%D')
    , date_format(hire_date, '%Y-%M-%D')
from employees;

## date type ? varchar(8) '20170414'
#직원들의 성명과 입사일 및 급여, 입사후 몇주지났는지
 ####조건

 #성명은 빈칸을 기준으로 붙여서 출력
  #- Steven King 형태로 출력 O
#- 짝수일에 입사한 자 
#- 급여는 천원단위로 절사하고 천단위 콤마부여 O
#- 업무가 IT관련이어야 함 O
#- (20주년기념일자는 20주년후 다음달 첫 월요일)

#- 입사일은 04/14/2017형태로 출력하시오.round((salary*1150), -3) 급여
#select concat(first_name,' ', last_name) 성명, 
#date_format(hire_date, '%d-%m-%Y') 입사일, 
#format(round((salary*1150)), 0) 급여, round(datediff(now(), hire_date)/7, 0) '입사 후 흐른주', 
#round(datediff(now(), hire_date)/364.25, 2) '입사년차', 
#date_add(hire_date, interval +20 YEAR) '근속일자',
#ADDDATE( date_format(addate(hire_date, interval 20*12+1 month), '%Y/%m/01'), '입사20주년'
#from employees
#where job_id like 'IT%'
#MOD((9-DAYOFWEEK(date_format(adddate(hire_date, interval 241 month), '%Y/%m/01'))), 7) '입사 기념 월요일';

select concat(concat(first_name, ' '),last_name) as 이름,
       date_format(hire_date,'%d/%m/%y') as 입사일, 
       format(round(salary * 1150,-3),0) as 연봉,
       (to_days(current_date) - to_days(hire_date))/7 as "입사후 몇 주 지남",
       round((to_days(current_date) - to_days(hire_date))/364.25, 2) as 근속년수,
       date_format(date_add(hire_date, interval 20 year),'%d/%m/%y') as 20주년
     
from employees
where 1=1
      and date_format(hire_date,'%d')% 2 = 0  
      and job_id like 'IT%';



