package com.myapp.helloworld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if (args.length > 0){
            System.out.println( AppLib.stringLen(args[0]));
        }
    }
}
