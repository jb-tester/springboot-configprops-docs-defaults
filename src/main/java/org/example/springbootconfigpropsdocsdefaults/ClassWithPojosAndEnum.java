package org.example.springbootconfigpropsdocsdefaults;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.util.List;
import java.util.Map;

@ConfigurationProperties("my.class")
public class ClassWithPojosAndEnum {
    @NestedConfigurationProperty
    DataClass pojo;

    List<DataClass> pojoList;
    Map<String, DataClass> pojoMap;

    public Map<String, DataClass> getPojoMap() {
        return pojoMap;
    }

    public void setPojoMap(Map<String, DataClass> pojoMap) {
        this.pojoMap = pojoMap;
    }

    public List<DataClass> getPojoList() {
        return pojoList;
    }

    public void setPojoList(List<DataClass> pojoList) {
        this.pojoList = pojoList;
    }

    public DataClass getPojo() {
        return pojo;
    }

    public void setPojo(DataClass pojo) {
        this.pojo = pojo;
    }
}
