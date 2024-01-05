package com.example.dia4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

public class HelloController {
    @FXML
    private TextField Input;
    @FXML
    private  TextField Result;
    @FXML
    private Button copyInput;
    @FXML
    private Button copyResult;
    @FXML
    private Button convert;
    @FXML
    private Label Alerta;
    @FXML
    private Button Limpiar;
    @FXML
    protected void Convertir(){
        int conversion = 0;
        int decimal = 0;
        try{
            Alerta.setText("");
            if(Input.getText() != null && Result.getText().isEmpty()){
                conversion = Integer.parseInt(Integer.toBinaryString(Integer.parseInt(Input.getText())));
                Result.setText(String.valueOf(conversion));
            }
            else if (Result.getText() != null && Input.getText().isEmpty()) {
                conversion = Integer.parseInt(Result.getText(),2);
                Input.setText(String.valueOf(conversion));
            }

        }catch (NumberFormatException e){
            Alerta.setText("Solo puedes ingresar numeros");
            Input.setText("");
            Result.setText("");
        }

    }
    @FXML
    protected void CopyInput(){ // vi que usaban try catch
        String copy  = Input.getText();
        Clipboard clipboard =  Clipboard.getSystemClipboard(); // Obtener el sistema de portapales
        ClipboardContent content = new ClipboardContent(); //Configurar el contenido del portapapeles
        content.putString(copy);
        clipboard.setContent(content);
        Alerta.setText("Texto copiado correctamente");

    }
    @FXML
    protected void CopyResult(){
        String copy  = Result.getText();
        Clipboard clipboard =  Clipboard.getSystemClipboard(); // Obtener el sistema de portapales
        ClipboardContent content = new ClipboardContent(); //Configurar el contenido del portapapeles
        content.putString(copy);
        clipboard.setContent(content);
        Alerta.setText("Texto copiado correctamente");
    }
    @FXML
    protected void Limpiar(){
        Alerta.setText("");
        Input.setText("");
        Result.setText("");
    }


}