package manson112.github.springmybatis.app;

import lombok.RequiredArgsConstructor;
import manson112.github.springmybatis.app.dto.OrgDto;
import manson112.github.springmybatis.app.dto.User;
import manson112.github.springmybatis.app.dto.UserDto;
import manson112.github.springmybatis.app.dto.UserOrgDto;
import manson112.github.springmybatis.app.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/user")
    public List<UserDto> findAllUser() {
        return userService.findAllUser();
    }

    @GetMapping("/user/{userId}")
    public UserDto findUserById(@PathVariable String userId) {
        return userService.findUserById(userId);
    }

    @GetMapping("/users/org")
    public List<UserOrgDto> findUsersWithOrg() {
        return userService.findUsersWithOrg();
    }

    @GetMapping("/users")
    public List<User> findAllUserInfo() {
        return userService.findAllUserInfo();
    }

}
