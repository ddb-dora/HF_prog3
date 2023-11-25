package game;

import java.awt.image.BufferedImage;

public abstract class Player {
	protected final int playerIdx;
	protected final BufferedImage playerImage;
	protected final int[] boardSize;
	protected final int nToConnect;
	
	public Player(int playerIdx, int[] boardSize, int nToConnect, BufferedImage playerImage) {
		this.playerIdx = playerIdx;
		this.boardSize = boardSize;
		this.nToConnect = nToConnect;
		this.playerImage = playerImage;
	}
	public abstract int step(Board board);
}
