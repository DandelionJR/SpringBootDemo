package springboot.demo.demo1;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@PropertySource(value = "classpath:demo1/application1.properties")
@ConfigurationProperties(prefix = "my")
public class ConfigBean {
    private String name;
    private int age;
    private int number;
    private String uuid;
    private int max;
    private String value;
    private String greeting;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getMax() {
        return max;
    }

    public int getNumber() {
        return number;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getUuid() {
        return uuid;
    }

    public String getValue() {
        return value;
    }
}
