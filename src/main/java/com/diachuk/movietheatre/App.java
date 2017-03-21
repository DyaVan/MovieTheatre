package com.diachuk.movietheatre;

import javax.management.AttributeList;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{

    static List<Object> objs = new ArrayList();
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Integer a = 100;
        Integer b = 8;


        System.out.println(Integer.toBinaryString(a));
//        System.out.println(Integer.toBinaryString(b));


        System.out.println(Integer.toBinaryString(GetMinrun(a)));

        objs.stream().redu

    }

    static int GetMinrun(int n)
    {
        int r = 0;           /* станет 1 если среди сдвинутых битов будет хотя бы 1 ненулевой */
        while (n >= 64) {
            r |= n & 1;
            n >>= 1;
        }
        return n + r;
    }
}
