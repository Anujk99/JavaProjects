
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anuj Khandelwal
 */
public class WordCounter implements ActionListener{
    Frame f=new Frame("World Counter");
    TextArea ta =new TextArea();
    Button b=new Button("Count");
    Label l=new Label();
    Label l1=new Label();
    WordCounter(){
        f.setSize(500,520);
        f.setLayout(null);
        f.setVisible(true);
        
        ta.setBounds(30,30,400,400);
        ta.setVisible(true);
        f.add(ta);
        b.setBounds(250,430,50,30);
        f.add(b);
        b.addActionListener(this);
        l.setBounds(10,470,160,15);
        f.add(l);
        l1.setBounds(10,490,160,15);
        f.add(l1);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String text=ta.getText();
        int len=text.length();
        String words[]=text.split("\\s");
        text=text.replaceAll("[\\n\\t ]", "");
   
        l.setText("Total Characters are : "+(text.length()));
        l1.setText("Total Words are : "+(words.length));
        
    }
    public static void main(String[] args) {
        WordCounter ob=new WordCounter();
        
    }
    
}
