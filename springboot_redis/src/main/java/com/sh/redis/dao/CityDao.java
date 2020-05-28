package com.sh.redis.dao;

/**
 * Created By Sunhu At 2020/5/28 10:06
 *
 * @author Sun
 */

import com.sh.redis.entity.City;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 城市 DAO 接口类
 *
 * Created by bysocket on 07/02/2017.
 */
@Repository
public interface CityDao {

    /**
     * 获取城市信息列表
     *
     * @return
     */
    List<City> findAllCity();

    /**
     * 根据城市 ID，获取城市信息
     *
     * @param id
     * @return
     */
    City findById(@Param("id") Long id);

    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(Long id);
}