-- member profile 테이블에서 생일이 3월인 여성 회원의 id, 이름, 성별, 생년월일을
-- 조회하는 sql문을 작성한다. 이때 전화번호가 NULL인 경우에는 출력 대상에서 제외하고
-- 결과는 회원 ID를 기준으로 오름차순 정렬

SELECT MEMBER_ID, MEMBER_NAME, GENDER, DATE_FORMAT(DATE_OF_BIRTH,'%Y-%m-%d')
FROM MEMBER_PROFILE
WHERE MONTH(DATE_OF_BIRTH)=3 
AND TLNO IS NOT NULL
AND GENDER='W'
ORDER BY MEMBER_ID ASC