package org.ainzson.source;

import org.ainzson.util.VersionUtils;
import org.apache.kafka.connect.source.SourceRecord;
import org.apache.kafka.connect.source.SourceTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class MongoSourceTask extends SourceTask {

    private  final Logger logger = LoggerFactory.getLogger(MongoSourceTask.class);
    private static final String CONNECTOR_TYPE = "source";
    public static final String ID_FIELD = "_id";
    public static  final String DOCUMENT_KEY_FIELD = "documentKey";
    static final String COPY_KEY = "copy";

    private static final String NS_KEY = "ns";
    private static final int UNKNOWN_FIELD_ERROR = 40415;
    private static final int FAILED_TO_PARSE_ERROR = 9;

    private StartedMongoSourceTask  startedMongoSourceTask;
    @Override
    public String version() {
        return VersionUtils.getVersion()    ;
    }

    @Override
    public void start(Map<String, String> map) {

    }

    @Override
    public List<SourceRecord> poll() throws InterruptedException {
        return null;
    }

    @Override
    public void stop() {

    }
}
