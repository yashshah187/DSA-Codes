# Write your MySQL query statement below

select distinct author_id as id from Views where author_id=viewer_id group by id order by id;

# Return the result table sorted by id in ascending order.