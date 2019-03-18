/*
 * @author Adrian Gomez
 */

package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.*;

public class Swing extends JFrame implements ActionListener{
    private JTextField textfield1;
    private JTextArea textarea1;
    private JLabel label1, label2, label3, label4, label5;
    private JButton boton1;
    private JRadioButton radio1,radio2,radio3;
    private ButtonGroup bg;
    private JCheckBox check1,check2,check3;
    private JMenuBar mb;
    private JMenu menu1;
    private JMenuItem mi1,mi2,mi3;
    private JComboBox combo1;
    
    public Swing() {
        setLayout(null);
        
        //JMenu
        mb=new JMenuBar();
        setJMenuBar(mb);
        menu1=new JMenu("Color de fondo");
        mb.add(menu1);
        mi1=new JMenuItem("Rojo");
        mi1.addActionListener(this);
        menu1.add(mi1);
        mi2=new JMenuItem("Verde");
        mi2.addActionListener(this);
        menu1.add(mi2);
        mi3=new JMenuItem("Azul");
        mi3.addActionListener(this);
        menu1.add(mi3);   
        
        //JLabel & JTextField
        label1=new JLabel("Introduce tu nombre...");
        label1.setBounds(10,10,150,30);
        add(label1);
        textfield1=new JTextField();
        textfield1.setBounds(150,13,150,20);
        add(textfield1);
        
        //JTextArea
        label2=new JLabel("Cuentanos algo de ti:");
        label2.setBounds(10,50,150,30);
        add(label2);
        textarea1=new JTextArea();
        textarea1.setBounds(10,80,400,300);
        add(textarea1);
        
        //JCheckBox
        label3=new JLabel("¿Que idiomas hablas?");
        label3.setBounds(430,10,150,30);
        add(label3);
        check1=new JCheckBox("Inglés");
        check1.setBounds(430,40,150,30);
        check1.addActionListener(this);
        add(check1);
        check2=new JCheckBox("Español");
        check2.setBounds(430,70,150,30);
        check2.addActionListener(this);        
        add(check2);
        check3=new JCheckBox("Alemán");
        check3.setBounds(430,100,150,30);
        check3.addActionListener(this);        
        add(check3);   
        
        //JRadioButton
        label4=new JLabel("¿Que tamaño de ventana quieres?");
        label4.setBounds(430,150,200,30);
        add(label4);
        bg= new ButtonGroup();
        radio1=new JRadioButton("660*500");
        radio1.setBounds(430,180,100,30);
        radio1.addActionListener(this);
        add(radio1);
        bg.add(radio1);
        radio2=new JRadioButton("1280*720");
        radio2.setBounds(430,210,100,30);
        radio2.addActionListener(this);        
        add(radio2);
        bg.add(radio2);
        radio3=new JRadioButton("1920*1080");
        radio3.setBounds(430,240,100,30);
        radio3.addActionListener(this);        
        add(radio3);
        bg.add(radio3);
        
        //JConboBox
        label5=new JLabel("¿Cual es tu color favorito?");
        label5.setBounds(430,290,150,30);
        add(label5);
        combo1=new JComboBox();
        combo1.setBounds(430,320,80,20);
        add(combo1);
        combo1.addItem("rojo");
        combo1.addItem("verde");
        combo1.addItem("azul");
        combo1.addItem("amarillo");
        combo1.addItem("negro");
        combo1.addActionListener(this);
        
        //JButton
        boton1=new JButton("Salir");
        boton1.setBounds(15,400,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            System.exit(0);
        }
        
        if (radio1.isSelected()) {
            setSize(660,500);
        }
        if (radio2.isSelected()) {
            setSize(800,600);
        }
        if (radio3.isSelected()) {
            setSize(1024,768);
        }   
        
        String cad="Hablas en ";
        if (check1.isSelected()==true) {
            cad=cad+"Inglés, ";
        }
        if (check2.isSelected()==true) {
            cad=cad+"Español, ";
        }
        if (check3.isSelected()==true) {
            cad=cad+"Alemán.";
        }
        setTitle(cad);
        
        Container f=this.getContentPane();
        if (e.getSource()==mi1) {
            f.setBackground(new Color(255,0,0));
        }
        if (e.getSource()==mi2) {
            f.setBackground(new Color(0,255,0));
        }
        if (e.getSource()==mi3) {
            f.setBackground(new Color(0,0,255));
        }  
        
        if (e.getSource()==combo1) {
            String seleccionado=(String)combo1.getSelectedItem();
            setTitle("tu color favorito es el " + seleccionado);
        }
    }
    
    public static void main(String[] ar) {
        Swing f=new Swing();
        f.setBounds(0,10,660,500);
        f.setResizable(false);
        f.setVisible(true);
    }
}