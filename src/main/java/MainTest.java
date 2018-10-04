import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import deserializer.ArrayDeserializerDoubleAsIntFix;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainTest {
    public static void main(String[] args) {
        String items = "JSONArray Data .............";


        GsonBuilder gsonBuilder = new GsonBuilder().registerTypeAdapter(new TypeToken<List<HashMap<String, Object>>>() {}.getType(), new ArrayDeserializerDoubleAsIntFix());
        Gson gson = gsonBuilder.create();
        List<Map<String, Object>> list = gson.fromJson(items, new TypeToken<List<HashMap<String, Object>>>() {}.getType());
    }
}
