package com.nightshift.recipe.repositories;

import com.nightshift.recipe.domain.UnitOfMeasure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@ExtendWith(SpringExtension.class)
class UnitOfMeasureRepositoryIntegrationTest {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @BeforeEach
    void setup() {

    }

    // Entire Spring context is loaded for these tests
    @Test
    void findByDescription() {
        String uom = "Teaspoon";
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription(uom);

        assertEquals(uom, unitOfMeasure.get().getDescription());
    }

    // The second test will run inside the already started Spring Context
    @Test
    void findByDescriptionCup() {
        String uom = "Cup";
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription(uom);

        assertEquals(uom, unitOfMeasure.get().getDescription());
    }
}