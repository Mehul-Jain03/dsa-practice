package mixed;

public class LeapYear {

	public static void main(String[] args) {
		int year = 700;
		boolean flag = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					flag = true;
				} else
					flag = false;
			} else
				flag = true;
		} else {
			flag = false;
		}

		if (flag) {
			System.out.println("Year is leap year");
		} else {
			System.out.println("Year is not a leap year");
		}
	}
}