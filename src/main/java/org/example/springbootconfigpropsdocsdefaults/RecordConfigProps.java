package org.example.springbootconfigpropsdocsdefaults;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 *
 * @param p1 the String property from RecordConfigProps
 * @param p2 the Enum property from RecordConfigProps
 */
@ConfigurationProperties(prefix = "my.record")
public record RecordConfigProps(
        @DefaultValue("default") String p1,
        @DefaultValue("GREEN") SomeEnum p2) {
}