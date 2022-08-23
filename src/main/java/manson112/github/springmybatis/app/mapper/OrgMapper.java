package manson112.github.springmybatis.app.mapper;

import manson112.github.springmybatis.app.dto.OrgDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrgMapper {
    List<OrgDto> findAllOrg();
    OrgDto findOrgById(@Param("orgId") String orgId);
}
