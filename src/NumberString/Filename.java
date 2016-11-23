/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NumberString;

/**
 *
 * @author Hita Do
 */
public class Filename {
    private String path;
    private char pathSeparator, extensionSeparator;
    
    Filename(String path, char separator, char extension){
        this.path=path;
        this.pathSeparator=separator;
        this.extensionSeparator=extension;
        
    }
    
    public String extension(){
        int dot= path.lastIndexOf(extensionSeparator);
        return path.substring(dot+1);//mengambil mulai dari setelah tanda titik
    }
    
    public String filename(){
        int dot = path.lastIndexOf(extensionSeparator);
        int sep = path.lastIndexOf(pathSeparator);
        return path.substring(sep+1,dot);//mengambil mulai dari nama file sampai .
    }
    
    public String path(){
        int sep =path.lastIndexOf(pathSeparator);
        return path.substring(0, sep);//mengambil mulai dari awal sampai terakhir separator
    }
    
}
