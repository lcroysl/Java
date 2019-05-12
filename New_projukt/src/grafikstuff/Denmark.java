package grafikstuff;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
public class Denmark extends Group{
	
	public Denmark(){
		
	
	Rectangle redback = new Rectangle();
	redback.setWidth(600);
	redback.setHeight(400);
	redback.setFill(Color.RED);
	
	Rectangle white1 = new Rectangle();
	white1.setWidth(60);
	white1.setHeight(400);
	white1.setFill(Color.WHITE);
	white1.setTranslateX(190);
	
	Rectangle white2 = new Rectangle();
	white2.setWidth(600);
	white2.setHeight(60);
	white2.setFill(Color.WHITE);
	white2.setTranslateY((400-60)/2);
	
	this.getChildren().addAll(redback, white1, white2);
	}
}



