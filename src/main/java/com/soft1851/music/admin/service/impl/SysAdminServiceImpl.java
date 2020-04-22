package com.soft1851.music.admin.service.impl;

import com.soft1851.music.admin.dto.LoginDto;
import com.soft1851.music.admin.entity.SysAdmin;
import com.soft1851.music.admin.mapper.SysAdminMapper;
import com.soft1851.music.admin.service.SysAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.soft1851.music.admin.util.Md5Util;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author F*wt
 * @since 2020-04-21
 */
@Service
@Slf4j
public class SysAdminServiceImpl extends ServiceImpl<SysAdminMapper, SysAdmin> implements SysAdminService {
    @Resource
    private SysAdminMapper sysAdminMapper;

    @Override
    public boolean login(LoginDto loginDto) {
       SysAdmin admin = getAdmin(loginDto.getName());
        if (admin != null){
            String pass = Md5Util.getMd5(loginDto.getPassword(),true,32);
            if (admin.getPassword().equals(pass)){
                return true;
            }else {
                log.error("密码错误");
                return false;
            }
        }else {
            log.error("用户名不存在");
            return false;
        }

    }

    @Override
    public SysAdmin getAdmin(String name) {
        Map<String,Object> params = new HashMap<>(8);
        params.put("name",name);
        List<SysAdmin> admins = sysAdminMapper.selectByMap(params);
        if (admins.size() > 0){
            return sysAdminMapper.selectByMap(params).get(0);
        }else {
            return null;
        }

    }
}
