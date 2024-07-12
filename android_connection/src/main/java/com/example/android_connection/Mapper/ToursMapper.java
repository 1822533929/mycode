package com.example.android_connection.Mapper;

import com.example.android_connection.Bean.tours;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("ToursMapper")
public interface ToursMapper {
    @Select("SELECT * FROM tours where tid = #{tid}")
    int getGoods(int tid);
    @Select("Select * from tours")
    List<tours> getAll();

}
