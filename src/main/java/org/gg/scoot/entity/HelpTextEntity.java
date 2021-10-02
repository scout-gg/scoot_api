package org.gg.scoot.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "help_text")
@AllArgsConstructor
@NoArgsConstructor
@With
@Getter
@Setter
public class HelpTextEntity extends PanacheEntityBase {
    @Id
    private Long id;
    @Column(name = "content_en")
    private String contentEn;
    @Column(name = "content_fr")
    private String contentFr;
    @Column(name = "content_br")
    private String contentBr;
    @Column(name = "content_de")
    private String contentDe;
    @Column(name = "content_es")
    private String contentEs;
    @Column(name = "content_hi")
    private String contentHi;
    @Column(name = "content_it")
    private String contentIt;
    @Column(name = "content_jp")
    private String contentJp;
    @Column(name = "content_ko")
    private String contentKo;
    @Column(name = "content_ms")
    private String contentMs;
    @Column(name = "content_mx")
    private String contentMx;
    @Column(name = "content_ru")
    private String contentRu;
    @Column(name = "content_tr")
    private String contentTr;
    @Column(name = "content_tw")
    private String contentTw;
    @Column(name = "content_vi")
    private String contentVi;
    @Column(name = "content_zh")
    private String contentZh;
}
