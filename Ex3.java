package com.exam.gui;

import java.awt.Button;
import java.awt.TextField;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//컨트롤 : 눈에 보이고 만질 수 있는 프로그램 제어용도의 객체 예 : 버튼 
//컨테이너 : 눈에 보이지는 않지만 다른 컨드롤이나 화면요소를 담을 수 있음.
public class Ex3 extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		VBox vBox = new VBox();
		vBox.setPrefSize(350, 150);
		vBox.setAlignment(Pos.BASELINE_CENTER);
		vBox.setSpacing(20);
		
		TextField tf=new TextField();
		Button btn1=new Button("버튼1");
		
		vBox.getChildren().add(tf);
		
		vBox.getChildren().add(btn1);
		
		Scene scene = new Scene(vBox);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("title");
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//*launch() 메소드가 하는 일
		//launch () 호출한 클래스 타입 객체를 생성하고,
		//새로운 윈도우 창(stage) 객체를 생성하고,
		//start() 호출하면서 매개 값으로 생성한 윈도우 창(stage)을 전달. 
		
		launch(args);
	}

}
