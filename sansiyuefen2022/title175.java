package com.LiKou.simple.sansiyuefen2022;

/**
 * SQL
 * 此题知识点：
 如果直接使用where条件连接，那么如果其中一张表（如：Person中有FirstName和LastName的信息）有记录，
 但是Person表中某个PersonId标识的记录在另一张表（Address）中，没有录入相应的City、State信息，那么在查询结果中，
 就会自动过滤掉Person表中的这条记录，不符合题目要求。
 而应该使用外连接，select {字段列表} from A left/right outer join B on(连接条件)，
 ①左外连接（left outer join）会保留表A中的所有记录；
 ②右外连接（right outer join on）会保留表B中的所有记录。
 */
public class title175 {

/*

select firstName,lastName,city,state from Person p left join Address a
on p.personId =a.personId

    */
}
