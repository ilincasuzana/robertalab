package de.fhg.iais.roberta.components.turtlebot;

import de.fhg.iais.roberta.components.Configuration;

public class TurtlebotConfiguration extends Configuration {

    public TurtlebotConfiguration() {
        super(null, null, 0, 0);
    }

    /**
     * This class is a builder of {@link Configuration}
     */
    public static class Builder extends Configuration.Builder<Builder> {

        @Override
        public Configuration build() {
            return new TurtlebotConfiguration();
        }

        @Override
        public String toString() {
            return "Builder []";
        }

    }

}
