-- 코드를 입력하세요
SELECT count(*) as USERS
FROM USER_INFO
where AGE >= 20 and AGE <= 29 and DATE_FORMAT(JOINED, '%Y') = "2021"