package juego03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import juego.jugador;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class principal extends JFrame {

	private JPanel contentPane;
	private JTextField tfnom;
	private JTextField tfap;
	private JTextField tfap2;
	private JTextField tfedad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		//generamos un jugador
		jugador player1=new jugador();
		player1.setNombre("Mohammed");
		player1.setApellido("Chaibi");
		player1.setEdad(50);
		player1.setId(1);
		
		System.out.println(player1.toString());
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
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
	
	//aqui he dejado eso preparado para la siguiente actividad
	public principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 11, 46, 14);
		contentPane.add(lblNombre);
		
		tfnom = new JTextField();
	
		tfnom.setBounds(10, 36, 86, 20);
		contentPane.add(tfnom);
		tfnom.setColumns(10);
		
		JLabel lblApellido = new JLabel("apellido");
		lblApellido.setBounds(10, 67, 46, 14);
		contentPane.add(lblApellido);
		
		tfap = new JTextField();
		tfap.setBounds(10, 92, 86, 20);
		contentPane.add(tfap);
		tfap.setColumns(10);
		
		JLabel lblSApellido = new JLabel("segundo apellido");
		lblSApellido.setBounds(10, 123, 86, 14);
		contentPane.add(lblSApellido);
		
		tfap2 = new JTextField();
		tfap2.setBounds(10, 148, 86, 20);
		contentPane.add(tfap2);
		tfap2.setColumns(10);
		
		JLabel lblEdad = new JLabel("edad");
		lblEdad.setBounds(10, 185, 46, 14);
		contentPane.add(lblEdad);
		
		tfedad = new JTextField();
		tfedad.setBounds(10, 210, 86, 20);
		contentPane.add(tfedad);
		tfedad.setColumns(10);
	}
}
