package cn.wjx.ssm.service.impl;

import cn.wjx.ssm.domain.User;
import cn.wjx.ssm.mapper.UserMapper;
import cn.wjx.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void save(User user) {
        userMapper.insert(user);
//        int a = 1 / 0;
    }

    @Override
    public void update(User user) {
        userMapper.updateById(user);
    }

    @Override
    public void delete(Long id) {
        userMapper.deleteById(id);
    }

    @Transactional(readOnly=true)
    @Override
    public User get(Long id) {
        return userMapper.selectById(id);
    }

    @Transactional(readOnly=true)
    @Override
    public List<User> listAll() {
        return userMapper.selectAll();
    }
}
