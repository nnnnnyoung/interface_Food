package dao;

import java.util.ArrayList;
import java.util.Scanner;

import dto.MenuDTO;

public interface DAO_INF {
	Scanner in=new Scanner (System.in);
	ArrayList<MenuDTO> b=new ArrayList<>();
	public void Info();
	public void Pay();
	public void Basket(MenuDTO m);
	
}
