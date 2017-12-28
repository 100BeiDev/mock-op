package com.bb.mo.server.config;




import com.bb.mo.server.utils.Yamls;

import java.io.InputStream;

/**
 * Created by l_yy on 2017/1/17.
 */
public class TraceConfLoader {

    private TraceConfLoader(){}

    public static TraceConf load(String fileName){
        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
        TraceConf conf = Yamls.load(in, TraceConf.class);
        formatServer(conf);
        return conf;
    }

    private static void formatServer(TraceConf conf) {
        String server = conf.getServer();
        if (!server.startsWith("http://") &&
                !server.startsWith("https://")){
            conf.setServer("http://" + conf.getServer());
        }
    }
}
