import music.Playable;
import music.string.veena;
import music.wind.saxaphone;
public class Test{
   public static void main(String []args){
      veena v=new veena();
      v.play();
      
      Playable pv=new veena();
      pv.play();

      saxaphone s=new saxaphone();
      s.play();
      
      Playable ps=new saxaphone();
      ps.play();


      
   }
}