package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class ViewBoard {
	int dist = 30;
	int row_x1 = 135;
	int row_y1 = 150;
	int row_x2 = 600;
	int row_y2 = 150;
	int col_x1 = 150;
	int col_y1 = 135;
	int col_x2 = 150;
	int col_y2 = 600;
	public void drawTable(Graphics g) {
		g.setColor(Color.BLACK);
		
		int numOfRows = 15;
		int numOfCols = 15;
		//sorok kirajzolása
		for(int i = 0; i < numOfRows+1; i++) {
			g.drawLine(row_x1, row_y1, row_x2, row_y2);
			row_y1 += dist;
			row_y2 += dist;
		}
		
		//Oszlopok kirajzolása		
		for(int i = 0; i < numOfCols + 1; i++) {
			g.drawLine(col_x1, col_y1, col_x2, col_y2);
			
			col_x1 += dist;
			col_x2 += dist;
		}
	}
	
	public void drawString(Graphics g) {
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
	public void drawPicture(Graphics g, BufferedImage image, int x, int y, JPanel panel) {
			g.drawImage(image, x, y, panel);
		
	}
}
