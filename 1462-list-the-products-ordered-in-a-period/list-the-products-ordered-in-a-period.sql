# Write your MySQL query statement below
select Products.product_name ,sum(unit) as unit  
from Products 
join 
Orders on Products.product_id=Orders.product_id
where order_date between '2020-02-01' and '2020-02-29'
group by Orders.product_id
having unit>=100