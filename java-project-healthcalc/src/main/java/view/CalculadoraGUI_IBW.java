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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraGUI_IBW extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textIBW;
	private JTextField textresultado_IBW;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraGUI_IBW frame = new CalculadoraGUI_IBW();
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
	public CalculadoraGUI_IBW() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 436);
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
		panelMetricaContainer.setBounds(112, 54, 378, 335);
		contentPane.add(panelMetricaContainer);
		panelMetricaContainer.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 128, 0)));
		panel.setBounds(10, 26, 358, 185);
		panelMetricaContainer.add(panel);
		panel.setLayout(null);
		
		JLabel lblAltura_IBW = new JLabel("Altura(cm)");
		lblAltura_IBW.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAltura_IBW.setHorizontalAlignment(SwingConstants.CENTER);
		lblAltura_IBW.setBounds(10, 90, 77, 19);
		panel.add(lblAltura_IBW);
		
		textIBW = new JTextField();
		textIBW.setBounds(113, 90, 121, 18);
		panel.add(textIBW);
		textIBW.setColumns(10);
		
		JLabel lblsexo_IBW = new JLabel("SEXO");
		lblsexo_IBW.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblsexo_IBW.setHorizontalAlignment(SwingConstants.CENTER);
		lblsexo_IBW.setBounds(23, 136, 64, 15);
		panel.add(lblsexo_IBW);
		
		JComboBox comboSexo_IBW = new JComboBox();
		comboSexo_IBW.setModel(new DefaultComboBoxModel(new String[] {"masculino", "femenino"}));
		comboSexo_IBW.setBounds(114, 134, 98, 19);
		panel.add(comboSexo_IBW);
		
		JLabel lblInsertardatos = new JLabel("Inserte los datos correspondientes");
		lblInsertardatos.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblInsertardatos.setBounds(23, 37, 211, 28);
		panel.add(lblInsertardatos);
		
		JLabel lblNewLabel = new JLabel("Resultado de la métrica:");
		lblNewLabel.setBounds(10, 252, 157, 27);
		panelMetricaContainer.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		textresultado_IBW = new JTextField();
		textresultado_IBW.setBounds(175, 256, 96, 18);
		panelMetricaContainer.add(textresultado_IBW);
		textresultado_IBW.setColumns(10);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCalcular.setBounds(516, 147, 120, 32);
		contentPane.add(btnCalcular);
		
		JLabel lblNewLabel_1 = new JLabel("MÉTRICA IBW");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(141, 24, 225, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblExito = new JLabel(" ÉXITO");
		lblExito.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblExito.setVisible(false);
		lblExito.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblExito.setHorizontalAlignment(SwingConstants.CENTER);
		lblExito.setForeground(new Color(0, 255, 0));
		lblExito.setBounds(516, 222, 120, 101);
		contentPane.add(lblExito);
		
		JLabel lblFracaso = new JLabel("ERROR");
		lblFracaso.setVisible(false);
		lblFracaso.setForeground(new Color(255, 0, 0));
		lblFracaso.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFracaso.setBackground(new Color(255, 255, 255));
		lblFracaso.setHorizontalAlignment(SwingConstants.CENTER);
		lblFracaso.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblFracaso.setBounds(516, 222, 120, 101);
		contentPane.add(lblFracaso);

	}
}
