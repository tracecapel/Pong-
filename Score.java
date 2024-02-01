import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
public class Score extends Rectangle {
    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1;
    int player2;
    
    public Score(int gameWidth, int gameHeight){
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;
    }

    public void draw(Graphics g){
        g.setColor(Color.white);
        g.setFont(new Font("Consolas", Font.PLAIN, 60));
        g.drawLine(500, 0, 500, 700);
        
        g.drawString(String.valueOf(player1), (GAME_WIDTH / 2)  , 50);
        
        g.drawString(String.valueOf(player2), (GAME_WIDTH / 2) +965 , 50);
    }

    public static void printWinMessage(Graphics g){
        g.drawString("Player 1 wins", GAME_WIDTH / 2, GAME_HEIGHT / 2);
    }

    
}
