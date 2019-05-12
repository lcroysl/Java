package grafikstuff;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
public class Somalia extends Group{
	public Somalia() {
		
		Rectangle tangle = new Rectangle();
		tangle.setHeight(400);
		tangle.setWidth(600);
		tangle.setFill(Color.AQUA);
		
		
		Star star = new Star(100);
		star.setTranslateX(298);
		star.setTranslateY(206);
		star.setFill(Color.WHITE);
		star.setRotate(54);
		
		
		
		this.getChildren().addAll(tangle, star);
	}

}
