import java.util.*;
import java.util.Collections;
public class string_Rotation
{
    static boolean isSubstring(String input1,String input2)
    {
        int count=0;
        while(true)
        {
            char input_arr[]=input1.toCharArray();
            char ch=input_arr[0];
            for(int i=0;i<input1.length()-1;i++)
            {
                input_arr[i]=input_arr[i+1];
            }
            input_arr[input1.length()-1]=ch;
            input1=String.valueOf(input_arr);
            count+=1;
            if(input1.equals(input2))
              return true;
            if(count==input1.length())
              return false;
        }
    }
	public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    String input1=sc.next();
    String input2=sc.next();
    if(isSubstring(input1,input2))
    System.out.println("yes");
    else
    System.out.println("no");
}
}
