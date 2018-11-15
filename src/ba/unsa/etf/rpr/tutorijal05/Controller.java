package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public Label display;

    private SimpleStringProperty screen=new SimpleStringProperty("0");

    public SimpleStringProperty screen(){
        return screen;
    }
    public String getScreen() {
        return screen.get();
    }

    private String operator="";
    private double number1=0;
    private Model model=new Model();
    private boolean start=true;

    public Controller() {

    }

    public void buttonAction(ActionEvent actionEvent) {
        if(start) {
            screen.set("");
            start=false;
        }
        String value = ((Button)actionEvent.getTarget()).getText();
        screen.set(screen.get() + value);
    }

    public void operationAction(ActionEvent actionEvent) {
        String value = ((Button)actionEvent.getTarget()).getText();
        if(!"=".equals(value)) {
            if(!operator.isEmpty())
                return;
            operator=value;
            number1=Long.parseLong(screen.get());
            screen.set("");
        }
        else {
            if(operator.isEmpty())
                return;
            if(operator.equals("%")) screen.set(String.valueOf(model.calculate1(number1,operator)));
            screen.set(String.valueOf(model.calculate(number1,Long.parseLong(screen.get()),operator)));
            operator="";
            start=true;
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        display.textProperty().bindBidirectional(screen);
    }
}
