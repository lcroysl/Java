package grafikstuff;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
public class Nkorea extends Group{
	public Nkorea() {
		
		Rectangle tangle = new Rectangle();
		tangle.setHeight(400);
		tangle.setWidth(600);
		tangle.setFill(Color.WHITE);
		
		
		Rectangle tangle3 = new Rectangle();
		tangle3.setHeight(80);
		tangle3.setWidth(600);
		tangle3.setFill(Color.DARKBLUE);
		
		Rectangle tangle4 = new Rectangle();
		tangle4.setTranslateY(320);
		tangle4.setHeight(80);
		tangle4.setWidth(600);
		tangle4.setFill(Color.DARKBLUE);
		
		Rectangle tangle5 = new Rectangle();
		tangle5.setTranslateY(90);
		tangle5.setHeight(220);
		tangle5.setWidth(600);
		tangle5.setFill(Color.RED);
		
		Circle circ = new Circle();
		circ.setRadius(75);
		circ.setFill(Color.WHITE);
		circ.setTranslateY(200);
		circ.setTranslateX(200);
		
		Star star = new Star(73);
		star.setTranslateX(198);
		star.setTranslateY(206);
		star.setFill(Color.RED);
		star.setRotate(54);
		
		
		
		this.getChildren().addAll(tangle, tangle3, tangle4, tangle5, circ, star);
	}

}
