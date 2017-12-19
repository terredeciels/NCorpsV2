package parametres;

import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class Controller {
    public Slider Nb;
    public AnchorPane panel;

    public void clicked(MouseEvent mouseEvent) {
        double nb = Nb.getValue();
        System.out.println(nb);
    }
}
