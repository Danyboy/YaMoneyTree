package ru.efnez.yamoneytree;

import android.app.DownloadManager;
import android.content.Context;
import android.view.View;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONObject;

/**
 * Created by danil on 13.08.15.
 */
public class LoadData {
    private Context context;

    // Instantiate the RequestQueue.
    RequestQueue queue = Volley.newRequestQueue(context);
    String url ="http://www.google.com";
    String result = "";

    public LoadData(Context context){
        this.context = context;
    }

////    void load(String url){
//        JsonObjectRequest jsObjRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
//
//    @Override
//    public void onResponse(JSONObject response) {
//        // TODO Auto-generated method stub
//        result = response.toString();
//    }, new Response.ErrorListener() {
//
//        @Override
//        public void onErrorResponse(VolleyError error) {
//            // TODO Auto-generated method stub
//        }
//    });
////        return "Load fail";
//
////    }
}