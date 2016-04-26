package statistics.matcher;

import javax.management.Query;

/**
 * Created by sami on 22.4.2016.
 */
public class QueryBuilder {
    private Matcher matcher;

    public QueryBuilder() {
    }

    public Matcher build() {
        return this.matcher;
    }

    public void playsIn(String value) {
        this.matcher = new And(new PlaysIn(value));

    }

    public void hasAtLeast(int value, String field) {
        this.matcher = new And(new HasAtLeast(value, field));
    }

    public void HasFewerThan(int value, String field) {
        this.matcher = new And(new HasFewerThan(value, field));
    }

    public void oneOf(Matcher... matchers) {
        for (Matcher matcher : matchers) {
            this.matcher = new Or(matcher);
        }
    }
}
