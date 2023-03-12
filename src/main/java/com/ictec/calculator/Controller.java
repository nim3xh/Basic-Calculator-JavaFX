package com.ictec.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;

public class Controller {
    float data=0f;
    int op;
    @FXML
    private Button num0;
    @FXML
    private Button num1;
    @FXML
    private Button num2;
    @FXML
    private Button num3;
    @FXML
    private Button num4;
    @FXML
    private Button num5;
    @FXML
    private Button num6;
    @FXML
    private Button num7;
    @FXML
    private Button num8;
    @FXML
    private Button num9;
    @FXML
    private Button mul;
    @FXML
    private Button sub;
    @FXML
    private Button mod;
    @FXML
    private Button div;
    @FXML
    private Button add;
    @FXML
    private Button equal;
    @FXML
    private Button dot;
    @FXML
    private Button AllClear;
    @FXML
    private Button reset;
    @FXML
    private Label Display;

    @FXML
    private void onClickButton(ActionEvent event){
        if(event.getSource()== num1){
            Display.setText(Display.getText()+"1");
        }else if(event.getSource()==num2){
            Display.setText(Display.getText()+"2");
        }else if(event.getSource()==num3){
            Display.setText(Display.getText()+"3");
        }else if(event.getSource()==num4){
            Display.setText(Display.getText()+"4");
        }else if(event.getSource()==num5){
            Display.setText(Display.getText()+"5");
        }else if(event.getSource()==num6){
            Display.setText(Display.getText()+"6");
        }else if(event.getSource()==num7){
            Display.setText(Display.getText()+"7");
        }else if(event.getSource()==num8){
            Display.setText(Display.getText()+"8");
        }else if(event.getSource()==num9){
            Display.setText(Display.getText()+"9");
        }else if(event.getSource()==num0){
            Display.setText(Display.getText()+"0");
        }else if(event.getSource()==dot){
            Display.setText(Display.getText()+".");
        }else if(event.getSource()==AllClear){
            Display.setText("");
        } else if (event.getSource()==reset) {
            Display.setText("");
        }
        if(event.getSource()==add){
            data = Float.parseFloat(Display.getText());
            op=1;
            Display.setText("");
        }else if(event.getSource()==sub){
            data=Float.parseFloat(Display.getText());
            op=2;
            Display.setText("");
        }else if(event.getSource()==mul){
            data=Float.parseFloat(Display.getText());
            op=3;
            Display.setText("");
        }else if(event.getSource()==mod){
            data=Float.parseFloat(Display.getText());
            op=4;
            Display.setText("");
        }else if(event.getSource()==div){
            data=Float.parseFloat(Display.getText());
            op=5;
            Display.setText("");
        }else if(event.getSource()==equal){
            float data2=Float.parseFloat(Display.getText());
            switch (op){
                case 1:
                    Float answer=data+data2;
                    Display.setText(String.valueOf(answer));
                    break;
                case 2:
                    answer=data-data2;
                    Display.setText(String.valueOf(answer));
                    break;
                case 3:
                    answer=data*data2;
                    Display.setText(String.valueOf(answer));
                    break;
                case 4:
                    answer=0f;
                    try {
                        answer = data % data2;
                    }catch (Exception e){
                        Display.setText("Error");
                    }
                    Display.setText(String.valueOf(answer));
                    break;
                case 5:
                    answer=0f;
                    try {
                        answer = data / data2;
                    }catch (Exception e){
                        Display.setText("Error");
                    }
                    Display.setText(String.valueOf(answer));
                    break;
            }
        }
    }
}
