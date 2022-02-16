import java.util.*;
class Stringpalindrome
{
 public static void main(String[] args)
 {
 	String str;
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Sting :");
    str=sc.next();
    int flag=0;
    String str1=str.toLowerCase();
    int l=str1.length();
    for(int i = 0; i < l/2; i++)
    {
    	if(str1.charAt(i) != str1.charAt(l-i-1))
    	{


              flag = 1;
              break;
        }
        i=i+1;
    }

   if (flag==0)
   {
   	System.out.println(str1+"'"+" is palindrome ");
   }
   else
   {
   	System.out.println(str1+"'"+" is  not palindrome ");
   }
  }
 }