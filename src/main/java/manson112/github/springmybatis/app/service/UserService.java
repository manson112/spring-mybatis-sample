package manson112.github.springmybatis.app.service;

import lombok.RequiredArgsConstructor;
import manson112.github.springmybatis.app.dto.UserDto;
import manson112.github.springmybatis.app.dto.UserOrgDto;
import manson112.github.springmybatis.app.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;


    public List<UserDto> findAllUser() {
        return userMapper.findAllUser();
    }

    public UserDto findUserById(String userId) {
        return userMapper.findUserById(userId);
    }
}
