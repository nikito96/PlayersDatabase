import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTable tablePlayers;
	private JTextField playerNameTextField;
	private JTextField positionsTextField;
	private JTextField clubTextField;
	private JLabel lblDateOfBirth;
	private JTextField dateOfBirthTextField;
	private JLabel lblOldClub;
	private JTextField oldClubTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tablePlayers = new JTable();
		tablePlayers.setBounds(10, 119, 764, 432);
		contentPane.add(tablePlayers);
		
		JLabel lblPlayerName = new JLabel("Player name:");
		lblPlayerName.setBounds(64, 32, 108, 14);
		contentPane.add(lblPlayerName);
		
		playerNameTextField = new JTextField();
		playerNameTextField.setBounds(20, 57, 152, 20);
		contentPane.add(playerNameTextField);
		playerNameTextField.setColumns(10);
		
		JLabel lblPositions = new JLabel("Positions:");
		lblPositions.setBounds(235, 32, 102, 14);
		contentPane.add(lblPositions);
		
		positionsTextField = new JTextField();
		positionsTextField.setBounds(185, 57, 152, 20);
		contentPane.add(positionsTextField);
		positionsTextField.setColumns(10);
		
		JLabel lblClub = new JLabel("Club:");
		lblClub.setBounds(397, 32, 46, 14);
		contentPane.add(lblClub);
		
		clubTextField = new JTextField();
		clubTextField.setBounds(353, 57, 130, 20);
		contentPane.add(clubTextField);
		clubTextField.setColumns(10);
		
		lblDateOfBirth = new JLabel("Date of birth:");
		lblDateOfBirth.setBounds(515, 32, 102, 14);
		contentPane.add(lblDateOfBirth);
		
		dateOfBirthTextField = new JTextField();
		dateOfBirthTextField.setBounds(492, 57, 114, 20);
		contentPane.add(dateOfBirthTextField);
		dateOfBirthTextField.setColumns(10);
		
		lblOldClub = new JLabel("Old Club:");
		lblOldClub.setBounds(659, 32, 90, 14);
		contentPane.add(lblOldClub);
		
		oldClubTextField = new JTextField();
		oldClubTextField.setBounds(616, 57, 133, 20);
		contentPane.add(oldClubTextField);
		oldClubTextField.setColumns(10);
		
		JButton btnAddPlayer = new JButton("Add");
		btnAddPlayer.setBounds(363, 88, 102, 26);
		contentPane.add(btnAddPlayer);
	}
}
