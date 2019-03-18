/*
 *@Author Aitor Ortiz 
 */

package prueba;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.*;

public class prueba extends JFrame implements ActionListener{
	private JLabel label1, label2, label3, label4; 
	private JButton boton1;
	private JTextField textfield1;
	private JTextArea textarea1;
	private JComboBox combo1;
	private JMenuBar mb;
	private JMenu menu1;
	private JMenuItem mi1,mi2,mi3;
	private JCheckBox check1, check2, check3;
	private JRadioButton radio1, radio2, radio3;
	private ButtonGroup bg;
	
	public prueba() {
		setLayout(null);
		label1=new JLabel("Hola, escribe tu nombre aqui: ");
		label1.setBounds(10,20,300,30);
		add(label1);
		label2=new JLabel("Dale al boton para salir.");
		label2.setBounds(10,375,150,30);
		add(label2);
		label3=new JLabel("¿Cual es tu color favorito?");
		label3.setBounds(425,20,150,30);
		add(label3);
		label4=new JLabel("¿En que idioma hablas?");
		label4.setBounds(425,175,150,30);
		add(label4);
		
		textfield1=new JTextField();
		textfield1.setBounds(200,27,150,20);
		add(textfield1);
		
		textarea1=new JTextArea();
		textarea1.setBounds(10,60,400,300);
		add(textarea1);
		
		boton1=new JButton("Salir");
		boton1.setBounds(150,375, 100, 30);
		add(boton1);
		boton1.addActionListener(this);
		
		combo1=new JComboBox();
		combo1.setBounds(425, 50, 80, 20);
		add(combo1);
		combo1.addItem("Rojo");
		combo1.addItem("Verde");
		combo1.addItem("Azul");
		combo1.addItem("Amarillo");
		combo1.addItem("Negro");
		combo1.addActionListener(this);
		
		mb=new JMenuBar();
		setJMenuBar(mb);
		menu1=new JMenu("Opciones");
		mb.add(menu1);
		mi1= new JMenuItem("Rojo");
		mi1.addActionListener(this);
		menu1.add(mi1);
		mi2= new JMenuItem("Verde");
		mi2.addActionListener(this);
		menu1.add(mi2);
		mi3= new JMenuItem("Azul");
		mi3.addActionListener(this);
		menu1.add(mi3);
		
		check1= new JCheckBox("Ingles");
		check1.setBounds(425, 200, 150, 30);
		check1.addActionListener(this);
		add(check1);
		check2= new JCheckBox("Español");
		check2.setBounds(425, 250, 150, 30);
		check2.addActionListener(this);
		add(check2);
		check3= new JCheckBox("Euskera");
		check3.setBounds(425, 300, 150, 30);
		check3.addActionListener(this);
		add(check3);
		
		bg= new ButtonGroup();
		radio1= new JRadioButton(" 600*500 ");
		radio1.setBounds(250, 375, 100, 30);
		radio1.addActionListener(this);
		add(radio1);
		bg.add(radio1);
		radio2= new JRadioButton(" 800*700 ");
		radio2.setBounds(350, 375, 100, 30);
		radio2.addActionListener(this);
		add(radio2);
		bg.add(radio2);
		radio3= new JRadioButton(" 1000*1000 ");
		radio3.setBounds(450, 375, 100, 30);
		radio3.addActionListener(this);
		add(radio3);
		bg.add(radio3);
	}
	
	
	
	public void actionPerformed (ActionEvent e) {
		if (e.getSource()== boton1) {
			System.exit(0);
		}
		
		Container f= this.getContentPane();
		if (e.getSource()==mi1) {
			f.setBackground(new Color(255,0,0));
		}
		if (e.getSource()==mi2) {
			f.setBackground(new Color(0,255,0));
		}
		if (e.getSource()==mi3) {
			f.setBackground(new Color(0,0,255));
		}
		
		String cad="Hablas en ";
		if (check1.isSelected()==true) {
			cad=cad+"Ingles-";
		}
		if (check2.isSelected()==true) {
			cad=cad+"Español-";
		}
		if (check3.isSelected()==true) {
			cad=cad+"Euskera-";
		}
		setTitle(cad);
		
		if (e.getSource()== combo1) {
			String seleccionado=(String)combo1.getSelectedItem();
			setTitle("Tu color favorito es el "+seleccionado);
		}
		if (radio1.isSelected()) {
			setSize(600,500);
		}
		if (radio2.isSelected()) {
			setSize(800,700);
		}
		
		if (radio3.isSelected()) {
			setSize(1000,1000);
		}
		
		
		
	}
	
	
	
	public static void main (String[] ar) {
		prueba f = new prueba();
		f.setBounds(10,10,600,500);
		f.setResizable(false);
		f.setVisible(true);
	}

}