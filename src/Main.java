import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
        bitrix_message();

        //Desktop d = Desktop.getDesktop();
        //d.browse(new URI("http://winnum-serv/Winnum/views/pages/app/dynamic/dgw.jsp?puuid=BD155D92-0D95-43F6-B646-2231238ABBC9&appid=winnum.org.app.WNApplicationInstance:17&mode=yes"));
        //Thread.sleep(5000);
        //d.browse(new URI("http://winnum-serv/Winnum/views/pages/app/dynamic/dgw.jsp?puuid=FAC33B71-108C-4751-916A-B32193888F82&appid=winnum.org.app.WNApplicationInstance:17&mode=yes"));

    }
    public static void bitrix_message() throws IOException{
        String message = "Сообщение пользователю с id655";
        URLConnection connection = new URL("https://sespel-auto.bitrix24.ru/rest/655/ooal36fc92j1qcrh/im.message.add.json?MESSAGE=" + message + "&DIALOG_ID=655/").openConnection();

        InputStream is = connection.getInputStream();
        InputStreamReader reader = new InputStreamReader(is);
        char[] buffer = new char[256];
        int rc;

        StringBuilder sb = new StringBuilder();

        while ((rc = reader.read(buffer)) != -1)
            sb.append(buffer, 0, rc);

        reader.close();

        System.out.println(sb);
    }
}