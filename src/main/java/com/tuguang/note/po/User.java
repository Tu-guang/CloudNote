package com.tuguang.note.po;

import lombok.Getter;
import lombok.Setter;

/**
 * 用户类
 */
@Getter
@Setter
public class User {
    private Integer userId; // 用户ID，主键
    private String uname; // 用户名称
    private String upwd; // 用户密码
    private String nick; // 用户昵称
    private String head; // 用户头像
    private String mood; // 用户心情
}

