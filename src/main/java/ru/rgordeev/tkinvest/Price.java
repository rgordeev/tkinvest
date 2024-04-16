package ru.rgordeev.tkinvest;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Setter
@Getter
@Table("price")
public class Price {
    @Column("id")
    private @Id Long id;
    @Column("time")
    private Long time;
    @Column("close_u")
    private Long closeu;
    @Column("close_n")
    private Integer closen;
    @Column("instrument_uid")
    private String instrumentUid;

    public Price() {
        this.id = null;
    }

    public Price(Long id, Long time, Long closeu, Integer closen, String instrumentUid) {
        this.id = id;
        this.time = time;
        this.closeu = closeu;
        this.closen = closen;
        this.instrumentUid = instrumentUid;
    }

    public Price(Long time, Long closeu, Integer closen, String instrumentUid) {
        this.id = null;
        this.time = time;
        this.closeu = closeu;
        this.closen = closen;
        this.instrumentUid = instrumentUid;
    }
}
