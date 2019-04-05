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
	private JTextField tfNA;
	private JTextField tfCom;
	private JTextField tfPre;
	private JTextField tfCod;
	private JLabel labelResultado;
	private JLabel lblIngreseCdigoDe;
	private JButton btnConsultaPorCdigo;
	
	
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
	    setBounds(100, 100, 460, 365);
	    contentPane = new JPanel();
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    setContentPane(contentPane);
	    contentPane.setLayout(null);
	    
	    //Primer texto (Nombre del articulo)
	    JLabel lblNombreDelArtculo = new JLabel("Nombre del artículo:");
	    lblNombreDelArtculo.setBounds(25, 30, 193, 14);
	    contentPane.add(lblNombreDelArtculo);
	    
	    //TextField de nombre del articulo
	    tfNA = new JTextField();
	    tfNA.setBounds(230, 27, 190, 20);
	    contentPane.add(tfNA);
	    tfNA.setColumns(10);
	    
	    //Segundo texto (Compañia)
	    JLabel lblCompañia = new JLabel("Compañia:");
	    lblCompañia.setBounds(25, 50, 193, 40);
	    contentPane.add(lblCompañia);
	    
	    //TextField de compañia
	    tfCom = new JTextField();
	    tfCom.setBounds(230, 60, 190, 20);
	    contentPane.add(tfCom);
	    tfCom.setColumns(10);

	    //Tercer texto (Precio)
	    JLabel lblPrecio = new JLabel("Precio:");
	    lblPrecio.setBounds(25, 81, 193, 40);
	    contentPane.add(lblPrecio);
	    
	    //TextField de precio
	    tfPre = new JTextField();
	    tfPre.setBounds(230, 92, 190, 20);
	    contentPane.add(tfPre);
	    tfPre.setColumns(10);
	    
	    //Boton Alta datos
	    JButton btnAlta = new JButton("Alta Datos");
	    btnAlta.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent arg0) {
	        labelResultado.setText("");        
	        try {
	          Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/game","root" ,"anboto");
	          Statement comando=conexion.createStatement();
	          comando.executeUpdate("insert into articulos(Nombre,Compañia,precio) values ('"+tfNA.getText()+"','"+tfCom.getText()+"',"+tfPre.getText()+")");
	          conexion.close();
	          labelResultado.setText("Se registraron los datos");
	          tfNA.setText("");
	          tfCom.setText("");
	          tfPre.setText("");
	        } catch(SQLException ex){
	          setTitle(ex.toString());
	        }
	      }
	    });
	    btnAlta.setBounds(230, 125, 190, 23);
	    contentPane.add(btnAlta);
	    
	    //Cuarto texto (Codigo)
	    lblIngreseCdigoDe = new JLabel("Ingrese código del articulo:");
	    lblIngreseCdigoDe.setBounds(25, 170, 243, 14);
	    contentPane.add(lblIngreseCdigoDe);
	    
	    //TextField de Codigo
	    tfCod = new JTextField();
	    tfCod.setBounds(230, 168, 190, 20);
	    contentPane.add(tfCod);
	    tfCod.setColumns(10);
	    cargarDriver();
	    
	    //Boton consultar por codigo 
	    btnConsultaPorCdigo = new JButton("Consulta por código");
	    btnConsultaPorCdigo.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent arg0) {
	        labelResultado.setText("");
	        tfNA.setText("");
	        tfCom.setText("");
	        tfPre.setText("");
	        try {
	          Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/game","root" ,"anboto");
	          Statement comando=conexion.createStatement();
	          ResultSet registro = comando.executeQuery("select Nombre,Compañia,precio from articulos where codigo="+tfCod.getText());
	          if (registro.next()==true) {
	            tfNA.setText(registro.getString("Nombre"));
	            tfCom.setText(registro.getString("Compañia"));
	            tfPre.setText(registro.getString("precio"));
	            labelResultado.setText("Se consulto el nombre, la comañia y el precio del artículo con el código " + tfCod.getText());
	          } else {
	            labelResultado.setText("No existe un artículo con el código " + tfCod.getText());
	          }
	          conexion.close();
	        } catch(SQLException ex){
	          setTitle(ex.toString());
	        }
	      }
	    });
	    btnConsultaPorCdigo.setBounds(230, 200, 190, 23);
	    contentPane.add(btnConsultaPorCdigo);
	    
	    //Boton Modificar
	    JButton btnNewButton_1 = new JButton("Modificar");
	    btnNewButton_1.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	        labelResultado.setText("");
	        try {
	          Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/game","root" ,"anboto");
	          Statement comando=conexion.createStatement();
	          int cantidad = comando.executeUpdate("update articulos set Nombre='" + tfNA.getText() + "'," +
	                                           "Compañia='" + tfCom.getText() + "', precio=" + tfPre.getText()
	                                           + " where codigo="+tfCod.getText());
	          if (cantidad==1) {
	            labelResultado.setText("Se modifico el nombre, la comañia y el precio del artículo con el código " + tfCod.getText());
	          } else {
	            labelResultado.setText("No existe un artículo con el código " + tfCod.getText());
	          }
	          conexion.close();
	        } catch(SQLException ex){
	          setTitle(ex.toString());
	        }                
	      }
	    });
	    btnNewButton_1.setBounds(230, 230, 190, 23);
	    contentPane.add(btnNewButton_1);
	    cargarDriver();
	    
	    //boton borrar
	    JButton btnNewButton = new JButton("Borrar");
	    btnNewButton.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent arg0) {
	        labelResultado.setText("");
	        try {
	          Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/game","root" ,"anboto");
	          Statement comando=conexion.createStatement();
	          int cantidad = comando.executeUpdate("delete from articulos where codigo="+tfCod.getText());
	          if (cantidad==1) {
	            tfNA.setText("");
	            tfCom.setText("");        
	            tfPre.setText("");
	            labelResultado.setText("Se borro el artículo con el código " + tfCod.getText() + " correctamente.");
	          } else {
	            labelResultado.setText("No existe un artículo con con el código " + tfCod.getText());
	          }
	          conexion.close();
	        } catch(SQLException ex){
	          setTitle(ex.toString());
	        }        
	      }
	    });
	    btnNewButton.setBounds(230, 260, 190, 23);
	    contentPane.add(btnNewButton);
	    
	    //Dice si los datos se han subido, modificado, eliminado correctamente
	    labelResultado = new JLabel("Resultado");
	    labelResultado.setBounds(25, 300, 450, 14);
	    contentPane.add(labelResultado);
	    
	}
	
	private void cargarDriver() {
	    try {
	      Class.forName("com.mysql.jdbc.Driver");
	    }catch(Exception ex) {
	      setTitle(ex.toString());
	    }
	  }

}
