import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Algo {

	private JFrame frame;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Algo window = new Algo();
					window.frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Algo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel text = new JLabel("Nome");
		text.setBounds(167, 112, 67, 23);
		frame.getContentPane().add(text);
		
		txtNome = new JTextField();
		txtNome.setBounds(88, 143, 193, 23);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JButton txtMostrar = new JButton("Mostrar");
		txtMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Nome: "+txtNome.getText());
			
			}
		});
		txtMostrar.setBounds(10, 177, 89, 23);//Onde o botão vai ficar
		frame.getContentPane().add(txtMostrar);
	}
}
