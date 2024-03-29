SELECT
    PRODUCT_CODE,
    SUM(SALES_AMOUNT) * PRICE SALES
FROM
    PRODUCT P
JOIN
    OFFLINE_SALE USING (PRODUCT_ID)
GROUP BY
    P.PRODUCT_CODE	
ORDER BY
    SALES DESC, PRODUCT_CODE ASC
;