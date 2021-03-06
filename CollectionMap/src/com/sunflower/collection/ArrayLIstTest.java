package com.sunflower.collection;

import java.util.*;

public class ArrayLIstTest {
    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("123");
        arrayList1.add("456");
        arrayList1.add("789");
        arrayList1.add("555");
        arrayList1.add(2,"999");
        System.out.println(arrayList1);//[123, 456, 999, 789, 555]
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("aaa");
        arrayList2.add("bbb");
        arrayList2.add("ccc");
        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);//[123, 456, 999, 789, 555, aaa, bbb, ccc]
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(1,123);
        linkedHashMap.put(2,456);
        System.out.println(linkedHashMap.entrySet().iterator().getClass());
    }
}
