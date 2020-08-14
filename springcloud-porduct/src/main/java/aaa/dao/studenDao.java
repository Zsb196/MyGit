package aaa.dao;

import aaa.entity.studen;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface studenDao{
    @Select("select * from studen")
    List<studen> listAll();

    @Delete("delete from studen where sid = #{sid}")
    int del(Integer sid);

    @Insert("insert into studen(sname,sex,address,cid) values(#{sname},#{sex},#{address},#{cid})")
    int add(studen studen);


}
