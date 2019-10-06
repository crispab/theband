package se.crisp.mocking.theband.artist;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "artist")
public class ArtistEntity {
    @Id
    private String id;

    @Column
    private String name;
}
