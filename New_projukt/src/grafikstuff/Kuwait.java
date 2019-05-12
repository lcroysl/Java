package grafikstuff;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
public class Kuwait extends Group{
	public Kuwait() {
		
		Polygon tangle = new Polygon(0,0, 170,135, 170,265, 0,400);
		tangle.setFill(Color.BLACK);
		
		Rectangle green = new Rectangle();
		green.setWidth(600);
		green.setHeight(135);
		green.setFill(Color.GREEN);
		
		Rectangle redtangle = new Rectangle();
		redtangle.setWidth(600);
		redtangle.setHeight(135);
		redtangle.setFill(Color.RED);
		redtangle.setTranslateY(265);
		
			
		Rectangle white = new Rectangle();
		white.setWidth(600);
		white.setHeight(130);
		white.setTranslateY(135);
		white.setFill(Color.WHITE);
		
		this.getChildren().addAll(green, white, redtangle, tangle);
	}

}

