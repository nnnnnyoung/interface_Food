package dao;

import java.util.ArrayList;

import dto.MenuDTO;

public class RicecakeDAO implements DAO_INF{
	
	@Override
	public void Info() {
		// TODO Auto-generated method stub
		System.out.println("맛에 빠져서 하나 더 먹으려니 없어졌네");
	}

	@Override
	public void Pay() {
		// TODO Auto-generated method stub
		for(MenuDTO M: b) {
			if(M.getFood().equals("떡볶이")) {
				System.out.println("떡 종류: "+M.getKind());
				System.out.println("맵기: "+M.getHot());
				System.out.println("수량: "+M.getNumber());
				System.out.println("가격: "+M.getNumber()*2000);
				System.out.println("----------------");
			}
		}
	}

	@Override
	public void Basket(MenuDTO m) {
		// TODO Auto-generated method stub
		m.setFood("떡볶이");
		System.out.println("떡의 종류를 선택해 주세요");
		System.out.println("1. 쌀떡");
		System.out.println("2. 밀떡");
		int kindNo=in.nextInt();
		in.nextLine();
		if(kindNo==1) {
			m.setKind("쌀떡");
		}else if(kindNo==2) {
			m.setKind("밀떡");
		}
		System.out.println("맵기를 선택해 주세요");
		System.out.println("1. 강");
		System.out.println("2. 중간");
		System.out.println("3. 보통");
		int hotNo=in.nextInt();
		in.nextLine();
		if(hotNo==1) {
			m.setHot("강");
		}else if(hotNo==2) {
			m.setHot("중간");
		}else if(hotNo==3) {
			m.setHot("보통");
		}
		
		System.out.println("수량을 선택해 주세요");
		System.out.println("1. 1인분 ");
		System.out.println("2. 2인분");
		int numberNo=in.nextInt();
		in.nextLine();
		if(numberNo==1) {
			m.setNumber(1);
		}else if(numberNo==2) {
			m.setNumber(2);
		}
		b.add(m);
		System.out.println("주문완료!");
		
		
		
		
		
		
		
		
		
		
	}

}
