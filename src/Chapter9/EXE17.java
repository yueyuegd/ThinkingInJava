package Chapter9;
interface staticfinalTest{
	String RED = "red";
}
class Test implements staticfinalTest{
	void Test(){
		//RED = "blue";��final���͵�
	}
}

public class EXE17 {
	public static void main(String[] args) {
		System.out.println("staticfinalTest.RED="+staticfinalTest.RED);//��static���͵�
	}

}
