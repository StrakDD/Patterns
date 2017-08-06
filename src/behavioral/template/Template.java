package behavioral.template;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public abstract class Template {
    public void showPage(){
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    public abstract void showPageContent();
}
