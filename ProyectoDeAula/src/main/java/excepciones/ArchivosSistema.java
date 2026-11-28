/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Usuario
 */
public class ArchivosSistema extends Exception{

    public ArchivosSistema(String message) {
        super(message);
    }

    public ArchivosSistema(String message, Throwable cause) {
        super(message, cause);
    }
    
}
