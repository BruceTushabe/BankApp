package com;

import java.io.*;

// MyFilenameFilter class implements FilenameFilter
// interface
class MyFilenameFilter implements FilenameFilter {

    String initials;
    // Constructor to initialize the project

    public MyFilenameFilter(String initials){
        this.initials = initials;
    }
    // Overiding the accept method of Filename Filter Interface

    public boolean accept(File dir, String name)
    {
        return name.startsWith(initials);
    }  
}

public class Main{
    
    public static void main(String[] args){

        // create an object of the file class
        // Replace the file path with the path of the directory
        
        File directory = new File("D:");

        // Create an object of Class MyFilenameFilter
        // Constructor with name of file which is being
        // searched

        MyFilenameFilter filter = new MyFilenameFilter("test.groovy");

        // store all names with same name
        // with/without extension

        String[] flist = directory.list(filter);

        // Empty array

        if (flist == null) {
            System.out.println("Empty directory or directory does not exist");
        } else {
            // Print all files with same name in directory
            // as provided in object of MyFilenameFilter
            // class

            for (int i = 0; i < flist.length; i++){
                System.out.println(flist[i] + "found");
            }
        }
    }

}