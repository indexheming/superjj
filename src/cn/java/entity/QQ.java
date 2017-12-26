/**
 * Project Name:dt47_springMVC4
 * File Name:QQ.java
 * Package Name:cn.java.entity
 * Date:下午3:30:47
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
*/

package cn.java.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;

/**
 * Description: QQ注册实体类<br/>
 * Date: 下午3:30:47 <br/>
 * 
 * @author dingP
 * @version
 * @see
 */
public class QQ {
    @NotNull(message = "亲，不要null")
    @Pattern(regexp = "[a-zA-Z]{4,10}", message = "昵称必须为4-10位纯字母")
    private String nick;// 昵称

    @Pattern(regexp = "\\d{6,16}", message = "密码必须为6-16位")
    private String password;// 密码

    @Pattern(regexp = "1[3578]\\d{9}", message = "手机号必须为11位数字")
    private String phone;// 手机号

    @Email(message = "邮箱格式不正确")
    private String email;// 邮箱

    @Min(value = 1, message = "亲，您还没出生吧")
    @Max(value = 150, message = "亲，您还没挂么")
    private Integer age;// 年龄-1

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "QQ [nick=" + nick + ", password=" + password + ", phone=" + phone + ", email=" + email + ", age=" + age
                + "]";
    }

}
