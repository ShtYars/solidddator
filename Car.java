
public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        //відповідає за керування автомобілем
        engine.start();
    }

    public void stop() {
        //відповідає за керування автомобілем
        engine.stop();
    }
}

