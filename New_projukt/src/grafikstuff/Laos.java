package grafikstuff;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
public class Laos extends Group{
	public Laos() {
		Rectangle redtangle = new Rectangle();
		redtangle.setWidth(600);
		redtangle.setHeight(400);
		redtangle.setFill(Color.RED);
		
		Rectangle bluetangle = new Rectangle();
		bluetangle.setWidth(600);
		bluetangle.setHeight(200);
		bluetangle.setFill(Color.DARKBLUE);
		bluetangle.setTranslateY(100);
		
			
		Circle white = new Circle();
		white.setRadius(75);
		white.setTranslateX(600/2);
		white.setTranslateY(400/2);
		white.setFill(Color.WHITE);
		
		this.getChildren().addAll(redtangle, bluetangle, white);
	}

}

