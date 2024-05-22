package Basic.EqualsTo;

public class ClientHashCode {
	
	private int id;
	
	public ClientHashCode(int d) {
		setId(d);
	}

	public static void main(String[] args) {
		ClientHashCode c1=new ClientHashCode(12);
		ClientHashCode c2=new ClientHashCode(12);
		ClientHashCode c3=c1;

		validateWithOperatorEqual(c1, c2);
		validateWithEquals(c1, c2);
		validateWithOperatorEqual(c1, c3);
		validateWithEquals(c1, c3);
	}

	/**
	 * @param c1
	 * @param c2
	 */
	public static void validateWithOperatorEqual(ClientHashCode c1, ClientHashCode c2) {
		System.out.println("******************************************");
		if(c1==c2) {
			System.out.println("both the clients are pointing to same object");
			
			if(c1.hashCode()== c2.hashCode()) {
				System.out.println("HashCodes are equal " + c1.hashCode());
			}else {
				System.out.println("HashCodes are not equal " + c1.hashCode() +" "+ c2.hashCode());
			}
		}else {
			System.out.println("No!! Clients have different Objects");
			if(c1.hashCode()== c2.hashCode()) {
				System.out.println("HashCodes are equal " + c1.hashCode());
			}else {
				System.out.println("HashCodes are not equal " + c1.hashCode() +" "+ c2.hashCode());
			}
		}
		System.out.println("******************************************");
	}

	/**
	 * @param c1
	 * @param c2
	 */
	public static void validateWithEquals(ClientHashCode c1, ClientHashCode c2) {
		System.out.println("******************************************");
		if(c1.equals(c2)) {
			System.out.println("both the clients are pointing to same object");
			if(c1.hashCode()== c2.hashCode()) {
				System.out.println("HashCodes are equal " + c1.hashCode());
			}else {
				System.out.println("HashCodes are not equal " + c1.hashCode() +" "+ c2.hashCode());
			}
		}else {
			System.out.println("No!! Clients have different Objects");
			if(c1.hashCode()== c2.hashCode()) {
				System.out.println("HashCodes are equal " + c1.hashCode());
			}else {
				System.out.println("HashCodes are not equal " + c1.hashCode() +" "+ c2.hashCode());
			}
		}
		System.out.println("******************************************");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
