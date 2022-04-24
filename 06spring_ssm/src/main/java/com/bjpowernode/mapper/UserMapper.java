package com.bjpowernode.mapper;

import com.bjpowernode.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author may
 * @date 2022/4/19 19:32
 */
public interface UserMapper {
    /**
     * /user/selectUserPage?userName=z&userSex=男&page=null
         * userName:表单中用户名称
         * userSex:表单中用户性别
         * page:提交的页码(第一次访问为null)
     * 有数据时：
     * [{
     * "userId":"15968954638794962",
     * "cardType":"身份证","
     * cardNo":"343343554654",
     * "userName":"撒撒旦",
     * "userSex":"女",
     * "userAge":"29",
     * "userRole":"生产、运输设备操作人员及有关人员"},
     * {….}
     * ]
     * 无数据时：
     * []
     */
    List<User>selectUserPage(
            @Param("userName")
            String userName,
            @Param("userSex")
            String userSex,
            @Param("startRow")
            int startRow);
}
