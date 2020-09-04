package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXRippler;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;

public class Main extends Application {
    private Label countBoxL;
    private Button plusBtn,minusBtn;
    VBox root;
    HBox counterFieldHbox,btnHbox;
    int label;
    @Override
    public void start(Stage primaryStage) throws Exception{
        countBoxL=new Label("0");
        countBoxL.setStyle("-fx-font:40px Arial");
        ButtonHandler bh=new ButtonHandler();
        ButtonHandler2 bh1=new ButtonHandler2();
        plusBtn=new Button("+");
        plusBtn.setOnAction(bh);
        plusBtn.setPrefWidth(100);
        minusBtn=new Button("-");
        minusBtn.setOnAction(bh1);
        minusBtn.setPrefWidth(100);
        plusBtn.setStyle("-fx-font:32px Arial");
        minusBtn.setStyle("-fx-font:32px Arial");

        counterFieldHbox=new HBox(countBoxL);
        counterFieldHbox.setAlignment(Pos.CENTER);
        btnHbox=new HBox(20,plusBtn,minusBtn);
        btnHbox.setAlignment(Pos.CENTER);
        root=new VBox(20,counterFieldHbox,btnHbox);
        root.setPadding(new Insets(35,25,30,25));
        primaryStage.setTitle("18138043");
        Scene scene=new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();




    }
    private class ButtonHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            label=Integer.parseInt(countBoxL.getText());
            label=label+1;
            countBoxL.setText(Integer.toString(label));
        }
    }
    private class ButtonHandler2 implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            label=Integer.parseInt(countBoxL.getText());
            label=label-1;
            countBoxL.setText(Integer.toString(label));
        }
    }




    public static void main(String[] args) {
        launch(args);
    }
}
