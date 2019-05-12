package grafikstuff;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
public class Finland extends Group{
	
	public Finland(){
		
	
	Rectangle whiteback = new Rectangle();
	whiteback.setWidth(600);
	whiteback.setHeight(400);
	whiteback.setFill(Color.WHITE);
	
	Rectangle blue1 = new Rectangle();
	blue1.setWidth(90);
	blue1.setHeight(400);
	blue1.setFill(Color.BLUE);
	blue1.setTranslateX(190);
	
	Rectangle blue2 = new Rectangle();
	blue2.setWidth(600);
	blue2.setHeight(90);
	blue2.setFill(Color.BLUE);
	blue2.setTranslateY((400-90)/2);
	
	this.getChildren().addAll(whiteback, blue1, blue2);
	}
}


