package dao;

import java.util.ArrayList;

import dto.MenuDTO;

public class KimbabDAO implements DAO_INF{
	ArrayList<MenuDTO> b=new ArrayList<>();
	
	@Override
	public void Info() {
		// TODO Auto-generated method stub
		System.out.println("�������� ������ �� ������");
	}

	@Override
	public void Pay() {
		// TODO Auto-generated method stub
		for(MenuDTO M: b) {
			if(M.getFood().equals("���")) {
				System.out.println("����: "+M.getKind());
				System.out.println("����: "+M.getNumber());
				System.out.println("�հ�: "+M.getNumber()*M.getPrice());
				System.out.println("-----------------");
			}
		}
	}

	@Override
	public void Basket(MenuDTO m) {
		// TODO Auto-generated method stub
		m.setFood("���");
		System.out.println("��������� ������ �ּ���");
		System.out.println("1. ��ġ���");
		System.out.println("2. �Ϲݱ��");
		System.out.println("3. ������");

		int kindNo=in.nextInt();
		in.nextLine();
		if(kindNo==1) {
			m.setKind("��ġ���");
			m.setPrice(3000);
		}else if(kindNo==2) {
			m.setKind("�Ϲݱ��");
			m.setPrice(2000);
		}else if(kindNo==3) {
			m.setKind("������");
			m.setPrice(3000);
		}
		System.out.println("������ �������?");
		int numberNo=in.nextInt();
		in.nextLine();
		m.setNumber(numberNo);
		b.add(m);
		System.out.println("�ֹ��Ϸ�!");
		
	}

}
