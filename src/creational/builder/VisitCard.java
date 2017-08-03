package creational.builder;

/**
 * Created by Denis Starovoitenko on 02.08.2017.
 */
public class VisitCard extends WebsiteBuilder{

    @Override
    void buildName() {
        website.setName("Visit card");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.CMS1);
    }

    @Override
    void buildPrice() {
        website.setPrice(7000);
    }
}
