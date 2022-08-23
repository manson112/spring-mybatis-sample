package manson112.github.springmybatis.app.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class OrgDto {
    private String orgId;
    private String orgName;

    @Builder
    public OrgDto(String orgId, String orgName) {
        this.orgId = orgId;
        this.orgName = orgName;
    }
}
