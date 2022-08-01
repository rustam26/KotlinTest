package ru.kosimov.KotlinTest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kosimov.KotlinTest.entity.TestUnity;

import java.util.Optional;

@Repository
public interface TestRepository extends JpaRepository<TestUnity, Long> {

    Optional<TestUnity> findById(Long id);

    void deleteById(Long id);

}
