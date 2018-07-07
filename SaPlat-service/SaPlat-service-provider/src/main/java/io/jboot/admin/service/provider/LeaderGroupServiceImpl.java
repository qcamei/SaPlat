package io.jboot.admin.service.provider;

import io.jboot.aop.annotation.Bean;
import io.jboot.admin.service.api.LeaderGroupService;
import io.jboot.admin.service.entity.model.LeaderGroup;
import io.jboot.service.JbootServiceBase;

import javax.inject.Singleton;

@Bean
@Singleton
public class LeaderGroupServiceImpl extends JbootServiceBase<LeaderGroup> implements LeaderGroupService {

}