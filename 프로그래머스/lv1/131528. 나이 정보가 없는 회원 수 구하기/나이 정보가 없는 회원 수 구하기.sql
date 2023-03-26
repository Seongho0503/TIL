SELECT
    SUM(AGE IS NULL) USERS
FROM
    USER_INFO
;


# SELECT COUNT(*) USERS
#     FROM 
#         USER_INFO
#     where
#         AGE IS NULL

# SELECT SUM(AGE IS NULL) AS USERS
#     FROM
#         USER_INFO
# IS NULL 을 만족하면 1, 만족 못하면 0