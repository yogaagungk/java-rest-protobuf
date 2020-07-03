/**
 * Dana.id
 * Copyright (c) 2017‐2020 All Rights Reserved.
 */
package com.vopher.javaprotobuf.config;

import com.vopher.javaprotobuf.repository.PostRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;

/**
 * @author Yoga Kurnia (yoga.kurnia@dana.id)
 * @version $Id: Configuration.java, v 0.1 2020-07-03 7:40 PM Yoga Kurnia
 */
@Configuration
public class AppConfiguration {

    @Bean
    public PostRepository postRepository() {
        return new PostRepository();
    }

    @Bean
    ProtobufHttpMessageConverter protobufHttpMessageConverter() {
        return new ProtobufHttpMessageConverter();
    }
}
