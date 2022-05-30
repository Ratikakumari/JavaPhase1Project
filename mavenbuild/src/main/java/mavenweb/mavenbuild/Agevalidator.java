package mavenweb.mavenbuild;

public class Agevalidator {
	public String ageVerify(int age) {
		if(age>=18) {
			return "right to vote";
		}

		else {
		return "no right to vote";
	}
	}
	}
