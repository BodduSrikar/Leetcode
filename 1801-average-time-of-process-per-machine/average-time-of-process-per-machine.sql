# Write your MySQL query statement below
select machine_id,round(avg(Process_time),3)
processing_time from 
(select machine_id,process_id,
sum(case when activity_type='start' then 
-timestamp 
else timestamp 
end) Process_time 
from Activity
group by machine_id,process_id)x
group by machine_id;