package grafikstuff;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
public class Russia extends Group{
	public Russia() {
		
		Rectangle tangle = new Rectangle();
		tangle.setHeight(133.3);
		tangle.setWidth(600);
		tangle.setFill(Color.WHITE);
		
		Rectangle tangle2 = new Rectangle();
		tangle2.setHeight(133.3);
		tangle2.setWidth(600);
		tangle2.setTranslateY(133.3);
		tangle2.setFill(Color.BLUE);
		
		Rectangle tangle3 = new Rectangle();
		tangle3.setHeight(133.3);
		tangle3.setWidth(600);
		tangle3.setTranslateY(266.6);
		tangle3.setFill(Color.RED);
		
		
		this.getChildren().addAll(tangle, tangle2, tangle3);
	}

}
