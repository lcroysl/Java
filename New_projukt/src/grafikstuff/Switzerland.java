package grafikstuff;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
public class Switzerland extends Group{
	public Switzerland() {
		
		Rectangle tangle = new Rectangle();
		tangle.setHeight(400);
		tangle.setWidth(400);
		tangle.setFill(Color.RED);
		
		Rectangle tangle2 = new Rectangle();
		tangle2.setHeight(70);
		tangle2.setWidth(250);
		tangle2.setTranslateY(165);
		tangle2.setTranslateX(75);
		tangle2.setFill(Color.WHITE);
		
		Rectangle tangle3 = new Rectangle();
		tangle3.setHeight(250);
		tangle3.setWidth(70);
		tangle3.setTranslateY(75);
		tangle3.setTranslateX(165);
		tangle3.setFill(Color.WHITE);
		
		
		this.getChildren().addAll(tangle, tangle2, tangle3);
	}

}