package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Controller {
    @FXML
    private Button btn1 = new Button();
    @FXML
    private Button btn2 = new Button();
    @FXML
    private Button btn3 = new Button();
    @FXML
    private Button btn4 = new Button();
    @FXML
    private Button btn5 = new Button();
    @FXML
    private Button btn6 = new Button();
    @FXML
    private Button btn7 = new Button();
    @FXML
    private Button btn8 = new Button();
    @FXML
    private Button btn9 = new Button();
    @FXML
    private Button btn0 = new Button();
    @FXML
    private Button btnPls = new Button();
    @FXML
    private Button btnMul = new Button();
    @FXML
    private Button btnSub = new Button();
    @FXML
    private Button btnDiv = new Button();
    @FXML
    private Button btnCls = new Button();
    @FXML
    private Button btnBck = new Button();
    @FXML
    private Button btnEnt = new Button();
    @FXML
    private Button btnDot = new Button();

    private String num = "";
    private String result = new String();
    private double a,b;
    private char sign;
    private boolean isFirst=false, isSecond=false;
    @FXML private Label resLabel = new Label();
    @FXML private Label screenLabel = new Label();


    private boolean isNumeric(String str){
        try {
            Double.parseDouble(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    public void calNow(ActionEvent event){
        if(event.getSource()==btn1){
            num+="1";
            screenLabel.setText(num);
        }else if(event.getSource()==btn2){
            num+="2";
            screenLabel.setText(num);
        }else if(event.getSource()==btn3){
            num+="3";
            screenLabel.setText(num);
        }else if(event.getSource()==btn4){
            num+="4";
            screenLabel.setText(num);
        }else if(event.getSource()==btn5){
            num+="5";
            screenLabel.setText(num);
        }else if(event.getSource()==btn6){
            num+="6";
            screenLabel.setText(num);
        }else if(event.getSource()==btn7){
            num+="7";
            screenLabel.setText(num);
        }else if(event.getSource()==btn8){
            num+="8";
            screenLabel.setText(num);
        }else if(event.getSource()==btn9){
            num+="9";
            screenLabel.setText(num);
        }else if(event.getSource()==btn0){
            num+="0";
            screenLabel.setText(num);
        }else if(event.getSource()==btnCls){
            num = "";
            result = "";
            isFirst = false;
            screenLabel.setText(num);
            resLabel.setText(result);
        }else if(event.getSource()==btnBck){
            num=num.substring(0,num.length()-1);
            screenLabel.setText(num);
        }else if(event.getSource()==btnSub){
            if(num.equals("")) {
                num+="-";
                screenLabel.setText(num);
            }else{
                if (isFirst) {
                    if (isNumeric(num)) {
                        b = Double.parseDouble(num);
                        if (sign == '+') {
                            result = Double.toString(a + b);
                        } else if (sign == '-') {
                            result = Double.toString(a - b);
                        } else if (sign == '*') {
                            result = Double.toString(a * b);
                        } else if (sign == '/') {
                            if (b != 0)
                                result = Double.toString(a / b);
                            else
                                result = "infinity";
                        }
                        if (isNumeric(result)) {
                            a = Double.parseDouble(result);
                            num = result;
                        } else {
                            a = 0;
                            b = 0;
                            isFirst = false;
                        }
                    } else {
                        result = "No No No!!";
                    }
                } else {
                    if (isNumeric(num)) {
                        a = Double.parseDouble(num);
                        isFirst = true;
                    } else {
                        result = "No No No!!";
                    }
                }
                sign = '-';
                num = "";
                if (isNumeric(num))
                    screenLabel.setText(String.format("%.2f", Double.parseDouble(num)));
                else
                    screenLabel.setText(num);
                if (isNumeric(result))
                    resLabel.setText(String.format("%.2f", Double.parseDouble(result)));
                else
                    resLabel.setText(result);
            }
        }else if(event.getSource()==btnPls){

            if(isFirst){
                if(isNumeric(num)){
                    b=Double.parseDouble(num);
                    if(sign=='+'){
                        result =  Double.toString(a+b);
                    }else if(sign=='-'){
                        result =  Double.toString(a-b);
                    }else if(sign=='*'){
                        result =  Double.toString(a*b);
                    }else if(sign=='/'){
                        if(b!=0)
                            result =  Double.toString(a/b);
                        else
                            result = "infinity";
                    }
                    if(isNumeric(result)){
                        a=Double.parseDouble(result);
                        num = result;
                    }else{
                        a=0;
                        b=0;
                        isFirst=false;
                    }
                }else{
                    result = "No No No!!";
                }
            }else{
                if(isNumeric(num)) {
                    a = Double.parseDouble(num);
                    isFirst = true;
                }else {
                    result = "No No No!!";
                }
            }
            sign = '+';
            num  = "";

            if(isNumeric(num))
                screenLabel.setText(String.format("%.2f",Double.parseDouble(num)));
            else
                screenLabel.setText(num);
            if(isNumeric(result))
                resLabel.setText(String.format("%.2f",Double.parseDouble(result)));
            else
                resLabel.setText(result);
        }else if(event.getSource()==btnMul){

            if(isFirst){
                if(isNumeric(num)){
                    b=Double.parseDouble(num);
                    if(sign=='+'){
                        result =  Double.toString(a+b);
                    }else if(sign=='-'){
                        result =  Double.toString(a-b);
                    }else if(sign=='*'){
                        result =  Double.toString(a*b);
                    }else if(sign=='/'){
                        if(b!=0)
                            result =  Double.toString(a/b);
                        else
                            result = "infinity";
                    }
                    if(isNumeric(result)){
                        a=Double.parseDouble(result);
                        num = result;
                    }else{
                        a=0;
                        b=0;
                        isFirst=false;
                    }
                }else{
                    result = "No No No!!";
                }
            }else{
                if(isNumeric(num)) {
                    a = Double.parseDouble(num);
                    isFirst = true;
                }else {
                    result = "No No No!!";
                }
            }
            sign = '*';
            num  = "";

            if(isNumeric(num))
                screenLabel.setText(String.format("%.2f",Double.parseDouble(num)));
            else
                screenLabel.setText(num);
            if(isNumeric(result))
                resLabel.setText(String.format("%.2f",Double.parseDouble(result)));
            else
                resLabel.setText(result);
        }else if(event.getSource()==btnDiv){

            if(isFirst){
                if(isNumeric(num)){
                    b=Double.parseDouble(num);
                    if(sign=='+'){
                        result =  Double.toString(a+b);
                    }else if(sign=='-'){
                        result =  Double.toString(a-b);
                    }else if(sign=='*'){
                        result =  Double.toString(a*b);
                    }else if(sign=='/'){
                        if(b!=0)
                            result =  Double.toString(a/b);
                        else
                            result = "infinity";
                    }
                    if(isNumeric(result)){
                        a=Double.parseDouble(result);
                        num = result;
                    }else{
                        a=0;
                        b=0;
                        isFirst=false;
                    }
                }else{
                    result = "No No No!!";
                }
            }else{
                if(isNumeric(num)) {
                    a = Double.parseDouble(num);
                    isFirst = true;
                }else {
                    result = "No No No!!";
                }
            }
            sign = '/';
            num  = "";

            if(isNumeric(num))
                screenLabel.setText(String.format("%.2f",Double.parseDouble(num)));
            else
                screenLabel.setText(num);
            if(isNumeric(result))
                resLabel.setText(String.format("%.2f",Double.parseDouble(result)));
            else
                resLabel.setText(result);

        } else if(event.getSource()==btnDot){
            num+=".";
            screenLabel.setText(num);
        }else if(event.getSource()==btnEnt){
            if(isFirst){
                if(isNumeric(num)){
                    b=Double.parseDouble(num);
                    if(sign=='+'){
                        result =  Double.toString(a+b);
                    }else if(sign=='-'){
                        result =  Double.toString(a-b);
                    }else if(sign=='*'){
                        result =  Double.toString(a*b);
                    }else if(sign=='/'){
                        if(b!=0)
                            result =  Double.toString(a/b);
                        else
                            result = "infinity";
                    }
                    if(isNumeric(result)){
                        a=Double.parseDouble(result);
                        num = result;
                        b=0;
                        isFirst=false;
                    }else{
                        a=0;
                        b=0;
                        isFirst=false;
                    }
                }else{
                    result = "No No No!!";
                }
            }else{
                result = "No No No!!";
            }

            if(isNumeric(num))
                screenLabel.setText(String.format("%.2f",Double.parseDouble(num)));
            else
                screenLabel.setText(num);
            if(isNumeric(result))
                resLabel.setText(String.format("%.2f",Double.parseDouble(result)));
            else
                resLabel.setText(result);
        }

    }
}
