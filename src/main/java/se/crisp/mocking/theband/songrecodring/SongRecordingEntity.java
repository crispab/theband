package se.crisp.mocking.theband.songrecodring;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "song_recording")
public class SongRecordingEntity {
    @Id
    private String id;

    @Column
    private String title;

    public void setId(String songId) {
        this.id = songId;
    }

    public String getId() {
        return id;
    }
}
