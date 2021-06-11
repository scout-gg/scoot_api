package org.gg.scoot.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "help_text")
public class HelpText extends PanacheEntityBase {
    @Id
    public Long id;
    @Column(name = "content_en")
    public String contentEn;
    @Column(name = "content_fr")
    public String contentFr;
    @Column(name = "content_br")
    public String contentBr;
    @Column(name = "content_de")
    public String contentDe;
    @Column(name = "content_es")
    public String contentEs;
    @Column(name = "content_hi")
    public String contentHi;
    @Column(name = "content_it")
    public String contentIt;
    @Column(name = "content_jp")
    public String contentJp;
    @Column(name = "content_ko")
    public String contentKo;
    @Column(name = "content_ms")
    public String contentMs;
    @Column(name = "content_mx")
    public String contentMx;
    @Column(name = "content_ru")
    public String contentRu;
    @Column(name = "content_tr")
    public String contentTr;
    @Column(name = "content_tw")
    public String contentTw;
    @Column(name = "content_vi")
    public String contentVi;
    @Column(name = "content_zh")
    public String contentZh;
}
