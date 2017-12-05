import java.util.*;
/**
 * Driver class, sets up game
 * 
 * To test your code, add a line like players.add(new ________)
 * of your class
 */
public class Driver
{
    public static void main(String [] args)
    {
        List <Player> players = new ArrayList <Player> ();
        boolean printsRun = false;
        //add players to game
        players.add(new Example2());
        players.add(new Example1());
        players.add(new Siddarth());
        players.add(new Vanshaj());
        
        Game newGame = new Game(players, printsRun);
        newGame.play();
        newGame.displayScore();   
        System.out.println("Vanshaj wins everytime! Siddarth is a loser! ;)");
        System.out.println("Made by Vanshaj Johar and Siddarth Aadi Venkatesh Kumar 3rd period");
    }
}