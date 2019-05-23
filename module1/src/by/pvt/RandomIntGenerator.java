package by.pvt;

/**
 *
 */
@FunctionalInterface
public interface RandomIntGenerator {

    Integer generate(int limit);

    default int getLimit() {
        return 100;
    }

}
