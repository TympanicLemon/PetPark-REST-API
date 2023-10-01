package pet.park.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pet.park.entity.Amenity;

import java.util.Set;

public interface AmenityDao extends JpaRepository<Amenity, Long> {
  Set<Amenity> findAllByAmenityIn(Set<String> amenities);
}
