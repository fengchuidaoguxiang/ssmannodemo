package cn.wjx.ssm.mapper;

import cn.wjx.ssm.domain.User;

import java.util.List;

public interface UserMapper {

    int insert(User user);

    int updateById(User user);

    int deleteById(Long id);

    User selectById(Long id);

    List<User> selectAll();
}
