package org.acme.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class FraseMotivacionalService {

    List<String> fraces = new ArrayList<>();

    private final String baseUrl = "https://www.pensador.com/frases_curtas/";

    Document document;

    private String randomFraceFromList() {

        int random = (int) (Math.random() * fraces.size());
        return fraces.get(random);
    }

    public String[] getFraces() {
        return fraces.toArray(new String[fraces.size()]);
    }

    public String getFraceMotivacional() {

        try {
            document = Jsoup.connect(baseUrl).get();

            Elements elements = document.getElementsByClass("frase");

            for (Element element : elements) {
                String text = element.wholeText();
                fraces.add(text);
            }

            return randomFraceFromList();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
