/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ec.gob.bomberosquito.hashmap;

import java.util.HashMap;

/**
 *
 * @author danielhwang
 */
public class Hashmap {

    public static void main(String[] args) {
        
        HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("Daniel", 1);
        empIds.put("Samuel", 2);
        empIds.put("John", 3);
        System.out.println(empIds);
        System.out.println(empIds.get("Daniel"));
        System.out.println(empIds.containsKey("John"));
        System.out.println(empIds.containsValue(4));
        
        //create or update key value
        empIds.put("Samuel", 7);
        System.out.println(empIds);
        
        //update an existing set of values
        empIds.replace("Bender", 10);
        System.out.println(empIds);
        
    }
}
