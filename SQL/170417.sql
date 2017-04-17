select *
from employees;

select *
from departments D, employees E;

select count(*) from employees;

select count(*) from departments;

select 107*27;

select E.first_name, 
		E.last_name, 
		E.department_id, 
		D.department_name
from departments D, employees E
where E.department_id = D.department_id 
and E.first_name = 'Neena';

select E.first_name, 
		E.last_name, 
		E.department_id, 
		D.department_name
from employees E join departments D using(department_id);

select E.first_name, 
		E.last_name, 
		E.department_id, 
		D.department_name
from employees E join departments D on(E.department_id = D.department_id);

/*
사번, 성, 명, 입사일자, 부서명, 부서가 위치한 도시명, 나라명, 대룩이름을 출력하시오, (옵션 : 부서장명도 출력)
*/

select * from employees;
select * from countries;
select * from regions;
select * from departments;
select * from locations;

select E.employee_id as 사번, 
		E.last_name as 성, 
        E.first_name as 이름,
        E.hire_date as 입사일자,
        D.department_name as 부서명,
        E2.first_name as 부서장명,
        L.city as 부서가위치한도시명,
        C.country_name as 나라명,
        R.region_name as 대륙명
from departments D, 
		locations L, 
        employees E, 
        employees E2,
        regions R,
        countries C
where D.location_id = L.location_id
and D.department_id = E.department_id
and E2.employee_id = E.manager_id
and C.region_id = R.region_id
and L.country_id = C.country_id;

select e.first_name, 
		e.last_name, 
        e.hire_date, 
        d.department_name,
        l.city,
        c.country_name,
        r.region_name,
        m.first_name
from employees e
	join departments d using(department_id)
    join locations l using(location_id)
    join countries c using(country_id)
    join regions r using(region_id)
    join employees m on d.manager_id = m.employee_id;
    
select count(*)
from employees e join departments d
on e.department_id = d.department_id;

select *
from employees
where department_id is null;


select count(*), e.employee_id, e.department_id, d.department_name
from employees e 
	left join departments d
	on e.department_id = d.department_id;

# 부서명도 출력하시오. 단, 부서에 배치되지 않은 사원도 출력하시오
# 단, 배치되지 않은 경우엔 부서명에 미배치라고 출력하시오
select e.last_name, 
		e.salary, 
		d.department_id, 
		ifnull(d.department_name, '미배치') 부서명
from employees e 
	left join departments d using(department_id);
    
    
# 사원정보를 조회, 관리자명도 출력
# Neena
select *
from employees e
where e.first_name = 'Neena';

select *
from departments d
where d.department_id = 90;

select *
from employees e
where e.employee_id = 100;


select e.first_name	as 이름, 
		e.salary as 급여, 
        ifnull(m.employee_id, '사장') as 사번, 
        ifnull(m.last_name, 'No Manager') as 매니져
from employees e 
	left join employees m 
    on e.manager_id = m.employee_id;
/*
사번, 급여, 입사일을 출력하시오
단, 관리자의 이름, 입사일, 급여도 출력하시오
단, 관리자보다 입사일이 빠른, 급여를 더 많이 받는 경우를 출력하시오
단, 2000년 1월 1일 이전 입사자여야 합니다.
*/

select	emp.employee_id as 사번,
		emp.first_name as 이름,
		emp.salary as 급여,
        emp.hire_date as 입사일,
        manager.first_name as 매니져이름,
        manager.hire_date as 매니져입사일,
        manager.salary as 매니져급여
        
from	employees emp join employees manager on emp.manager_id = manager.employee_id

where	emp.hire_date 	<	manager.hire_date and
		emp.salary 		> 	manager.salary and
        emp.hire_date 	<	20000101;
	

# 부서별
select		department_id as 부서, 
			avg(salary) as 평균급여
from		employees
where		department_id is not null
group by	department_id;

