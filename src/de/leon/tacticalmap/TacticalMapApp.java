package de.leon.tacticalmap;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TacticalMapApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        Pane mapPane = new Pane();
        mapPane.setStyle("-fx-background-color: #f0f0f0;"); 
        

        VBox sidebar = new VBox(10);
        sidebar.setPadding(new Insets(10));
        sidebar.setStyle("-fx-background-color: #333333;");
        sidebar.setPrefWidth(150);

        Label lblTools = new Label("Einheiten");
        lblTools.setTextFill(Color.WHITE);
        
        Button btnTank = new Button("Panzerzug");
        btnTank.setPrefWidth(130); // Button breit machen
        
        Button btnInf = new Button("Infanterie");
        btnInf.setPrefWidth(130);

        sidebar.getChildren().addAll(lblTools, btnTank, btnInf);


        root.setCenter(mapPane);
        root.setLeft(sidebar);

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("Tactical Map Sandbox v0.1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}