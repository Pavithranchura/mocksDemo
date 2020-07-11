package io.github.jhipster.sample.web.rest;

import io.github.jhipster.sample.JhipsterSampleApplicationApp;
import io.github.jhipster.sample.security.AuthoritiesConstants;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

@AutoConfigureMockMvc
@WithMockUser(authorities = AuthoritiesConstants.ADMIN)
@SpringBootTest(classes = JhipsterSampleApplicationApp.class)
public class WiremockExample {

    @Test
    public void testWiremock() {

    }
}
