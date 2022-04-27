package software.sigma;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "What A Wonderful World";
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization!");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction!");
    }
}