# Write your MySQL query statement below
select e.name, eu.unique_id from Employees as e
left join EmployeeUni as eu on eu.id = e.id;