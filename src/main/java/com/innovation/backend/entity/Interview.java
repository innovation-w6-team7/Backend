package com.innovation.backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Interview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private SubTopic subTopic;

    @Column(nullable = false)
    private String question;

    @Column(nullable = false)
    private String answer;

    @Column()
    private String reference;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "interview", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Likes> likes;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "interview", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Answer> answers;




}
