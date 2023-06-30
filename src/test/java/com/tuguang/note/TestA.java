package com.tuguang.note;

import com.tuguang.note.dao.UserDao;
import com.tuguang.note.po.User;
import com.tuguang.note.service.UserService;
import com.tuguang.note.util.DBUtil;
import com.tuguang.note.vo.ResultInfo;
import org.junit.Test;

public class TestA {
    private UserDao userDao = new UserDao();
    private UserService userService = new UserService();
    /**
     * 单元测试类
     */
    @Test
    public void testConnection() {
        System.out.println(DBUtil.getConnection());
    }

    @Test
    public void testDao(){
        User user=userDao.queryUserByName("zhangsan");
        System.out.println(user.getNick());
        ResultInfo<User> resultInfo = userService.userLogin("admin", "123456");
        System.out.println(resultInfo.getCode());
    }
}
