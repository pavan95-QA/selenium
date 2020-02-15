package webdriverproject;
import java.io.FileOutputStream;  

public class duplicate {
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("‪F:\\New folder\\pavan.txt");    
             fout.write(65);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  