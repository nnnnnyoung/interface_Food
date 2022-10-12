package dao;

import java.util.ArrayList;

import dto.MenuDTO;

public class KimbabDAO implements DAO_INF{
	ArrayList<MenuDTO> b=new ArrayList<>();
	
	@Override
	public void Info() {
		// TODO Auto-generated method stub
		System.out.println("¿·±¸¸®°¡ ÅÍÁ®¾ß Á¦ ¸ÀÀÌÁö");
	}

	@Override
	public void Pay() {
		// TODO Auto-generated method stub
		for(MenuDTO M: b) {
			if(M.getFood().equals("±è¹ä")) {
				System.out.println("Á¾·ù: "+M.getKind());
				System.out.println("¼ö·®: "+M.getNumber());
				System.out.println("ÇÕ°è: "+M.getNumber()*M.getPrice());
				System.out.println("-----------------");
			}
		}
	}

	@Override
	public void Basket(MenuDTO m) {
		// TODO Auto-generated method stub
		m.setFood("±è¹ä");
		System.out.println("±è¹äÁ¾·ù¸¦ ¼±ÅÃÇØ ÁÖ¼¼¿ä");
		System.out.println("1. ÂüÄ¡±è¹ä");
		System.out.println("2. ÀÏ¹İ±è¹ä");
		System.out.println("3. µ·±î½º±è¹ä");

		int kindNo=in.nextInt();
		in.nextLine();
		if(kindNo==1) {
			m.setKind("ÂüÄ¡±è¹ä");
			m.setPrice(3000);
		}else if(kindNo==2) {
			m.setKind("ÀÏ¹İ±è¹ä");
			m.setPrice(2000);
		}else if(kindNo==3) {
			m.setKind("µ·±î½º±è¹ä");
			m.setPrice(3000);
		}
		System.out.println("¸îÁÙÀ» ´ãÀ»±î¿ä?");
		int numberNo=in.nextInt();
		in.nextLine();
		m.setNumber(numberNo);
		b.add(m);
		System.out.println("ÁÖ¹®¿Ï·á!");
		
	}

}
