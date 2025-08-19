SELECT b.book_id, b.title, b.author, b.genre, b.publication_year, b.total_copies AS current_borrowers
FROM library_books as b RIGHT JOIN borrowing_records AS r ON b.book_id = r.book_id
WHERE r.return_date IS NULL
GROUP BY b.book_id, b.title, b.author, b.genre, b.publication_year, b.total_copies
HAVING COUNT(r.book_id) = b.total_copies
ORDER BY b.total_copies DESC, b.title ASC