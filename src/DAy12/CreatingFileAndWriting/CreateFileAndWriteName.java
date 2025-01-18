//In this exercise, you will create a new file (e.g., name.txt) and write your name to it.
//Task:
//Write a program that:
//Creates a new text file called name.txt.
//Write your name to the file.

package DAy12.CreatingFileAndWriting;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileAndWriteName {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        String con[] ={"hi","Ananthabarani"};
        try {
            bw = new BufferedWriter(new FileWriter("D:\\study\\writename.txt"));
            for(String str : con)
            {
                bw.write(str);
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try
            {
                if(bw!=null) {
                    bw.close();
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Content Added to File");
    }
}
