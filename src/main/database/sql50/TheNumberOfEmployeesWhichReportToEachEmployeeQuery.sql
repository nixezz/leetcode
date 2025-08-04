SELECT mn.employee_id, mn.name, COUNT(em.employee_id) AS reports_count, ROUND(AVG(em.age)) AS average_age
FROM Employees em JOIN Employees mn ON em.reports_to = mn.employee_id
GROUP BY employee_id, name
ORDER BY employee_id ASC;