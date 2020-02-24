import java.util.*;
import java.util.Collections;
public class stringCompression
{
   static void compress_String(String input)
   {
       String result="";
       int count=1;
       result+=input.charAt(0);
       for(int i=1;i<input.length();i++)
       {
           char ch=input.charAt(i);
           if(result.charAt(result.length()-1)==ch)
           {
             count+=1;
           }
           if(result.charAt(result.length()-1)!=ch)
           {
               result+=count;
               result+=ch;
               count=1;
           }
           if( i+1==input.length())
           result+=count;
        }
       System.out.println(result);
   }
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    String input=sc.next();
	    compress_String(input);
}
}
