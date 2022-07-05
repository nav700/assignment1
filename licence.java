import java.util.*;

class licence
{
public static void main(String[]args)
  {
   int id;
  Scanner s=new Scanner(System.in);
  id=s.nextInt();
  if(id<=15)
   {
     try{
          throw AgenotvalidException();
        }
     catch(AgenotvalidException e)
        {System.out.println("yourage is not valid");}
   }
   else
    { System.out.println("you are allowed ");}
 }
}
/*class licencedemo
{
  public static void main(String[]args)
  {
    

  }*/

class AgenotvalidException extends Exception
{
}











