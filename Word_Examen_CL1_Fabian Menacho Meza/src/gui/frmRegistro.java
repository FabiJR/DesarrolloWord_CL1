package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


//Desarrollo del Word del CL1
/*
 * 
 * 
 * *\Profesor le habre enviado el link del repositorio del Registro que debiamos hacer en word
 * 	la verdad nose si se hacia o no, no entendi bien las indicaciones
 * 	pero de igual forma lo hize y se le presentare tanto el link del desarrollo de mi parte del proyecto
 * 	como lo del Word por si acaso.
 * 
 * 
 * 
 * 
 * 	--Fabian Menacho Meza
 * 
 */
public class frmRegistro extends JFrame {

	private JPanel contentPane;
	private JTextField txtTarjetaCredito;
	private JTextField txtCuentBancaria;
	private JTextField txtPasaporte;
	private JTextField txtGmail;
	private JTextField txtNacimiento;
	private JButton btnEnviar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmRegistro frame = new frmRegistro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmRegistro() {
		setTitle("REGISTRO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Formulario de registro");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(48, 11, 350, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tarjeta de Credito");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 74, 161, 14);
		contentPane.add(lblNewLabel_1);
		
		txtTarjetaCredito = new JTextField();
		txtTarjetaCredito.setBounds(181, 72, 180, 20);
		contentPane.add(txtTarjetaCredito);
		txtTarjetaCredito.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cuenta Bancaria");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(10, 99, 161, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Pasaporte");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(10, 124, 161, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Correo Gmail");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(10, 149, 161, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Fecha Nacimiento");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_4.setBounds(10, 174, 161, 14);
		contentPane.add(lblNewLabel_1_4);
		
		txtCuentBancaria = new JTextField();
		txtCuentBancaria.setBounds(181, 97, 180, 20);
		contentPane.add(txtCuentBancaria);
		txtCuentBancaria.setColumns(10);
		
		txtPasaporte = new JTextField();
		txtPasaporte.setBounds(181, 122, 180, 20);
		contentPane.add(txtPasaporte);
		txtPasaporte.setColumns(10);
		
		txtGmail = new JTextField();
		txtGmail.setBounds(181, 147, 180, 20);
		contentPane.add(txtGmail);
		txtGmail.setColumns(10);
		
		txtNacimiento = new JTextField();
		txtNacimiento.setBounds(181, 172, 180, 20);
		contentPane.add(txtNacimiento);
		txtNacimiento.setColumns(10);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnEnviar_actionPerformed(arg0);
			}
		});
		btnEnviar.setBounds(181, 214, 89, 23);
		contentPane.add(btnEnviar);
	}
	
	//Desarrollo del Word del Examen CL1
	//Fabian Menacho Meza	
	protected void do_btnEnviar_actionPerformed(ActionEvent arg0) {
		
		String tarjeta=txtTarjetaCredito.getText();
		String cuenta=txtCuentBancaria.getText();
		String pasaporte=txtPasaporte.getText();
		String gmail=txtGmail.getText();
		String nacimiento=txtNacimiento.getText();
		
		if(!tarjeta.matches("[0-9][0-9][0-9][0-9][-][0-9][0-9][0-9][0-9][-][1][2][0-9][0-9][-][2][0][0-9][0-9]")) {
			mensaje("Error al leer la tarjeta de credito, formato XXXX-XXXX-15XX-20XX");
		}if(!cuenta.matches("[0][-][0][0][1][5][8][-][0-9][0-9][0-9][0-9][0-9][-][0-9][0-9][0-9]")){
			mensaje("Error al leer la Cuenta Bancaria, formato 0-00158-XXXXX-XXX");
		}if(!pasaporte.matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][-][0-9][0-9]")) {
			mensaje("error al leer el pasaporte, formato XXXXXXXXXXXX-XX");
		}if(!gmail.matches("[_A-Za-z0-9-]+(\\\\.[_A-Za-z0-9-]+)*[@][g][m][a][i][l][.][c][o][m]")) {
			mensaje("Error al registrar la cuenta de Gmail");
		}if(!nacimiento.matches("[0-9][0-9][0-9][0-9][/](0?[1-9]|1[012])[/](0?[1-9]|[12][0-9]|3[01])")) {
			mensaje("error al registrar la fecha de nacmiento, formato yyyy/mm/dd");
		}
		else {
			mensaje("Registro exitoso");
		}
	}
	
	public void mensaje(String m) {
		JOptionPane.showMessageDialog(this, m);
	}
}
