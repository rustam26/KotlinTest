package ru.kosimov.KotlinTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.kosimov.KotlinTest.entity.TestUnity;
import ru.kosimov.KotlinTest.service.TestService;

@RestController
public class MyRESTController {

    private TestService testService;

    @Autowired
    public MyRESTController(TestService testService) {
        this.testService = testService;
    }


    @GetMapping("/read/{id}")
    public TestUnity getTestUnity(@PathVariable Long id) {
        TestUnity testUnity = testService.readTestUnity(id).get();
        return testUnity;
    }

    @PostMapping("/create")
    public TestUnity create(@RequestBody TestUnity testUnity) {

        testService.createTestUnity(testUnity);
        return testUnity;

    }

    @PatchMapping("/update/{id}/{name}")
    public TestUnity  update(@PathVariable Long id, @PathVariable String name) {
        return testService.updateTestUnity(id,name);

    }


    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        testService.deleteTestUnity(id);
    }


}






