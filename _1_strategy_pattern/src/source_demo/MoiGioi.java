package source_demo;

public class MoiGioi extends Person {
	
	public void MoiGioi() {
		this.customerable = new CustomerPermission();
		this.introductionable = new IntrodutionPermission();
		this.orderable = new OrderPermission();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
