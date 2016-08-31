package Chap3;

class Dog{
	String name;
	String says;
}

public class EXERCISE5_2_6_3 {
	public static void Compare(Dog d1,Dog d2){
		System.out.println("== on top references: "+(d1==d2));
		System.out.println("== equals() on top references: "+d1.equals(d2));
		System.out.println("== on name: "+(d1.name==d2.name));
		System.out.println("== equals() on name: "+d1.name.equals(d2));
		System.out.println("== on says: "+(d1.says==d2.says));
		System.out.println("== equals() on says: "+d1.says.equals(d2));
	}

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.name = "spot";
		d1.says = "Ruff!";
		System.out.println("d1������Ϊ:"+d1.name+",d1�Ľ���Ϊ:"+d1.says);
		Dog d2 = new Dog();
		d2.name = "scruffy";
		d2.says = "Wurf!";
		System.out.println("d2������Ϊ:"+d2.name+",d2�Ľ���Ϊ:"+d2.says);
		Dog d3 = d1;
		//d3 = d1;
		System.out.println("d1��d2�ȽϽ��:");
		Compare(d1,d2);
		System.out.println("d1��d3�ȽϽ��:");
		Compare(d1,d3);
		System.out.println("d2��d3�ȽϽ��:");
		Compare(d2,d3);
		

	}

}
