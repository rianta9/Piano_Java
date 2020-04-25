package Piano_S;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

import java.io.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Piano_P extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	JButton btnC;
	JButton btnD;
	JButton btnG;
	JButton btnC1;
	JButton btnB;
	JButton btnE;
	JButton btnF;
	JButton btnA;
	JButton btnBb;
	JButton btnE_1;
	JButton btnF_1;
	JButton btnC_Sharp;
	JButton btnD_Sharp;
	JButton btnF_Sharp;
	JButton btnG_Sharp;
	JButton btnC_Sharp1;
	JButton btnD_Sharp1;
	private JLabel lblQ;
	private JLabel lblW;
	private JLabel lblE;
	private JLabel lblR;
	private JLabel lblT;
	private JLabel lblY;
	private JLabel lblU;
	private JLabel lblI;
	private JLabel lblO;
	private JLabel lblP;
	private JLabel lblZ;
	private JLabel lblX;
	private JLabel lblC;
	private JLabel lblV;
	private JLabel lblB;
	private JLabel lblN;
	private JLabel lblM;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Piano_P frame = new Piano_P();
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
	public Piano_P() {
		setTitle("Piano");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 481);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(105, 105, 105));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		btnC = new JButton("C");
		btnC.setBounds(10, 222, 58, 193);
		btnC.setVerticalAlignment(SwingConstants.BOTTOM);
		btnC.setMnemonic(KeyEvent.VK_Q);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("Music_Note/C.wav");
				      AudioInputStream stream = AudioSystem.getAudioInputStream(file);
				      Clip clip = AudioSystem.getClip();
				      clip.open(stream);
				      clip.start();				 
				      stream.close();
				} catch (Exception e1) {
					return;
				}
			}
		});
		
		textField = new JTextField();
		textField.setBounds(34, 11, 589, 20);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode() == KeyEvent.VK_Q) {
					btnC.doClick();
				}
				else if(arg0.getKeyCode() == KeyEvent.VK_W) {
					btnD.doClick();
				}
				else if(arg0.getKeyCode() == KeyEvent.VK_E) {
					btnE.doClick();
				}
				else if(arg0.getKeyCode() == KeyEvent.VK_R) {
					btnF.doClick();
				}
				else if(arg0.getKeyCode() == KeyEvent.VK_T) {
					btnG.doClick();
				}
				else if(arg0.getKeyCode() == KeyEvent.VK_Y) {
					btnA.doClick();
				}
				else if(arg0.getKeyCode() == KeyEvent.VK_U) {
					btnB.doClick();
				}
				else  if(arg0.getKeyCode() == KeyEvent.VK_I) {
					btnC1.doClick();
				}
				else  if(arg0.getKeyCode() == KeyEvent.VK_O) {
					btnE_1.doClick();
				}
				else  if(arg0.getKeyCode() == KeyEvent.VK_P) {
					btnF_1.doClick();
				}
				else  if(arg0.getKeyCode() == KeyEvent.VK_Z) {
					btnC_Sharp.doClick();
				}
				else  if(arg0.getKeyCode() == KeyEvent.VK_X) {
					btnD_Sharp.doClick();
				}
				else  if(arg0.getKeyCode() == KeyEvent.VK_C) {
					btnF_Sharp.doClick();
				}
				else  if(arg0.getKeyCode() == KeyEvent.VK_V) {
					btnG_Sharp.doClick();
				}
				else if(arg0.getKeyCode() == KeyEvent.VK_B) {
					btnBb.doClick();
				}
				else  if(arg0.getKeyCode() == KeyEvent.VK_N) {
					btnC_Sharp1.doClick();
				}
				else if(arg0.getKeyCode() == KeyEvent.VK_M) {
					btnD_Sharp1.doClick();
				}
			}
		});
		textField.setColumns(10);
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		btnD = new JButton("D");
		btnD.setBounds(74, 222, 58, 193);
		btnD.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD.setMnemonic(KeyEvent.VK_W);
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("Music_Note/D.wav");
				      AudioInputStream stream = AudioSystem.getAudioInputStream(file);
				      Clip clip = AudioSystem.getClip();
				      clip.open(stream);
				      clip.start();				 
				      stream.close();
				} catch (Exception e2) {
					return;
				}
			}
		});
		btnD.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		btnE = new JButton("E");
		btnE.setBounds(138, 222, 58, 193);
		btnE.setMnemonic(KeyEvent.VK_E);
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("Music_Note/E.wav");
				      AudioInputStream stream = AudioSystem.getAudioInputStream(file);
				      Clip clip = AudioSystem.getClip();
				      clip.open(stream);
				      clip.start();				 
				      stream.close();
				} catch (Exception e3) {
					return;
				}
			}
		});
		btnE.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnE.setVerticalAlignment(SwingConstants.BOTTOM);
		
		btnF = new JButton("F");
		btnF.setBounds(202, 222, 58, 193);
		btnF.setMnemonic(KeyEvent.VK_R);
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("Music_Note/F.wav");
				      AudioInputStream stream = AudioSystem.getAudioInputStream(file);
				      Clip clip = AudioSystem.getClip();
				      clip.open(stream);
				      clip.start();				 
				      stream.close();
				} catch (Exception e4) {
					return;
				}
			}
		});
		btnF.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnF.setVerticalAlignment(SwingConstants.BOTTOM);
		
		btnG = new JButton("G");
		btnG.setBounds(266, 222, 58, 193);
		btnG.setMnemonic(KeyEvent.VK_T);
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("Music_Note/G.wav");
				      AudioInputStream stream = AudioSystem.getAudioInputStream(file);
				      Clip clip = AudioSystem.getClip();
				      clip.open(stream);
				      clip.start();				 
				      stream.close();
				} catch (Exception e5) {
					return;
				}
			}
		});
		btnG.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnG.setVerticalAlignment(SwingConstants.BOTTOM);
		
		btnA = new JButton("A");
		btnA.setBounds(328, 222, 62, 193);
		btnA.setMnemonic(KeyEvent.VK_Y);
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					File file = new File("Music_Note/A.wav");
				      AudioInputStream stream = AudioSystem.getAudioInputStream(file);
				      Clip clip = AudioSystem.getClip();
				      clip.open(stream);
				      clip.start();				 
				      stream.close();
				} catch (Exception e) {
					return;
				}
			}
		});
		btnA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnA.setVerticalAlignment(SwingConstants.BOTTOM);
		
		btnB = new JButton("B");
		btnB.setBounds(396, 222, 58, 193);
		btnB.setMnemonic(KeyEvent.VK_U);
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("Music_Note/B.wav");
				      AudioInputStream stream = AudioSystem.getAudioInputStream(file);
				      Clip clip = AudioSystem.getClip();
				      clip.open(stream);
				      clip.start();				 
				      stream.close();
				} catch (Exception e6) {
					return;
				}
			}
		});
		btnB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnB.setVerticalAlignment(SwingConstants.BOTTOM);
		
		btnC1 = new JButton("C1");
		btnC1.setBounds(460, 222, 58, 193);
		btnC1.setMnemonic(KeyEvent.VK_I);
		btnC1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("Music_Note/C1.wav");
				      AudioInputStream stream = AudioSystem.getAudioInputStream(file);
				      Clip clip = AudioSystem.getClip();
				      clip.open(stream);
				      clip.start();				 
				      stream.close();
				} catch (Exception e7) {
					return;
				}
			}
		});
		btnC1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC1.setVerticalAlignment(SwingConstants.BOTTOM);
		
		btnE_1 = new JButton("E1");
		btnE_1.setBounds(524, 222, 58, 193);
		btnE_1.setMnemonic(KeyEvent.VK_O);
		btnE_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("Music_Note/E1.wav");
				      AudioInputStream stream = AudioSystem.getAudioInputStream(file);
				      Clip clip = AudioSystem.getClip();
				      clip.open(stream);
				      clip.start();				 
				      stream.close();
				} catch (Exception e8) {
					return;
				}
			}
		});
		btnE_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnE_1.setVerticalAlignment(SwingConstants.BOTTOM);
		
		btnF_1 = new JButton("F1");
		btnF_1.setBounds(588, 222, 58, 193);
		btnF_1.setMnemonic(KeyEvent.VK_P);
		btnF_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("Music_Note/F1.wav");
				      AudioInputStream stream = AudioSystem.getAudioInputStream(file);
				      Clip clip = AudioSystem.getClip();
				      clip.open(stream);
				      clip.start();				 
				      stream.close();
				} catch (Exception e9) {
					return;
				}
			}
		});
		btnF_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnF_1.setVerticalAlignment(SwingConstants.BOTTOM);
		
		btnC_Sharp = new JButton("C#");
		btnC_Sharp.setBounds(42, 84, 58, 114);
		btnC_Sharp.setMnemonic(KeyEvent.VK_A);
		btnC_Sharp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("Music_Note/C_s.wav");
				      AudioInputStream stream = AudioSystem.getAudioInputStream(file);
				      Clip clip = AudioSystem.getClip();
				      clip.open(stream);
				      clip.start();				 
				      stream.close();
				} catch (Exception e10) {
					return;
				}
			}
		});
		btnC_Sharp.setBackground(Color.DARK_GRAY);
		btnC_Sharp.setForeground(Color.WHITE);
		btnC_Sharp.setVerticalAlignment(SwingConstants.BOTTOM);
		btnC_Sharp.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		btnD_Sharp = new JButton("D#");
		btnD_Sharp.setBounds(110, 84, 58, 114);
		btnD_Sharp.setMnemonic(KeyEvent.VK_S);
		btnD_Sharp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("Music_Note/D_s.wav");
				      AudioInputStream stream = AudioSystem.getAudioInputStream(file);
				      Clip clip = AudioSystem.getClip();
				      clip.open(stream);
				      clip.start();				 
				      stream.close();
				} catch (Exception e11) {
					return;
				}
			}
		});
		btnD_Sharp.setBackground(Color.DARK_GRAY);
		btnD_Sharp.setForeground(Color.WHITE);
		btnD_Sharp.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD_Sharp.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		btnF_Sharp = new JButton("F#");
		btnF_Sharp.setBounds(232, 84, 58, 114);
		btnF_Sharp.setMnemonic(KeyEvent.VK_D);
		btnF_Sharp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("Music_Note/F_s.wav");
				      AudioInputStream stream = AudioSystem.getAudioInputStream(file);
				      Clip clip = AudioSystem.getClip();
				      clip.open(stream);
				      clip.start();				 
				      stream.close();
				} catch (Exception e12) {
					return;
				}
			}
		});
		btnF_Sharp.setBackground(Color.DARK_GRAY);
		btnF_Sharp.setForeground(Color.WHITE);
		btnF_Sharp.setVerticalAlignment(SwingConstants.BOTTOM);
		btnF_Sharp.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		btnG_Sharp = new JButton("G#");
		btnG_Sharp.setBounds(300, 84, 58, 114);
		btnG_Sharp.setMnemonic(KeyEvent.VK_F);
		btnG_Sharp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("Music_Note/G_s.wav");
				      AudioInputStream stream = AudioSystem.getAudioInputStream(file);
				      Clip clip = AudioSystem.getClip();
				      clip.open(stream);
				      clip.start();				 
				      stream.close();
				} catch (Exception e10) {
					return;
				}
			}
		});
		btnG_Sharp.setBackground(Color.DARK_GRAY);
		btnG_Sharp.setForeground(Color.WHITE);
		btnG_Sharp.setVerticalAlignment(SwingConstants.BOTTOM);
		btnG_Sharp.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		btnBb = new JButton("Bb");
		btnBb.setBounds(368, 84, 58, 114);
		btnBb.setMnemonic(KeyEvent.VK_G);
		btnBb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("Music_Note/Bb.wav");
				      AudioInputStream stream = AudioSystem.getAudioInputStream(file);
				      Clip clip = AudioSystem.getClip();
				      clip.open(stream);
				      clip.start();				 
				      stream.close();
				} catch (Exception e14) {
					return;
				}
			}
		});
		btnBb.setBackground(Color.DARK_GRAY);
		btnBb.setForeground(Color.WHITE);
		btnBb.setVerticalAlignment(SwingConstants.BOTTOM);
		btnBb.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		btnC_Sharp1 = new JButton("C#1");
		btnC_Sharp1.setBounds(485, 83, 58, 114);
		btnC_Sharp1.setMnemonic(KeyEvent.VK_H);
		btnC_Sharp1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("Music_Note/C_s1.wav");
				      AudioInputStream stream = AudioSystem.getAudioInputStream(file);
				      Clip clip = AudioSystem.getClip();
				      clip.open(stream);
				      clip.start();				 
				      stream.close();
				} catch (Exception e15) {
					return;
				}
			}
		});
		btnC_Sharp1.setBackground(Color.DARK_GRAY);
		btnC_Sharp1.setForeground(Color.WHITE);
		btnC_Sharp1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnC_Sharp1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		btnD_Sharp1 = new JButton("D#1");
		btnD_Sharp1.setBounds(553, 83, 58, 114);
		btnD_Sharp1.setMnemonic(KeyEvent.VK_J);
		btnD_Sharp1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("Music_Note/D_s1.wav");
				      AudioInputStream stream = AudioSystem.getAudioInputStream(file);
				      Clip clip = AudioSystem.getClip();
				      clip.open(stream);
				      clip.start();				 
				      stream.close();
				} catch (Exception e16) {
					return;
				}
			}
		});
		btnD_Sharp1.setBackground(Color.DARK_GRAY);
		btnD_Sharp1.setForeground(Color.WHITE);
		btnD_Sharp1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD_Sharp1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lblQ = new JLabel("Q");
		lblQ.setBounds(15, 202, 53, 14);
		lblQ.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblW = new JLabel("W");
		lblW.setBounds(78, 202, 53, 14);
		lblW.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblE = new JLabel("E");
		lblE.setBounds(141, 202, 53, 14);
		lblE.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblR = new JLabel("R");
		lblR.setBounds(204, 202, 53, 14);
		lblR.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblT = new JLabel("T");
		lblT.setBounds(271, 202, 53, 14);
		lblT.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblY = new JLabel("Y");
		lblY.setBounds(328, 202, 62, 14);
		lblY.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblU = new JLabel("U");
		lblU.setBounds(396, 202, 53, 14);
		lblU.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblI = new JLabel("I");
		lblI.setBounds(467, 202, 53, 14);
		lblI.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblO = new JLabel("O");
		lblO.setBounds(526, 202, 56, 14);
		lblO.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblP = new JLabel("P");
		lblP.setBounds(588, 202, 58, 14);
		lblP.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblZ = new JLabel("Z");
		lblZ.setBounds(42, 63, 58, 14);
		lblZ.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblX = new JLabel("X");
		lblX.setBounds(110, 63, 58, 14);
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblC = new JLabel("C");
		lblC.setBounds(232, 63, 58, 14);
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblV = new JLabel("V");
		lblV.setBounds(300, 63, 58, 14);
		lblV.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblB = new JLabel("B");
		lblB.setBounds(368, 63, 58, 14);
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblN = new JLabel("N");
		lblN.setBounds(485, 63, 58, 14);
		lblN.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblM = new JLabel("M");
		lblM.setBounds(553, 63, 58, 14);
		lblM.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("qweqqweq\r\n" + 
				"ertert\r\n" + 
				"tyttrq\r\n" + 
				"rqrrqr");
		textArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_Q) {
					btnC.doClick();
				}
				else if(e.getKeyCode() == KeyEvent.VK_W) {
					btnD.doClick();
				}
				else if(e.getKeyCode() == KeyEvent.VK_E) {
					btnE.doClick();
				}
				else if(e.getKeyCode() == KeyEvent.VK_R) {
					btnF.doClick();
				}
				else if(e.getKeyCode() == KeyEvent.VK_T) {
					btnG.doClick();
				}
				else if(e.getKeyCode() == KeyEvent.VK_Y) {
					btnA.doClick();
				}
				else if(e.getKeyCode() == KeyEvent.VK_U) {
					btnB.doClick();
				}
				else  if(e.getKeyCode() == KeyEvent.VK_I) {
					btnC1.doClick();
				}
				else  if(e.getKeyCode() == KeyEvent.VK_O) {
					btnE_1.doClick();
				}
				else  if(e.getKeyCode() == KeyEvent.VK_P) {
					btnF_1.doClick();
				}
				else  if(e.getKeyCode() == KeyEvent.VK_Z) {
					btnC_Sharp.doClick();
				}
				else  if(e.getKeyCode() == KeyEvent.VK_X) {
					btnD_Sharp.doClick();
				}
				else  if(e.getKeyCode() == KeyEvent.VK_C) {
					btnF_Sharp.doClick();
				}
				else  if(e.getKeyCode() == KeyEvent.VK_V) {
					btnG_Sharp.doClick();
				}
				else if(e.getKeyCode() == KeyEvent.VK_B) {
					btnBb.doClick();
				}
				else  if(e.getKeyCode() == KeyEvent.VK_N) {
					btnC_Sharp1.doClick();
				}
				else if(e.getKeyCode() == KeyEvent.VK_M) {
					btnD_Sharp1.doClick();
				}
			}
		});
		textArea.setBounds(672, 37, 297, 378);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		contentPane.add(textArea);
		contentPane.add(textField);
		contentPane.add(lblQ);
		contentPane.add(btnC);
		contentPane.add(btnD);
		contentPane.add(btnE);
		contentPane.add(btnF);
		contentPane.add(btnG);
		contentPane.add(lblW);
		contentPane.add(lblE);
		contentPane.add(lblR);
		contentPane.add(lblT);
		contentPane.add(lblY);
		contentPane.add(btnA);
		contentPane.add(lblU);
		contentPane.add(lblI);
		contentPane.add(lblO);
		contentPane.add(lblP);
		contentPane.add(btnB);
		contentPane.add(btnC1);
		contentPane.add(btnE_1);
		contentPane.add(btnF_1);
		contentPane.add(lblZ);
		contentPane.add(btnC_Sharp);
		contentPane.add(btnD_Sharp);
		contentPane.add(lblX);
		contentPane.add(btnF_Sharp);
		contentPane.add(btnG_Sharp);
		contentPane.add(btnBb);
		contentPane.add(lblC);
		contentPane.add(lblV);
		contentPane.add(lblB);
		contentPane.add(btnC_Sharp1);
		contentPane.add(btnD_Sharp1);
		contentPane.add(lblN);
		contentPane.add(lblM);
		
		JLabel lblmChun = new JLabel("Âm Chuẩn");
		lblmChun.setForeground(new Color(255, 215, 0));
		lblmChun.setHorizontalAlignment(SwingConstants.CENTER);
		lblmChun.setBounds(780, 14, 83, 14);
		contentPane.add(lblmChun);
	}
}
