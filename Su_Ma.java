package Gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Su_Ma extends Frame
{

	JLabel l,l1,l1a,l2,l3, l4, l5, l6, l7, l8, l9, l10, l12, l13, l14, l11, l15,l16,l17,l18,l19,l20,l21,l22,l23;
	JTextField ta,tb,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	JComboBox cb1,cb2,cb3;
	JRadioButton rb1,rb2,rb3;
	JTextArea area1,area2,area3;
	public Su_Ma() 
	{
		//Frame
		setSize(800, 800); 
		setLayout(null); 
		setVisible(true); 
		setBackground(Color.LIGHT_GRAY);
		
		//Login Page
		l=new JLabel("Log In Page");
		l.setBounds(650, 200, 250, 20);
		add(l);
		
		l1=new JLabel("User Name :");
		l1.setBounds(550, 250, 250, 20);
		add(l1);
		t1=new JTextField();
		t1.setBounds(630, 250, 150, 20);
		add(t1);
		
		l2=new JLabel("Password :");
		l2.setBounds(550, 300, 250, 20);
		add(l2);
		t2=new JTextField();
		t2.setBounds(630, 300, 150, 20);
		add(t2);
		
		
		//Log in button
		b1=new JButton("Log In");
		b1.setBounds(550,350,100,20);
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JFrame f1=new JFrame("Start your Shopping");
				f1.setLayout(null);
				f1.setSize(800,800);
				f1.setVisible(true);
				f1.setBackground(Color.LIGHT_GRAY);
				
				l10 = new JLabel("SMART SUPER MARKET"); 
				l10.setBounds(200, 100, 300, 15);
				l10.setFont(new Font("times",Font.BOLD,20));
				f1.add(l10);
				
				//Grocery
				
				l11=new JLabel("GROCERY Products");
				l11.setBounds(250,160,180,20);
				l11.setFont(new Font("times",Font.BOLD,16));
				f1.add(l11);
				
				//Grocery-Ponni Rice
				
				l12=new JLabel("Ponni Rice");
				l12.setBounds(65,200,250,20);
				l12.setFont(new Font("times",Font.BOLD,13));
				f1.add(l12);
				
				DefaultListModel<String> li1 = new DefaultListModel<>();
				li1.addElement("  1 kg (100 Rs)"); 
				li1.addElement("  5 kg (400 Rs)"); 
				li1.addElement("  10 kg (800 Rs)"); 
				li1.addElement("  25 kg (2000 Rs)"); 
				li1.addElement("  50 kg (4000 Rs)");
				
				JList<String> list1 = new JList<>(li1); 
				list1.setBounds(50, 225, 100, 90);
				f1.add(list1);
				
				//Grocery-Wheat Powder
				
				l13=new JLabel(" Wheat Powder");
				l13.setBounds(170,200,250,20);
				l13.setFont(new Font("times",Font.BOLD,13));
				f1.add(l13);
				
				DefaultListModel<String> li2 = new DefaultListModel<>();
				li2.addElement("  1 kg (50 Rs)"); 
				li2.addElement("  5 kg (200 Rs)"); 
				li2.addElement("  10 kg (700 Rs)"); 
				li2.addElement("  25 kg (1500 Rs)"); 
				li2.addElement("  50 kg (2700 Rs)");
				
				JList<String> list2 = new JList<>(li2); 
				list2.setBounds(170, 225, 100, 90);
				f1.add(list2);
				
				//Grocery-Sugar
				
				l14=new JLabel("Sugar");
				l14.setBounds(320,200,250,20);
				l14.setFont(new Font("times",Font.BOLD,13));
				f1.add(l14);
				
				DefaultListModel<String> li3 = new DefaultListModel<>();
				li3.addElement("  1 kg (40 Rs)"); 
				li3.addElement("  5 kg (175 Rs)"); 
				li3.addElement("  10 kg (350 Rs)"); 
				li3.addElement("  25 kg (800 Rs)"); 
				li3.addElement("  50 kg (1300 Rs)");
				
				JList<String> list3 = new JList<>(li3); 
				list3.setBounds(290, 225, 100, 90);
				f1.add(list3);
				
				//Grocery-Daal
				
				l15=new JLabel("Daal");
				l15.setBounds(440,200,250,20);
				l15.setFont(new Font("times",Font.BOLD,13));
				f1.add(l15);
				
				DefaultListModel<String> li4 = new DefaultListModel<>();
				li4.addElement("  1 kg (40 Rs)"); 
				li4.addElement("  5 kg (175 Rs)"); 
				li4.addElement("  10 kg (350 Rs)"); 
				li4.addElement("  25 kg (800 Rs)"); 
				li4.addElement("  50 kg (1300 Rs)");
				
				JList<String> list4 = new JList<>(li4); 
				list4.setBounds(410, 225, 100, 90);
				f1.add(list4);
				
				
				//Grocery-Egg
				
				l16=new JLabel("Egg");
				l16.setBounds(565,200,250,20);
				l16.setFont(new Font("times",Font.BOLD,13));
				f1.add(l16);
				
				DefaultListModel<String> li5 = new DefaultListModel<>();
				li5.addElement("  1 Egg (6 rs)"); 
				li5.addElement("  5 Egg (25 Rs)"); 
				li5.addElement("  10 Egg (45 Rs)"); 
				li5.addElement("  25 Egg (100 Rs)"); 
				li5.addElement("  50 Egg (450 Rs)");
				
				JList<String> list5 = new JList<>(li5); 
				list5.setBounds(530, 225, 100, 90);
				f1.add(list5);
				
				//Snacks and drinks
				
				l17=new JLabel("SNACKS and DRINKS");
				l17.setBounds(250,340,180,20);
				l17.setFont(new Font("times",Font.BOLD,16));
				f1.add(l17);
				
				//Snacks-Chips Items
				
				l18=new JLabel("Chips (100 g)");
				l18.setBounds(70,375,250,20);
				l18.setFont(new Font("times",Font.BOLD,13));
				f1.add(l18);
				
				DefaultListModel<String> li6 = new DefaultListModel<>();
				li6.addElement("  Potato (20 Rs)"); 
				li6.addElement("  Soya Beens (25 Rs)");
				li6.addElement("  Mixer (30 Rs)"); 
				li6.addElement("  Nandhram (40 Rs)"); 
				li6.addElement("  Murukku (20 Rs)");
				
				JList<String> list6 = new JList<>(li6); 
				list6.setBounds(50, 400, 120, 90);
				f1.add(list6);
				
				//Snacks-Chocolate
				
				l19=new JLabel("Chocolate (100 g)");
				l19.setBounds(190,375,250,20);
				l19.setFont(new Font("times",Font.BOLD,13));
				f1.add(l19);
				
				DefaultListModel<String> li7 = new DefaultListModel<>();
				li7.addElement("  Diary Milk (80 Rs)"); 
				li7.addElement("  Munch (60 Rs)"); 
				li7.addElement("  5 Star (75 Rs)"); 
				li7.addElement("  KitKat (85 Rs)"); 
				li7.addElement("  Perk (55 Rs)");
				
				JList<String> list7 = new JList<>(li7); 
				list7.setBounds(190, 400, 110, 90);
				f1.add(list7);
				
				//Snacks-Biscuts
				
				l20=new JLabel("Biscuts (100 g)");
				l20.setBounds(335,375,250,20);
				l20.setFont(new Font("times",Font.BOLD,13));
				f1.add(l20);
				
				DefaultListModel<String> li8 = new DefaultListModel<>();
				li8.addElement("  Bourbon (10 Rs)"); 
				li8.addElement("  Good day (12 Rs)"); 
				li8.addElement("  Marry gold (15 Rs)"); 
				li8.addElement("  Mom's Magic (20 Rs)"); 
				li8.addElement("  Parle-G (7 Rs)");
				
				JList<String> list8 = new JList<>(li8); 
				list8.setBounds(320, 400, 130, 90);
				f1.add(list8);
				
				//Snacks-Cool Drinks
				
				l21=new JLabel("Cool Drinks (1 Ltr)");
				l21.setBounds(465,375,250,20);
				l21.setFont(new Font("times",Font.BOLD,13));
				f1.add(l21);
				
				DefaultListModel<String> li9 = new DefaultListModel<>();
				li9.addElement("  7 Up (45 Rs)"); 
				li9.addElement("  Mazza (50 Rs)"); 
				li9.addElement("  Sprite (50 Rs)"); 
				li9.addElement("  Fizz (80 Rs)"); 
				li9.addElement("  Fanta (55 Rs)");
				
				JList<String> list9 = new JList<>(li9); 
				list9.setBounds(470, 400, 100, 90);
				f1.add(list9);
				
				//Fruit,Veg,Meat
				
				l22=new JLabel("FRUIT and Vegitables");
				l22.setBounds(250,515,180,20);
				l22.setFont(new Font("times",Font.BOLD,16));
				f1.add(l22);
				
				//Fruit-Apple,Orange,Pomogranet,Banana
				
				l18=new JLabel("Types");
				l18.setBounds(100,550,250,20);
				l18.setFont(new Font("times",Font.BOLD,13));
				f1.add(l18);
				
				DefaultListModel<String> li10 = new DefaultListModel<>();
				li10.addElement("  Apple 1 Kg (200 Rs)"); 
				li10.addElement("  Orange 1 Kg (250 Rs)"); 
				li10.addElement("  Pomogranet 1 Kg (180 Rs)"); 
				li10.addElement("  Banana 1 Kg (100 Rs)"); 
				li10.addElement("  Mango 1 Kg (80 Rs)");
				
				JList<String> list10 = new JList<>(li10); 
				list10.setBounds(50, 575, 160, 90);
				f1.add(list10);
				
				//Veg
				
				l19=new JLabel("Vegitables");
				l19.setBounds(260,550,250,20);
				l19.setFont(new Font("times",Font.BOLD,13));
				f1.add(l19);
				
				DefaultListModel<String> li11 = new DefaultListModel<>();
				li11.addElement("  Tomato 1 Kg (60 Rs)"); 
				li11.addElement("  Onion 1 Kg (100 Rs)"); 
				li11.addElement("  Potato 1 Kg (40 Rs)"); 
				li11.addElement("  Garlic 1 Kg (200 Rs)"); 
				li11.addElement("  Ginger 1 Kg (150 Rs)");
				
				JList<String> list11 = new JList<>(li11); 
				list11.setBounds(230, 575, 130, 90);
				f1.add(list11);
				
				//Meat
				
				l20=new JLabel("Meat");
				l20.setBounds(425,550,250,20);
				l20.setFont(new Font("times",Font.BOLD,13));
				f1.add(l20);
				
				DefaultListModel<String> li12 = new DefaultListModel<>();
				li12.addElement("  Goat 1 Kg (800 Rs)"); 
				li12.addElement("  Chicken 1 Kg (200 Rs)"); 
				li12.addElement("  Fish 1 Kg (150 Rs)"); 
				li12.addElement("  Deer 1 Kg (10k Rs)"); 
				li12.addElement("  Duck 1 Kg (250 Rs)");
				
				JList<String> list12 = new JList<>(li12); 
				list12.setBounds(380, 575, 135, 90);
				f1.add(list12);
				
				
				
				
				//Delivery Address
				
				l21=new JLabel("Delivery Address :");
				l21.setBounds(750,50,180,20);
				l21.setFont(new Font("times",Font.BOLD,13));
				f1.add(l21);
				
				area1=new JTextArea();
				area1.setBounds(750,80,400,50);
				f1.add(area1);
				
				//Payment Method
				
				l22=new JLabel("Payment Method :");
				l22.setBounds(750,150,180,20);
				l22.setFont(new Font("times",Font.BOLD,13));
				f1.add(l22);
				
				rb1=new JRadioButton("Cash On Delivery");
				rb1.setBounds(800,180,125,20);
				f1.add(rb1);
				rb2=new JRadioButton("Online Mode");
				rb2.setBounds(950,180,100,20);
				f1.add(rb2);
				
				ButtonGroup bg=new ButtonGroup();
				bg.add(rb1);
				bg.add(rb2);
				
				//Mobile No
				
				l23=new JLabel("Phone Number :");
				l23.setBounds(750,220,180,20);
				l23.setFont(new Font("times",Font.BOLD,13));
				f1.add(l23);
				
				t10=new JTextField();
				t10.setBounds(860,220,180,20);
				f1.add(t10);
				
				
				//Generate Receipt
				
				b7=new JButton("Generate Receipt");
				b7.setBounds(750,290,150,20);
				b7.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e)
					{
						area2.setText("-------------------"+ "-----------RECEIPT----------" + "--------------------------"+ "--------------------------" + "-------------------\n");
						area2.setText(area2.getText()+ "    Customer Name: "+ t3.getText()+ "\n");
						area2.setText(area2.getText()+ "    Phone No : "+ t10.getText()+ "\n"); 
						area2.setText(area2.getText()+ "    Address: "+ area1.getText()+ "\n");
						area2.setText(area2.getText()+ "    Grocery-Ponni Rice = "+ list1.getSelectedValue().toString()+ "\n"); 
						area2.setText(area2.getText()+ "    Grocery-Wheat Powder = "+ list2.getSelectedValue().toString() + "\n");
						area2.setText(area2.getText()+ "    Grocery-Sugar = "+ list3.getSelectedValue().toString()+ "\n"); 
						area2.setText(area2.getText()+ "    Grocery-Daal = "+ list4.getSelectedValue().toString() + "\n");
						area2.setText(area2.getText()+ "    Grocery-Egg = "+ list5.getSelectedValue().toString()+ "\n"); 
						area2.setText(area2.getText()+ "    Chips-Items = "+ list6.getSelectedValue().toString() + "\n");
						area2.setText(area2.getText()+ "    Snacks-Chocolate = "+ list7.getSelectedValue().toString()+ "\n"); 
						area2.setText(area2.getText()+ "    Snacks-Biscuts = "+ list8.getSelectedValue().toString() + "\n");
						area2.setText(area2.getText()+ "    Grocery-Cool Drinks = "+ list9.getSelectedValue().toString()+ "\n"); 
						area2.setText(area2.getText()+ "    Fruit = "+ list10.getSelectedValue().toString() + "\n");
						area2.setText(area2.getText()+ "    Vegitables = "+ list11.getSelectedValue().toString()+ "\n"); 
						area2.setText(area2.getText()+ "    Meat = "+ list12.getSelectedValue().toString() + "\n");
					}
				}); 
				f1.add(b7);
				
				//Place order Button
				
				b8=new JButton("Place Order");
				b8.setBounds(925,290,125,20);
				b8.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						JOptionPane.showMessageDialog(f1,"Your Order have been placed Successfully --THANK YOU--","Confirmation",JOptionPane.INFORMATION_MESSAGE);
					}
				});
				f1.add(b8);
				
				//Receipt
				
				area2 = new JTextArea(); 
				area2.setBounds(750, 320, 300, 275);
				f1.add(area2);
				
				
				//status area
				
				area3 = new JTextArea(); 
				area3.setBounds(750,650,300,20);
				f1.add(area3);
				
				//Button-Order status
				
				b9=new JButton("Order Status");
				b9.setBounds(840,620,125,20);
				b9.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						area3.setText("We are processing your order and deliver within 2 days");
					}
				});
				f1.add(b9);
				
				
				//Reset Button
				
				b10=new JButton("Reset");
				b10.setBounds(1150,400,100,20);
				b10.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
