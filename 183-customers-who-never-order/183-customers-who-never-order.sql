# Write your MySQL query statement below
Select name as Customers 
from Customers left join Orders on Customers.id=Orders.customerId 
where customerId is null;
