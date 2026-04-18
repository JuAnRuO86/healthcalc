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
import javax.swing.border.EtchedBorder;

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
		setBounds(100, 100, 675, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelMetricaContainer = new JPanel();
		panelMetricaContainer.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelMetricaContainer.setBounds(100, 50, 400, 350);
		contentPane.add(panelMetricaContainer);
		panelMetricaContainer.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 128, 0)));
		panel.setBounds(20, 30, 350, 200);
		panelMetricaContainer.add(panel);
		panel.setLayout(null);
		
		JLabel lblAltura_IBW = new JLabel("Altura(cm)");
		lblAltura_IBW.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAltura_IBW.setHorizontalAlignment(SwingConstants.CENTER);
		lblAltura_IBW.setBounds(10, 90, 80, 20);
		panel.add(lblAltura_IBW);
		
		textIBW = new JTextField();
		textIBW.setBounds(110, 90, 80, 20);
		panel.add(textIBW);
		textIBW.setColumns(10);
		
		JLabel lblsexo_IBW = new JLabel("SEXO");
		lblsexo_IBW.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblsexo_IBW.setHorizontalAlignment(SwingConstants.CENTER);
		lblsexo_IBW.setBounds(10, 140, 80, 20);
		panel.add(lblsexo_IBW);
		
		JComboBox comboSexo_IBW = new JComboBox();
		comboSexo_IBW.setModel(new DefaultComboBoxModel(new String[] {"masculino", "femenino"}));
		comboSexo_IBW.setBounds(110, 140, 80, 20);
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
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCalcular.setBounds(520, 150, 120, 40);
		contentPane.add(btnCalcular);
		
		JLabel lblMetrica = new JLabel("MÉTRICA IBW");
		lblMetrica.setHorizontalAlignment(SwingConstants.CENTER);
		lblMetrica.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMetrica.setBounds(100, 10, 400, 30);
		contentPane.add(lblMetrica);
		
		JLabel lblExito = new JLabel(" ÉXITO");
		lblExito.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblExito.setVisible(false);
		lblExito.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblExito.setHorizontalAlignment(SwingConstants.CENTER);
		lblExito.setForeground(new Color(0, 255, 0));
		lblExito.setBounds(520, 250, 120, 100);
		contentPane.add(lblExito);
		
		JLabel lblFracaso = new JLabel("ERROR");
		lblFracaso.setVisible(false);
		lblFracaso.setForeground(new Color(255, 0, 0));
		lblFracaso.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFracaso.setBackground(new Color(255, 255, 255));
		lblFracaso.setHorizontalAlignment(SwingConstants.CENTER);
		lblFracaso.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblFracaso.setBounds(520, 250, 120, 100);
		contentPane.add(lblFracaso);
		
		JButton btnBMI = new JButton("BMI");
		btnBMI.setBounds(20, 100, 85, 20);
		contentPane.add(btnBMI);
		
		JButton btnIBW = new JButton("IBW");
		btnIBW.setBounds(20, 140, 85, 20);
		contentPane.add(btnIBW);
		
		JButton btnERR = new JButton("REE");
		btnERR.setBounds(20, 180, 85, 20);
		contentPane.add(btnERR);

	}
}
