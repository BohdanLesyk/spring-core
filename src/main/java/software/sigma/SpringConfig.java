package software.sigma;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("software.sigma")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean MusicPlayer musicPlayer() {
        return new MusicPlayer(classicalMusic(), rockMusic(), jazzMusic());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
