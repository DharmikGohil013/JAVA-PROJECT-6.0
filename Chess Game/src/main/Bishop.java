package main;
import main.GamePanel;
import main.Type;
public class Bishop extends Piece{

	public Bishop(int color ,int col, int row){
		
	super(color,col,row);
	type = Type.BISHOP;
	if(color ==GamePanel.WHITE){
		image =getImage("/resource/bishopW");
	}
	else{
		image =getImage("/resource/bishop");
	}

}

public boolean canMove(int targetCol , int targetRow){
	
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