package ru.kosimov.KotlinTest.service;


import ru.kosimov.KotlinTest.entity.TestUnity;

import java.util.List;
import java.util.Optional;

public interface TestService {

     void createTestUnity(TestUnity testUnity);

     Optional<TestUnity> readTestUnity (Long id);

     void deleteTestUnity(Long id);

     TestUnity updateTestUnity(Long id, String name);


}
