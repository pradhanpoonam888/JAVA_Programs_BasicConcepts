package Basic.EqualsTo;

public class Clients {

	static int id;

	public Clients(int d) {
		id = d;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public static void main(String[] args) {
		Clients c1 = new Clients(12);
		Clients c2 = new Clients(12);
		Clients c3 = c1;

		validateWithOperatorEqual(c1, c2);
		validateWithEquals(c1, c2);
		validateWithOperatorEqual(c1, c3);
		validateWithEquals(c1, c3);
	}

	/**
	 * @param c1
	 * @param c2
	 */
	public static void validateWithOperatorEqual(Clients c1, Clients c2) {
		if (c1 == c2) {
			System.out.println("both the clients are pointing to same object");
		} else {
			System.out.println("No!! Clients have different");
		}
	}

	/**
	 * @param c1
	 * @param c2
	 */
	public static void validateWithEquals(Clients c1, Clients c2) {
		if (c1.equals(c2)) {
			System.out.println("both the clients are pointing to same object");
		} else {
			System.out.println("No!! Clients have different");
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Entered");
		boolean flag = false;
		Clients other=(Clients) obj;
		if (id == other.getId()) {
			System.out.println("IDs are matching");
			flag = true;
		} else {
			System.out.println("IDs are NOT Matching");
		}
		return flag;

	}

}
