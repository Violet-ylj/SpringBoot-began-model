package com.ylj.beganmodel.demos.controller;

import com.ylj.beganmodel.demos.Entity.People;
import com.ylj.beganmodel.demos.Entity.Response;
import com.ylj.beganmodel.demos.Entity.Result;
import com.ylj.beganmodel.demos.dao.PeopleDao;
import com.ylj.beganmodel.demos.dao.redis.IRedisService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:Violet
 * @Description:
 * @Data:2024/5/16 21:51
 **/

@Data
@RequestMapping("/admin/began")
@RestController
public class began {

    @Autowired
    PeopleDao peopleDao;

    @Autowired
    private IRedisService redisService;


    @GetMapping("/get/{id}")
    Result<People> began(@PathVariable Integer id){
        People people1 =peopleDao.searchPeople(id);
        redisService.setValue("tryfirst", 1);
        return Result.success(people1);
    }

}
