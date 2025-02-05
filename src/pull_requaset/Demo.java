package pull_requaset;

public class Demo {
	public static void main(String[] args) {
		String city[] = { "Dublin", "SanRamon", "Danvil", "Concord", "Martiniz" };
		for (String c : city) {
			System.out.println(c);
			System.out.println("SanRamon");
			System.out.println("Dublin");
			int num = 10;

			String name = "Hawa";

			getNum(2, 6, 5);
			getNum(3, 5, 6);
			getNum(5, 6, 4);

		}

	}

	public static void getNum(int a, int b, int c) {
		System.out.println(a * b - c);
	}

	public static int getResult(boolean id, String country) {
		int result = 0;

		if (id == true && country == "USA") {
			System.out.println("You can get license ");
		} else {
			System.out.println("You cannot get license ");
		}

		return result;
	}

}
