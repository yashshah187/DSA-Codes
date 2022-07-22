# Write your MySQL query statement below

select distinct customer_Id, count(customer_Id) as count_no_trans from Visits where visit_Id not in(select distinct visit_id from Transactions) group by customer_Id;