package com.learnreactiveprogramming.service;

import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;

public class FluxAndMonoGeneratorServiceTest {

    FluxAndMonoGeneratorService fluxAndMonoGeneratorService =
        new FluxAndMonoGeneratorService();
    @Test
    void namesFlux() {
        //given

        //when
        var namesFlux = fluxAndMonoGeneratorService.namesFlux();

        //then
        StepVerifier.create(namesFlux)
            //.expectNext("alex", "ben","chloe")
            //.expectNextCount(3)
            .expectNext("alex")
            .expectNextCount(2)
            .verifyComplete();
    }

    @Test
    void nameMono() {
        //given

        //when
        var nameMono = fluxAndMonoGeneratorService.nameMono();

        //then
        StepVerifier.create(nameMono)
            .expectNext("alex")
            //.expectNextCount(1)
            .verifyComplete();
    }
}
