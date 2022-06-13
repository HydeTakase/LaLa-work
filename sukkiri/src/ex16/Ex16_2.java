package ex16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import chap16.ex.User;

public class Ex16_2 {

	public static void main(String[] args) {
		User h1 = new User("斎藤", 10);
		User h2 = new User("鈴木", 11);
		
		List<User> heroList = new ArrayList<>();
		heroList.add(h1);
		heroList.add(h2);
		
		for (User hero : heroList) {
			System.out.println(hero.getName());
		}
		
		Map<User, Integer> userList = new HashMap<>();
		userList.put(h1, 3);
		userList.put(h2, 7);
		
		for (User key : userList.keySet()) {
			int value = userList.get(key);
			System.out.println(key.getName() + "が倒した敵は" + value);
		}
		

	}
	

}
