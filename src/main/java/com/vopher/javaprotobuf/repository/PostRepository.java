/**
 * Dana.id
 * Copyright (c) 2017‐2020 All Rights Reserved.
 */
package com.vopher.javaprotobuf.repository;

import com.vopher.javaprotobuf.Application;
import com.vopher.javaprotobuf.model.PostProto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Yoga Kurnia (yoga.kurnia@dana.id)
 * @version $Id: PostRepository.java, v 0.1 2020-07-03 7:43 PM Yoga Kurnia
 */
public class PostRepository {

    private Map<Integer, PostProto.Post> store;

    public void init() {
        store = new HashMap<Integer, PostProto.Post>();
    }

    public Collection<PostProto.Post> getAll() {
        Collection<PostProto.Post> results = new ArrayList<PostProto.Post>();

        for (Map.Entry<Integer, PostProto.Post> entry : store.entrySet()) {
            results.add(entry.getValue());
        }

        return results;
    }

    public PostProto.Post getById(Integer id) {
        PostProto.Post post = store.get(id);

        if (null == post) {
            Application.getLogger(this).error("[not found] couldn't post with id " + id);
        }

        return post;
    }

    public PostProto.Post save(PostProto.Post post) {
        store.put(post.getId(), post);

        return post;
    }

    public PostProto.Post update(PostProto.Post post) {
        PostProto.Post savedPost = store.get(post.getId());

        if (null == savedPost) {
            Application.getLogger(this).error("[update failed] couldn't post with id " + post.getId());

            return null;
        }

        store.put(post.getId(), post);

        return post;
    }
}
