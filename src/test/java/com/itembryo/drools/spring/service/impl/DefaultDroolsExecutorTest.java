package com.itembryo.drools.spring.service.impl;

import com.itembryo.drools.spring.dto.Category;
import com.itembryo.drools.spring.dto.Item;
import com.itembryo.drools.spring.service.DroolsExecutor;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by abhayphougat on 10/06/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class DefaultDroolsExecutorTest {


    @Autowired
    DroolsExecutor droolsExecutor;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void execute() throws Exception {

        Item item = new Item(199d);

        droolsExecutor.execute(item);

        System.out.println("The item Category is : "+item.getCategory());

        assertSame(Category.LOW_VALUE,item.getCategory());

    }

}