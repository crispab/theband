package se.crisp.mocking.theband.songrecodring;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class SongService {
    public List<String> artistsOnSong(String songId) {
        return Collections.emptyList();
    }
}
