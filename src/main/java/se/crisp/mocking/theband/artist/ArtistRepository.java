package se.crisp.mocking.theband.artist;

import org.springframework.data.jpa.repository.JpaRepository;

interface ArtistRepository extends JpaRepository<ArtistEntity, String> {

}
