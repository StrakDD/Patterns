package structual.decorator;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class TeamLead extends DeveloperDecorator {
    public TeamLead(Developer developer) {
        super(developer);
    }

    public String makeAnalysis(){
        return "Team lead in deal.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeAnalysis();
    }
}
