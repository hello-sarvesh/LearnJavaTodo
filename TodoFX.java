import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TodoFX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a scene and place a button in the scene
        VBox root = new VBox(); // layout
        Text txtHelloJava = new Text();
        txtHelloJava.setText("Hello Java World !!");
        root.getChildren().addAll(txtHelloJava);

        String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
        Text txtTitle = new Text("_______________DashBoard Todo_______________");
        Text txtDateTime = new Text("Date Time: " + timeStamp);
        Text txtOne = new Text("1. Add New Task");
        Text txtTwo = new Text("2. Show All Task");
        Text txtThree = new Text("3. Remove Task");
        Text txtZero = new Text("0. exit");
        root.getChildren().addAll(txtTitle,txtDateTime,txtOne,txtTwo,txtThree,txtZero);
        
        Scene scene = new Scene(root, 200, 250);

        primaryStage.setTitle("MyJavaFX"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
