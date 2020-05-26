/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anuj Khandelwal
 */
public class IPFinder implements ActionListener{
    TextField tf=new TextField();
    Button b=new Button("find ip");
    Label l=new Label();
    Label l1=new Label();
IPFinder(){
    Frame f=new Frame();
    f.setSize(500,250);
    f.setLayout(null);
    f.setVisible(true);
    l1.setBounds(60, 50,150, 20);
    l1.setText("Enter URL");
    tf.setBounds(130, 50,150, 20);
    b.setBounds(130, 80,150, 20);
    l.setBounds(130, 120,150, 20);
    f.add(tf);
    f.add(b);
    f.add(l);
    f.add(l1);
    b.addActionListener(this);
}
    @Override
    public void actionPerformed(ActionEvent e) {
    
        try{  
        String host=tf.getText();
        l.setText("Please Wait..");
        String ip=java.net.InetAddress.getByName(host).getHostAddress();  
        l.setText("IP is: "+ip);  
        }catch(Exception ex){
            l.setText("Invalid URL");
            System.out.println(ex);
        
        }  
        
    }
    public static void main(String[] args) {
        IPFinder ob=new IPFinder();
    }
}
