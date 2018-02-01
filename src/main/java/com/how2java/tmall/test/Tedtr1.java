package com.how2java.tmall.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author XKK
 * @create 2018-02-01 9:11
 * @desc fgfdg
 **/
public class Tedtr1 {
    public static void main(String[] args) {
       // stringToDate("2018/2/1 09:15:52","yyyy-MM-dd HH:mm:ss");

        String dateStr = "2016-2-21 13:23:11";
        //获得SimpleDateFormat类，我们转换为yyyy-MM-dd的时间格式
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            //使用SimpleDateFormat的parse()方法生成Date
            Date date = sf.parse(dateStr);
            //打印Date
          //  String ss = sf.format(date);
         //   System.out.println(date.toLocaleString());
          //  System.out.println(ss);
            System.out.println("dfsdfdsf");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    /**
     *
     * 字符串转换为对应日期
     *
     * @param source
     * @param pattern
     * @return
     */
    public static Date stringToDate(String source, String pattern) {
        SimpleDateFormat  simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = null;
        try {
            date = simpleDateFormat.parse(source);
        } catch (Exception e) {
        }
        return date;
    }
}