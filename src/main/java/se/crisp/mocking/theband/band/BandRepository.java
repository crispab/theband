package se.crisp.mocking.theband.band;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BandRepository extends JpaRepository<BandEntity, String> {

}
