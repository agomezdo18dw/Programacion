package InterfacesVisuales;

import javax.swing.*;

public class InterfacesVisuales extends JFrame{
    private JLabel label1;
    public InterfacesVisuales() {
        setLayout(null);
        label1=new JLabel("Hola Mundo.");
        label1.setBounds(10,20,200,30);
        add(label1);
    }
    
    public static void main(String[] ar) {
        InterfacesVisuales formulario1=new InterfacesVisuales();
        formulario1.setBounds(10,10,400,300);
        formulario1.setVisible(true);
    }
}