package access.connection;

public class ConnectionManage {
	private static Connection[] pool = new Connection[10];
	private static int counter = 0;
	static{
		for(int i=0;i<pool.length;i++){
			pool[i] = new Connection();
		}
	}
	public static Connection getConnection(){
		if(counter<pool.length){
			return pool[counter++];
		}
		return null;
	}

	public static void main(String[] args) {
		

	}

}
