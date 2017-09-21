package com.pangpang.starter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

/**
 * Created by leewake on 2017/9/21 0021.
 *
 * 实现CommandLineRunner接口，然后将其定义成一个bean，就可以在spring boot启动时进行记录
 */

public class StartupRunner implements CommandLineRunner{

    protected final Logger logger = LoggerFactory.getLogger(StartupRunner.class);

    @Override
    public void run(String... strings) throws Exception {
        logger.info("hello pangpang !");
    }

}
