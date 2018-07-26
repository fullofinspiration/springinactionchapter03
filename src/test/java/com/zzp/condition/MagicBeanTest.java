package com.zzp.condition;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MagicBeanConfig.class)
public class MagicBeanTest {
    @Autowired
    private ApplicationContext applicationContext;
    @Test
    public void assertNotNull() {
        assertTrue(applicationContext.containsBean("magicBean"));
    }
}
