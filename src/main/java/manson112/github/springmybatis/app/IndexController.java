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
    public List<MybatisTestEntity> findAll() {
        return testMybatisMapper.findAll();
    }

    @GetMapping("/entity/{id}")
    public MybatisTestEntity findById(@PathVariable String id) {
        return testMybatisMapper.findById(id);
    }

    @GetMapping("/xml")
    public List<MybatisTestEntity> findAllXml() {
        return testMybatisMapper.findAllXml();
    }

    @GetMapping("/entity/xml/{id}")
    public MybatisTestEntity findByIdXml(@PathVariable String id) {
        return testMybatisMapper.findByIdXml(id);
    }

}
