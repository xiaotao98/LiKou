package com.LiKou.simple.sansiyuefen2022;

/**
 * SQL
 */
public class title181 {

    //自链接
/*      select e1.name as Employee from Employee e1,Employee e2
        where e1.salary> e2.salary and e2.id=e1.managerId

    //子链接
        select e.name as Employee  from Employee e
        where e.salary>(select salary from Employee where id=e.managerId)


    */

}
