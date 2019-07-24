import java.io.*;
import java.util.*;
class Main{

 public static void main(String []args){
String s;
Scanner sc=new Scanner(System.in);
s=sc.nextLine();
String[] str=s.split(",");
int length = str.length;
int a=Integer.parseInt(String.valueOf(str[0]));
int b=Integer.parseInt(String.valueOf(str[1]));
int c=Integer.parseInt(String.valueOf(str[2]));

  if(a>b && a>c)
		System.out.println(a);
  	else if(b>c)
		System.out.println(b);
  	else
		System.out.println(c);
 }
}