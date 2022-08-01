package ru.kosimov.KotlinTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kosimov.KotlinTest.dao.TestRepository;
import ru.kosimov.KotlinTest.entity.TestUnity;

import java.util.Optional;

@Service
public class TestServiceImpl implements TestService{

    private TestRepository repository;

    @Autowired
    public TestServiceImpl(TestRepository repository) {
        this.repository = repository;
    }


    @Override
    public void createTestUnity(TestUnity testUnity) {
        repository.save(testUnity);
    }

    @Override
    public Optional<TestUnity> readTestUnity(Long id) {
        return repository.findById(id);
    }

    @Override
    public void deleteTestUnity(Long id) {
        repository.deleteById(id);
    }

    @Override
    public TestUnity updateTestUnity(Long id, String name) {
        TestUnity testUnity = repository.findById(id).get();
        testUnity.setTestName(name);
        return repository.save(testUnity);
    }
}
