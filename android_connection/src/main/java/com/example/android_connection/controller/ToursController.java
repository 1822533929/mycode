package com.example.android_connection.controller;

import com.example.android_connection.Mapper.ToursMapper;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") //一级接口
public class ToursController {
    private JSONObject objectTrue = new JSONObject();
    private JSONObject objectFalse = new JSONObject();
    @Autowired
    ToursMapper toursMapper;

    public ToursController() throws JSONException {
        objectTrue.put("result", true);
        objectFalse.put("result", false);
    }


    @ResponseBody
    @RequestMapping("/getAll")
    public String getAll(){
        JSONObject object = new JSONObject();
        object.put("result", true);
        object.put("data", toursMapper.getAll());
        return object.toString();
    }


}
