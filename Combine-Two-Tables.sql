1# Write your MySQL query statement below
2
3select p.firstName,p.lastName,a.city,a.state from Person p LEFT OUTER JOIN Address a ON(a.personId = p.personId)