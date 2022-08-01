# Write your MySQL query statement below
select
case 
   when s1.id%2!=0 and s1.id=(select count(*) from Seat) then s1.id
   when s1.id%2=0 then s1.id-1
   else s1.id+1
end as id,s1.student
from Seat s1
order by id;