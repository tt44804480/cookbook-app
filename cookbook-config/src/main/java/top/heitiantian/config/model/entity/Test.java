package top.heitiantian.config.model.entity;

import javax.persistence.*;

public class Test {
    @Id
    private Byte id;

    private String name;

    private Integer age;

    /**
     * @return id
     */
    public Byte getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Byte id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}