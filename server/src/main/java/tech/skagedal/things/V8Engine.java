package tech.skagedal.things;

import javax.inject.Singleton;

@Singleton
public class V8Engine implements Engine {
    @Override
    public int getCylinders() {
        return 0;
    }

    @Override
    public String start() {
        return "Starting V8";
    }
}
