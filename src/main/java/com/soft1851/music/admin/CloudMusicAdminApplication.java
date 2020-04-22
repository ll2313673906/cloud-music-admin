package com.soft1851.music.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.soft1851.music.admin.mapper")
public class CloudMusicAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudMusicAdminApplication.class, args);
    }

}
