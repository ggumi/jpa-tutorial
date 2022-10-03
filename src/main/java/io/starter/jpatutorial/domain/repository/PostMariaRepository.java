package io.starter.jpatutorial.domain.repository;

import io.starter.jpatutorial.domain.jpo.PostJpo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostMariaRepository extends JpaRepository<PostJpo, Long> {


}
