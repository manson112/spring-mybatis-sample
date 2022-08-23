package manson112.github.springmybatis.app.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
public class UserEntity {
    private String id;
    private String name;
    private String orgId;

    @Builder
    public UserEntity(String id, String name, String orgId) {
        this.id = id;
        this.name = name;
        this.orgId = orgId;
    }
}
