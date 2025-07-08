package org.example.springbootconfigpropsdocsdefaults;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "my.lombok.getters-setters")
@Getter
@Setter
class WithLombokGettersSettersConfigProps {

    /**
     * the String property from WithLombokGettersSettersConfigProps
     */
    private String p1="default";
    /**
     * the Enum property from WithLombokGettersSettersConfigProps class
     */
    private SomeEnum p2=SomeEnum.WHITE;
}
