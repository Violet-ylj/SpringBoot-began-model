package com.ylj.beganmodel.demos.dao;

import com.ylj.beganmodel.demos.Entity.People;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author:Violet
 * @Description:
 * @Data:2024/5/16 21:53
 **/

@Mapper
public interface PeopleDao {

    People searchPeople(Integer id);
}
