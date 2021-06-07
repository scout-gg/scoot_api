package org.gg.scoot.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;


import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Civilization extends PanacheEntity {
    public Long id;
    public String name;
    @Column(name = "name_fr")
    public String nameFr;
    @Column(name = "name_br")
    public String nameBr;
    @Column(name = "name_de")
    public String nameDe;
    @Column(name = "name_es")
    public String nameEs;
    @Column(name = "name_hi")
    public String nameHi;
    @Column(name = "name_it")
    public String nameIt;
    @Column(name = "name_jp")
    public String nameJp;
    @Column(name = "name_ko")
    public String nameKo;
    @Column(name = "name_ms")
    public String nameMs;
    @Column(name = "name_mx")
    public String nameMx;
    @Column(name = "name_ru")
    public String nameRu;
    @Column(name = "name_tr")
    public String nameTr;
    @Column(name = "name_tw")
    public String nameTw;
    @Column(name = "name_vi")
    public String nameVi;
    @Column(name = "name_zh")
    public String nameZh;
}
