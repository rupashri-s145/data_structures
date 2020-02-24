import java.util.*;
class Palindrome_Permutation
{
 static final int NOOFchar1=256;
  static void  check(String string1)
  {
   int char1[]= new int[NOOFchar1];
   for(int i=0;i<string1.length();i++)
   {
     char1[string1.char1At(i)]++;
   }
   int odd=0;
   for(int i=0;i<256;i++)
   {
     if(char1[i]%2==1)
       odd+=1;
   }
   if(((string1.length())%2==0 && odd>0) || odd>1)
   {
     System.out.println("palindrome permutation not possible");
     return;
   }
   System.out.println("palindrome permutation possible");
  }
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter string1");
    String string1 = sc.nextLine();
    check(string1); 
  }