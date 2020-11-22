package assignment;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class CalculatorApplication extends JFrame implements ActionListener {
static JFrame j;
static JTextField tf;
static double te;
String s1,s2,s3;

CalculatorApplication(){
	s1=s2=s3="";
}
	public static void main(String[] args) {
		j=new JFrame("My Calculator");
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch(Exception ee) {
			System.err.println(ee.getMessage());
		}
		CalculatorApplication CA = new CalculatorApplication();
		tf=new JTextField(16);
		tf.setEditable(false);
		JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,be,beq,beq1,ba,bs,bd,bm;
		b0= new JButton("0");
		b1= new JButton("1");
		b2= new JButton("2");
		b3= new JButton("3");
		b4= new JButton("4");
		b5= new JButton("5");
		b6= new JButton("6");
		b7= new JButton("7");
		b8= new JButton("8");
		b9= new JButton("9");
		beq1= new JButton("=");
		ba= new JButton("+");
		bs= new JButton("-");
		bm= new JButton("*");
		bd= new JButton("/");
		beq= new JButton("C");
		be= new JButton(".");
		JPanel jp=new JPanel();
		b0.addActionListener(CA);
		b1.addActionListener(CA);
		b2.addActionListener(CA);
		b3.addActionListener(CA);
		b4.addActionListener(CA);
		b5.addActionListener(CA);
		b6.addActionListener(CA);
		b7.addActionListener(CA);
		b8.addActionListener(CA);
		b9.addActionListener(CA);
		ba.addActionListener(CA);
		bm.addActionListener(CA);
		bd.addActionListener(CA);
		bs.addActionListener(CA);
		be.addActionListener(CA);
		beq.addActionListener(CA);
		beq1.addActionListener(CA);
		jp.add(tf);
		jp.add(ba);
		jp.add(b0);
		jp.add(b1);
		jp.add(b2);
		jp.add(b3);
		jp.add(bs);
		jp.add(b4);
		jp.add(b5);
		jp.add(b6);
		jp.add(bm);
		jp.add(b7);
		jp.add(b8);
		jp.add(b9);
		jp.add(bd);
		jp.add(be);
		jp.add(b0);
		jp.add(beq);
		jp.add(beq1);
		jp.setBackground(Color.BLUE);
		j.add(jp);
		j.setSize(200,200);
		j.show();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String s=e.getActionCommand();
		if((s.charAt(0)>='0'&& s.charAt(0)<='9')||s.charAt(0)=='.') {
			if(!s2.equals("")) 
			    s3=s3+s;
			else
				s1=s1+s;
			tf.setText(s1+s2+s3);
		}
		else if(s.charAt(0)=='C') {
			s1=s2=s3="";
			tf.setText(s1+s2+s3);
		}
		else if(s.charAt(0)=='+'||s.charAt(0)=='*'||s.charAt(0)=='/'||s.charAt(0)=='-') {
			s2=s2+s;
		}
		else {
			
			if(s2.equals("+"))
				te=(Double.parseDouble(s1)+Double.parseDouble(s3) );
			else if(s2.equals("-"))
				te=(Double.parseDouble(s1)-Double.parseDouble(s3) );
			else if(s2.equals("*"))
				te=(Double.parseDouble(s1)*Double.parseDouble(s3) );
			else if(s2.equals("/"))
				te=(Double.parseDouble(s1)/Double.parseDouble(s3) );
			else tf.setText("Applicable for two variables. Error");
		
			
			s1=Double.toString(te);
			s2=s;
			s3="";
			}
		
		String st=s1+s2+s3;
		tf.setText(st.replace('=', ' '));
	}
	
}

