package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.lang.Math;

public class Calculator {
    private ObservableList<Octet> address = FXCollections.observableArrayList();
    public Calculator(){
        address.add(new Octet());
        address.add(new Octet());
        address.add(new Octet());
        address.add(new Octet());
    }
    public void toBinary(String[] values){
        int i = 0;
        for(Octet octet : address) {
            octet.toBinary(Integer.parseInt(values[i]));
            i++;
        }
    }
    public void toDecimal(String[] value){
        int i = 0;
        for(Octet octet : address){
            octet.toDecimal(value[i]);
            i++;
        }
    }
    public void setBinary(String[] values){
        for(int i = 0; i < address.size(); i++){
            address.get(i).setBinary(values[i]);
        }
    }
    public ObservableList<Octet> getAddress() {
        return address;
    }

}
