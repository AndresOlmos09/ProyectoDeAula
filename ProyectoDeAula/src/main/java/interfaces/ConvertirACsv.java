/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Usuario
 */
public interface ConvertirACsv {
    
    String converirCsv();
    
    default String limpiar(String texto) {
        if (texto == null) {
            return "";
        }
        return texto.replace(",", " ").replace("\n", " ");
    }
}
