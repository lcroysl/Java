package grafikstuff;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
public class Congo extends Group{
	public Congo() {
		
		Polygon tangle = new Polygon(0,0, 400,0, 0,400);
		tangle.setFill(Color.GREEN);
		
		Polygon tangle2 = new Polygon(400,0, 600,0, 200,400, 0,400);
		tangle2.setFill(Color.YELLOW);
		
		Polygon tangle3 = new Polygon(600,400, 200,400, 600,0);
		tangle3.setFill(Color.RED);
		
		
		
		this.getChildren().addAll(tangle, tangle2, tangle3);
	}

}

