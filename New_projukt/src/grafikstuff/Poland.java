package grafikstuff;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
public class Poland extends Group{
	public Poland() {
		
		Rectangle tangle = new Rectangle();
		tangle.setHeight(200);
		tangle.setWidth(600);
		tangle.setFill(Color.WHITE);
		
		Rectangle tangle2 = new Rectangle();
		tangle2.setHeight(200);
		tangle2.setWidth(600);
		tangle2.setTranslateY(200);
		tangle2.setFill(Color.RED);
		
		
		this.getChildren().addAll(tangle, tangle2);
	}

}

