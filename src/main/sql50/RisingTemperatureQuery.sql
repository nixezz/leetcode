/*
 В условии соединения мы используем DATEDIFF функцию для поиска пар записей, где recordDate разница между ними составляет ровно один день.
 Это условие гарантирует сравнение температуры каждого дня с температурой предыдущего дня.
*/
SELECT a.id
FROM weather a JOIN weather b ON DATEDIFF(a.recordDate, b.recordDate) = 1
WHERE a.temperature > b.temperature