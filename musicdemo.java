interface musicplayer
{
 void on();
 void off();
 void play();
 void stop();
}
 
interface videoplayer extends musicplayer
{
 void changecontrast(int x);
 void changebrightness(int x);
}

class ipod implements videoplayer
{
 public void on(){System.out.println("music and video is ON");}
 public  void off(){System.out.println("music and video is OFF");}
 public void play(){System.out.println("music is PLAY but video is PLAY");}
 public void stop(){System.out.println("music and video is STOP");}
 public void changecontrast(int x){System.out.println("changes is "+x);}
 public void changebrightness(int x){System.out.println("changes is "+x);} 
}

class musicdemo
{
public static void main(String[]args)
  {
   ipod i=new ipod();
   i.on();
   i.off();
   i.play();
   i.stop();
   i.changecontrast(10);
   i.changebrightness(12);
  }
}