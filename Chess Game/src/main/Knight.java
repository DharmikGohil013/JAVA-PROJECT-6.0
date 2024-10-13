package main;
import main.GamePanel;
import main.Type;
public class Knight extends Piece{

	public Knight(int color ,int col, int row){
		
	super(color,col,row);
	type = Type.KNIGHT;
	if(color ==GamePanel.WHITE){
		image =getImage("/resource/knightW");
	}
	else{
		image =getImage("/resource/knightB");
	}

}

 public boolean canMove(int targetCol , int targetRow){
	
	if(isWithinBoard(targetCol,targetRow)){
	
	if(Math.abs(targetCol -preCol)*Math.abs(targetRow -preRow) ==2){
	if(isValidSquare(targetCol,targetRow))return true;
	}

	}
	return false;
}

}