
package customstagestyle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class CustomStageStyle extends Application {
   // @FXML
    //private Pane pane1;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        root.setStyle("-fx-background-color: #696969;");
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.getIcons().add(new Image("/customstagestyle/CP.PNG"));
        stage.getScene().getStylesheets().add(getClass().getResource("Style.css").toExternalForm());
        stage.show();
        
        /*Parent parent = FXMLLoader.load(getClass().getResource("/com/TableView.fxml"));
        Scene scene = new Scene(parent);
        stage.setTitle("TableView");
        stage.setScene(scene);
        stage.show();*/
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
