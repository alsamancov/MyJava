package OracleTutorial.Lesson001;

/**
 * Created by Саманцов on 30.05.2015.
 */
public interface Bicycle {

    //wheel revolutions per minute
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}
