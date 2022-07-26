# Write your MySQL query statement below

select Users.name,
( case 
  when sum(Rides.distance) is null then 0
  else sum(Rides.distance)
 end )as travelled_distance 
from Users left join Rides on Users.id=Rides.user_id 
group by Rides.user_id 
order by sum(Rides.distance) desc,Users.name;

#ordered by travelled_distance in descending order
#order them by their name in ascending order.

