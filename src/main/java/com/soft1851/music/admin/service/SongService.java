package com.soft1851.music.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.soft1851.music.admin.domain.entity.Song;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @Author fwt
 * @since 2020-04-22
 */
public interface SongService extends IService<Song> {
    /**
     * 导出数据
     */
    void exportData();
}
