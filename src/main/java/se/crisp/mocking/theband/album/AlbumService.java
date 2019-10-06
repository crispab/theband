package se.crisp.mocking.theband.album;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.crisp.mocking.theband.songrecodring.SongRecordingEntity;
import se.crisp.mocking.theband.songrecodring.SongService;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class AlbumService {

    private final AlbumRepository albumRepository;
    private final SongService songService;

    @Autowired
    public AlbumService(AlbumRepository albumRepository, SongService songService) {
        this.albumRepository = albumRepository;
        this.songService = songService;
    }

    public List<String> appearingOnAlbum(String albumId) {

        Optional<AlbumEntity> album = albumRepository.findById(albumId);
        if (!album.isPresent()) {
            return Collections.emptyList();
        }
        SongRecordingEntity songRecordingEntity = album.get().getSongRecordings().get(0);
        return this.songService.artistsOnSong(songRecordingEntity.getId());
    }
}
