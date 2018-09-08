import java.applet.*;
import java.awt.*;
public class MyApplet extends Applet{
	public void paint(Graphics g){
		g.setColor(Color.red);
		g.drawString("Assignment for Java",05,10);
		g.drawString("Created by Sandun Chamara",05,240);
				
		for(int y=220; y>19;y--){
			g.setColor(Color.blue);
			g.drawLine(10,y,80,y);
			g.setColor(Color.yellow);
			g.drawLine(80,y,150,y);
			g.setColor(Color.red);
			g.drawLine(150,y,220,y);
			g.setColor(Color.white);
			g.drawLine(220,y,290,y);
			g.setColor(Color.orange);
			g.drawLine(290,y,360,y);
			try{Thread.sleep(50);}
			catch(Exception e){};
		}

			for(int a=220; a>179;a--){
			g.setColor(Color.orange);
			g.drawLine(360,a,430,a);
			try{Thread.sleep(50);}
			catch(Exception e){};
			}		
			for(int a=180; a>139;a--){
			g.setColor(Color.white);
			g.drawLine(360,a,430,a);
			try{Thread.sleep(50);}
			catch(Exception e){};
			}		
			for(int a=140; a>99;a--){
			g.setColor(Color.red);
			g.drawLine(360,a,430,a);
			try{Thread.sleep(50);}
			catch(Exception e){};
			}
			for(int a=100; a>59;a--){
			g.setColor(Color.yellow);
			g.drawLine(360,a,430,a);
			try{Thread.sleep(50);}
			catch(Exception e){};
			}
			for(int a=60; a>19;a--){
			g.setColor(Color.blue);
			g.drawLine(360,a,430,a);
			try{Thread.sleep(50);}
			catch(Exception e){};
			}
			
	
	}
}