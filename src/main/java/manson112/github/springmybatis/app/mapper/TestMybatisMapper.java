package manson112.github.springmybatis.app.mapper;

import manson112.github.springmybatis.app.domain.MybatisTestEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestMybatisMapper {
    @Select("select * from tb_mybatis_test")
    public List<MybatisTestEntity> findAll();

    @Select("select * from tb_mybatis_test where id=#{id}")
    public MybatisTestEntity findById(@Param("id") String id);

}
