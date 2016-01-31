package ru.javawebinar.topjava.web.meal;

import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;
import ru.javawebinar.topjava.web.AbstractControllerTest;


import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


/**
 * Created by alximik on 24/01/16.
 */
@Transactional

public class JspUserMealControllerTest extends AbstractControllerTest {

    @Test
    public void testMealList() throws Exception {
        mockMvc.perform(get("/meals"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("mealList"))
                .andExpect(forwardedUrl("/WEB-INF/jsp/mealList.jsp"))
                .andExpect(model().attribute("mealList", hasSize(6)));
    }

}