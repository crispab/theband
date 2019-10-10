package se.crisp.mocking.theband.album;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RequestMapping("/albums")
@RestController
public class AlbumController {

    @GetMapping
    public List<AlbumEntity> findAll() {
        return Collections.emptyList();
    }
}

