package software.sigma;

import org.springframework.stereotype.Component;

//@Component("rockMusicBean") OR
@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "The Wind Cries Mary";
    }
}
