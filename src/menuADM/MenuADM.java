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
			System.out.println("어떤 메뉴를 선택할까요?");
			System.out.println("1. 라면");
			System.out.println("2. 김밥");
			System.out.println("3. 떡볶이");
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
			System.out.println("1. 설명보기");
			System.out.println("2. 장바구니 담기");
			System.out.println("3. 메뉴별 계산하기");
			System.out.println("4. 뒤로가기");
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
