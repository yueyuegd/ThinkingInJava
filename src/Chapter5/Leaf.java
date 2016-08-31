package Chapter5;

public class Leaf {
	int i = 0;
	Leaf increment(){
		i++;
		return this;
	}
	void print(){
		System.out.println("i="+i);
	}

	public static void main(String[] args) {
		Leaf l = new Leaf();
		l.increment().increment().increment().print();

	}

}
