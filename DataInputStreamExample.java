import java.io.DataInputStream;
public class DataInputStreamExample {

	public static void main(String[] args) throws Exception {
		 
		DataInputStream dis=new DataInputStream(System.in);
		
		System.out.println("Enter Two Values");
		int a=Integer.parseInt(dis.readLine());
		int b=Integer.parseInt(dis.readLine());
		
		int c=a+b;
		
		System.out.println("Sum="+c);
		
	}

}
