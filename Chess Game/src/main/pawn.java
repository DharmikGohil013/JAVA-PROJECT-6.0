package main;
import main.GamePanel;
import main.Type;
public class pawn extends Piece{

	public pawn(int color ,int col, int row){
		
	super(color,col,row);
	type =Type.PAWN;
	if(color ==GamePanel.WHITE){
		image =getImage("/resource/pawn");
	}
	else{
		image =getImage("/resource/pawnB");
	}
}

public boolean canMove(int targetCol,int targetRow){
	
	if(isWithinBoard(targetCol,targetRow) && !isSameSquare(targetCol,targetRow)){
	int moveValue;
	if(color ==GamePanel.WHITE){
	moveValue=-1;
	}	
	else{
		moveValue =1;
	}
	// check the hitting piece
	hittingP = getHittingP(targetCol,targetRow);

	// 1 square movement 
	if(targetCol==preCol && targetRow ==preRow+moveValue && hittingP== null){
	return true;
	}
	
	// 2 square movement

	if(targetCol==preCol && targetRow ==preRow+moveValue*2 && hittingP== null && !moved && !pieceIsOnStraightLine(targetCol,targetRow)){
	return true;
	}
	// Diagonally capture the pieces
	if(Math.abs(targetCol -preCol)==1 && targetRow==preRow +moveValue && hittingP!=null && hittingP.color !=color){
		return true;
	}

	// En passant 
if(Math.abs(targetCol -preCol)==1 && targetRow==preRow +moveValue){
for(Piece piece : GamePanel.simPieces){
	if(piece.col ==targetCol && piece.row ==preRow && piece.twoStepped == true){
	hittingP = piece;
	return true;
}
}
	
}	
	 
	
}


return false;	
}


}