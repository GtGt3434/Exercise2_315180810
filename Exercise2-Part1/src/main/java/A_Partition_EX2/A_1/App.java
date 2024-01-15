package A_Partition_EX2.A_1;

/**
 * Hello world!
 *
 */
public class App {
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
		else
			return "error";
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
