SELECT T1.product_id, T1.product_name, sum(T1.price * T2.amount) as total_sales
from FOOD_PRODUCT T1 JOIN FOOD_ORDER T2
ON T1.product_id = T2.product_id
where to_char(T2.produce_date, 'yyyy-mm') = '2022-05'
group by T1.product_id,T1.product_name
order by 3 desc , 1 asc;

/*
 * FOOD_PRODUCT와 FOOD_ORDER 테이블에서 
 * 생산일자가 2022년 5월인 식품들의 식품 ID, 식품 이름, 총매출을 조회하는 SQL문을 작성해주세요. 
 * 이때 결과는 총매출을 기준으로 내림차순 정렬해주시고 총매출이 같다면 식품 ID를 기준으로 오름차순 정렬해주세요.
 */