package org.example;

/**
 * @author:yqz
 * @create: 2022-12-28
 * @Description: 属性填充
 */
public class PropertyValue {

    private final String name;
    private Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}