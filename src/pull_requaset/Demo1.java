package pull_requaset;

public class Demo1 {
public static void main(String[] args) {
	String city []= {"Dublin","SanRamon","Sacarmanto","Danvil","Pleanton"};
	
	for (String c :city) {
		System.out.println(c);
	}
	
	getNum(2,4);
	getNum(9,5);
	getNum(5,8);
	
}
public static void getNum(int a,int v) {
	System.out.println(a*v);
}
public static String getInfo(boolean isCitizen,String country,int age) {
	String result ="";
	if (isCitizen ==true&& country =="USA"&& age>= 18) {
		System.out.println("You can code");
	}else {
		System.out.println("You cannot code");
	}
	
	return result;
}
}
