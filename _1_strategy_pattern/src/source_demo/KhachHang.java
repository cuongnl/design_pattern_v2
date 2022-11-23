package source_demo;

public class KhachHang extends Person {
	
	public void KhachHang() {
		this.customerable = new CustomerNoPermission();
		this.introductionable = new IntrodutionNoPermission();
		this.orderable = new OrderPermission();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
