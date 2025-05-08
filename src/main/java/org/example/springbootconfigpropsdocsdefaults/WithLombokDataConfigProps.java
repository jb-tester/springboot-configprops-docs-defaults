package org.example.springbootconfigpropsdocsdefaults;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "my.lombok.data")
@Data
class WithLombokDataConfigProps {

    /**
     * the String property from WithLombokDataConfigProps class
     */
    private String p1="default";
}
