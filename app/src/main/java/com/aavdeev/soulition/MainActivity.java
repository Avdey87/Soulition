package com.aavdeev.soulition;

import android.app.Activity;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class MainActivity extends Activity {

    private String TAG = "MainActivity";
    private ListView listView;

    ArrayList<HashMap<String, String>> raketsList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        raketsList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.list);

        new GetRokets().execute();
    }

    private class GetRokets extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {
            Connect connect = new Connect();
            String url = "https://api.spacexdata.com/v2/launches?launch_year=2017";
            String jsonStr = connect.makeRaket(url);

            Log.e(TAG, "Response from url: " + jsonStr);
            if (jsonStr != null) {
                try {
                    JSONArray jsonArray = new JSONArray(jsonStr);
                    //JSONArray rakets = jsonArray.getJSONArray("rocket");

                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject r = jsonArray.getJSONObject(i);
                        String rocket_name=r.getJSONObject("rocket").getString("rocket_name");
                        String time =  r.getString("launch_date_local");
                        String mission = r.getJSONObject("links").getString("mission_patch");
                       String details = r.getString("details");

                        /*SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
                        String date = fmt.format(time);*/



                        HashMap<String, String> raket = new HashMap<>();

                        raket.put("rocket_name", rocket_name);
                        raket.put("launch_date_local", time);
                       raket.put("mission_patch", mission);
                        raket.put("details", details);

                        raketsList.add(raket);

                    }
                } catch (final JSONException e) {
                    Log.e(TAG, "Json parsing error: " + e.getMessage());
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplicationContext(),
                                    "Json parsing error: " + e.getMessage(),
                                    Toast.LENGTH_LONG).show();
                        }
                    });

                }
            }else {
                Log.e(TAG, "Couldn't get json from server.");
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(),
                                "Couldn't get json from server. Check LogCat for possible errors!",
                                Toast.LENGTH_LONG).show();
                    }
                });
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            ListAdapter adapter = new SimpleAdapter(MainActivity.this, raketsList,
                    R.layout.list_item, new String[]{ "rocket_name","launch_date_local","mission_patch","details"},
                    new int[]{R.id.raket_name, R.id.time, R.id.mission_path, R.id.details});
            listView.setAdapter(adapter);

    }


}

}
