package io.geekidea.springboot.assembly;

import io.geekidea.springboot.assembly.entity.SysUser;
import io.geekidea.springboot.assembly.service.SysUserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private SysUserService sysUserService;

    @Test
    public void contextLoads() {
        SysUser sysUser = sysUserService.getSysUser(1L);
        Assert.assertEquals(sysUser.getId(), new Long(1));
    }

    @Test
    public void test1(){
        Assert.assertEquals("1+1=2", 3, 1+1);
    }

    @Test
    public void test2(){
        Assert.assertEquals("1+1=2", 2, 1+1);
    }
}
