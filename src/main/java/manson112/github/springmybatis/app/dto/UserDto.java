package manson112.github.springmybatis.app.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
public class UserDto {
    private String userId;
    private String userName;

    @Builder
    public UserDto(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }
}
