package com.nie.test;

import java.util.*;

public class DemoTest02 {
    public static void main(String[] args) {
        //练习：A,B,C,D四个景点，80个学生投票，并统计投票
        String arr[] = {"A","B","C","D"};

        Random r = new Random();

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 80; i++) {

            int num = r.nextInt(arr.length);
            String str = arr[num];
            list.add(str);
        }

        HashMap<String,Integer> hm = new HashMap<>();

        for (String name : list) {
            if (hm.containsKey(name)){
                int count = hm.get(name);
                count++;
                hm.put(name,count);
            }
            else {
                hm.put(name,1);
            }
        }

        Set<String> keys = hm.keySet();
        for (String key : keys) {
            Integer value = hm.get(key);
            System.out.println(key+"="+value);

        }

        System.out.println("------------");
        int max =0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (max<value){
                max = value;
            }
        }
        System.out.println(max);
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value == max ){
                System.out.println("投票最多的景区是"+key);
            }
        }


    }
}
