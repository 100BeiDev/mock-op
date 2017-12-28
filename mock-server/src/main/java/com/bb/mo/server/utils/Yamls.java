package com.bb.mo.server.utils;
//import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;

/**
 * l_yy
 */
public final class Yamls {

   // private static final Yaml yaml = new Yaml();

    private Yamls(){}

    public static <T> T load(InputStream in, Class<T> clazz){
        return null;
        //return yaml.loadAs(in, clazz);
    }
}
