package manson112.github.springmybatis.app.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
public class UserOrgDto {
    private String userId;
    private String userName;
    private String orgId;
    private String orgName;

    @Builder
    public UserOrgDto(String userId, String userName, String orgId, String orgName) {
        this.userId = userId;
        this.userName = userName;
        this.orgId = orgId;
        this.orgName = orgName;
    }
}
