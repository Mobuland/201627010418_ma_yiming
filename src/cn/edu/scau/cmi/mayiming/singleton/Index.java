package cn.edu.scau.cmi.mayiming.singleton;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Index extends Application{
	
	public static void main (String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane pane = new BorderPane();
		Label topLabel = new Label("单例设计模式");
		topLabel.setFont(Font.font(20));
		pane.setTop(topLabel);
		pane.setCenter(new CenterPane());
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("实验2");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
}

class ChairmanPane extends VBox {
	public ChairmanPane (String id) {
		this.setPrefWidth(200);
		this.setPrefHeight(100);
		
		Button btn = new Button("毛主席");
		btn.setPrefHeight(60);
		btn.setPrefWidth(100);
		
		Label label = new Label(id);
		label.setVisible(false);
		label.setManaged(false);
		
		this.getChildren().addAll(btn, label);
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				label.setVisible(true);
				label.setManaged(true);
			}
		});
		
	}
}

class CenterPane extends HBox {
	public CenterPane () {
		this.setPrefHeight(800);
		this.setPrefWidth(600);
		VBox left = new VBox();
		Button produceBtn = new Button("产生主席");
		left.getChildren().addAll(produceBtn);
		
		FlowPane flowPane = new FlowPane();
		flowPane.setPadding(new Insets(15,15,15,15));


		
		getChildren().addAll(left, flowPane);
		
		produceBtn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Chairman chairmanInstance = Chairman.getInstance("毛主席");
				flowPane.getChildren().add(new ChairmanPane(chairmanInstance.getName() + " \nhashCode: " + 
						chairmanInstance.hashCode()));
			}
		});
		
	}
}


