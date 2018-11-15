package ba.unsa.etf.rpr.tutorijal05;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

    public Button nula;
    public Button jedan;
    public Button dva;
    public Button tri;
    public Button cetiri;
    public Button pet;
    public Button sest;
    public Button sedam;
    public Button osam;
    public Button devet;
    public Button procenat;
    public Button dijeljenje;
    public Button sabiranje;
    public Button oduzimanje;
    public Button mnozenje;
    public Button jednako;
    public Button tacka;
    public TextField display;

    private String operator="";
    private double number1=0;
    private Model model=new Model();
    private boolean start=true;
    private long number2=0;

    public void buttonAction(ActionEvent actionEvent) {
        if(start) {
            display.setText("");
            start=false;
        }
        String value = ((Button)actionEvent.getSource()).getText();
        display.setText(display.getText() + value);
    }

    public void operationAction(ActionEvent actionEvent) {
        String value = ((Button)actionEvent.getSource()).getText();
        if(!"=".equals(value)) {
            if(!operator.isEmpty())
                return;
            operator=value;
            number1=Long.parseLong(display.getText());
            display.setText("");
        }
        else {
            if(operator.isEmpty())
                return;
            display.setText(String.valueOf(model.calculate(number1,Long.parseLong(display.getText()),operator)));
            operator="";
            start=true;
        }
    }
}
