# Write your MySQL query statement below
Select name as Employee from Employee x where salary > (select salary from Employee y where y.id=x.managerId);