package pl.comarch.szkolenia.funkcyjny;

import java.util.function.UnaryOperator;

public class JakiasKlasaAnonimowa implements UnaryOperator<String> {
    @Override
    public String apply(String s) {
        return (s.length() + 5) + "";
    }
}
