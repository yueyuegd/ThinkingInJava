package Chapter5;

public class EXERCISE22_2 {
	private RMB r;
	public EXERCISE22_2(RMB r){
		this.r = r;
	}
	public void descibe(){
		System.out.print("���鵽����ֵ��:");
		switch(r){
		case ONE:
			System.out.println("ֽ��һ��");
			break;
		case TWO:
			System.out.println("ֽ������");
			break;	
		case FIVE:
			System.out.println("ֽ�����");
			break;
		case TEN:
			System.out.println("ֽ��ʮԪ");
			break;
		case TWENTY:
			System.out.println("ֽ�Ҷ�ʮԪ");
			break;
		case FIFTY:
			System.out.println("ֽ����ʮԪ");
			break;
			default:
				System.out.println("���ź�����û�г����κ�ֽ��");
		}
	}

	public static void main(String[] args) {
		EXERCISE22_2 one = new EXERCISE22_2(RMB.ONE),
				                  two = new EXERCISE22_2(RMB.TWO),
				                  five = new EXERCISE22_2(RMB.FIVE),
				                  ten = new EXERCISE22_2(RMB.TEN),
				                  twenty = new EXERCISE22_2(RMB.TWENTY),
				                  fifty = new EXERCISE22_2(RMB.FIFTY);
		one.descibe();
		two.descibe();
		five.descibe();
		ten.descibe();
		twenty.descibe();
		fifty.descibe();

	}

}
