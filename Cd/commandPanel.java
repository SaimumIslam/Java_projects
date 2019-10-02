import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

class commandPanel extends JPanel implements ActionListener {
  ItemListing listing;
  
 public commandPanel(ItemListing n_listing) {
  this.listing = n_listing;
  
  JButton CDbutton = new JButton("CD");
  CDbutton.setActionCommand("CD");
  CDbutton.addActionListener(this);
  add(CDbutton);
  
  JButton Videobutton = new JButton("Video");
  Videobutton.setActionCommand("Video");
  Videobutton.addActionListener(this);
  add(Videobutton);
  
  JButton allbutton = new JButton("All");
  allbutton.setActionCommand("All");
  allbutton.addActionListener(new myListener(listing));
  add(allbutton);
  
  JButton SaveButton = new JButton("Save");
  SaveButton.setActionCommand("Save");
  SaveButton.addActionListener(this);
  add(SaveButton);
  JButton LoadButton = new JButton("Load");
  LoadButton.setActionCommand("Load");
  LoadButton.addActionListener(this);
  add(LoadButton);

   JButton SearchButton = new JButton("Search");
  SearchButton.setActionCommand("Search");
  SearchButton.addActionListener(this);
  add(SearchButton);
  
 }
 public void actionPerformed(ActionEvent e) {
   if ("CD".equals(e.getActionCommand()))
     listing.showCDItem ();
   else if ("Video".equals(e.getActionCommand())) 
     listing.showVideoItem ();
   else if("Save".equals(e.getActionCommand()))
   {
     listing.saveItem();
   }
   else if("Load".equals(e.getActionCommand()))
   {
    
    listing.loadItem();  
    
   }
    else if("Search".equals(e.getActionCommand()))
   {
    
    listing.loadItem();  
    
   }
   
   
 }
}
