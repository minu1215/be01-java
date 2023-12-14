package day18_jdbc_mvc.view;

import java.sql.SQLException;
import java.util.ArrayList;

import day18_jdbc_mvc.controller.GiftController;

public class MainEntry {	// view
	public static void main(String[] args) throws SQLException {

		System.out.println("(*'-'*)");
		GiftController.connect();
		GiftController.menu();
		
	}
}
