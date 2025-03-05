package org.ainzson;

import org.ainzson.util.VersionUtils;
import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.connect.connector.Task;
import org.apache.kafka.connect.source.SourceConnector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MongoSourceConnector extends SourceConnector {

    private  static  final List<String> REQUIRED_SOURCE_ACTIONS = Arrays.asList("changeStream","find");
    private Map<String,String> settings;

    @Override
    public void start(final Map<String, String> props) {
        settings = props;
    }

    @Override
    public Class<? extends Task> taskClass() {
        return null;
    }

    @Override
    public List<Map<String, String>> taskConfigs(int i) {
        return null;
    }

    @Override
    public void stop() {

    }

    @Override
    public ConfigDef config() {
        return null;
    }

    @Override
    public String version() {
       return VersionUtils.getVersion();
    }
}