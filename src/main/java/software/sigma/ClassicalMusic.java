package software.sigma;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    private ClassicalMusic() { }

    public static ClassicalMusic getInstance() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void doMyInit() {
        System.out.println("Doing my initialization!");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction!");
    }
}
