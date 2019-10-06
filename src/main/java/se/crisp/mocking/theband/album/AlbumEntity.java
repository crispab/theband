package se.crisp.mocking.theband.album;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "album")
public class AlbumEntity {
    @Id
    private String id;

}
