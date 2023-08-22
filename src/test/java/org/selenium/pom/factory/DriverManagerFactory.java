package org.selenium.pom.factory;

import org.selenium.pom.constants.DriverType;

public class DriverManagerFactory {

    public static DriverManager getManager(DriverType driverType) {
        switch (driverType) {
            case CHROME -> {
                return new ChromeDrivenManger();
            }
            case FIREFOX -> {
                return new FirefoxManager();
            }
            default -> throw new IllegalStateException("No such name of driver: " + driverType);
        }
    }

}
