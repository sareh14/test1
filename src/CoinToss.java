
import java.util.Random;
public class CoinToss {
  
    public int TossACoin()
  {
      Random rand = new Random();
      
      int toss =Math.abs(rand.nextInt())%2;
      
      if (toss==0){
      
          return "HEADS";
      }
      else
      {
          return "TAILS";
      }
           
      
     
  }  
}
