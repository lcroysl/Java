package grafikstuff;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
public class Czech extends Group{
	public Czech() {
		
		Rectangle tangle = new Rectangle();
		tangle.setHeight(200);
		tangle.setWidth(600);
		tangle.setFill(Color.WHITE);
		
		Polygon tangle2 = new Polygon(0,0, 200,200, 0,400);
		tangle2.setFill(Color.BLUE);
		
		Rectangle tangle3 = new Rectangle();
		tangle3.setTranslateY(200);
		tangle3.setHeight(200);
		tangle3.setWidth(600);
		tangle3.setFill(Color.RED);
		
		
		
		this.getChildren().addAll(tangle, tangle3, tangle2);
	}

}
