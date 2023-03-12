
SELECT INS.animal_id AS amimal_id, INS.name as name
FROM ANIMAL_INS INS  JOIN ANIMAL_OUTS OUTS
ON INS.animal_id = OUTS.animal_id
WHERE INS.datetime > OUTS.datetime
ORDER BY INS.datetime
/*
관리자의 실수로 일부 동물의 입양일이 잘못 입력되었습니다. 
보호 시작일보다 입양일이 더 빠른 동물의 아이디와 이름을 조회하는 SQL문을 작성해주세요. 
이때 결과는 보호 시작일이 빠른 순으로 조회해야합니다.
*/