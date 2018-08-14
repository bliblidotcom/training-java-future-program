/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blibli;

/**
 *
 * @author Ghozi AW
 */
public class faktorialrekursif {

    public static void main(String[] args) {
        System.out.println(rekursif(5));
    }
    
    static int rekursif(int angka){
        if (angka==0) {
            return 1;
        }else{
        return angka*rekursif(angka-1);
        }
    }
}
