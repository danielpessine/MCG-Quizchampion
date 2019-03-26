import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class GUI_Start extends JFrame {

	private JPanel contentPane;
	private JLabel lblMcgQuizchampion;
	private JTextField txtSpieler;
	private JButton btnSpieler;
	private JButton btnLaden;
	private JButton btnStart;
	private JLabel lblRegeln;
	private JButton btnSpieler_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Start frame = new GUI_Start();
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
	public GUI_Start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1800, 1050);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblMcgQuizchampion = new JLabel("MCG Quizchampion");
		lblMcgQuizchampion.setHorizontalAlignment(SwingConstants.CENTER);
		lblMcgQuizchampion.setFont(new Font("Tahoma", Font.PLAIN, 70));
		lblMcgQuizchampion.setBounds(10, 11, 1656, 85);
		contentPane.add(lblMcgQuizchampion);
		
		txtSpieler = new JTextField();
		txtSpieler.setText("Spieler 1");
		txtSpieler.setBounds(49, 205, 196, 53);
		contentPane.add(txtSpieler);
		txtSpieler.setColumns(10);
		
		btnSpieler = new JButton("Spieler 1");
		btnSpieler.setBounds(49, 120, 196, 74);
		contentPane.add(btnSpieler);
		
		btnLaden = new JButton("Laden");
		btnLaden.setBounds(49, 475, 89, 23);
		contentPane.add(btnLaden);
		
		btnStart = new JButton("Start");
		btnStart.setBounds(49, 509, 89, 23);
		contentPane.add(btnStart);
		
		lblRegeln = new JLabel("Regeln");
		lblRegeln.setBackground(Color.LIGHT_GRAY);
		lblRegeln.setHorizontalAlignment(SwingConstants.LEFT);
		lblRegeln.setForeground(Color.BLACK);
		lblRegeln.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRegeln.setBounds(475, 84, 226, 450);
		contentPane.add(lblRegeln);
		
		btnSpieler_1 = new JButton("Spieler 2");
		btnSpieler_1.setBounds(49, 269, 196, 74);
		contentPane.add(btnSpieler_1);
	}
}
