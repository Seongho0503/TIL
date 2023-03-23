SELECT COUNT(*)
    FROM 
        USER_INFO
    WHERE
       ( AGE >= 20 AND AGE <= 29 )  &&
       DATE_FORMAT(JOINED , "%Y") = "2021"
    