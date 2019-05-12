package grafikstuff;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class Flagmaker extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//skapar ett fönster med måtten 500px x 500px med bakgrundsfärgen ljusgrå
		Group root = new Group();
		Scene scene = new Scene(root,500,500,Color.LIGHTGREY);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		UK ukflag = new UK();
		ukflag.setTranslateX(200);
		ukflag.setTranslateY(100);
		//root.getChildren().add(ukflag);
		
		Laos laosflag = new Laos();
		laosflag.setTranslateX(200);
		laosflag.setTranslateY(100);
		//root.getChildren().add(laosflag);
		
		Sweden swedenflag = new Sweden();
		swedenflag.setTranslateX(200);
		swedenflag.setTranslateY(100);
		//root.getChildren().add(swedenflag);
		
		Denmark denmarkflag = new Denmark();
		denmarkflag.setTranslateX(200);
		denmarkflag.setTranslateY(100);
		//root.getChildren().add(denmarkflag);
		
		Finland finlandflag = new Finland();
		finlandflag.setTranslateX(200);
		finlandflag.setTranslateY(100);
		//root.getChildren().add(finlandflag);
		
		Kuwait kuwaitflag = new Kuwait();
		kuwaitflag.setTranslateX(200);
		kuwaitflag.setTranslateY(100);
		//root.getChildren().add(kuwaitflag);
		
		Congo congoflag = new Congo();
		congoflag.setTranslateX(200);
		congoflag.setTranslateY(100);
		//root.getChildren().add(congoflag);
		
		Austria austriaflag = new Austria();
		austriaflag.setTranslateX(200);
		austriaflag.setTranslateY(100);
		//root.getChildren().add(austriaflag);
		
		Japan japanflag = new Japan();
		japanflag.setTranslateX(200);
		japanflag.setTranslateY(100);
		//root.getChildren().add(japanflag);
		
		Czech czechflag = new Czech();
		czechflag.setTranslateX(200);
		czechflag.setTranslateY(100);
		//root.getChildren().add(czechflag);
		
		Nkorea nkoreaflag = new Nkorea();
		nkoreaflag.setTranslateX(200);
		nkoreaflag.setTranslateY(100);
		//root.getChildren().add(nkoreaflag);
		
		Palau palauflag = new Palau();
		palauflag.setTranslateX(200);
		palauflag.setTranslateY(100);
		//root.getChildren().add(palauflag);
		
		Poland polandflag = new Poland();
		polandflag.setTranslateX(200);
		polandflag.setTranslateY(100);
		//root.getChildren().add(polandflag);
		
		Russia russiaflag = new Russia();
		russiaflag.setTranslateX(200);
		russiaflag.setTranslateY(100);
		//root.getChildren().add(russiaflag);
		
		Somalia somaliaflag = new Somalia();
		somaliaflag.setTranslateX(200);
		somaliaflag.setTranslateY(100);
		//root.getChildren().add(somaliaflag);
		
		Switzerland switzerlandflag = new Switzerland();
		switzerlandflag.setTranslateX(200);
		switzerlandflag.setTranslateY(100);
		//root.getChildren().add(switzerlandflag);
		
		Ukraine ukraineflag = new Ukraine();
		ukraineflag.setTranslateX(200);
		ukraineflag.setTranslateY(100);
		root.getChildren().add(ukraineflag);
		
	}
	public static void main(String[] args) {
		launch();
	}
	

}
