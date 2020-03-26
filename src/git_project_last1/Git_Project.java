package git_project_last1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Git_Project {

	public static void main(String[] args) {
		String arr1 []= {"A", "C", "O", "U"};
		String arr2 []= {"O", "U", "J", "G","L"};
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for (String w:arr1 ) {
			for(String y:arr2) {
				if(w.equals(y)) {
					System.out.println(w);
				}
			}
		}
	
	List <Integer >list= new ArrayList<>();
	list.add(10);
	list.add(20);
	list.add(20);
	int product=1;
	for(int w:list) {
		product=product*w;
		}
	System.out.println(product);
	
	List<Integer> list1 =new ArrayList<>();
	List<Integer> list2 =new ArrayList<>();
list1.add(111);
list1.add(222);
list1.add(333);
list1.add(444);
	
list2.add(555);
list2.add(666);
list2.add(777);

 list1.addAll(list2);
 System.out.println(list1);
System.out.println("github deneme");
	System.out.println("github deneme 1");
	}

}

