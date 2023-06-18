WITH T AS (
    SELECT 
        HOST_ID
    FROM
        PLACES
    GROUP BY
        HOST_ID
    HAVING
        COUNT(*) > 1
)
SELECT
     ID,
     NAME,
     HOST_ID
FROM
    PLACES
WHERE
    (HOST_ID) IN (SELECT * FROM T)
;
    