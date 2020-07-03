/**
 * Dana.id
 * Copyright (c) 2017‐2020 All Rights Reserved.
 */
package com.vopher.javaprotobuf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Yoga Kurnia (yoga.kurnia@dana.id)
 * @version $Id: Main.java, v 0.1 2020-07-03 7:06 PM Yoga Kurnia
 */
@SpringBootApplication
public class Application {

    public static Logger getLogger(Object o) {
        return LoggerFactory.getLogger(o.getClass());
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
