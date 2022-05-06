package org.acme.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class FraseMotivacionalServiceTest {

    @Test
    void getFraseMotivacional() {
        FraseMotivacionalService fraseMotivacionalService = new FraseMotivacionalService();
        String fraseMotivacional = fraseMotivacionalService.getFraceMotivacional();
        assertNotNull(fraseMotivacional);
    }
}