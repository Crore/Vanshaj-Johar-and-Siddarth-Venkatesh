import java.util.*;
public class Vanshaj implements Player
{
    private static String name = "Vanshaj";
    private static String teamNames = "Joker";
   public String move(List <String> myMoves, List <String> opponentMoves, int myScore, int opponentScore)
    {
        double rand;
        if(myMoves.size() % 3 == 0)
            return "r";
        else if(myMoves.size() % 3 == 1){
            rand = Math.random();
            if(rand >= 0.33){
                return "r";
            }
            else if(rand < 0.33)
                return "s";
            else if(myMoves.size() % 3 == 2){
               if(rand >= 0.66){
                    return "r";
                }
                else if(rand < 0.66){
                   return "s";
                }
            }
        }
        return "p";
       }
    public String getName()
    {
        return name;
    }
} 
