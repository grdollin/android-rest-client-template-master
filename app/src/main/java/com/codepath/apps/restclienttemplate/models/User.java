package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by brh on 2/25/2018.
 */

public class User {

    //list the attributes
    public String name;
    public  long uid;
    public String sreenName;
    public  String profileImageUrl;

    //deserialize the JSON
    public static User fromJSON(JSONObject json) throws JSONException{
        User user=new User();

        //extact and fill values
        user.name=json.getString("name");
        user.uid=json.getLong("id");
        user.sreenName=json.getString("sreen_name");
        user.profileImageUrl=json.getString("profile_image_url");
        return user;

    }
}
