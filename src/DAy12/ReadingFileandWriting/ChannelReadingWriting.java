//Using any two buffers for Reading and Writing Data
package DAy12.ReadingFileandWriting;

import java.nio.CharBuffer;

public class ChannelReadingWriting {
    public static void main(String[] args) {
        CharBuffer bf=CharBuffer.allocate(15);
        String s1="Ananthabarani";
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            bf.put((c));
        }
        int pos=bf.position();
        System.out.println("Position  of write:"+ pos);
        bf.flip();
        pos=bf.position();
        System.out.println("Position of reading "+ pos);
        System.out.println("Reading the buffer....");
        while(bf.hasRemaining()){
            System.out.print(bf.get());
        }
    }
}
