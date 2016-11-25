import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BorderLayoutExample implements ActionListener
{
		static JFrame jf=new JFrame();
		Container container;
		private JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		JPanel p5=new JPanel();
		Checkbox cb1=new Checkbox("West");
		Checkbox cb2=new Checkbox("East");
		Checkbox cb3=new Checkbox("South");
		Checkbox cb4=new Checkbox("North");
		Checkbox cb5=new Checkbox("Center");
		
	
	public static void main(String args[])
	{
		BorderLayoutExample b=new BorderLayoutExample();
		//JFrame jf=new JFrame();
		
		b.createWindow(jf);
		
	
	}
	
	public  void createWindow(Container container)
	{
		container=jf.getContentPane();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		p1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		p2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		p3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		p4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		p5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		container.setLayout(new BorderLayout());
		container.setBounds(0,0,500,500);
		container.add(p1,BorderLayout.LINE_START);
		container.add(p2,BorderLayout.LINE_END);
		container.add(p3,BorderLayout.CENTER);
		container.add(p4,BorderLayout.PAGE_START);
		container.add(p5,BorderLayout.PAGE_END);
	
		
		this.createMenu(p1);
		p2.add(cb2);
		p3.add(cb5);
		p4.add(cb4);
		p5.add(cb3);
		//createTextArea(p3);
		
	}
	
	public  void createMenu(JPanel p1)
	{
		p1.setLayout(new GridLayout(10,3));
		JButton btn1=new JButton("Pink");
		JButton btn2=new JButton("Green");
		JButton btn3=new JButton("Yellow");
		JButton btn4=new JButton("Black");
		
		btn1.setName("Pink");
		btn2.setName("Green");
		btn3.setName("Yellow");
		btn4.setName("Black");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		
		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		p1.add(btn4);
		
		cb1.setName("West");
		p1.add(cb1);
	}
		
	public  void createTextArea(JPanel p)
	{
		TextArea ta=new TextArea();
		p.add(ta,new GridLayout());
	
	}
	
	public  void createCheckBox(JPanel p,String str)
	{
		Checkbox cb=new Checkbox(str);
		cb.setName(str);
		p.add(cb);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		JComponent comp=(JComponent)event.getSource();
		String name=comp.getName();
		if(name.equals("Pink"))
		{
			if(cb1.getState())
				p1.setBackground(Color.PINK);
			if(cb2.getState())
				p2.setBackground(Color.PINK);
			if(cb3.getState())
				p5.setBackground(Color.PINK);
			if(cb4.getState())
				p4.setBackground(Color.PINK);
			if(cb5.getState())
				p3.setBackground(Color.PINK);
			
		}
		else if(name.equals("Green"))
		{
			if(cb1.getState())
				p1.setBackground(Color.GREEN);
			if(cb2.getState())
				p2.setBackground(Color.GREEN);
			if(cb3.getState())
				p5.setBackground(Color.GREEN);
			if(cb4.getState())
				p4.setBackground(Color.GREEN);
			if(cb5.getState())
				p3.setBackground(Color.GREEN);
			
		}
		else if(name.equals("Yellow"))
		{
			if(cb1.getState())
				p1.setBackground(Color.YELLOW);
			if(cb2.getState())
				p2.setBackground(Color.YELLOW);
			if(cb3.getState())
				p5.setBackground(Color.YELLOW);
			if(cb4.getState())
				p4.setBackground(Color.YELLOW);
			if(cb5.getState())
				p3.setBackground(Color.YELLOW);
			
		}
		else if(name.equals("Black"))
		{
			if(cb1.getState())
				p1.setBackground(Color.BLACK);
			if(cb2.getState())
				p2.setBackground(Color.BLACK);
			if(cb3.getState())
				p5.setBackground(Color.BLACK);
			if(cb4.getState())
				p4.setBackground(Color.BLACK);
			if(cb5.getState())
				p3.setBackground(Color.BLACK);
			
		}	
		
	}
	
}
		
		