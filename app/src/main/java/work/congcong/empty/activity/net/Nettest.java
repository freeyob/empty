package work.congcong.empty.activity.net;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by cong on 16-12-22.
 */

public final class Nettest {
    public static String getTest() throws IOException{
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("http://baidu.com").build();
        Response response = client.newCall(request).execute();
        response.close();
        return response.body().string();
    }
}
