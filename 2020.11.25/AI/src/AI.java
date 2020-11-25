import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;
import java.io.*;
public class AI extends MIDlet
{
	Display display;
	MainCanvas mc;
	public AI(){
		display=Display.getDisplay(this);
		mc=new MainCanvas();
		display.setCurrent(mc);
	}
	public void startApp(){
	}
	public void destroyApp(boolean unc){
	}
	public void pauseApp(){
	}
}
class MainCanvas extends Canvas implements Runnable
{
	Thread thread;
	int heroX,heroY,bossX,bossY;
	int Flag;
	Image heroImg[][]=new Image[4][3];//0表示左，1表示右，2表示上，3表示下。
	Image currentImg;
	Image bossImg;
public MainCanvas(){
	    try
	    {
			for(int i=0;i<heroImg.length;i++){
				for(int j=0;j<heroImg[i].length;j++){
				heroImg[i][j]=Image.createImage("/sayo"+i+j+".png");
				}
			}
			bossImg=Image.createImage("/zuzu000.png");
			currentImg=heroImg[3][1];
			heroX=122;
			heroY=122;
			
			bossX=0;
			bossY=0;
			Flag=1;

			thread=new Thread(this);
			thread.start();
		}
	    catch (IOException e)
	    {
			e.printStackTrace();
	    }
   }

	public void paint(Graphics g){
		g.setColor(255,0,0);
		g.fillRect(0,0,getWidth(),getHeight());
		g.drawImage(currentImg,heroX,heroY,0);
		g.drawImage(bossImg,bossX,bossY,0);
	}
	public void run(){
		while (true){
			
			try{
				Thread.sleep(200);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			if(bossX<heroX){
                bossX++;
			}else{
				bossX--;
			}
			if(bossY<heroY){
				bossY++;
			}else{
				bossY--;
			}
			repaint();	
		}
	}
    public void changePicAndTurn(int direction){
		if(Flag==1){
			currentImg=heroImg[direction][0];
			Flag++;
			}
		else if(Flag==2){
		    currentImg=heroImg[direction][2];
			Flag=1;
			}
	}
	public void keyPressed(int keyCode){
		int action=getGameAction(keyCode);

		if(action==LEFT){
			changePicAndTurn(0);
			heroX=heroX-1;
		}
		if(action==RIGHT){
			changePicAndTurn(1);
			heroX=heroX+1;
		}
		if(action==UP){
			changePicAndTurn(2);
			heroY=heroY-1;
		}
		if(action==DOWN){
			changePicAndTurn(3);
			heroY=heroY+1;
		}
		
	}
}