package main;
import main.GamePanel;
import main.Type;
public class Queen extends Piece{

	public Queen(int color ,int col, int row){
		
	super(color,col,row);
	type =Type.QUEEN;
	if(color ==GamePanel.WHITE){
		image =getImage("/resource/queenW");
	}
	else{
		image =getImage("/resource/queenB");
	}

}

public boolean canMove(int targetCol , int targetRow){
	
if(isWithinBoard(targetCol,targetRow)&& !isSameSquare(targetCol,targetRow)){
	// rook can move horizontal and vertical
	if(targetCol ==preCol || targetRow ==preRow){
	if(isValidSquare(targetCol,targetRow) && !pieceIsOnStraightLine(targetCol,targetRow))return true;
	}
	}

	
	// Diagonal
	if(isWithinBoard(targetCol,targetRow)&& !isSameSquare(targetCol,targetRow)){
	
	if(Math.abs(targetCol-preCol)==Math.abs(targetRow-preRow)){
		
	if(isValidSquare(targetCol,targetRow) && !pieceIsOnDiagnalLine(targetCol,targetRow)){
		return true;
	}
	
	}

	}

		return false;
}

}