package com.jq.team.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jq.team.domain.TeamTaskTag;
import com.jq.team.mapper.TeamTaskTagMapper;
import com.jq.team.service.TeamTaskTagService;
import org.springframework.stereotype.Service;

/**
* @author 30627
* @description 针对表【team_task_tag(项目标签和任务的关系表)】的数据库操作Service实现
* @createDate 2024-03-03 18:12:10
*/
@Service
public class TeamTaskTagServiceImpl extends ServiceImpl<TeamTaskTagMapper, TeamTaskTag>
    implements TeamTaskTagService {

}




