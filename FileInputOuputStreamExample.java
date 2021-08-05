import java.io.*;
public class FileInputOuputStreamExample {

	public static void main(String[] args)throws Exception {
		int c;
 FileInputStream fis=new FileInputStream("E:\\cc\\unnamed.jpg");
 
FileOutputStream fos=new FileOutputStream("E:\\dummy\\max_sajib.jpg");

 while((c=fis.read())!=-1)
 {
	 fos.write(c);
 } 
 fis.close();
 fos.close();
 	}

}
