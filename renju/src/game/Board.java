package game;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class Board {
	//2D-s tömb a táblánknak, ami 15x15-ös
	private int row = 15;
	private int col = 15;
	private Cell[][] board = new Cell[row][col];
	List<Cell>imagePositions = new ArrayList<>();

	
	//ctor
	public Board(int r, int c) {
		row = r;
		col = c;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				board[i][j] = null;
			}
		}
	}
	public void drawOnBoard(Board board, Graphics g, BufferedImage image, Graphics g, JPanel panel) {
		for(int i = 0; i < imagePositions.size(); i++) {
			drawPicture(g, image, imagePositions.get(i).getCoordX(i), imagePositions.get(i).getCoordY(i), panel);

		}
		
	}
	public int getBoardRow() {
		return row;
	}
	public int getBoardCol() {
		return col;
	}
}
