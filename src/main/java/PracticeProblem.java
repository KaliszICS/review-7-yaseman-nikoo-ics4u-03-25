public class PracticeProblem {

	public static void main(String args[]) {

	}


	public static String evenOrOdd(int num){
		if (num%2==0){
		return "Even";

		}
		else{
		return "Odd";
		}

	public static String teacherOrStudent(String word){
		if (word.equals("Kalisz")){
			return "Teacher";
		}
		else{
			return "Student";
		}
	}

	public static int farhterFromZero(int num){
		if (num<0){
			return num-5;
		}
		else if(num>0){
			return num+5;
		}
		else{
			return num;
		}
	}
	public static String isFive(int num){
		if (num == 5){
			return "The number is Five";
		}
		else{
			return "The number is not Five";
		}
	}
	public static String positiveOrNegative(double num){
		if (num >0){
			return "Positive";
		}
		else{
			return "Neagaive";
		}
	}
	public static String highOrLow(int num){
		if (num > 100){
			return "High";
		}
		else{
			return "Low";
		}
	}
	public static String isHello(String word){
		if (word.equals("Hello")){
			return "The word is Hello";
		}
		else{
			return "The word is not Hello";
		}
	}