# Write your MySQL query statement below
SELECT p.firstName, p.lastName , A.city,A.state 
FROM Person P
LEFT JOIN Address A USING (personId)