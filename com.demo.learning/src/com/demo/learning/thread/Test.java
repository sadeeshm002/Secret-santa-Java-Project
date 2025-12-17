package com.demo.learning.thread;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class Test {
	
	public static void main(String[] args) {
//		int arr[] =  new int[5];
//		
//		Arrays.asList(arr);
		
//		String name = "sadeesh";
		// for(Char char : name){
		    
		// }

//		for(int i=name.length()-1; i>=0;i--)
//		   System.out.print(new char[i]);
		
		
//	   List<ThreadPoolExample> studentList = new ArrayList<ThreadPoolExample>();
//	   List<Integer> list = new ArrayList<Integer>();
//	       studentList.add("sadeesh");
//	       studentList.add("arun");
//	       
//	       studentList.stream().forEach( e ->{
//	           System.out.println(e);
//	       });

//	 forEach(ThreadPoolExample s:studentList.){

//	 System.out.println();

//	 }
		
//		List<String> names = new ArrayList<String>();  // Arrays.asList("Sadeee", "Arun", "Priya");
//
//        for (String name : names) {
//            System.out.println(name);
//        }
		
//		Random random = new Random();
//		int val = random.nextInt(3);
//		System.out.println(val);
		
//		int index = 2657860 & (16-1);
//		System.out.println(index);
		
//		boolean[]  booleanArr = new boolean[10];
//		booleanArr[0]=true;
//		booleanArr[4]= true;
//		for(boolean a : booleanArr)
//		System.out.println(a);
		
//		ArrayList<Integer> al = new ArrayList<>();
//        al.add(1);
//        al.add(2);
//        al.add(3);
//        al.add(4);
//        al.add(5);
//
//        Iterator<Integer> itr = al.iterator();
//        while (itr.hasNext()) {
//            if (itr.next() == 2) {
//                // will not throw Exception
//                itr.remove();
//            }
//        }
//
//        System.out.println(al);
//
//        itr = al.iterator();
//        while (itr.hasNext()) {
//            if (itr.next() == 3) {
//                // will throw Exception on
//                // next call of next() method
//                al.remove(3);
//            }
//        }
		
//		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 5, 8 });
//		Iterator<Integer> itr = list.iterator();
//		while (itr.hasNext()) {
//			Integer no = (Integer) itr.next();
//			System.out.println(no);
//			if (no == 1)
//
//				// This will not print,
//				// hence it has created separate copy
//				list.add(14);
//			list.remove(Integer.valueOf(3));
//		}
//
//		System.out.println(list);
		
		Hashtable<String, Integer> map = new Hashtable<String, Integer>();

		map.put("ONE", 1);
		map.put("TWO", 2);
		map.put("THREE", 3);
		map.put("FOUR", 4);

		// Getting an Iterator from map
		Iterator<String> it = map.keySet().iterator();

		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key + " : " + map.get(key));

			// This will reflect in iterator.
			// Hence, it has not created separate copy
			map.put("SEVEN", 7);
		}
		
		} 
	
	

}
