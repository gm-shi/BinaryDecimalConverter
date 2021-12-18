import javafx.ViewLoader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Calculator;

public class CalculatorApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view/calculator.fxml"));
        Parent root = loader.load();
        stage.setTitle("Binary Calculator");
        stage.setScene(new Scene(root));
        stage.sizeToScene();
        stage.show();
    }

}
