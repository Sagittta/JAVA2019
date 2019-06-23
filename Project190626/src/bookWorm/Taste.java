package bookWorm;

import java.util.*;
import java.sql.*;

public class Taste {
	int age, country, genre, author;
	String book;
	
	public void selecTaste() {
		Scanner sc = new Scanner(System.in);
		
		age = sc.nextInt();
		country = sc.nextInt();
		genre = sc.nextInt();
		author = sc.nextInt();
		book = sc.next();
	}

}
