package view;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import game.Board;
;
public class ViewFrame extends JFrame {
	private JButton button;
	
	BufferedImage blackImage; 
	
	BufferedImage whiteImage; 

	public ViewFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Bezárható ablakot készitünk
		setTitle("Renju");		//Az ablak cime
		setSize(1200, 800);		//Az ablak mérete
		setResizable(true);		//átméretezhető az ablak
		System.out.println(System.getProperty("user.dir"));

		try {
		blackImage = ImageIO.read(new File("images/blackCoin.png"));
		
		whiteImage = ImageIO.read(new File("images/whiteCoin.png"));
		}catch(IOException e){
			e.printStackTrace();
		}
		
		//A tábla vonalainak rajzolásához
		JPanel boardPanel = new JPanel(){
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				drawTable(g);
		//A tábla sor- és oszlopneveinek rajzolásához
				drawString(g);
		//A lépés kirajzolásához, X és O helyett fekete-fehér korongok
				drawPicture(g, blackImage, 151, 151, this);
			}
		
			
		};
		
		
		//Megjelenitjük a táblát, és minden mást is majd rajta
		add(boardPanel, BorderLayout.CENTER);
		
		//A frame-et láthatóvá tesszük.
		setVisible(true);
		
	}
	
	public void printMenu() {
		
	}

	private void drawTable(Graphics g) {
		g.setColor(Color.BLACK);
		//(x1, y1, x2, y2)
		int dist = 30;
		int x1 = 135;
		int y1 = 150;
		int x2 = 600;
		int y2 = 150;
		
		int numOfRows = 15;
		int numOfCols = 15;
		//sorok kirajzolása
		for(int i = 0; i < numOfRows+1; i++) {
			g.drawLine(x1, y1, x2, y2);
			y1 += dist;
			y2 += dist;
		}
		
		//Oszlopok kirajzolása
		x1 = 150;
		y1 = 135;
		x2 = 150;
		y2 = 600;
		
		
		for(int i = 0; i < numOfCols + 1; i++) {
			g.drawLine(x1, y1, x2, y2);
			
			x1 += dist;
			x2 += dist;
		}

	}
	
	private void drawString(Graphics g) {
		g.setFont(new Font("Arial", Font.BOLD, 16));
		g.setColor(Color.BLACK);
		//Még ird majd át a 15-öt szépre
		int x = 160;
		int y = 145;
		String c[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"};
		int dist = 30;
		for(int i = 0; i < 15; i++) {
			g.drawString(c[i], x, y);
			x += dist;
		}
		
		
		String nums[] =  {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
		x = 130;
		y = 170;
		for(int i = 0; i < 15; i++) {
			g.drawString(nums[i], x, y);
			y += dist;
		}
	}
	private void drawPicture(Graphics g, BufferedImage image, int x, int y, JPanel panel) {
			g.drawImage(image, x, y, panel);
		
	}
}
