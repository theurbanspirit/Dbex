package com.exampleDatabase.ExampleClass.Impl;

import com.exampleDatabase.ExampleClass.Model.Var;
import com.exampleDatabase.ExampleClass.repository.DataInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Types;
import java.util.List;

@Repository

public class DataImplementor implements DataInterface
{
    @Autowired
    JdbcTemplate templ;




    @Override
    public String getRecord( /*String name, String pass */) {
        String returnMsg="hii";
       /* String sql="select * from login_trader where name=?";
        Var v=templ.queryForObject(sql,new Object[]{name},new BeanPropertyRowMapper<>(Var.class));


       if(v==null||!v.getName().equals(name)||!v.getPassword().equals(pass)){
            returnMsg="Invalid user name or password";
        }else{
            returnMsg="success";
        }
*/
        return returnMsg;
    }



}
