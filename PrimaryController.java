package com.mycompany.exerciseone;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML
    private TextField EnterNum;
    @FXML
    private TextField DisplayNum;
    
     
    @FXML
    private void Incrementing() throws IOException { 
        try{
        String n =EnterNum.getText();
         int num = Integer.parseInt(n);
         
       
        int num2 =10;
        
        int Result =+(num2+num);
      
        String R = Integer.toString(Result);
         if(EnterNum.getText().isEmpty()){   
              Alert alert = new Alert(AlertType.ERROR);
             alert.setTitle("Error #");
             alert.setHeaderText("Please Enter Number");
             alert.setContentText("Ooops, there was an error!");
        }
        
        else{
          DisplayNum.setText(R);
        }
        }catch(NumberFormatException e){
            Alert alert = new Alert(AlertType.ERROR);
             alert.setTitle("Error #");
             alert.setHeaderText("Please Enter Number");
             alert.setContentText("Ooops, there was an error!");
             alert.showAndWait();
        }
        
    }
     @FXML
    private void Decrementing() throws IOException { 
        try{
        String n =EnterNum.getText();
       
        int num = Integer.parseInt(n);
       
        int Result =10;
        
         Result =Result+num;
         int r =  Result-num;
        
        int Results =Result-num;
      
        String T = Integer.toString(Results,r);
         if(EnterNum.getText().isEmpty()){   
             Alert alert = new Alert(AlertType.ERROR);
             alert.setTitle("Error #");
             alert.setHeaderText("Please Enter Number");
             alert.setContentText("Ooops, there was an error!");

            alert.showAndWait();
        }
        else{
          DisplayNum.setText(T);  
         }
           }catch(NumberFormatException e){
            Alert alert = new Alert(AlertType.ERROR);
             alert.setTitle("Error #");
             alert.setHeaderText("Please Enter Number");
             alert.setContentText("Ooops, there was an error!");
             alert.showAndWait();
        }
    }
}