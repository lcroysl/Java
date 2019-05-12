package grafikstuff;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
public class UK extends Group{
	
		public UK() {
			
			Rectangle blueback = new Rectangle();
			blueback.setFill(Color.DARKBLUE);
			blueback.setHeight(400);
			blueback.setWidth(600);
			
			Polygon diagonal1 = new Polygon(0,0, 90,0, 600,350, 600,400, 510,400, 0,50);
			diagonal1.setFill(Color.WHITE);
			
			Polygon diagonal1red = new Polygon(0,0, 270,190, 230,190, 0,35);
			diagonal1red.setFill(Color.RED);
			
			Polygon diagonal2red = new Polygon(600,400, 330,210, 370,210, 600,365);
			diagonal2red.setFill(Color.RED);
			
			Polygon diagonal2 = new Polygon(600,0, 600,50, 90,400, 0,400, 0,350, 510,0);
			diagonal2.setFill(Color.WHITE);
			
			Polygon diagonal3red = new Polygon(0,400, 270,210, 335,210, 60,400);
			diagonal3red.setFill(Color.RED);
			
			Polygon diagonal4red = new Polygon(600,0, 330,190, 265,190, 540,0);
			diagonal4red.setFill(Color.RED);
			
			Rectangle cross1 = new Rectangle();
			cross1.setHeight(400);
			cross1.setWidth(50);
			cross1.setFill(Color.RED);
			cross1.setTranslateX(275);
			
			Rectangle cross1white = new Rectangle();
			cross1white.setHeight(400);
			cross1white.setWidth(90);
			cross1white.setFill(Color.WHITE);
			cross1white.setTranslateX((600-90)/2);
			
			Rectangle cross2 = new Rectangle();
			cross2.setHeight(60);
			cross2.setWidth(600);
			cross2.setFill(Color.RED);
			cross2.setTranslateY(170);
			
			Rectangle cross2white = new Rectangle();
			cross2white.setHeight(100);
			cross2white.setWidth(600);
			cross2white.setFill(Color.WHITE);
			cross2white.setTranslateY((400-100)/2);
			
			this.getChildren().addAll(blueback, diagonal1, diagonal2, diagonal1red, diagonal2red, diagonal3red, diagonal4red, cross1white, cross2white, cross1, cross2);
			}
		}

	
	
