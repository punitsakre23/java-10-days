import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class URLService {

    String chars = "abcdef";
    Random random = new Random();
    List<String> urls = new ArrayList<>();

    public void fillURLs() {
        for (int i = 0; i < 100000; i++) {
            urls.add(generateURL());
        }
    }

    public String generateURL() {
        String sURL = "";
        StringBuilder sb = new StringBuilder();
        int index = 0;
        sb.setLength(0);

        for (int i = 0; i < 6; i++) {
            index = random.nextInt(chars.length());
            sb.append(chars.charAt(index));
        }

        sURL = sb.toString();

        return sURL;

    }

}
