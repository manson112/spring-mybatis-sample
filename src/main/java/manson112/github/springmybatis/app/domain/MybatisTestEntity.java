package manson112.github.springmybatis.app.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
public class MybatisTestEntity {
    private String id;
    private String name;

    @Builder
    public MybatisTestEntity(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
