package academy.learnprogramming;

public class StarWars extends Movie {

    public StarWars() {
        super("Star wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}
