package chap16.ex;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<User> userList = new ArrayList<User>();
		User user1 = new User("染谷将太", 29);
		userList.add(user1);
		User user2 = new User("二階堂ふみ", 27);
		userList.add(user2);
		User user3 = new User("窪塚洋介", 42);
		userList.add(user3);

		for (User user : userList) {
			System.out.println(user.getName() + ":" + user.getAge());
		}
	}

}
