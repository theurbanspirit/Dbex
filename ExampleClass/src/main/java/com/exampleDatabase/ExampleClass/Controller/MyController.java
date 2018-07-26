package com.exampleDatabase.ExampleClass.Controller;

import com.exampleDatabase.ExampleClass.Impl.DataImplementor;
import com.exampleDatabase.ExampleClass.Model.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    DataImplementor dataImplementor;


    @RequestMapping(value = "/getsingledata")   // {name}/{pass}")
    public String getSingleData( /* @PathVariable String name,@PathVariable String pass */ ) {

        return dataImplementor.getRecord();
    }


}