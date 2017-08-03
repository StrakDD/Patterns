package creational.builder;

/**
 * Created by Denis Starovoitenko on 02.08.2017.
 */
public class EnterpriseCard extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Enterprise web site.");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.CMS2);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
