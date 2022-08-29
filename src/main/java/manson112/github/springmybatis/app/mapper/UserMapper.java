package manson112.github.springmybatis.app.mapper;

import manson112.github.springmybatis.app.dto.User;
import manson112.github.springmybatis.app.dto.UserDto;
import manson112.github.springmybatis.app.dto.UserOrgDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserDto> findAllUser();

    UserDto findUserById(@Param("userId") String userId);

    List<UserOrgDto> findUsersWithOrg();

    List<User> findAllUserInfo();
}
