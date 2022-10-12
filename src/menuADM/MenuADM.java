package menuADM;

import java.util.ArrayList;
import java.util.Scanner;

import dao.DAO_INF;
import dao.KimbabDAO;
import dao.RamenDAO;
import dao.RicecakeDAO;
import dto.MenuDTO;

public class MenuADM {

	private DAO_INF newDao=null;
	private Scanner in= new Scanner (System.in);
	
	public MenuADM(){
		for(;;) {
			System.out.println("� �޴��� �����ұ��?");
			System.out.println("1. ���");
			System.out.println("2. ���");
			System.out.println("3. ������");
			int no= in.nextInt();
			in.nextLine();
			if(no==1) {
				newDao=new RamenDAO();				
			}else if(no==2) {
				newDao=new KimbabDAO();
			}else if(no==3) {
				newDao=new RicecakeDAO();
			}
			
			menu();
		}

	}

	
	
	
	
	public void menu() {
		for(;;) {
			System.out.println("1. ������");
			System.out.println("2. ��ٱ��� ���");
			System.out.println("3. �޴��� ����ϱ�");
			System.out.println("4. �ڷΰ���");
			int no= in.nextInt();
			in.nextLine();
			if(no==1) {
				info();
			}else if(no==2) {
				basket();
			}else if(no==3) {
				Pay();
			}else {
				break;
			}
		}

		
		
	}

	public void Pay() {
		newDao.Pay();
		
	}

	public void basket() {
		MenuDTO menu= new MenuDTO();
		newDao.Basket(menu);
		
	}

	public void info() {
		// TODO Auto-generated method stub
		newDao.Info();
	}
}
