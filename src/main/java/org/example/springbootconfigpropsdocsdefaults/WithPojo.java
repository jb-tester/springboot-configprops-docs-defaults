package org.example.springbootconfigpropsdocsdefaults;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@ConfigurationProperties("my.class-with-pojo")
public class WithPojo {
    @NestedConfigurationProperty
    DataClass pojo;

    public DataClass getPojo() {
        return pojo;
    }

    public void setPojo(DataClass pojo) {
        this.pojo = pojo;
    }
}
