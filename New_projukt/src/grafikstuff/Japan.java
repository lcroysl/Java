package grafikstuff;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
public class Japan extends Group{
	public Japan() {
		Rectangle redtangle = new Rectangle();
		redtangle.setWidth(600);
		redtangle.setHeight(400);
		redtangle.setFill(Color.WHITE);
			
		Circle white = new Circle();
		white.setRadius(100);
		white.setTranslateX(600/2);
		white.setTranslateY(400/2);
		white.setFill(Color.RED);
		
		this.getChildren().addAll(redtangle, white);
	}

}


