package cn.edu.scau.cmi.mayiming.FactoryMode.abstractFactory;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
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
	private static String[] insurancesType = {"-请选择-","驾驶员身体受伤", "汽车损坏", "人员伤亡", "多种事故"};
	private static String[] insurancesCompanyType = {"-请选择-","中国人寿保险(PICC)", "平安保险"};
	private static InsuranceClaimsInterface insuranceClaims = null;
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
		gridPane.setPadding(new Insets(20, 20, 20, 20));
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		
		gridPane.add(new Label("姓名:"), 0, 0);
		Label name = new Label(studentName);
		gridPane.add(name, 1, 0);
		gridPane.add(new Label("学号:"), 2, 0);
		Label id = new Label(studentId);
		gridPane.add(id, 3, 0);
		
		ComboBox<Object> cbo2 = new ComboBox<>();
		ObservableList<String> items2 = FXCollections.observableArrayList(insurancesCompanyType);
		cbo2.getItems().addAll(items2);
		cbo2.setPrefWidth(200);
		cbo2.setValue("-请选择-");
		gridPane.add(new Label("请选择保险公司"), 0, 1);
		gridPane.add(cbo2, 1, 1);

		ComboBox<Object> cbo = new ComboBox<>();
		ObservableList<String> items = FXCollections.observableArrayList(insurancesType);
		cbo.getItems().addAll(items);
		cbo.setPrefWidth(200);
		cbo.setValue("-请选择-");
		gridPane.add(new Label("请选择保险"), 2, 1);
		gridPane.add(cbo, 3, 1);
		
		Button btn = new Button("显示保险信息");
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
				// 抽象工厂模式的使用
				int insuranceCompanyIndex = items2.indexOf(cbo2.getValue());
				System.out.println(insuranceCompanyIndex);
				int insuranceIndex = items.indexOf(cbo.getValue());
				if (1 == insuranceCompanyIndex) {
					insuranceClaims = new PICCInsuranceCliams();
				} else if (2 == insuranceCompanyIndex) {
					insuranceClaims = new PingAnInsuranceCliams();
				}
				
				if (null != insuranceClaims) {
					String text = insuranceClaims.getInsuranceInfo(insuranceIndex);
					if (null != text && text.length() > 0) {
						textArea.setText(text);
					}
				}
			}
		});
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("实验二：抽象工厂方法");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
