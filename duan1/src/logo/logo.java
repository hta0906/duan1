/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logo;

import Class.Nhanvien;
import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class logo {
    public static Image getanh(){
        URL url=logo.class.getResource("/Icon/coffee.png");
   return new ImageIcon(url ).getImage();
    
}
   public static  boolean  save(File src){
        File dst=new File("C:\\java3\\duan1\\src\\Icon",src.getName());
        try {
            Path from=Paths.get(src.getAbsolutePath());
            Path to=Paths.get(dst.getAbsolutePath());
            Files.copy(from, to,StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (Exception e) {
            return false;
            
        }  
   }
    public static Nhanvien USER = null;
    
     public static boolean authenticated() {
        return logo.USER != null;
     }
    
      public static void logoff() {
    logo.USER = null;
 }
    
}

