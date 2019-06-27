package be.fgov.famhp.pharmastatus.extrar.repository;

import be.fgov.famhp.pharmastatus.extrar.domain.Authority;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {
}
