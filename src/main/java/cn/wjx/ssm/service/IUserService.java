package cn.wjx.ssm.service;

import cn.wjx.ssm.domain.User;

import java.util.List;

public interface IUserService {

    void save(User user);

    void update(User user);

    void delete(Long id);

    User get(Long id);

    List<User> listAll();
}
