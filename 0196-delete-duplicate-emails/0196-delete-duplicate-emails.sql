# Write your MySQL query statement below
DELETE a FROM person as a
INNER JOIN 
person as b
ON
     a.email = b.email
 AND
 a.id>b.id
