package manson112.github.springmybatis.app.service;

import lombok.RequiredArgsConstructor;
import manson112.github.springmybatis.app.dto.OrgDto;
import manson112.github.springmybatis.app.mapper.OrgMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrgService {
    private final OrgMapper orgMapper;
    public List<OrgDto> findAllOrg() {
        return orgMapper.findAllOrg();
    }

    public OrgDto findOrgById(String orgId) {
        return orgMapper.findOrgById(orgId);
    }
}
