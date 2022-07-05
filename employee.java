public class employee 
{
int id;
String s;
employee(){id=30;s="naveen bhardwaj";}
employee(int a,String b){id=a; s=b;}
/*void getdata(int x,String y)
  {
    id=x;
    s=y;
  }
  
 void getdata(int a)
 {
   id=a;
 }*/
 void display()
 {
  System.out.println(id+" "+s);
 }
}
class studmain
{
public static void main(String[]args)
 {
  employee e=new employee();
//  e.getdata(12,"naveen");
  e.display();
  employee e1=new employee(16,"rahul bhardwaj");
  //e1.getdata(34);
  e1.display();
 }

}