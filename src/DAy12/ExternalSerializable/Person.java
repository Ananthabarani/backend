package DAy12.ExternalSerializable;


import java.io.*;

public class Person implements Externalizable {
    String name;
    int id;
    public Person(){

    }
    public Person(int id){
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

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("write external");
        out.write(id);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("read external");
        id= in.read();
    }
}
