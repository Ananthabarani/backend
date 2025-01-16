package DAy12.SerializeandDeserialize;

import java.io.*;

public class Customer implements Serializable {
    String name;
    int id;
    public Customer(){

    }
    public  Customer(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
