package org.yiva.zbxj.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository(value = "testDao")
public interface TestDao {

    int validDB();
}
