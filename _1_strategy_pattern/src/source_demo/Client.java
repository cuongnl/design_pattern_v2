package source_demo;

public class Client {
	public static void main(String[] args) {
		Person nhanVien = new MoiGioi();
		nhanVien.handleCustomerAble();
		nhanVien.handleIntroductionAble();
		nhanVien.handleOrderAble();
	}
}
