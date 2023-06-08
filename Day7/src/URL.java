public class URL {

    public static void main(String[] args) {

        String oURL = "https://musicalmuse.netlify.app/";
        String sURL = "";

        URLService service = new URLService();

        service.fillURLs();

        do {
            sURL= service.generateURL();
            System.out.println("Created...");
        }
        while (service.urls.contains(sURL));

        System.out.println("https://musicalmuse/" + sURL);

    }

}
