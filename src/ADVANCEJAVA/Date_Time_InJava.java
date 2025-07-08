package ADVANCEJAVA;

//import java.sql.SQLOutput;

import java.util.Date;

// date is stored in form of a long number
/*It holds(stores) the number of millisecond(increase accuracy) passed since 1 jan 1970
java assumes that 1900 is the starting year to calculate the records from this
* */
public class Date_Time_InJava {
    public static void main(String[] args) {
//        System.out.println("COUNT OF SECOND SINCE 1 JAN 1970 : ");
//        System.out.print(System.currentTimeMillis()/1000);
//        System.out.println();
//        System.out.println("COUNT OF MINUTES SINCE 1 JAN 1970 : ");
//        System.out.print(System.currentTimeMillis()/1000/60);
//        System.out.println();
//        System.out.println("COUNT OF HOURS SINCE 1 JAN 1970 : ");
//        System.out.print(System.currentTimeMillis()/1000/3600);
//        System.out.println();
//        System.out.println("COUNT OF DAYS SINCE 1 JAN 1970 : ");
//        System.out.print(System.currentTimeMillis()/1000/3600/24);
//        System.out.println();
//        System.out.println("COUNT OF YEARS SINCE 1 JAN 1970 : ");
//        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
/*  IT is safe to store value of millisecond as long value
* */
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());
      //  Date d=new Date(125,3,7,17,25);
        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getYear());
//        System.out.println(d.before(20));



    }
}
