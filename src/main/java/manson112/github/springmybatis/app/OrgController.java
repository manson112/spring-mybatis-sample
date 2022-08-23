package manson112.github.springmybatis.app;

import lombok.RequiredArgsConstructor;
import manson112.github.springmybatis.app.dto.OrgDto;
import manson112.github.springmybatis.app.service.OrgService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrgController {
    private final OrgService orgService;

    @GetMapping("/org")
    public List<OrgDto> findAllOrg() {
        return orgService.findAllOrg();
    }

    @GetMapping("/org/{orgId}")
    public OrgDto findOrgById(@PathVariable String orgId) {
        return orgService.findOrgById(orgId);
    }

}
