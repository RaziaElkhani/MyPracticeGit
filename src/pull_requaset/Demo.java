package pull_requaset;

public class Demo {
public static void main(String[] args) {
	String city []= {"Dublin","SanRamon","Danvil","Concord","Martiniz"};
	for(String c:city) {
		System.out.println(c);
		System.out.println("SanRamon");
		System.out.println("Dublin");
		System.out.println("Danvil");
		getNum(2,6,5);
		getNum(3,5,6);
		getNum(5,6,4);
	}

	
}
public static void getNum(int a,int b,int c) {
	System.out.println(a*b-c);
}

}
