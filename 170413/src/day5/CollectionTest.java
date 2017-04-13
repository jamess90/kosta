package day5;

import java.util.List;
import java.util.ArrayList;

public class CollectionTest {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add(555);
		list.add(new String("haha"));
		list.add(new IOTest());
		for(int i = 0; i < list.size(); i++){
			Object obj = list.get(i);
		}
		List<String> list2 = new ArrayList<>();
//		list2.add(213);
		list2.add(new String("55555"));
		list2.add("5555555");
		for(String tempStr: list2){
			System.out.println(tempStr);
		}
	}
}
