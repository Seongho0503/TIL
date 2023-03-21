-- 코드를 입력하세요
SELECT * FROM CAR_RENTAL_COMPANY_CAR
    WHERE OPTIONS LIKE "%네비게이션%"
ORDER BY CAR_ID DESC


# SELECT * FROM CAR_RENTAL_COMPANY_CAR
# WHERE OPTIONS = "네비게이션" 네비게이션 옵션 하나만 출력됨
# WHERE 절에서 LIKE 써서 "네비게이션이 포함된 옵션 출력"