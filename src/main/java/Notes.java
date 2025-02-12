
class Notes {
	public static void main(String[] args) {

		int num;
		num = -5;
		

		if (num < 10 && num > 0) { //only runs when the condition is true
			System.out.println("Your number was less than 10");
			num = 15;
			int num2 = 9; //can't create a variable inside and use it outside
			System.out.println(num2);
		}
		//cannot code between if and else
		// System.out.println("no");

		//what condition your else represents
		//num <= 0 || num >= 10
		else { //when the above condition is false, this will run
			System.out.println("The else ran");
		}
		System.out.println(num);
		// System.out.println(num2);
	}
}
