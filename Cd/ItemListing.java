import javax.swing.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;



class ItemListing  {
  JTextArea text;
  Database database;
  
  public ItemListing(JTextArea text, Database database) {
    this.text = text;
    this.database = database;
  }
  
  public void addCDItem(CD item) {
    database.addCDItem (item);
  }
  public void addVideoItem(Video item) {
    database.addVideoItem (item);
  }
  public void showCDItem() {
    text.setText (database.getCDs());
  }
  public void showVideoItem() {
    text.setText (database.getVideos());
  }
  public void showAllItem() {
    text.setText (database.getCDs()+database.getVideos());
  }
  public void showSaveIteam()
  {
    
    try{
      
      FileOutputStream fout = new FileOutputStream("out.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fout);   
      oos.writeObject(database);
      oos.close();
      text.setText("Done"); 
    }catch(Exception ex){
      ex.printStackTrace();
    }
    
   
  }
  
  public void loadItem()
  {
    
     try{
      
     FileInputStream fileIn = new FileInputStream("out.ser");
     ObjectInputStream ois = new ObjectInputStream(fileIn);
     
    database = (Database) ois.readObject();
    
    text.setText( database.getCDs()+database.getVideos());
     
     ois.close();
     
     }catch(Exception ex){
     ex.printStackTrace();
     System.out.println(ex.getMessage());
    }
    
    
  }
  
}
