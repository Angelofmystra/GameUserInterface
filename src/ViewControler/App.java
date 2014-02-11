package ViewControler;


import javafx.application.Application;
import javafx.stage.Stage;

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