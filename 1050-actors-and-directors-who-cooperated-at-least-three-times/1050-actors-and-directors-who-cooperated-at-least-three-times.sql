# Write your MySQL query statement below
select actor_id,director_id from ActorDirector group by actor_id,director_id having count(actor_id=director_id)>2;

# //{"headers":{"ActorDirector":["actor_id","director_id","timestamp"]},"rows":{"ActorDirector":[[3,5,1],[4,2,0],[4,5,5],[5,3,7],[4,5,3],[4,3,8],[2,5,9],[4,2,2],[1,5,4],[5,3,6]]}}