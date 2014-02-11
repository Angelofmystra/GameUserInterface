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
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author bertrandbrompton
 */
public class gameClient {
    public Stage primaryStage;
    public void start(Stage stage){
        String menustyle = "-fx-padding: 12 30 12 30; -fx-focus-color: firebrick;";
        primaryStage = stage;
        StackPane gamestack = new StackPane();
        Scene gameclient = new Scene(gamestack, 800,600);

        VBox friendlist = new VBox();
        friendlist.setPadding(new Insets(10, 0, 0, 10));
        friendlist.setSpacing(10);
        friendlist.setStyle(menustyle);               
        friendlist.setPrefSize(300, 50);

        HBox menu = new HBox();
        menu.setPadding(new Insets(10, 0, 0, 10));
        menu.setSpacing(10);
        menu.setStyle(menustyle);                
        menu.setPrefSize(300, 50);

        HBox chatpanel = new HBox();
        chatpanel.setPadding(new Insets(10, 0, 0, 10));
        chatpanel.setSpacing(10);
        chatpanel.setStyle(menustyle);               
        chatpanel.setPrefSize(300, 50);

        Button friendsbtn = new Button("Friends");
        friendsbtn.setOnAction(playHandler());
        chatpanel.getChildren().add(friendsbtn);                   
        friendsbtn.setStyle(menustyle); //-fx-background-insets: 0,1,2,3;
        friendsbtn.setAlignment(Pos.TOP_CENTER);

        Button communitybtn = new Button("Community");
        communitybtn.setOnAction(playHandler());
        chatpanel.getChildren().add(communitybtn);
        communitybtn.setAlignment(Pos.CENTER_RIGHT);
        communitybtn.setStyle(menustyle);

        Button notificationsbtn = new Button("Notifications");
        notificationsbtn.setOnAction(playHandler());
        chatpanel.getChildren().add(notificationsbtn);
        notificationsbtn.setAlignment(Pos.CENTER_RIGHT);
        notificationsbtn.setStyle(menustyle);

        BorderPane border = new BorderPane();
        border.setPadding(new Insets(20, 0, 20, 20));
        //border.setRight(friendlist);
        border.setTop(menu);
        border.setBottom(chatpanel);

        Button mainbtn = new Button("Main");
        mainbtn.setOnAction(playHandler());
        menu.getChildren().add(mainbtn);
        mainbtn.setStyle(menustyle);

        Button playbtn = new Button("Play");
        playbtn.setOnAction(playHandler());
        menu.getChildren().add(playbtn);                 
        playbtn.setStyle(menustyle);

        Button shopbtn = new Button("Shop");
        shopbtn.setOnAction(playHandler());
        menu.getChildren().add(shopbtn);
        shopbtn.setStyle(menustyle);

        Button profilebtn = new Button("Profile");
        profilebtn.setOnAction(playHandler());
        menu.getChildren().add(profilebtn);
        profilebtn.setStyle(menustyle);

        Button lorebtn = new Button("Lore");
        lorebtn.setOnAction(playHandler());
        menu.getChildren().add(lorebtn);
        lorebtn.setStyle("-fx-padding: 12 30 12 30;");

        Button helpbtn = new Button("Help");
        helpbtn.setOnAction(playHandler());
        menu.getChildren().add(helpbtn);
        helpbtn.setStyle(menustyle);

        Button optionsbtn = new Button("Options");
        optionsbtn.setOnAction(playHandler());
        menu.getChildren().add(optionsbtn);
        optionsbtn.setStyle(menustyle);

        GridPane gridpane = new GridPane();
        Label labela = new Label();
        labela.setText("Featured Item 1");
        labela.setStyle("-fx-text-fill: white; -fx-font-size: 12px;");

        Label labelb = new Label();
        labelb.setText("Featured Item 2");
        labelb.setStyle("-fx-text-fill: white; -fx-font-size: 12px;");

        Label labelc = new Label();
        labelc.setText("Featured Item 3");
        labelc.setStyle("-fx-text-fill: white; -fx-font-size: 12px;");

        Label labeld = new Label();
        labeld.setText("Featured Item 4");
        labeld.setStyle("-fx-text-fill: white; -fx-font-size: 12px;");


        GridPane.setConstraints(labela, 1,1);
        GridPane.setConstraints(labelb, 1,2);
        GridPane.setConstraints(labelc, 2,1);
        GridPane.setConstraints(labeld, 2,2);
        gridpane.getChildren().addAll(labela,labelb,labelc,labeld);
        gridpane.getColumnConstraints().add(new ColumnConstraints(300));
        gridpane.getColumnConstraints().add(new ColumnConstraints(300));
        gridpane.getRowConstraints().add(new RowConstraints(300));
        gridpane.getRowConstraints().add(new RowConstraints(300));

        border.setCenter(gridpane);


        gamestack.getChildren().add(border);



        primaryStage.setScene(gameclient);
        String image = App.class.getResource("background2.jpg").toExternalForm();
        gamestack.setStyle("-fx-background-image: url('" + image + "'); -fx-background-position: center center; -fx-background-repeat: stretch;");
        //primaryStage.setScene(new Scene(VBoxBuilder.create().children(new Text("League of Legends Client")).build()));
        primaryStage.sizeToScene();
        primaryStage.setFullScreen(false);
        primaryStage.setFullScreen(true);
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
    
}
