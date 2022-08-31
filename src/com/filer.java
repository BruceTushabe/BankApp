package com;

import java.io.File;

public class filer {

    public static void main(String[] argv) throws Exception {
        // Create an object of the File class
        // Replace the file path with path of the directory

        File directory = new File("C");

        // store all names with same name
        // with/without extension

        String[] flist = directory.list();
        int flag = 0;
        if (flist == null){
            System.out.println("Empty Directory.");
        }
        else {
            // Linear search in the array

            for (int i = 0; i < flist.length; i++){
                String filename = flist[i];
                if (filename.equalsIgnoreCase("test.groovy")){
                    System.out.println(filename + "found");
                    flag = 1;
                }
            }
        }

        if (flag == 0){
            System.out.println("File not found");
        }

    }

}
