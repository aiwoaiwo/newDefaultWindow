package test;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class defaultWindow{
	private JPanel[] jPanel = {new JPanel(),new JPanel(),new JPanel(),new JPanel(),new JPanel(),new JPanel()};
	private JLabel bq = new JLabel();
	private JTextArea jTextAreaLeft = new JTextArea();
	private JTextArea jTextAreaRight = new JTextArea();
	private JButton an = new JButton();
	private JFrame jFrame = new JFrame();
	private Font font=new Font("����",Font.PLAIN,50);
	private String jButtonON = "��ʼ";
	private String jButtonOFF = "ֹͣ";
	private String jLableText = "ѧ������";
	private String defaultWindowTitle = "ѧ������";
	public defaultWindow() {
	createWindowContainer();
	setJPanelToJFrame();
	createWindowProperty();
	mouseDoChick();
	}
	//��ť�����¼�
	public void mouseDoChick(){
		an.addActionListener(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (an.getText().equals(jButtonON)){
					an.setText(jButtonOFF);
				}else{
					an.setText(jButtonON);
				}
			}
		});
	}
	//Ϊ����������Լ���������
	public void createWindowProperty(){
		jFrame.setTitle(defaultWindowTitle);
		jFrame.setSize(260,270);
		jFrame.setLocation(850,780);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
	}
	//����������������
	public void createWindowContainer(){
		jFrame.setContentPane(jPanel[0]);
		jPanel[0].setLayout(new GridLayout(3,1));
	}
	//���������
	public void setJPanelToJFrame(){
		jPanel[0].add(jPanel[1]);
		jPanel[0].add(jPanel[2]);
		jPanel[0].add(jPanel[3]);
		addJPanel_1();
		addJPanel_2();
		addJPanel_3();
	}
	//��һ���
	public void addJPanel_1(){
		bq.setText(jLableText);
		bq.setHorizontalAlignment(SwingConstants.CENTER);
		bq.setFont(font);
		jPanel[1].add(bq);
	}
	//�ڶ����
	public void addJPanel_2(){
		jPanel[2].setLayout(new GridLayout(1,2));

		jPanel[2].add(jPanel[4]);
		jPanel[2].add(jPanel[5]);

		jPanel[4].setLayout(new GridLayout());
		jPanel[5].setLayout(new GridLayout());
		jPanel[4].add(new JScrollPane(jTextAreaLeft));
		jPanel[5].add(new JScrollPane(jTextAreaRight));

		jTextAreaLeft.setBackground(Color.orange);
		jTextAreaRight.setBackground(Color.orange);
	}
	//�������
	public void addJPanel_3(){
		jPanel[3].setLayout(new GridLayout());
		jPanel[3].add(an);
		an.setFont(font);
		an.setText(jButtonON);
	}
}
