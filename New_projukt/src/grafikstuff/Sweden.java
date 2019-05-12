package grafikstuff;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
public class Sweden extends Group{
	
	public Sweden(){
		
	
	Rectangle blueback = new Rectangle();
	blueback.setWidth(600);
	blueback.setHeight(400);
	blueback.setFill(Color.BLUE);
	
	Rectangle yellow1 = new Rectangle();
	yellow1.setWidth(70);
	yellow1.setHeight(400);
	yellow1.setFill(Color.YELLOW);
	yellow1.setTranslateX(190);
	
	Rectangle yellow2 = new Rectangle();
	yellow2.setWidth(600);
	yellow2.setHeight(70);
	yellow2.setFill(Color.YELLOW);
	yellow2.setTranslateY((400-70)/2);
	
	this.getChildren().addAll(blueback, yellow1, yellow2);
	}
}


