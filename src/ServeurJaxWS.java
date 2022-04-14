import ws.BanqueService;

import javax.xml.ws.Endpoint;

public class ServeurJaxWS {

    public static void main(String[] args) {

        String url = "http://0.0.0.0:8686/";
        // la creation du serveur JaxWS qui déployé le web service (BanqueService)
        Endpoint.publish(url, new BanqueService());
        System.out.println("Web service déployé sur "+url);
    }
}
