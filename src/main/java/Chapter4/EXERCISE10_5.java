package Chapter4;

public class EXERCISE10_5 {
	public static boolean VampireNumber(int i){
		int unit = i%10;//��λ
		int tens = i%100/10;//ʮλ
		int hundred = i%1000/100;//��λ
		int thousand = i/1000;//ǧλ
		if((thousand*10+hundred)*(tens*10+unit)==i||(thousand*10+hundred)*(unit*10+tens)==i||
				(hundred*10+thousand)*(tens*10+unit)==i||(thousand*10+hundred)*(unit*10+tens)==i||
				(thousand*10+tens)*(hundred*10+unit)==i||(thousand*10+tens)*(unit*10+hundred)==i||
				(tens*10+thousand)*(hundred*10+unit)==i||(tens*10+thousand)*(unit*10+hundred)==i||
				(thousand*10+unit)*(hundred*10+tens)==i||(thousand*10+unit)*(tens*10+hundred)==i||
				(unit*10+thousand)*(hundred*10+tens)==i||(unit*10+thousand)*(tens*10+hundred)==i){
			return true;
		}else{
			return false;
		}
		
		
	}

	public static void main(String[] args) {
		for(int i=1000;i<=9999;i++){
			if(VampireNumber(i)){
				System.out.print(i+" ");
			}
		}

	}

}
