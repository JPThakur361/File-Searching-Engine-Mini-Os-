
//package searchengine;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class FileSearch extends Frame 
{
	static SELayout se;
	public static void main(String[] args) 
	{
        //application logic here
    
       se = new SELayout("File Search Engine");
    }
	public void listFilesAndFolders(String folder,String filename) 	
	{
		File file = new File(folder);
		try
		{
			if (!file.exists()) 
			{
				se.ta1.append("no file found");
			}
		}
	
		catch(Exception e){}
		File[] fileArray = file.listFiles();
		for (int i = 0; i<fileArray.length; i++) 	
		{
			if (fileArray[i].isDirectory()) 
			{
				try
				{ 
					String filename1=fileArray[i].getName().toLowerCase();
					int j=filename1.indexOf(filename);
					if(j!=(-1))
					{
						String s=fileArray[i].getAbsolutePath()+"\n";
						se.ta1.append(s);
					}
					listFilesAndFolders(fileArray[i].getAbsolutePath(),filename);
				}
				catch(Exception e){}
			}
			else 
			{
				try
				{
					String filename1=fileArray[i].getName().toLowerCase();
					int j=filename1.indexOf(filename);
					if(j!=(-1))
					{
						String s=fileArray[i].getAbsolutePath()+"\n";
						se.ta1.append(s);
					}
				}
				catch(Exception e){}
			}
		}
	}
public void listFilesAndFolders3(String folder,String filename) 
{
    File file = new File(folder);
    try	
	{
		if (!file.exists()) 
		{
			se.ta1.append("no file found");
		}
	}
	catch(Exception e){}
    File[] fileArray = file.listFiles();
    for (int i = 0; i<fileArray.length; i++)
	{
		if (fileArray[i].isDirectory()) {
		try
        {
			String filename1=fileArray[i].getName().toLowerCase();
			int j=filename1.indexOf(filename);
			if(j!=(-1))
			{
				String s=fileArray[i].getAbsolutePath()+"\n";
				se.ta1.append(s);
			}
			listFilesAndFolders(fileArray[i].getAbsolutePath(),filename);
        }
        catch(Exception e){}
	}
	else
	{
		try
        {
			String filename1=fileArray[i].getName().toLowerCase();
			int j=filename1.indexOf(filename);
			if(j!=(-1))
			{
				String s=fileArray[i].getAbsolutePath()+"\n";
				se.ta1.append(s);
			}
		}
		catch(Exception e){}
		}
    }
}

 public void listFilesAndFolders1(String folder) {
     File file = new File(folder);
     try{
     if (!file.exists()) {



       se.ta1.append("no file found");
      
     }
 	}
 	catch(Exception e){}

  File[] fileArray = file.listFiles();

     for (int i = 0; i<fileArray.length; i++) {

       if (fileArray[i].isDirectory()) {

           try
         {
              String filename1=fileArray[i].getName().toLowerCase();
         int j=filename1.indexOf(".mp3");
         if(j!=(-1))
         {
 		String s=fileArray[i].getAbsolutePath()+"\n";
 		se.ta1.append(s);
 		}
         listFilesAndFolders1(fileArray[i].getAbsolutePath());
         }



         catch(Exception e){}
 		
    }
       else
       {
 		 try
         {
        
  		String filename1=fileArray[i].getName().toLowerCase();
  		int j=filename1.indexOf(".mp3");
         if(j!=(-1))
  		{
  		String s=fileArray[i].getAbsolutePath()+"\n";
  		se.ta1.append(s);
 		}
 		}
 	catch(Exception e){}
 		}
    }
}
  
public void listFilesAndFolders2(String folder) {
     File file = new File(folder);
	    


           try{
	     if (!file.exists()) {
	       se.ta1.append("no file found");
	       //System.exit(1);
	     }
	 	}
	 	catch(Exception e){}

	     File[] fileArray = file.listFiles();

	     for (int i = 0; i<fileArray.length; i++) {

	       if (fileArray[i].isDirectory()) {

	           try
	         {
	       String filename1=fileArray[i].getName().toLowerCase();
	       
               int j=filename1.indexOf(".avi");
	         if(j!=(-1))
	         {
	 		String s=fileArray[i].getAbsolutePath()+"\n";
	 		se.ta1.append(s);
	 		}


	         listFilesAndFolders2(fileArray[i].getAbsolutePath());
	         }
	         catch(Exception e){}
	 		}
	       else
	       {
	 		 try
	         {
	    		String filename1=fileArray[i].getName().toLowerCase();
	  		int j=filename1.indexOf(".avi");
	         if(j!=(-1))
	  		

           {
	  		String s=fileArray[i].getAbsolutePath()+"\n";
	  		se.ta1.append(s);
	 		}
	 		}
	 		catch(Exception e){}
 		  }
    }
}
}
class SELayout extends JFrame implements ActionListener,KeyListener 
{
	Button btn,btn1,btn2,btn3;
	JMenuBar mb ;
	JMenu m1,m2,m3,m4,m5;
	JMenuItem m;
	JLabel lb1,lb2,lb3,lb4;
	Label lb;
        TextField tf;
	TextArea ta1;
	JPanel tp,mp;
	SELayout(String caption){
		super(caption);
		btn  =new Button("Search");
		btn1 =new Button(" Music ");
		btn2 =new Button(" Videos ");
		btn3 =new Button(" EXIT ");
		mb = new JMenuBar();
		m  = new JMenuItem("Search Now!");
		m1 = new JMenu("  Efficient Search  ");
		m2 = new JMenu("Edit");
		m3 = new JMenu("View");
		m4 = new JMenu("Tools");
		m5 = new JMenu("Help");
	
                m1.add(m);
		mb.add(m1);
                mb.add(m2);
                mb.add(m3);
                mb.add(m4);
                mb.add(m5);
		setJMenuBar(mb);
		tp=new JPanel();
		mp=new JPanel();
		tp.setLayout(new FlowLayout());
		
		btn.setFont(new Font("Forte",Font.ITALIC,15));
		btn1.setFont(new Font("Forte",Font.ITALIC,15));
		btn2.setFont(new Font("Forte",Font.ITALIC,15));
        btn3.setFont(new Font("Forte",Font.ITALIC,15));
        tp.setFont(new Font("Forte",Font.BOLD,15));
		lb=new Label("Find :",Label.LEFT);
		ta1=new TextArea(" Result",5,5);
		ta1.setBackground(new Color(91,72,208));
		ta1.setForeground(new Color(0,0,0));
		ta1.setFont(new Font("Forte",Font.BOLD,16));


        btn1.setBackground(new Color(255,255,255));
		btn2.setBackground(new Color(255,255,255));
        btn3.setBackground(new Color(255,255,255));
		btn.setBackground(new Color(255,255,255));
		tf=new TextField(20);
		tp.add(lb);
		


         tp.add(tf);
		tp.add(btn);
		tp.add(btn1);
		tp.add(btn2);
                tp.add(btn3);	
		tp.setBackground(Color.gray);
		mp.setLayout(new GridLayout(1,1));
		mp.add(ta1);
		
		setSize(600,500);
		setVisible(true);
		setLayout(new BorderLayout());
		
                add(tp,"North");
		add(mp,"Center");
		btn.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
                btn3.addActionListener(this);
		tf.addKeyListener(this);
		m.addActionListener(this);
	}
	public void keyPressed(KeyEvent ke)
	{
			


            if(ke.getKeyChar()==KeyEvent.VK_ENTER)
			{
				String s=tf.getText();
				         ta1.setText(" "+"Result"+"\n");
				         char d[]={'c','d','e','f','g','h','i','j','k','i',};
						     FileSearch fileSearch = new FileSearch();
						     for(int i=0;i<=9;i++)
						     {
						 	
                                                       String dir=d[i]+":";
						 	    File file = new File(dir);
						     	if(file.isDirectory())
						     	{
						 			fileSearch.listFilesAndFolders(dir,s);
						 		}
				   	 		}
				   	 		if(ta1.getText().equals(" "+"Result"+"\n"))
				   	 		{
								ta1.append("no file found"+"\n");
							}
			ta1.append("Search is complete"+"\n");
				}
		}


