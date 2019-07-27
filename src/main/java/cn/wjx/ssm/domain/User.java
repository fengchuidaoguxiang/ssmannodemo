package cn.wjx.ssm.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class User {

    private Long id;
    private String name;
    private Integer age;
    private Date bornDate;
    private String headImg;

    public User(Long id, String name, Integer age, Date bornDate, String headImg) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.bornDate = bornDate;
        this.headImg = headImg;
    }
}
