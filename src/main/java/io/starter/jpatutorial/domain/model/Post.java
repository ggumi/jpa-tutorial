package io.starter.jpatutorial.domain.model;

import io.starter.jpatutorial.domain.jpo.PostJpo;
import lombok.*;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post {
    private Long no;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private int views;

    /**
     * Jpo -> Domain 객체 변환
     */
    public static Post jpoOf(PostJpo postJpo) {
        Post post = new Post();
        BeanUtils.copyProperties(postJpo,post);
        return post;
    }

    /**
     * Domain객체 -> Jpo 변환
     */
    public PostJpo asJpo() {
        PostJpo postJpo = new PostJpo();
        BeanUtils.copyProperties(this, postJpo);
        return postJpo;
    }



}
