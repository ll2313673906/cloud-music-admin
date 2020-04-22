package com.soft1851.music.admin.service.impl;

import com.soft1851.music.admin.dto.LoginDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author F*WT
 * @Date 2020/4/21 14:55
 * @Description
 */
@SpringBootTest
class SysAdminServiceImplTest {
@Resource
private SysAdminServiceImpl sysAdminService;
    @Test
    void login() {
        LoginDto loginDto = LoginDto.builder().name("mqxu").password("123456").build();
        System.out.println(sysAdminService.login(loginDto));
    }
}