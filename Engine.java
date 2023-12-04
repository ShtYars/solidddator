
public interface Engine {
    void start();

    void stop();

    void increasePower();

    //Розділення інтерфейсу на менші частини
    void startElectric();

    void stopElectric();
}
