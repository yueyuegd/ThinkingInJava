package Strings;
import java.util.*;

public class Receipt {
	private double total = 0;
	private Formatter f = new Formatter(System.out);
	public void printTitle(){
		f.format("%-15s %5s %10s\n","Item","Qty","Price");
		f.format("%-15s %5s %10s\n", "----", "---",  "-----");
	}
	public void print(String name,int qty,double price){
		f.format("%-15.15s %5d %10.2f\n",name,qty,price);
		total +=price;
	}
	public void printTotal(){
		f.format("%-15s %5s %10.2f\n","Tax","",total*0.06);
		f.format("%-15s %5s %10s\n","","","-----");
		f.format("%-15s %5s %10.2f\n","Total","",total*1.06);
		
		
	}
	public static void main(String[] args) {
		Receipt recepit = new Receipt();
		recepit.printTitle();
		recepit.print("Jack's Magic Beas",4,4.25);
		recepit.print("Princess Peas",3,5.1);
		recepit.print("Three Bears Porridge",1,14.29);
		recepit.printTotal();
		
	}

}
