package source_demo;

public class CongTacVien extends Person {

	public void CongTacVien() {
		this.customerable = new CustomerPermission();
		this.introductionable = new IntrodutionPermission();
		this.orderable = new OrderNoPermission();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

}
