package br.com.unifalmg.blog.entity;

import javax.persistence.*;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Outros atributos do Comment

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    // construtores, getters e setters
}
