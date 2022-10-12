package dao;

import dto.MenuDTO;

public class RamenDAO implements DAO_INF{
	
	@Override
	public void Info() {
		// TODO Auto-generated method stub
		System.out.println("면은 그저 시작일 뿐, 국물이 라면의 완성");
	}

	@Override
	public void Pay() {
		// TODO Auto-generated method stub

		for(MenuDTO M:b) {
			if(M.getFood().equals("라면")) {
				System.out.println("종류: "+M.getKind());
				System.out.println("가격: "+M.getPrice());
				System.out.println("-----------------");
			}
		}

		
	}

	@Override
	public void Basket(MenuDTO m) {
		m.setFood("라면");
		System.out.println("메뉴를 선택해 주세요");
		System.out.println("1. 쉰라면  ");
		System.out.println("2. 쥔라면  ");
		
		int no=in.nextInt();
		in.nextLine();
		if(no==1) {
			m.setKind("쉰라면");
			m.setPrice(1500);
			b.add(m);
		}else if(no==2) {
			m.setKind("쥔라면");
			m.setPrice(2000);
			b.add(m);
			
		}
		
		System.out.println("주문완료!");
		
	}

}
