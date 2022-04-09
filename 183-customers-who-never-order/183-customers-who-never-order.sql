# Write your MySQL query statement below

SELECT 
name as Customers
from Customers
where Customers.id 
not in 
(Select customerId from orders);