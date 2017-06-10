package com.itembryo.drools.spring.service.impl;

import com.itembryo.drools.spring.service.DroolsExecutor;
import org.drools.kproject.KSession;
import org.drools.runtime.StatelessKnowledgeSession;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by abhayphougat on 10/06/17.
 */
@Service
public class DefaultDroolsExecutor implements DroolsExecutor {


    @Resource
    StatelessKnowledgeSession itemKSession;

    @Override
    public void execute(Object object) {

         itemKSession.execute(object);
    }
}
