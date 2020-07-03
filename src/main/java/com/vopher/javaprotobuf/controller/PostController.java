/**
 * Dana.id
 * Copyright (c) 2017‐2020 All Rights Reserved.
 */
package com.vopher.javaprotobuf.controller;

import com.vopher.javaprotobuf.model.PostProto;
import com.vopher.javaprotobuf.repository.PostRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author Yoga Kurnia (yoga.kurnia@dana.id)
 * @version $Id: PostController.java, v 0.1 2020-07-03 7:59 PM Yoga Kurnia
 */
@RestController
public class PostController {

    private final PostRepository repository;

    public PostController(PostRepository repository) {
        this.repository = repository;
    }

    @PostMapping(value = "post")
    public ResponseEntity<PostProto.Post> save(@RequestBody PostProto.Post post) {
        PostProto.Post result = repository.save(post);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }

    @PutMapping(value = "post")
    public ResponseEntity<PostProto.Post> update(@RequestBody PostProto.Post post) {
        PostProto.Post result = repository.update(post);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }

    @GetMapping(value = "post")
    public ResponseEntity<Collection<PostProto.Post>> getAll() {
        Collection<PostProto.Post> results = repository.getAll();

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(results);
    }

    @GetMapping(value = "post/{id}")
    public ResponseEntity<PostProto.Post> get(@PathVariable(value = "id") Integer id) {
        PostProto.Post result = repository.getById(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }


}
