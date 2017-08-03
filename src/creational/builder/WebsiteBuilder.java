package creational.builder;

/**
 * Created by Denis Starovoitenko on 02.08.2017.
 */
public abstract class WebsiteBuilder {
    Website website;

    void createWebsite(){
        website = new Website();
    }

    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();

    Website getWebsite(){
        return website;
    }
}
