package ru.javawebinar.topjava.web.meal;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import ru.javawebinar.topjava.model.UserMeal;
import ru.javawebinar.topjava.to.UserMealWithExceed;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 * GKislin
 * 06.03.2015.
 */
@RestController
@RequestMapping(value = UserMealRestController.REST_URL)
public class UserMealRestController extends AbstractUserMealController {
    static final String REST_URL = "/rest/meals";

    @Override
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserMealWithExceed> getAll() {
        return super.getAll();
    }

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserMeal get(@PathVariable int id) {
        return super.get(id);
    }

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id) {
        super.delete(id);
    }

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody UserMeal meal, @PathVariable int id) {
        super.update(meal,meal.getId());
    }


    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserMeal> createWithResponce(@RequestBody UserMeal meal) {
        UserMeal userMeal = super.create(meal);
        URI uriOfNewResource = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path(REST_URL + "/{id}")
                .buildAndExpand(userMeal.getId()).toUri();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setLocation(uriOfNewResource);
        return new ResponseEntity<>(userMeal, httpHeaders, HttpStatus.CREATED);
    }

    @Override
    @RequestMapping(value = "/between", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserMealWithExceed> getBetween(@DateTimeFormat LocalDate startDate,
                                               @DateTimeFormat LocalTime startTime,
                                               @DateTimeFormat LocalDate endDate,
                                               @DateTimeFormat LocalTime endTime) {
        return super.getBetween(startDate, startTime, endDate, endTime);
    }
}