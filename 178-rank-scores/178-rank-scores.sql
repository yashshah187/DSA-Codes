# Write your MySQL query statement below

SELECT score, DENSE_RANK() OVER(ORDER BY Scores.score DESC) 'rank'  FROM Scores;