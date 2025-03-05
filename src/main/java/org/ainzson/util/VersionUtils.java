package org.ainzson.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.Properties;

public class VersionUtils {
    private  static  final Logger log = LoggerFactory.getLogger(VersionUtils.class);
    private  static  final String PATH = "./mongo-connect.properties";

    private static String version = "unknown";

    static {
        try (InputStream inputStream =  VersionUtils.class.getResourceAsStream(PATH)) {
            Properties properties = new Properties();
            properties.load(inputStream);
            version = properties.getProperty("version",version).trim();
        }
        catch (Exception ex) {
            log.warn("Error while loading versions");
        }
    }

    public static String getVersion() {
        return version;
    }


}
