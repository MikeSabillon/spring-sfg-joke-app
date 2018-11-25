package sabillon.springframework5.sfgjokeapp.serviceimpl;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;
import sabillon.springframework5.sfgjokeapp.service.JokeService;

/**
 * The type Joke service.
 */
@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    /**
     * Instantiates a new Joke service.
     */
    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return this.chuckNorrisQuotes.getRandomQuote();
    }
}
