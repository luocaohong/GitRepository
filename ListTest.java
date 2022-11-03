package com.atguigu.java;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;

/*
collection接口:
List接口：ArrayList,LinkedList,Vector
Set接口:HashSet,LinkHashSet,TreeSet
Map接口:HashMap,LinkedHashMap,TreeMap,Hashtable,Properties

 */
public class ListTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add("BB");
        coll.add(123);
        coll.add(456);
        System.out.println(coll.size());

        Collection coll1 = new ArrayList();
        coll1.add(789);
        coll1.add(789);
        coll.addAll(coll1);
        System.out.println(coll.size());
        System.out.println(coll);
        System.out.println(coll.isEmpty());
        //coll.clear();
        //System.out.println(coll.isEmpty());
    }
}