//						t3.setText(""); Customer Name
						t10.setText("");
						area1.setText("");
						area2.setText("");
						area3.setText("");
					}
				});
				f1.add(b10);
				
				//Print button
				
				b11=new JButton("Print");
				b11.setBounds(1150,450,100,20);
				b11.addActionListener( new ActionListener() 
				{
					public void actionPerformed( ActionEvent e)
					{
						try 
						{
							area2.print(); 
						}
						catch (java.awt.print.PrinterException a) 
						{
							System.err.format( "NoPrinter Found", a.getMessage());
						}
					}
				});
				f1.add(b11);
				
				//Back Button
				
				b12=new JButton("< Back >");
				b12.setBounds(1150,500,100,20);
				b12.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						f1.dispose();
					}
				});
				f1.add(b12);
				
				
			}
		});
		add(b1);
		
		
		//Forget Password
		b5=new JButton("Forget Password");
		b5.setBounds(660,350,150,20);
		b5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JFrame f3=new JFrame("Forget Password Page");
				f3.setSize(800, 800); 
				f3.setLayout(null);
				f3.setVisible(true);
				f3.setBackground(Color.LIGHT_GRAY);
				
				l8=new JLabel("New Password :");
				l8.setBounds(50, 150, 250, 20);
				f3.add(l8);
				t8 = new JTextField();
				t8.setBounds(250, 150, 250, 20);
				f3.add(t8);
				
				l9=new JLabel("Confirm Password :");
				l9.setBounds(50, 200, 250, 20);
				f3.add(l9);
				t9 = new JTextField();
				t9.setBounds(250, 200, 250, 20);
				f3.add(t9);
				
				b6=new JButton("Update");
				b6.setBounds(50, 250, 100, 20);
				b6.addActionListener(new ActionListener()
				{	
					public void actionPerformed(ActionEvent e)
					{
						int response1 = JOptionPane.showConfirmDialog(f3,"Sure to Change your Password ?","Confirmation",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
						if(response1==JOptionPane.YES_OPTION)
						{
							JOptionPane.showMessageDialog(f3,"Password Changed","Confirmation",JOptionPane.INFORMATION_MESSAGE);
						}
						else if(response1==JOptionPane.NO_OPTION)
						{
							JOptionPane.showMessageDialog(f3,"Password Not Changed","Confirmation",JOptionPane.INFORMATION_MESSAGE);
						}
						else if(response1==JOptionPane.CANCEL_OPTION)
						{
							//it will close automatically 
						}
						
							
					}
				});
				f3.add(b6);
				
				
				b7=new JButton("<Back>");
				b7.setBounds(200, 250, 100, 20);
				b7.addActionListener(new ActionListener()
				{	
					public void actionPerformed(ActionEvent e)
					{
						f3.dispose();
					}
				});
				f3.add(b7);
			}
		});
		add(b5);
		
		
		//Create ACCount button 
		l1a=new JLabel("New user means");
		l1a.setBounds(550,400,120,20);
		add(l1a);
		b2=new JButton("Create Account");
		b2.setBounds(650,400,125,20);
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JFrame f2=new JFrame("Create Your Account");
				f2.setSize(800, 800); 
				f2.setLayout(null);
				f2.setVisible(true); 
				f2.setBackground(Color.LIGHT_GRAY);
				
				//Content of Create Account
				l3=new JLabel("Customer Name :");
				l3.setBounds(50, 150, 250, 20);
				f2.add(l3);
				t3 = new JTextField();
				t3.setBounds(250, 150, 250, 20);
				f2.add(t3);
				
				l4=new JLabel("E-Mail ID :");
				l4.setBounds(50, 200, 250, 20);
				f2.add(l4);
				t4 = new JTextField();
				t4.setBounds(250, 200, 250, 20);
				f2.add(t4);
				
				l5=new JLabel("Phone Number :");
				l5.setBounds(50, 250, 250, 20);
				f2.add(l5);
				t5 = new JTextField();
				t5.setBounds(250, 250, 250, 20);
				f2.add(t5);
				
				l6=new JLabel("Create Password :");
				l6.setBounds(50, 300, 250, 20);
				f2.add(l6);
				t6 = new JTextField();
				t6.setBounds(250, 300, 250, 20);
				f2.add(t6);
				
				l7=new JLabel("Confirm Password :");
				l7.setBounds(50, 350, 250, 20);
				f2.add(l7);
				t7 = new JTextField();
				t7.setBounds(250, 350, 250, 20);
				f2.add(t7);
				
				b3=new JButton("Submit");
				b3.setBounds(50, 400, 100, 20);
				b3.addActionListener(new ActionListener()
				{	
					public void actionPerformed(ActionEvent e)
					{
						JOptionPane.showMessageDialog(f2,"Account Created","Information",JOptionPane.INFORMATION_MESSAGE);
						f2.dispose();
					}
				});
				f2.add(b3);
				
				b4=new JButton("Reset");
				b4.setBounds(200, 400, 100, 20);
				b4.addActionListener(new ActionListener()
				{	
					public void actionPerformed(ActionEvent e)
					{
						t3.setText("");
						t4.setText("");
						t5.setText("");
						t6.setText("");
						t7.setText("");
					}
				});
				f2.add(b4);
			}
		});
		add(b2);
		
	
		
		
		
		
		
		
		
	}

	public static void main(String[] args) 
	{
		new Su_Ma();

	}

}
