package dao;

import java.util.ArrayList;

import dto.MenuDTO;

public class RicecakeDAO implements DAO_INF{
	
	@Override
	public void Info() {
		// TODO Auto-generated method stub
		System.out.println("���� ������ �ϳ� �� �������� ��������");
	}

	@Override
	public void Pay() {
		// TODO Auto-generated method stub
		for(MenuDTO M: b) {
			if(M.getFood().equals("������")) {
				System.out.println("�� ����: "+M.getKind());
				System.out.println("�ʱ�: "+M.getHot());
				System.out.println("����: "+M.getNumber());
				System.out.println("����: "+M.getNumber()*2000);
				System.out.println("----------------");
			}
		}
	}

	@Override
	public void Basket(MenuDTO m) {
		// TODO Auto-generated method stub
		m.setFood("������");
		System.out.println("���� ������ ������ �ּ���");
		System.out.println("1. �Ҷ�");
		System.out.println("2. �ж�");
		int kindNo=in.nextInt();
		in.nextLine();
		if(kindNo==1) {
			m.setKind("�Ҷ�");
		}else if(kindNo==2) {
			m.setKind("�ж�");
		}
		System.out.println("�ʱ⸦ ������ �ּ���");
		System.out.println("1. ��");
		System.out.println("2. �߰�");
		System.out.println("3. ����");
		int hotNo=in.nextInt();
		in.nextLine();
		if(hotNo==1) {
			m.setHot("��");
		}else if(hotNo==2) {
			m.setHot("�߰�");
		}else if(hotNo==3) {
			m.setHot("����");
		}
		
		System.out.println("������ ������ �ּ���");
		System.out.println("1. 1�κ� ");
		System.out.println("2. 2�κ�");
		int numberNo=in.nextInt();
		in.nextLine();
		if(numberNo==1) {
			m.setNumber(1);
		}else if(numberNo==2) {
			m.setNumber(2);
		}
		b.add(m);
		System.out.println("�ֹ��Ϸ�!");
		
		
		
		
		
		
		
		
		
		
	}

}
