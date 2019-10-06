package se.crisp.mocking.theband.album;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import se.crisp.mocking.theband.songrecodring.SongRecordingEntity;
import se.crisp.mocking.theband.songrecodring.SongService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AlbumServiceTest {

    private static final String SOME_SONG_ID = "some song id";
    private static final String SOME_ARTIST_1_ID = "some artist 1 id";
    private static final String SOME_ARTIST_2_ID = "some artist 2 id";
    private static final String SOME_ARTIST_3_ID = "some artist 3 id";

    @Mock
    private AlbumRepository albumRepository;

    @Mock
    private SongService songService;

    private static final String SOME_ALBUM_ID = "some album id";

    @Test
    public void given_an_album_with_artists_when_asking_for_participants_then_all_song_related_artists() {
        AlbumEntity album = new AlbumEntity();
        SongRecordingEntity someSong = new SongRecordingEntity();
        someSong.setId(SOME_SONG_ID);
        album.addSongRecording(someSong);

        List<String> artistList = createListOfThreeArtistId();
        when(songService.artistsOnSong(SOME_SONG_ID)).thenReturn(artistList);

        when(albumRepository.findById(SOME_ALBUM_ID)).thenReturn(Optional.of(album));

        AlbumService service = new AlbumService(albumRepository, songService);

        // When
        List<String> list = service.appearingOnAlbum(SOME_ALBUM_ID);

        // Then
        assertThat(list.size(), is(3));
    }

    private List<String> createListOfThreeArtistId() {
        List<String> result = new ArrayList<>();
        result.add(SOME_ARTIST_1_ID);
        result.add(SOME_ARTIST_2_ID);
        result.add(SOME_ARTIST_3_ID);
        return result;
    }
}