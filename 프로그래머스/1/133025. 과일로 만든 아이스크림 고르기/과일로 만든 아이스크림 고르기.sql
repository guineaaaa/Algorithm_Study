-- 상반기 아이스크림의 총 주문량이 3000보다 높고 & 아이스크림 주 성분이 과일인
-- 아이스크림의 맛을 총주문량이 큰 순서대로 조회하는 sql
SELECT A.FLAVOR FROM FIRST_HALF AS A
JOIN ICECREAM_INFO AS B
ON A.FLAVOR=B.FLAVOR
WHERE (A.TOTAL_ORDER>3000) AND (B.INGREDIENT_TYPE='fruit_based')
ORDER BY A.TOTAL_ORDER DESC