package DAy12.ExternalSerializable;
import DAy12.SerializeandDeserialize.Customer;

import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
       SerializationExample se=new SerializationExample();
        se.doser();
        se.deser();
    }
    public void doser(){
        ObjectOutputStream oos=null;
        try {
            Person pes = new Person();
            pes.setId(10);
            pes.setName("Anand");
            oos = new ObjectOutputStream(new FileOutputStream("D:\\study\\serilazation.txt"));
            oos.writeObject(pes);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try
            {
                if(oos!=null){
                    oos.close();
                }
                System.out.println("Done");
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public void deser()
    {
        ObjectInputStream ois=null;
        try{
            ois= new ObjectInputStream(new FileInputStream("D:\\study\\serilazation.txt"));
            Person pes=(Person) ois.readObject();
            System.out.println(pes.getId());
            System.out.println(pes.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally{
            try{
                if(ois!=null){
                    ois.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
