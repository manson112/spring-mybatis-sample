package manson112.github.springmybatis.app.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
public class OrgEntity {
    private String id;
    private String orgName;
    private String horgId;

    @Builder
    public OrgEntity(String id, String orgName, String horgId) {
        this.id = id;
        this.orgName = orgName;
        this.horgId = horgId;
    }
}
