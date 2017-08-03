package creational.builder;

/**
 * Created by Denis Starovoitenko on 02.08.2017.
 */
public class Director {
    WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }

    Website buildWebSite(){
        builder.createWebsite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();

        return builder.getWebsite();
    }
}
