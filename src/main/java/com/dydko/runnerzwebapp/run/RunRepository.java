package com.dydko.runnerzwebapp.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class RunRepository {

    private List<Run> runs = new ArrayList<>();

    List<Run> findAll() {
        return runs;
    }

    Optional<Run> findById(Integer id) {
        return runs
                .stream()
                .filter(run -> run.id().equals(id))
                .findFirst();
    }

    void create(Run run) {
        runs.add(run);
    }

    void update(Run run, Integer id) {
        Optional<Run> existingRun = findById(id);
        existingRun.ifPresent(value -> runs.set(runs.indexOf(value), run));
    }

    void delete(Integer id) {
        Optional<Run> existingRun = findById(id);
        existingRun.ifPresent(runs::remove);
    }

    @PostConstruct
    private void init() {
        runs.add(new Run(1, "First run", LocalDateTime.now(), LocalDateTime.now().plusHours(1), 3, Location.INDOOR));
        runs.add(new Run(2, "Second run", LocalDateTime.now(), LocalDateTime.now().plusHours(2), 5, Location.OUTDOOR));
    }
}
