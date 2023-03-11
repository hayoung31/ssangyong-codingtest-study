-- 코드를 입력하세요
SELECT *
FROM
(
    SELECT I.name AS name, I.datetime AS datetime 
    FROM animal_ins I LEFT JOIN animal_outs O
    ON I.animal_id = O.animal_id
    WHERE O.animal_id IS NULL
    ORDER BY datetime
)
WHERE ROWNUM <=3

/*

아직 입양을 못 간 동물 중, 
가장 오래 보호소에 있었던 동물 3마리의 이름과 보호 시작일을 조회하는 SQL문을 작성해주세요. 
이때 결과는 보호 시작일 순으로 조회해야 합니다.

*/