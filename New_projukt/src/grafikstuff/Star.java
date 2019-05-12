package grafikstuff;
import javafx.scene.shape.Polygon;
public class Star extends Polygon {
	public Star(double radius) {
		double v = 72;
		for (int i = 0; i < 5; i++) {
		double x = Math.sin(Math.toRadians(90 + v * 2*i))* radius;
		double y = Math.cos(Math.toRadians(90 + v * 2*i))* radius;
		getPoints().add(x);
		getPoints().add(y);
		}
	}

}
