package org.example.springbootconfigpropsdocsdefaults;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.boot.context.properties.bind.DefaultValue;


@ConfigurationProperties(prefix = "my.record-with-pojo")
public record RecordWithPojo(
        @NestedConfigurationProperty DataClass dataClass) {
}