	public void keyTyped(KeyEvent ke){}
	public void keyReleased(KeyEvent ke){}

      public void actionPerformed(ActionEvent ae) {
	 if(ae.getSource()==btn)
	  {
         String s=tf.getText();
         ta1.setText(" "+"Result"+"\n");
         char d[]={'c','d','e','f','g','h','i','j','k','i',};
		     FileSearch fileSearch = new FileSearch();
		     for(int i=0;i<=9;i++)
		     {
		 	    String dir=d[i]+":";
		 	    File file = new File(dir);
		     	if(file.isDirectory())
		     	{
		 			fileSearch.listFilesAndFolders(dir,s);
		 		}
   	 		}
   	 		if(ta1.getText().equals(" "+"Result"+"\n"))
   	 		{
				ta1.append("no file found"+"\n");
		



              	}
			ta1.append("Search is complete"+"\n");
		}
	 else if(ae.getSource()==btn1)
		{
			ta1.setText(" "+"Result"+"\n");
         	char d[]={'c','d','e','f','g','h','i','j','k','i',};
		     	FileSearch fileSearch = new FileSearch();
		     	for(int i=0;i<=9;i++)
		     	{
		 	 	   String dir=d[i]+":";
		 	 	   File file = new File(dir);
		    	   if(file.isDirectory())
		     	   {
		 				fileSearch.listFilesAndFolders1(dir);
		 		   }
   	 			}
   	 		ta1.append("Search is complete"+"\n");
		}
	

            else if(ae.getSource()==btn2)
			{
				


                       ta1.setText(" "+"Result"+"\n");
	         	char d[]={'c','d','e','f','g','h','i','j','k','i',};
			     	FileSearch fileSearch = new FileSearch();
			     	for(int i=0;i<=9;i++)
			     	{
			 	 	   String dir=d[i]+":";
			 	 	   File file = new File(dir);
			    	   if(file.isDirectory())
			     	   {
			 				fileSearch.listFilesAndFolders2(dir);
			 		   }
	   	 			}
	   	 		ta1.append("Search is complete"+"\n");
			}
         else if(ae.getSource()==btn3)
			{
                            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            System.exit(0);
                        }
	else if(ae.getSource()==m)
		{
                             String s=" "+tf.getText()+" ";
				ta1.setText(" "+"Result"+"\n");
				char d[]={'c','d','e','f','g','h','i','j','k','i',};
				FileSearch fileSearch = new FileSearch();
				for(int i=0;i<=9;i++)
				{
				 	    String dir=d[i]+":";
				 	   

 
                                                 File file = new File(dir);
				     	if(file.isDirectory())
				     	{
				 			fileSearch.listFilesAndFolders3(dir,s);
				 		}
				}
				if(ta1.getText().equals(" "+"Result"+"\n"))
				{
					ta1.append("no file found"+"\n");
				}
			ta1.append("Search is complete"+"\n");
		}

      }
}


 
