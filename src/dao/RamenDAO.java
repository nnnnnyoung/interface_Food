package dao;

import dto.MenuDTO;

public class RamenDAO implements DAO_INF{
	
	@Override
	public void Info() {
		// TODO Auto-generated method stub
		System.out.println("���� ���� ������ ��, ������ ����� �ϼ�");
	}

	@Override
	public void Pay() {
		// TODO Auto-generated method stub

		for(MenuDTO M:b) {
			if(M.getFood().equals("���")) {
				System.out.println("����: "+M.getKind());
				System.out.println("����: "+M.getPrice());
				System.out.println("-----------------");
			}
		}

		
	}

	@Override
	public void Basket(MenuDTO m) {
		m.setFood("���");
		System.out.println("�޴��� ������ �ּ���");
		System.out.println("1. �����  ");
		System.out.println("2. ����  ");
		
		int no=in.nextInt();
		in.nextLine();
		if(no==1) {
			m.setKind("�����");
			m.setPrice(1500);
			b.add(m);
		}else if(no==2) {
			m.setKind("����");
			m.setPrice(2000);
			b.add(m);
			
		}
		
		System.out.println("�ֹ��Ϸ�!");
		
	}

}
