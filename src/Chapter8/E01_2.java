package Chapter8;
class Unicycle extends Cycle{
	public void ride(){
		System.out.println("���̤��");
	}
}
class Bicycle extends Cycle{
	public void ride(){
		System.out.println("�ﵥ��");
	}
}
class Tricycle extends Cycle{
	public void ride(){
		System.out.println("�����ֳ�");
	}
}

public class E01_2 {

	public static void main(String[] args) {
		Cycle c1 = new Unicycle();
		Cycle c2 = new Bicycle();
		Cycle c3 = new Tricycle();
		c1.ride();
		c2.ride();
		c3.ride();

	}

}
