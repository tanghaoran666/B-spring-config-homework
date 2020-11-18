package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(properties = {"levelNumber=0"})
@AutoConfigureMockMvc
class LevelController0Test {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void should_return_advanced_when_given_level_1() throws Exception {
        mockMvc.perform(get("/level")).andExpect(status().isOk())
                .andExpect(jsonPath("$", is("basic")));
    }
}