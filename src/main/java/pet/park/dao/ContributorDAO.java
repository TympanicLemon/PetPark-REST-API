package pet.park.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import pet.park.entity.Contributor;

public interface ContributorDAO extends JpaRepository<Contributor, Long> {
}
