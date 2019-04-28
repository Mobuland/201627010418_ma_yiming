package cn.edu.scau.cmi.mayiming.composite.transparentComposite;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Index extends Application {

	private static String studentName = "马一鸣";
	private static String studentId = "201627010418";
	
	public static void main (String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// ---------------------上左--------------------------
		String imgPath = System.getProperty("user.dir") + "/imgs/test.jpg";

		InputStream is = new FileInputStream(new File(imgPath));
		Image img = new Image(is);
		ImageView imageView = new ImageView(img);
		// ---------------------------------------------------
		
		//----------------------上右--------------------------
		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setPadding(new Insets(10, 10, 10, 10));
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		
		gridPane.add(new Label("姓名:"), 0, 0);
		Label name = new Label(studentName);
		gridPane.add(name, 1, 0);
		gridPane.add(new Label("学号:"), 2, 0);
		Label id = new Label(studentId);
		gridPane.add(id, 3, 0);

		
		Button btn = new Button("透明组合模式");
		gridPane.add(btn, 1, 2);
		// -----------------------------------------------------
		
		// ------------------------下---------------------------
		TextArea textArea = new TextArea();
		// -----------------------------------------------------
		
		// 上部面板
		BorderPane center = new BorderPane();
		center.setLeft(imageView);
		center.setRight(gridPane);
		
		// 主面板
		BorderPane pane = new BorderPane();
		pane.setTop(center);
		pane.setCenter(textArea);
		// 事件
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// 安全组合模式的使用
				Branch corpTree = CropTree.compositeCorpTree();
				String corpTreeInfo = CropTree.getTreeInfo(corpTree);
				String text = "透明组合模式:\n" + corpTreeInfo;
				textArea.setText(text);
			}
		});
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("实验五：透明组合模式");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
