package manson112.github.springmybatis.app.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserOrgDto {
    private String userId;
    private String userName;
    private String orgId;
    private String orgName;
}
