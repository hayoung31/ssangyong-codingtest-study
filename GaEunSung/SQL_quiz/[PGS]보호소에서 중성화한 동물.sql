SELECT to_char(O.sales_date, 'yyyy') AS YEAR,
       to_number(to_char(O.sales_date, 'mm')) AS MONTH,
       COUNT(DISTINCT O.user_id) AS PUCHASED_USERS,
       ROUND(COUNT(DISTINCT O.user_id) 
             / (SELECT COUNT(DISTINCT user_id)
                FROM user_info
                WHERE to_char(joined, 'YYYY') = '2021'), 1) AS PUCHASED_RATIO
FROM online_sale O JOIN user_info U 
ON  O.user_id = U.user_id
WHERE to_char(U.joined, 'yyyy') = '2021'
group by to_char(O.sales_date, 'yyyy'), to_number(to_char(O.sales_date, 'mm'))
ORDER BY YEAR,MONTH