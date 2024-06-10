package interfacepractice;

public class MarutiSuzuki implements Car, License {

	@Override
	public void lincense() {
		System.out.println("I have a license to driving this MarutiSuzuki Car");

	}

	@Override
	public void engine() {
		System.out.println("This is Honnda city Car Engine");
	}

	@Override
	public void companyName() {
		System.out.println("marutisuzuki");

	}

	public static void main(String[] args) {
		MarutiSuzuki mr = new MarutiSuzuki();

		mr.lincense();
		mr.engine();
		mr.companyName();
	}
}
