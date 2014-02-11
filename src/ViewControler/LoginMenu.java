/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ViewControler;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.VBoxBuilder;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author bertrandbrompton
 */
public class LoginMenu {
    Stage primaryStage;
    final Label message = new Label("");
    final PasswordField pb = new PasswordField();
    final TextField uf = new TextField();
    final CheckBox checkbox = new CheckBox("Remember Username");
    
    public LoginMenu(Stage primaryStage){
        this.primaryStage = primaryStage;
        //this.primaryStage.setFullScreen(true);
        Button btn = new Button("Login");
        btn.setOnAction(loginClientHandler());
         
        checkbox.setSelected(true);
        Button btn2 = new Button("Forgot your password");
        btn2.setOnAction(forgotPasswordHandler());
        Button btn3 = new Button("Create new Account");
        btn3.setOnAction(createNewAccountHandler());
        //PasswordField passwordField = new PasswordField();
        //passwordField.setPromptText("Your password");
        StackPane root = new StackPane();
 //       root.getChildren().add(btn);
        //root.getChildren().add(passwordField);

        Scene scene = new Scene(root, 800, 600);
        //Media media = new Media("background.flv");
        //MediaPlayer mediaplayer = new MediaPlayer(media);
        //mediaplayer.setAutoPlay(true);
        //MediaView mediaview = new MediaView(mediaplayer);
        //root.getChildren().add(mediaview);

        VBox vb = new VBox();
        vb.setPadding(new Insets(10, 0, 0, 10));
        vb.setSpacing(10);
        vb.setStyle("-fx-background-color: #344152; -fx-effect: dropshadow( one-pass-box , black , 8 , 0.0 , 2 , 0 ); ");
        
        vb.setPrefSize(300, 50);
        
        HBox hb = new HBox();
        hb.setSpacing(10);
        hb.setAlignment(Pos.CENTER_LEFT);
        
        Label unLabel = new Label("Username");
        unLabel.setTextFill(Color.web("#ffffff"));
        
        Label pwLabel = new Label("Password");
        pwLabel.setTextFill(Color.web("#ffffff"));
        
        Label lolisfree = new Label("Playing League of Legends is FREE!");
        lolisfree.setTextFill(Color.web("#ffffff"));

        Label accountlogin = new Label("Account Login");
        accountlogin.setTextFill(Color.web("#ffffff"));
        
        HBox hb2 = new HBox();
        
        
        pb.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                if (!pb.getText().equals("pass")) {
                    message.setText("Your password is incorrect!");
                    message.setTextFill(Color.rgb(210, 39, 30));
                } else {
                    message.setText("Your password has been confirmed");
                    message.setTextFill(Color.rgb(21, 117, 84));
                }
                pb.clear();
            }
        });
        String image = App.class.getResource("background.jpg").toExternalForm();
        root.setStyle("-fx-background-image: url('" + image + "'); -fx-background-position: center center; -fx-background-repeat: stretch;");          		
//        Image imagez = new Image("background.jpg");
//        ImageView iv1 = new ImageView();
//        iv1.setImage(imagez);
//        iv1.setFitWidth(300);
//        iv1.setPreserveRatio(true);
//        iv1.setSmooth(true);
//        iv1.setCache(true);

        
        hb.getChildren().addAll(pwLabel, pb);
        hb2.getChildren().addAll(unLabel, uf);
        vb.getChildren().addAll(accountlogin,hb2, hb, checkbox, message, btn, btn2,btn3,lolisfree);
        BorderPane border = new BorderPane();
        border.setPadding(new Insets(20, 0, 20, 20));
        border.setLeft(vb);
        //root.getChildren().add(hb);
        root.getChildren().add(border);
        
        hb2.setSpacing(10);
        //root.getChildren().add(hb2);
        
        
        
        primaryStage.setTitle("League of Legends Login Client");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    LoginMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        public EventHandler loginClientHandler() {
        EventHandler evh = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if ((pb.getText().equals("pass")) && (uf.getText().equals("mouse"))) {
                    message.setText("Your username and password has been confirmed");
                    message.setTextFill(Color.rgb(21, 117, 84));
                    gameClient gc = new gameClient();
                    gc.start(primaryStage);
                    
                } else {
                    message.setText("Your username and password is incorrect!");
                    message.setTextFill(Color.rgb(210, 39, 30));

                }
                
                if(checkbox.isSelected() == false){
                	uf.clear();
                }
                pb.clear();
            }
        };
        return evh;
    }
        public EventHandler forgotPasswordHandler(){
        EventHandler evh = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
            //@Override
            //public void handle(ActionEvent event) {
            //		Application.getHostServices().showDocument(url);
            //}
        };
        return evh;    	
    }
    public EventHandler playHandler(){
        EventHandler evh = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
            //@Override
            //public void handle(ActionEvent event) {
            //		Application.getHostServices().showDocument(url);
            //}
        };
        return evh;    	
    }    
    public EventHandler createNewAccountHandler(){
        EventHandler evh = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(new Scene(VBoxBuilder.create().children(new Text("text")).build()));
                primaryStage.sizeToScene();
                primaryStage.setFullScreen(false);
                primaryStage.setFullScreen(true);
            }
        };
        return evh;    	
    }

}
