package com.soft1851.music.admin.controller;


import com.soft1851.music.admin.service.SongService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 *  @Author
 * @since 2020-04-22
 */
@RestController
@RequestMapping("/song")
public class SongController {
    @Resource
    private SongService songService;

    @GetMapping(value = "/export")
    public void exportData() {
        songService.exportData();
    }

}
