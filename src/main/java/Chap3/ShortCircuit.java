package Chap3;

public class ShortCircuit {//�Ƚ�ĳ��ֵ��1�Ĵ�С
	static boolean test1(int val){
		System.out.println("test1("+val+")");
		System.out.println("result:"+(val<1));
		return val<1;
	}
	static boolean test2(int val){//�Ƚ�ĳ��ֵ��2�Ĵ�С
		System.out.println("test2("+val+")");
		System.out.println("result:"+(val<2));
		return val<2;
	}
	static boolean test3(int val){//�Ƚ�ĳ��ֵ��3�Ĵ�С
		System.out.println("test3("+val+")");
		System.out.println("result:"+(val<3));
		return val<3;
	}

	public static void main(String[] args) {
		boolean b = test1(0) && test2(2) && test3(2);//������·������
		//test2(2)�Ľ��Ϊfalse����test3(2)��ִ��
		System.out.println("Expressing:"+b);

	}

}
