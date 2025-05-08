package org.example.springbootconfigpropsdocsdefaults;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "my.lombok.constructors")
@AllArgsConstructor
class WithLombokConstructorsConfigProps {

    /**
     * the String property from WithLombokConstructorsConfigProps class
     */
    private String p1="default";
}
