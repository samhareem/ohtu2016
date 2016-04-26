package statistics.matcher;

import statistics.Player;

/**
 * Created by sami on 22.4.2016.
 */
public class Or implements Matcher {
    private Matcher[] matchers;

    public Or(Matcher... matchers) {
        this.matchers = matchers;
    }

    @Override
    public boolean matches(Player p) {
        for (Matcher matcher : matchers) {
            if (matcher.matches(p)) {
                return true;
            }
        }

        return false;
    }
}
