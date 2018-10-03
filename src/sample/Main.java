package sample;

import com.sun.jndi.toolkit.url.Uri;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello World");
        Button btn = new Button();
        TextField text = new TextField();

        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                TextField text = new TextField();
                primaryStage.getScene().getRoot().getChildrenUnmodifiable().add(text);
                ObservableList<Node> nodes =  primaryStage.getScene().getRoot().getChildrenUnmodifiable();
                for (Node node:nodes
                     ) {
                    System.out.println(node.toString());
                }
                System.out.println("Hello World!");
                text.textProperty().setValue("Eeek!");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }




    public static void main(String[] args) {
        launch(args);
    }
}
