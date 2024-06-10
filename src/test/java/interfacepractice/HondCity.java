package interfacepractice;

public class HondCity implements Car, License {

	@Override
	public void lincense() {
		System.out.println("I have a license to driving this hondaCity Car");

	}

	@Override
	public void engine() {

		System.out.println("This is Honnda city Car Engine");
	}

	@Override
	public void companyName() {

		System.out.println("HondaCity");
	}

	public static void main(String[] args) {
		HondCity hc = new HondCity();
		hc.lincense();
		hc.engine();
		hc.companyName();
	}

}
