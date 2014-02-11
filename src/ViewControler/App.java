package ViewControler;

import javafx.application.Application;
import javafx.stage.Stage;
/**
 * This class is the first one run when the application starts. As it currently stands it starts the Login Menu. This might be subject to change if we include a client patcher.
 * @author bertrandbrompton
 */
public class App extends Application {
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        LoginMenu loginMenu = new LoginMenu(primaryStage);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}