package Chapter7;

class Amphibian{
	public void moveInwater(){
		System.out.println(" A moving in water");
	}
	public void moveOnland(){
		System.out.println("A moving on land");
	}
}
class Frog extends Amphibian{
	public void moveInwater(){//����
		System.out.println("F moving in water");
	}
	public void moveOnland(){
		System.out.println("F moving on land");
	}
}
public class E16_2_Frog {

	public static void main(String[] args) {
		Amphibian a = new Frog();//����ת��
		a.moveInwater();//���ؿ����ã���д������
		a.moveOnland();

	}

}
