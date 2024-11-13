package guigrind;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import javax.swing.*;
import java.awt.Font;

/**
 *
 * @author HP
 */
public class GuiGrind {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JFrame frame= new JFrame();
        //frame.setVisible(true);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(600,600);
        //frame.setLocationRelativeTo(null);
        new myFrame();
        
    }
    
}
class myFrame extends JFrame{
    
    JLabel l = new JLabel("coding");
    public myFrame()
    {
        super("the title");
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400,400);
        l.setText("adnan");
        Font font=new Font("Ariel",Font.PLAIN,40);
        l.setFont(font);
        add(l);
    }
}
