package com.soft1851.music.admin.mapper;

import com.soft1851.music.admin.domain.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @Author fwt
 * @since 2020-04-22
 */
@Validated
public interface SysUserMapper extends BaseMapper<SysUser> {

    @Insert("INSERT INTO sys_user VALUES (" +
            "#{sysUser.userId},#{sysUser.userName},#{sysUser.nickName},#{sysUser.password},#{sysUser.phone},#{sysUser.email},#{sysUser.avatar},#{sysUser.gender},#{sysUser.address},#{sysUser.birthday},#{sysUser.cloudCoin},#{sysUser.deleteFlag},#{sysUser.updateTime},#{sysUser.createTime},#{sysUser.salt},#{sysUser.ext1})")
    SysUser register(@Valid @RequestBody SysUser sysUser);
}
