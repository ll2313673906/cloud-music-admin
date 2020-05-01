package com.soft1851.music.admin.controller;


import com.soft1851.music.admin.domain.entity.SysUser;
import com.soft1851.music.admin.mapper.SysUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @Author fwt
 * @since 2020-04-22
 */
@RestController
@RequestMapping("/sysUser")
@Slf4j
@Validated
public class SysUserController {
    @Resource
    private SysUserMapper sysUserMapper;
    @PostMapping(value = "/register")
    public ResponseEntity<SysUser> register(@RequestBody SysUser sysUser){
        return ResponseEntity.ok().body(sysUserMapper.register(sysUser));
    }
}
