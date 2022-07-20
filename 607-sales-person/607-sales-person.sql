# Write your MySQL query statement below

# select a.name from SalesPerson a where sales_id not in ( select b.sales_id from Orders b where com_id  in ( select c.com_id from Company c where name="RED") );

select name from salesperson where sales_id not in (select sales_id from Orders left join company on orders.com_id = company.com_id where company.name="Red");