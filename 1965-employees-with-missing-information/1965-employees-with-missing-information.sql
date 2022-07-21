# Write your MySQL query statement below


select e.employee_id from Employees e where e.employee_id not in(select a.employee_id from Employees a, Salaries b where a.employee_Id=b.employee_Id) union select s.employee_Id from Salaries s where s.employee_id not in(select a.employee_id from Employees a, Salaries b where a.employee_Id=b.employee_Id) order by employee_Id;