package grafikstuff;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
public class Austria extends Group{
	public Austria() {
		Rectangle redtangle = new Rectangle();
		redtangle.setWidth(600);
		redtangle.setHeight(400);
		redtangle.setFill(Color.RED);
		

		Rectangle white = new Rectangle();
		white.setWidth(600);
		white.setHeight(130);
		white.setTranslateY((400-130)/2);
		white.setFill(Color.WHITE);
		
		this.getChildren().addAll(redtangle, white);
	}

}

