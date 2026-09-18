# Write your MySQL query statement below

SELECT person_name
FROM (
    SELECT *, SUM(WEIGHT) OVER(ORDER BY TURN) AS total_weight
FROM QUEUE
) q
WHERE total_weight <= 1000
ORDER BY total_weight DESC
LIMIT 1;