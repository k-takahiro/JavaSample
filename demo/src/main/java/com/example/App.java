package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args ) throws ClassNotFoundException
    {
        System.out.println( "Hello World!" );
        System.out.println(PostNumber.valueOf("012-3456-789").getValue());
        
        logger.info("〇test〇");
        logger.info(Configurator.getInstance().getValueByKey("key1"));

    }

    public String publicMethod() {
        return "publicMethod param is none";
    }

    public String publicMethod(String param) {
        return "publicMethod param is " + param;
    }

    private String privateMethod() {
        return "privateMethod param is none";
    }

    private String privateMethod(String param) {
        return "privateMethod param is " + param;
    }
}
