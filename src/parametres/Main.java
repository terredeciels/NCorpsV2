package parametres;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public Main() throws Exception {
        Stage primaryStage2 = new Stage();
        start(primaryStage2);
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Gui.fxml"));
        primaryStage.setTitle("Paramètres");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
}
