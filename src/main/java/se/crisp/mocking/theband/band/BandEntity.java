package se.crisp.mocking.theband.band;

import javax.persistence.*;

@Entity
@Table(name = "band")
public class BandEntity {
    @Id
    private String id;

    @Column
    private String name;
}
