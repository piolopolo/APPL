import java.awt.*; 
import javax.swing.*; 
public class CurrencyConverter { 
    public static void main (String[] args) { 
        JFrame frame = new JFrame ("Currency Converter"); 
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); 
        frame.setSize(316, 160);
        frame.setResizable(false);
        RatePanel ratePanel = new RatePanel (); 
        frame.getContentPane().add(ratePanel); 
        frame.setVisible(true); 
    }
}