package com.hbh.dao;

import com.hbh.entity.Ckretire;
import com.hbh.entity.Sale;
import com.hbh.entity.SaleExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SaleMapper {
    int deleteByPrimaryKey(String saleid);

    int insert(Sale record);


    List<Sale> selectByExample(SaleExample example);

    Sale selectByPrimaryKey(String saleid);

    boolean updateByPrimaryKey(Sale record);
    
    List<Sale> getbyparams(@Param("proid") String proid,@Param("cusid")String cusid,@Param("pname")String pname,@Param("cusname")String cusname );

}