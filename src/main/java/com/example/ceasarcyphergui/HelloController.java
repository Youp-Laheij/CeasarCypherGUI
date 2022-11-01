package com.example.ceasarcyphergui;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert.AlertType;

public class HelloController {
    private int key =0;
    @FXML
    private Label welcomeText;
    @FXML
    private TextField textBox;
    @FXML
    private Button plusKey;
    @FXML
    private Button minKey;
    @FXML
    private Label keyText;
    @FXML
    private Button encryptButton;
    @FXML
    private Button decryptButton;
    @FXML
    private ImageView outerRing;
    @FXML
    private ImageView innerRing;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void encrypt(){
        Encrypt codedText = new Encrypt(textBox.getText(),key);
        //System.out.println(codedText.encryptText());
        Alert encryptAlert = new Alert(AlertType.INFORMATION,codedText.encryptText());
        encryptAlert.show();

    }
    @FXML
    protected void decrypt(){
        Decrypt codedText = new Decrypt(textBox.getText(),key);
        //System.out.println(codedText.decryptText());
        Alert decryptAlert = new Alert(AlertType.INFORMATION,codedText.decryptText());
        decryptAlert.show();
    }
    @FXML
    protected void addKey(){
        key++;
        if (key >= 25){
            plusKey.setDisable(true);
            key = 25;
        }
        else if (key > 0){
            minKey.setDisable(false);
        }
        else{
            plusKey.setDisable(false);
        }
        keyText.setText(""+key);
        outerRing.setRotate(key*(-360.0/26)+77);

    }
    @FXML
    protected  void  subKey(){
        key--;
        if (key <= 0){
            minKey.setDisable(true);
            key = 0;
        }
        else if(key<25){
            plusKey.setDisable(false);
        }
        else{
            minKey.setDisable(false);
        }
        keyText.setText(""+key);
        outerRing.setRotate(key*(-360.0/26)+77);
    }



}