package sabillon.springframework5.sfgjokeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sabillon.springframework5.sfgjokeapp.service.JokeService;

/**
 * The type Joke controller.
 */
@Controller
public class JokeController {

    private JokeService jokeService;

    /**
     * Instantiates a new Joke controller.
     *
     * @param jokeService the joke service
     */
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    /**
     * Show joke string.
     *
     * @param model the model
     * @return the string
     */
    @RequestMapping({"/", ""})
    public String showJoke(Model model) {
        model.addAttribute("joke",this.jokeService.getJoke());
        return "chucknorris";
    }
}
