package Data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import thebanksystem.Bank;

public class FileIO {

    public static Bank bank;

    public static void write() {
        try {
            FileOutputStream fout = new FileOutputStream("red.txt");
            ObjectOutputStream obj = new ObjectOutputStream(fout);
            obj.writeObject(FileIO.bank);
            obj.flush();
            obj.close();
            fout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void read() {
        FileInputStream fin = null;
        ObjectInputStream obj = null;

        try {
            fin = new FileInputStream("red");
            obj = new ObjectInputStream(fin);
            FileIO.bank = (Bank) obj.readObject();
        } catch (Exception e) {
            FileIO.bank = new Bank();
        } 
        
        finally {
            try {
                if (fin != null) {
                    fin.close();
                }
                if (obj != null) {
                    obj.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
