# Write your MySQL query statement below
select teacher_id, count( distinct Subject_id) as cnt from Teacher group by teacher_id;