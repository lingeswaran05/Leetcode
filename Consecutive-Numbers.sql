1# Write your MySQL query statement below
2SELECT DISTINCT l1.num AS ConsecutiveNums
3FROM Logs l1
4JOIN Logs l2 ON l1.id = l2.id - 1
5JOIN Logs l3 ON l1.id = l3.id - 2
6WHERE l1.num = l2.num
7  AND l1.num = l3.num;
8