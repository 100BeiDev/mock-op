package com.bb.mo.server.config;

import java.util.List;

/**
 * Created by l_yy on 2017/1/17.
 */
public class TraceConf {

    private static final String TRACE_CONF_FILE = System.getProperty("trace.conf.file", "mock.yml");

    //private static final TraceConf conf = TraceConfLoader.load(TRACE_CONF_FILE);


//    public static TraceConf getConf() {
//        return conf;
//    }
//

    /**
     * Enable the trace or not
     */
    private Boolean enable = Boolean.TRUE;

    /**
     * The trace server
     */
    private String server;

    /**
     * The app name
     */
    private String name;

    /**
     * The app owner
     */
    private String owner;



    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }



    @Override
    public String toString() {
        return "TraceConf{" +
                "enable=" + enable +
                ", server='" + server + '\'' +
                ", name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
