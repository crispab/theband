package se.crisp.mocking.theband.album;

import se.crisp.mocking.theband.songrecodring.SongRecordingEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "album")
public class AlbumEntity {
    @Id
    private String id;

    @Transient
    private List<SongRecordingEntity> songs = new ArrayList<>();

    public void addSongRecording(SongRecordingEntity song) {
        this.songs.add(song);
    }

    public List<SongRecordingEntity> getSongRecordings() {
        return songs;
    }
}
