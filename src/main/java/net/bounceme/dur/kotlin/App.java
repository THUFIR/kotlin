package net.bounceme.dur.kotlin;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    private static final Logger LOG = Logger.getLogger(App.class.getName());

    private void run() {
        LOG.info("running");

        int integer = 2;
        LOG.log(Level.INFO, "integer is\t\t{0}", integer);
        new demo.Foo();
        demo.ExampleKt.bar();
        integer = demo.ExampleKt.doubleUp(integer);
        LOG.log(Level.INFO, "integer is\t\t{0}", integer);
    }

    public static void main(String[] args) {
        new App().run();
    }
}
