package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import java.lang.Math;


public class Octet {
    private IntegerProperty decimal;
    private StringProperty binary;
    public Octet(){
        decimal = new SimpleIntegerProperty();
        this.decimal.set(0);
        binary = new SimpleStringProperty();
        this.binary.set("0");
    }
    public IntegerProperty decimalProperty() {
        return decimal;
    }
    public StringProperty binaryProperty(){
        return binary;
    }
    public final int getDecimal(){
        return decimal.get();
    }
    public final void setDecimal(int value){
        decimal.set(value);
    }
    public final String getBinary(){
        return binary.get();
    }
    public final void setBinary(String value){
        binary.set(value);
    }
    public void toBinary(int num){
        setBinary(String.format("%8s", Integer.toBinaryString(num)).replace(" ", "0"));
    }
    public void toDecimal(String binary){
        setDecimal(Integer.parseInt(binary,2));
    }

}
