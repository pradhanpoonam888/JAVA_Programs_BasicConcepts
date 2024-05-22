package ENUMS;

// import java.lang.Enum;

public class SeasonCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

enum Seasons12 {
	WINTER, SPRING, SUMMER, RAINY, FALL;

	public int getExpectedMaxTemperature() {
		switch (this) {
		case WINTER:
			return 5;
		case SPRING:
		case FALL:
			return 10;
		case SUMMER:
			return 20;
		default:
			break;
		}
		return -1;// Dummy since Java does not recognize this is possible
	}
	
}
