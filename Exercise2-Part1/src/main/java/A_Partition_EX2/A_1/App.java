package A_Partition_EX2.A_1;

/**
 * Hello world!
 *
 */
public class App {
	/**
	 * A method that takes a number as a parameter and checks to which BVA group
	 * this number belongs
	 * 
	 * @param grade
	 * @return The letter that represents the grade, if invalid, returns "error"
	 */
	public static String BVA_CheckPartionGroup(int grade) {
		if (grade >= 1 && grade <= 49)
			return "F";
		else if (grade >= 50 && grade <= 59)
			return "E";
		else if (grade >= 60 && grade <= 69)
			return "D";
		else if (grade >= 70 && grade <= 79)
			return "C";
		else if (grade >= 80 && grade <= 89)
			return "B";
		else if (grade >= 90 && grade <= 100)
			return "A";
		// If the number was under 1 or above 100
		return "error";
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
