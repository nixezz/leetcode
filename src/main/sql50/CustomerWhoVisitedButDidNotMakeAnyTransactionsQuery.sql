SELECT DISTINCT v.customer_id, COUNT(*) AS count_no_trans
FROM visits v LEFT JOIN transactions t ON v.visit_id = t.visit_id
WHERE t.visit_id IS NULL
GROUP BY v.customer_id