module sample.dcapture.db {
    requires dcapture.db;
    requires dcapture.io;
    requires java.json;
    requires java.ws.rs;
    requires java.sql;
    requires javax.servlet.api;
    requires javax.inject;
    requires org.glassfish.java.json;
    requires org.apache.logging.log4j;
    requires org.apache.commons.io;
    requires jetty.io;
    requires jetty.server;
    requires jetty.servlet;
    requires pustike.inject;
    requires jetty.util;
    opens sample.dcapture.db.service to dcapture.io, pustike.inject;
}