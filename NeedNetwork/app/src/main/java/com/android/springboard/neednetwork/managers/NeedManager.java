package com.android.springboard.neednetwork.managers;

import android.content.Context;

import com.android.springboard.neednetwork.constants.Constants;
import com.android.springboard.neednetwork.models.Need;
import com.android.springboard.neednetwork.models.User;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Shouib on 9/24/2017.
 */

public class NeedManager {

    private Context mContext;

    public NeedManager(Context context) {
        mContext = context;
    }

    public void createNeed(Need need, Response.Listener<JSONObject> jsonObjectListener, Response.ErrorListener errorListener) {
        RequestQueue queue = Volley.newRequestQueue(mContext);
        Gson gson = new Gson();
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(gson.toJson(need));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.POST, Constants.REST_API_REGISTER_USER, jsonObject, jsonObjectListener, errorListener);

        queue.add(jsObjRequest);
    }

    public void updateNeed(Need need, Response.Listener<JSONObject> jsonObjectListener, Response.ErrorListener errorListener) {
        RequestQueue queue = Volley.newRequestQueue(mContext);
        Gson gson = new Gson();
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(gson.toJson(need));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.POST, Constants.REST_API_REGISTER_USER, jsonObject, jsonObjectListener, errorListener);

        queue.add(jsObjRequest);
    }

    public void deleteNeed(Need need, Response.Listener<JSONObject> jsonObjectListener, Response.ErrorListener errorListener) {
        RequestQueue queue = Volley.newRequestQueue(mContext);
        Gson gson = new Gson();
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(gson.toJson(need));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.POST, Constants.REST_API_REGISTER_USER, jsonObject, jsonObjectListener, errorListener);

        queue.add(jsObjRequest);
    }

    public void getCurrentNeeds(Response.Listener<JSONObject> jsonObjectListener, Response.ErrorListener errorListener) {
        RequestQueue queue = Volley.newRequestQueue(mContext);
        Gson gson = new Gson();
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(gson.toJson(null));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.POST, Constants.REST_API_REGISTER_USER, jsonObject, jsonObjectListener, errorListener);

        queue.add(jsObjRequest);
    }

    public void getMyNeeds(Response.Listener<JSONObject> jsonObjectListener, Response.ErrorListener errorListener) {
        RequestQueue queue = Volley.newRequestQueue(mContext);
        Gson gson = new Gson();
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(gson.toJson(null));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.POST, Constants.REST_API_REGISTER_USER, jsonObject, jsonObjectListener, errorListener);

        queue.add(jsObjRequest);
    }

    public void login(User user, Response.Listener<JSONObject> jsonObjectListener, Response.ErrorListener errorListener) {
        RequestQueue queue = Volley.newRequestQueue(mContext);
        Gson gson = new Gson();
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(gson.toJson(user));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.POST, Constants.REST_API_LOGIN_USER, jsonObject, jsonObjectListener, errorListener) {

            @Override
            public String getBodyContentType() {
                return "application/json";
            }
        };

        queue.add(jsObjRequest);
    }
}
