package ru.javawebinar.topjava.web.meal;

import org.junit.Test;
import org.springframework.http.MediaType;
import ru.javawebinar.topjava.TestUtil;
import ru.javawebinar.topjava.web.AbstractControllerTest;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static ru.javawebinar.topjava.MealTestData.MEAL1;
import static ru.javawebinar.topjava.MealTestData.MATCHER;

/**
 * Created by alximik on 30/01/16.
 */
public class UserMealRestControllerTest extends AbstractControllerTest {
    static final String REST_URL = "/rest/meals";

    @Test
    public void testGetAll() throws Exception {
        mockMvc.perform(get(REST_URL))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    public void testGet() throws Exception {
        mockMvc.perform(get(REST_URL + "/" + "100002"))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MATCHER.contentMatcher(MEAL1))
                .andDo(print());
    }

    @Test
    public void testGetNotFound() throws Exception {
        mockMvc.perform(get(REST_URL + "/" + "000"))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound())
                .andDo(print());
    }

    @Test
    public void testDelete() throws Exception {

    }

    @Test
    public void testUpdate() throws Exception {

    }

    @Test
    public void testCreateWithResponce() throws Exception {

    }

    @Test
    public void testGetBetween() throws Exception {


    }
}