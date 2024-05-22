package Basic.EqualsTo;

public class Client {
	
	private int id;
	
	public Client(int d) {
		setId(d);
	}

	public static void main(String[] args) {
		Client c1=new Client(12);
		Client c2=new Client(12);
		Client c3=c1;

		validateWithOperatorEqual(c1, c2);
		validateWithEquals(c1, c2);
		validateWithOperatorEqual(c1, c3);
		validateWithEquals(c1, c3);
	}

	/**
	 * @param c1
	 * @param c2
	 */
	public static void validateWithOperatorEqual(Client c1, Client c2) {
		if(c1==c2) {
			System.out.println("both the clients are pointing to same object");
		}else {
			System.out.println("No!! Clients have different Objects");
		}
	}

	/**
	 * @param c1
	 * @param c2
	 */
	public static void validateWithEquals(Client c1, Client c2) {
		if(c1.equals(c2)) {
			System.out.println("both the clients are pointing to same object");
		}else {
			System.out.println("No!! Clients have different Objects");
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
