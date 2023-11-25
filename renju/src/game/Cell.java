package game;

public class Cell {
	int value;
	int[][] coordinates = new int[2][15];
	//ctor
	public Cell() {
		value = 0;
		for(int i = 0; i < 15; i++) {
				coordinates[0][i] = 0; 
				coordinates[1][i] = 0;
		}
	}
	public void setCell(int x, int y, int playerIdx) {
		value = playerIdx;
		for(int i = 0; i < 15; i++) {
			coordinates[0][i] = x;
			coordinates[1][i] = y;
		}
	}
	public int getCoordX(int idx) {
		return coordinates[0][idx];
	}
	public int getCoordY(int idx) {
		return coordinates[1][idx];
	}
	
	
	
	//public void draw(Graphics g, BufferedImage image) {
		
	//}
}
