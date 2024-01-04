package com.example.dia3;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import java.text.DecimalFormat;
import java.util.Objects;

public class HelloController {
    @FXML
    private ComboBox<String> DIVISA1;
    @FXML
    private ComboBox<String> DIVISA2;
    @FXML
    private TextField valor1;
    @FXML
    private TextField valor2;
    @FXML
    public void initialize(){
        String[] divisa = new String[]{"MXN" ,"USD" , "EUR"};
        DIVISA1.getItems().addAll(divisa);
        DIVISA2.getItems().addAll(divisa);
    }
    public void Convertir(){
        double valorconvers;
        //conversion de MXN a USD
        if (Objects.equals(DIVISA1.getSelectionModel().getSelectedItem(),"MXN") && Objects.equals(DIVISA2.getSelectionModel().getSelectedItem(),"USD")){
            if(valor1.getText() != null && valor2.getText().isEmpty()){
                System.out.println("Se esta convirtiendo......");
                valorconvers = Double.parseDouble(valor1.getText()) / 17.03;
                DecimalFormat decimalFormat = new DecimalFormat("#.###");
                valor2.setText(decimalFormat.format(valorconvers));
                System.out.println("Fin de la conversion...");

            } else if (valor2.getText() != null && valor1.getText().isEmpty()) {
                System.out.println("Se esta convirtiendo......");
                valorconvers = Double.parseDouble(valor2.getText()) * 17.03;
                valor1.setText(String.valueOf(valorconvers));
                System.out.println("Fin de la conversion...");
            }


        }//Conversion de MXN a EUR
        else if (Objects.equals(DIVISA1.getSelectionModel().getSelectedItem(),"MXN") && Objects.equals(DIVISA2.getSelectionModel().getSelectedItem(),"EUR")) {
            if(valor1.getText() != null && valor2.getText().isEmpty()){
                System.out.println("Se esta convirtiendo......");
                valorconvers = Double.parseDouble(valor1.getText()) / 18.59;
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                valor2.setText(decimalFormat.format(valorconvers));
                System.out.println("Fin de la conversion...");
            }
            else if (valor2.getText() != null && valor1.getText().isEmpty()) {
                System.out.println("Se esta convirtiendo......");
                valorconvers = Double.parseDouble(valor2.getText()) * 18.59;
                valor1.setText(String.valueOf(valorconvers));
                System.out.println("Fin de la conversion...");
            }

        }//Conversion de USD a EUR
        else if (Objects.equals(DIVISA1.getSelectionModel().getSelectedItem(),"USD") && Objects.equals(DIVISA2.getSelectionModel().getSelectedItem(),"EUR")) {
            if(valor1.getText() != null && valor2.getText().isEmpty() ){
                System.out.println("Se esta convirtiendo......");
                valorconvers = Double.parseDouble(valor1.getText()) / 1.09;
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                valor2.setText(decimalFormat.format(valorconvers));
                System.out.println("Fin de la conversion...");
            }
            else if (valor2.getText() != null && valor1.getText().isEmpty()) {
                System.out.println("Se esta convirtiendo......");
                valorconvers = Double.parseDouble(valor2.getText()) * 1.09;
                valor1.setText(String.valueOf(valorconvers));
                System.out.println("Fin de la conversion...");
            }
        }
        //Conversion  de USD a MXN
        else if (Objects.equals(DIVISA1.getSelectionModel().getSelectedItem(),"USD") && Objects.equals(DIVISA2.getSelectionModel().getSelectedItem(),"MXN")) {
            if(valor1.getText() != null && valor2.getText().isEmpty()){
                System.out.println("Se esta convirtiendo......");
                valorconvers = Double.parseDouble(valor1.getText()) * 17.03;
                DecimalFormat decimalFormat = new DecimalFormat("#.###");
                valor2.setText(decimalFormat.format(valorconvers));
                System.out.println("Fin de la conversion...");
            }
            else if (valor2.getText() != null && valor1.getText().isEmpty()) {
                System.out.println("Se esta convirtiendo......");
                valorconvers = Double.parseDouble(valor2.getText()) / 17.03;
                valor1.setText(String.valueOf(valorconvers));
                System.out.println("Fin de la conversion...");
            }
        }
        //Conversion de EUR MXN
        else if (Objects.equals(DIVISA1.getSelectionModel().getSelectedItem(),"EUR") && Objects.equals(DIVISA2.getSelectionModel().getSelectedItem(),"MXN")) {
            if(valor1.getText() != null && valor2.getText().isEmpty()){
                System.out.println("Se esta convirtiendo......");
                valorconvers = Double.parseDouble(valor1.getText()) * 18.59;
                DecimalFormat decimalFormat = new DecimalFormat("#.###");
                valor2.setText(decimalFormat.format(valorconvers));
                System.out.println("Fin de la conversion...");
            }
            else if (valor2.getText() != null && valor1.getText().isEmpty()) {
                System.out.println("Se esta convirtiendo......");
                valorconvers = Double.parseDouble(valor2.getText()) / 18.59;
                valor1.setText(String.valueOf(valorconvers));
                System.out.println("Fin de la conversion...");
            }
        }
        //Conversion de EUR  USD
        else if (Objects.equals(DIVISA1.getSelectionModel().getSelectedItem(),"EUR") && Objects.equals(DIVISA2.getSelectionModel().getSelectedItem(),"USD")) {
            if(valor1.getText() != null && valor2.getText().isEmpty()){
                System.out.println("Se esta convirtiendo......");
                valorconvers = Double.parseDouble(valor1.getText()) * 1.09;
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                valor2.setText(decimalFormat.format(valorconvers));
                System.out.println("Fin de la conversion...");
            }
            else if (valor2.getText() != null && valor1.getText().isEmpty()) {
                System.out.println("Se esta convirtiendo......");
                valorconvers = Double.parseDouble(valor2.getText()) / 1.09;
                valor1.setText(String.valueOf(valorconvers));
                System.out.println("Fin de la conversion...");
            }
        }
    }

    public void Limpiar(){
        valor1.setText("");
        valor2.setText("");
    }
}