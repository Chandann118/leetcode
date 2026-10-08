# Write your MySQL query statement below
SELECT name   as Employee from  Employee e
WHERE salary > ( SELECT salary from Employee where id = e.managerID);