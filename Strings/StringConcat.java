package Strings;

public class StringConcat {

	public  static  void printLetters(String str){
		for(int i = 0; i < str.length(); i++){
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		String firstName = "Priyanshu";
		String lastName = "Baliyan";
		String fullName = firstName + " " + lastName;

		// System.out.println(fullName);

		// charAt(index)
		// System.out.println(fullName.charAt(0)); // return 0th index value : P

		printLetters(fullName);

	}
}
