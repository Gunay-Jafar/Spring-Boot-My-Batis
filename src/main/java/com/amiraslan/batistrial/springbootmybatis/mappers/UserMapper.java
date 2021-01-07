package com.amiraslan.batistrial.springbootmybatis.mappers;

import com.amiraslan.batistrial.springbootmybatis.models.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {
    List<User> findAll();

    User findById(int id);
}
