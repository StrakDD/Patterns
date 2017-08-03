package creational.builder;

/**
 * Created by Denis Starovoitenko on 02.08.2017.
 */
public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new VisitCard());
        Website website = director.buildWebSite();

        System.out.println(website);
    }
}
