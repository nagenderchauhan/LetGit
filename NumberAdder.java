public class NumberAdder
{
static int num1=-10222;
static int num2=10223;
public void setNums(int n1,int n2)
{
num1 = n1 ;
num2 = n2 ;
}
public static int  Sum()
{
return num1 + num2 ;
}
public static void main (String args[])
{
int sum=Sum();
System.out.println("sumof"+sum);
}
}
