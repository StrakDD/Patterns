package behavioral.observer;

import java.util.List;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public interface Observer {
    void handleEvent(List<String> vacancies);
}
