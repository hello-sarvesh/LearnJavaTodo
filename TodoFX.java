import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TodoFX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a scene and place a button in the scene
        GridPane root = new GridPane(); // layout
        
        root.setHgap(10);
        root.setVgap(10);
        root.setAlignment(Pos.CENTER);

        Text txtHelloJava = new Text();
        txtHelloJava.setText("Hello Java World !!");
        root.add(txtHelloJava,0,1);

        String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
        Text txtTitle = new Text("_______________DashBoard Todo_______________");
        Text txtDateTime = new Text("Date Time: " + timeStamp);
        Button btnOne = new Button("1. Add New Task");
        Button btnTwo = new Button("2. Show All Task");
        Button btnThree = new Button("3. Remove Task");
        Button btnZero = new Button("0. exit");
        root.add(txtTitle,0,2);
        root.add(txtDateTime,0,3);
        root.add(btnOne,0,4);
        root.add(btnTwo,0,5);
        root.add(btnThree,0,6);
        root.add(btnZero,0,7);

        Scene scene = new Scene(root, 200, 250);

        primaryStage.setTitle("MyJavaFX"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
