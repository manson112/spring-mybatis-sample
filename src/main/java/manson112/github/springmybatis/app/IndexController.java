package manson112.github.springmybatis.app;

import lombok.RequiredArgsConstructor;
import manson112.github.springmybatis.app.domain.MybatisTestEntity;
import manson112.github.springmybatis.app.mapper.TestMybatisMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class IndexController {
    private final TestMybatisMapper testMybatisMapper;

    @GetMapping("/")
    public List<MybatisTestEntity> index() {
        return testMybatisMapper.findAll();
    }

    @GetMapping("/{id}")
    public MybatisTestEntity findById(@PathVariable String id) {
        return testMybatisMapper.findById(id);
    }
}
