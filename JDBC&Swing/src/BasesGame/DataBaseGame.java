/**
 * @Author Adrian Gomez Dominguez
 */
package BasesGame;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Formulario.BajaYModificacion;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseGame extends JFrame{
	
	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JLabel labelResultado;
	private JButton btnConsultaPorCdigo;
	private JTextField tf3;
	  
	/**
	 * Lanzamos la aplicacion
	 */
	public static void main(String[] args) {
	    EventQueue.invokeLater(new Runnable() {
	      public void run() {
	        try {
	        	DataBaseGame frame = new DataBaseGame();
	          frame.setVisible(true);
	        } catch (Exception e) {
	          e.printStackTrace();
	        }
	      }
	    });
	  }
	
	/**
	 * Creamos la ventana (frame)
	 */
	public DataBaseGame() {
		
		//Ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(100, 100, 606, 405);
	    contentPane = new JPanel();
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    setContentPane(contentPane);
	    contentPane.setLayout(null);
	    
	    //Primer texto (Nombre del articulo)
	    JLabel lblNombreDelArtculo = new JLabel("Nombre del artículo:");
	    lblNombreDelArtculo.setBounds(25, 30, 193, 14);
	    contentPane.add(lblNombreDelArtculo);
	    
	    //TextField de nombre
	    tf1 = new JTextField();
	    tf1.setBounds(200, 27, 190, 20);
	    contentPane.add(tf1);
	    tf1.setColumns(10);
	    
	    //Segundo texto (Compañia)
	    JLabel lblCompañia = new JLabel("Compañia:");
	    lblCompañia.setBounds(25, 65, 193, 40);
	    contentPane.add(lblCompañia);
	}

}
