import java.io.*;


public class PipedExample {
	public static void main(String[] args) throws Exception{
		byte ch[]={99,100,101,102,103,104};
		int c=-1;

		 ByteArrayInputStream car=new ByteArrayInputStream(ch);
		 ByteArrayOutputStream caw=new ByteArrayOutputStream();
		while((c=car.read())!=-1)
		{
			
			caw.write(c);
		}
		System.out.println(caw);
		
	}
}
