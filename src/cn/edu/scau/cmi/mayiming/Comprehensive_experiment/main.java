package cn.edu.scau.cmi.mayiming.Comprehensive_experiment;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class main extends Application {

    public static void main (String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("12212.fxml"));//修改了
            Scene scene = new Scene(root,600,622);//修改了
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);//设置不能窗口改变大小
            primaryStage.setTitle("一个简单的JavaFX");//设置标题
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}

