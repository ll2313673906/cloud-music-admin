package com.soft1851.music.admin.mapper;

import com.soft1851.music.admin.domain.entity.SysUser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author F*WT
 * @Date 2020/4/30 21:59
 * @Description
 */
@SpringBootTest
class SysUserMapperTest {
    @Resource
    private SysUserMapper sysUserMapper;

    @Test
    void register() {
        SysUser sysUser = new SysUser();
        sysUser.setAddress("");
        System.out.println(sysUser);

    }

    @Test
    void checkManually(){
        //通过Validator工厂类获得的Validator实例，也可以通过注入的方式
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        SysUser user = new SysUser();
        user.setPhone("");
        //对参数进行校验，得到一组结果
        Set<ConstraintViolation<SysUser>> violations = validator.validate(user);
        for (ConstraintViolation<SysUser> constraintViolation :violations){
            System.out.println(constraintViolation.getMessage());
        }

    }
}