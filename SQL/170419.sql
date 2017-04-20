use hr;
CALL new_procedure(100);

set @my_emp_no= 100;

select @my_emp_no;


select last_name, first_name, salary, hire_date 
from employees 
where date_format(hire_date, '%Y')='1996';