# Write your MySQL query statement below
select a.name from SalesPerson a where sales_id not in ( select b.sales_id from Orders b where com_id  in ( select c.com_id from Company c where name="RED") );