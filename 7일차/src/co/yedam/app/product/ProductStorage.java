package co.yedam.app.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductStorage {
	private List<Product> list = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	private int counter;

	public void showMenu() {
		while (true) {
			System.out.println("============================");
			System.out.println("1.등록  |  2.목록  |  3.종료");
			System.out.println("============================");

			System.out.print("선택>>");
			String selectNo = scanner.nextLine(); 	// 번호 읽기
			switch (selectNo) {
				case "1": registerProduct(); break; 	// Product 등록
				case "2": showProducts(); break; 		// 등록된 모든 Product 정보보기
				case "3": return; 					// 프로그램 종료
			}
		}
	}
	
	public void registerProduct() {
		try {
			Product product = new Product();
			product.setPno(++counter);				//pno 세팅
			
			System.out.print("상품명>> ");
			product.setName(scanner.nextLine());	// 이름을 읽고 세팅 
			
			System.out.print("가격>> ");
			product.setPrice(Integer.parseInt(scanner.nextLine()));		// 가겨을 읽고 세팅
			
			System.out.print("재고>> ");
			product.setStock(Integer.parseInt(scanner.nextLine()));		// 재고를 읽고 세팅
			
			list.add(product);		// list에 product저장
		} catch (Exception e) {
			System.out.println("등록 에러: " + e.getMessage());
		}
	}
	
	public void showProducts() {		// list에 저장된 모든 product 정보를 모니터에 출력
		for (Product p : list) {
			System.out.println(p.getPno() + "\t" + p.getName() + "\t" +
							p.getPrice() + "\t" + p.getStock());
		}
	}
}
