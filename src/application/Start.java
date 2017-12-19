package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import static application.Constants.H;
import static application.Constants.W;

public class Start extends Application {

    public GraphicsContext graphicsContext;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane root = new BorderPane();
        Canvas canvas = new Canvas(W, H);
        graphicsContext = canvas.getGraphicsContext2D();
        Pane layerPane = new Pane();
        layerPane.getChildren().addAll(canvas);
        canvas.widthProperty().bind(layerPane.widthProperty());
        root.setCenter(layerPane);
        Line h = new Line(0, H / 2, W, H / 2);
        Line v = new Line(W / 2, 0, W / 2, H);
        h.setStroke(Color.WHITE);
        v.setStroke(Color.WHITE);
        h.setStrokeWidth(0.3);
        v.setStrokeWidth(0.3);
        layerPane.getChildren().add(h);
        layerPane.getChildren().add(v);
        Scene scene = new Scene(root, W, H);
        primaryStage.setScene(scene);
        primaryStage.setTitle("N Particules");
        primaryStage.show();


        // new Main();

        Animation0 anim = new Animation0(this);
        anim.start();
    }

}
