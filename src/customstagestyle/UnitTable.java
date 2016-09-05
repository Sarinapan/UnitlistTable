package customstagestyle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Time;
import javafx.beans.property.SimpleStringProperty;

 
public class UnitTable {
    private final SimpleStringProperty Units;
    private final SimpleStringProperty Type;
    private final SimpleStringProperty Time;
    private final SimpleStringProperty Location;
    public UnitTable (String Units, String Type, String Time, String Location){
            this.Units = new SimpleStringProperty (Units);
            this.Type = new SimpleStringProperty("QQ"); 
            this.Time = new SimpleStringProperty (Time);
            this.Location = new SimpleStringProperty (Location);
    }
    public UnitTable(){
        this(null,null, null, null);
    }

    public SimpleStringProperty getUnits() {
        return Units;
    }

    public SimpleStringProperty getType() {
        return Type;
    }

    public SimpleStringProperty getTime() {
        return Time;
    }

    public SimpleStringProperty getLocation() {
        return Location;
    }
    
}
