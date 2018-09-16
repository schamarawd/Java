import java.applet.*;
import java.awt.*;
public class MyApplet extends Applet{
	public void paint(Graphics g){
		g.setColor(Color.red);
		g.drawString("Assignment for Java",05,10);
		g.drawString("Created by Sandun Chamara",05,290);
				
		for(int y=270; y>19;y--){
			g.setColor(Color.blue);
			g.drawLine(10,y,80,y);	
			try{Thread.sleep(10);}
			catch(Exception e){};
		}
		for(int y=270; y>19;y--){
			g.setColor(Color.yellow);
			g.drawLine(81,y,150,y);
			try{Thread.sleep(10);}
			catch(Exception e){};
		}
		for(int y=270; y>19;y--){
			g.setColor(Color.red);
			g.drawLine(151,y,220,y);
			try{Thread.sleep(10);}
			catch(Exception e){};
		}
		for(int y=270; y>19;y--){
			g.setColor(Color.white);
			g.drawLine(221,y,290,y);
			try{Thread.sleep(10);}
			catch(Exception e){};
		}
		for(int y=270; y>19;y--){
			g.setColor(Color.orange);
			g.drawLine(291,y,360,y);
			try{Thread.sleep(10);}
			catch(Exception e){};
		}
		//sub
			for(int a=270; a>219;a--){
			g.setColor(Color.orange);
			g.drawLine(361,a,430,a);
			try{Thread.sleep(10);}
			catch(Exception e){};
			}		
			for(int a=220; a>169;a--){
			g.setColor(Color.white);
			g.drawLine(361,a,430,a);
			try{Thread.sleep(10);}
			catch(Exception e){};
			}		
			for(int a=170; a>119;a--){
			g.setColor(Color.red);
			g.drawLine(361,a,430,a);
			try{Thread.sleep(10);}
			catch(Exception e){};
			}
			for(int a=120; a>69;a--){
			g.setColor(Color.yellow);
			g.drawLine(361,a,430,a);
			try{Thread.sleep(10);}
			catch(Exception e){};
			}
			for(int a=70; a>19;a--){
			g.setColor(Color.blue);
			g.drawLine(361,a,430,a);
			try{Thread.sleep(10);}
			catch(Exception e){};
			}
	}
}
