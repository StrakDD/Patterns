package behavioral.template;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Template template = new WellcomePage();
        Template template1 = new NewsPage();

        template.showPageContent();
        template1.showPageContent();
    }
}
