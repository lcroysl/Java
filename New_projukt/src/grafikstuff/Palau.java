package grafikstuff;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
public class Palau extends Group{
	public Palau() {
		
		Rectangle tangle = new Rectangle();
		tangle.setHeight(400);
		tangle.setWidth(600);
		tangle.setFill(Color.AQUA);
		
		Circle circ = new Circle();
		circ.setRadius(120);
		circ.setFill(Color.YELLOW);
		circ.setTranslateY(200);
		circ.setTranslateX(265);
		
		
		this.getChildren().addAll(tangle, circ);
	}

}
