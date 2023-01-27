package output;

public class StringMethod {

	public static void main(String[] args) {
		String stringOne = "Java is an object oriented programming language";
		String stringTwo = "Author name is James gosling";
		
		System.out.println(stringOne.length());
		System.out.println(stringTwo.length());
		
		System.out.println("###-###-####");
		
		System.out.println(getCharCount(stringOne, 'n'));
		System.out.println(getCharCount(stringOne, 'j'));
		System.out.println(getCharCount(stringOne, 'l'));
		System.out.println(getCharCount(stringOne, 'g'));
		
		System.out.println("###-###-####");
		
		System.out.println(stringOne.indexOf('a'));
		//stringOne = stringOne.toLowerCase();
		//System.out.println(stringOne);
		System.out.println(getCharCount(stringOne, 'a'));
		
		
		
		
		System.out.println(stringOne.equals(stringTwo));
		
		stringToStringArray(stringOne);
		
		System.out.println("###-###-####");
		char a = 'n';
		System.out.println((int)a);
		
	}
	
	public static int getCharCount(String str, char key) {
		int count  = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == key) {
				count++;
			}
		}
		return count;
	}
	
	public static void stringToStringArray(String str) {
		String[] strArr = str.split(" ");
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i] + " ");
		}
		
		//for (int i = 0; i < str.length(); i++) {
		//	System.out.println(str[i]);
		//}
	}

}
