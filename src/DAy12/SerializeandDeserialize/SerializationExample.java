package DAy12.SerializeandDeserialize;

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
            Customer cus = new Customer();
            cus.setId(10);
            cus.setName("Anand");
            oos = new ObjectOutputStream(new FileOutputStream("D:\\study\\serilazation.txt"));
            oos.writeObject(cus);
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
            Customer cus=(Customer) ois.readObject();
            System.out.println(cus.getId());
            System.out.println(cus.getName());
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
