/*
 * File name: Start.java
 * Date:      2014/09/04 12:34
 * Author:    Jan Faigl
 */

package cz.cvut.fel.pjv;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Start {

   public static void main(String[] args) throws FileNotFoundException {
      FileInputStream is = new FileInputStream(new File("src/main/resources/test_input.txt"));
      System.setIn(is);

      Lab02 lab = new Lab02();
      lab.start(args);
   }
}
