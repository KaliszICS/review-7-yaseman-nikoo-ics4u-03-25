public class PracticeProblem {

	public static void main(String args[]) {

	}


	public static String evenOrOdd(int num){
		String word;
		if (num%2==0){
		word = "Even";
		return word;
		}
		else{
			word= "Odd";
		return word;
		}
	}

	public static String teacherOrStudent(String word){
		if (word.equals("Kalisz")){
			return "Teacher";
		}
		else{
			return "Student";
		}
	}

	public static int fartherFromZero(int num){
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
		String word;
		if (num >0){
			word ="Positive";
			return word;
		}
		else{
			word = "Negative";
			return word;
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
}