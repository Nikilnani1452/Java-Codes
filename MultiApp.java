import java.util.*;
class Thread1 extends Thread
{
 public void run()
 {
  Random r=new Random();
  int n=r.nextInt(20);
  System.out.println("Random integer Generated:"+n);
   if(n%2==0)
   {
  Thread2 th2=new Thread2(n);
  th2.start();
   }
   else
   {
  Thread3 th3=new Thread3(n);
  th3.start(); 
  } 
  try{
  Thread.sleep(1000);
  }
  catch(InterruptedException e)
  {
   System.out.println("Interrupted Exception");
  }
 }
}
class Thread2 extends Thread
{
 int x;
 Thread2(int n)
 {
  x=n;
 }
 public void run()
 { 
   System.out.println("Square of the number is:"+(x*x));
 }
}
class Thread3 extends Thread
{
 int x;
 Thread3(int n)
 {
  x=n;
 }
 public void run()
 {
   System.out.println("Cube of the number is:"+(x*x*x));
 }
}
class MultiApp
{
 public static void main(String args[])
 {
   Thread1 th1=new Thread1();
   th1.start();	
 }
}
