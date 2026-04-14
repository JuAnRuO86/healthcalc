package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CalculadoraGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Altura_IBW;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraGUI frame = new CalculadoraGUI();
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
	public CalculadoraGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 597, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBMI = new JButton("BMI");
		btnBMI.setBounds(30, 86, 84, 20);
		contentPane.add(btnBMI);
		
		JButton btnIBW = new JButton("IBW");
		btnIBW.setBounds(30, 116, 84, 20);
		contentPane.add(btnIBW);
		
		JButton btnREE = new JButton("REE");
		btnREE.setBounds(30, 147, 84, 20);
		contentPane.add(btnREE);
		
		JPanel panelMetricaContainer = new JPanel();
		panelMetricaContainer.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelMetricaContainer.setBounds(112, 54, 298, 293);
		contentPane.add(panelMetricaContainer);
		panelMetricaContainer.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 128, 0)));
		panel.setBounds(23, 26, 251, 185);
		panelMetricaContainer.add(panel);
		panel.setLayout(null);
		
		JLabel lblAltura_IBW = new JLabel("Altura (cm)");
		lblAltura_IBW.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAltura_IBW.setBounds(10, 45, 71, 13);
		panel.add(lblAltura_IBW);
		
		Altura_IBW = new JTextField();
		Altura_IBW.setBounds(86, 43, 133, 18);
		panel.add(Altura_IBW);
		Altura_IBW.setColumns(10);
		
		JLabel lblSexo_IBW = new JLabel("SEXO");
		lblSexo_IBW.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSexo_IBW.setBounds(10, 106, 59, 12);
		panel.add(lblSexo_IBW);
		
		JComboBox comboSexo = new JComboBox();
		comboSexo.setModel(new DefaultComboBoxModel(new String[] {"masculino", "femenino"}));
		comboSexo.setBounds(90, 103, 103, 27);
		panel.add(comboSexo);
		
		JLabel lblResultado = new JLabel("Resultado de la métrica");
		lblResultado.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblResultado.setBounds(23, 237, 153, 25);
		panelMetricaContainer.add(lblResultado);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBounds(433, 110, 120, 32);
		contentPane.add(btnCalcular);
		
		JLabel lblNewLabel_1 = new JLabel("Seleccione que desea calcular");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(112, 24, 225, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblExito = new JLabel(" ÉXITO");
		lblExito.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblExito.setVisible(false);
		lblExito.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblExito.setHorizontalAlignment(SwingConstants.CENTER);
		lblExito.setForeground(new Color(0, 255, 0));
		lblExito.setBounds(433, 176, 120, 101);
		contentPane.add(lblExito);
		
		JLabel lblFracaso = new JLabel("ERROR");
		lblFracaso.setVisible(false);
		lblFracaso.setForeground(new Color(255, 0, 0));
		lblFracaso.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFracaso.setBackground(new Color(255, 255, 255));
		lblFracaso.setHorizontalAlignment(SwingConstants.CENTER);
		lblFracaso.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblFracaso.setBounds(433, 176, 120, 101);
		contentPane.add(lblFracaso);

	}
}
