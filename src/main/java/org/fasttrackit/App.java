package org.fasttrackit;


public class App 
{
    public static void main( String[] args )
    {
        Car car = new Car ();
        car.name = "Dacia";
        car.color = "white";
        car.doorCount = 5;
        car.mileage = 7.5;
        car.running = true;

        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1500;

        car.engine = engine;

        car.engine.manufacturer = "BMW";

        car.engine.horsepower = 200.5;
        car.weight = 1200;

        double x = 1.25;
        // coeficient pentru calcului acceleratiei

        car.acceleration = ((car.engine.horsepower / car.weight)* x);
        // testare operatii matematice - nu reprezinta cu adevarat formula de calcul pentru acceleratie :)

        System.out.println("Acceleratia masinii este:" + car.acceleration);

    }
}
