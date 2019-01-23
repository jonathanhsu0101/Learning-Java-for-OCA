package corelesson4.prototype;

public class CloneTest {
	public static void main(String[] args) {
		User user = new User();
		Address address = new Address();
		user.setAddress(address);
		
		User user1 = null;
		User user2 = null;
		try {
			user1 = (User)user.clone(); //淺克隆 (Java內建)
			user2 = (User)user.deepClone(); //深克隆 (自己寫)
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(user==user1);
		System.out.println(user.getAddress()==user1.getAddress());
		System.out.println("===============================");
		System.out.println(user==user2);
		System.out.println(user.getAddress()==user2.getAddress());
	}
}
