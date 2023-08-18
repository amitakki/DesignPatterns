package com.designpatterns.structural.facade;

// Facade class
public class HomeTheaterFacade {
    private final DVDPlayer dvdPlayer;
    private final Projector projector;
    private final Screen screen;
    private final SoundSystem soundSystem;

    public HomeTheaterFacade() {
        dvdPlayer = new DVDPlayer();
        projector = new Projector();
        screen = new Screen();
        soundSystem = new SoundSystem();
    }

    void watchMovie() {
        screen.rollDown();
        projector.turnOn();
        dvdPlayer.turnOn();
        soundSystem.turnOn();
        System.out.println("Enjoy your movie!");
    }

    void endMovie() {
        dvdPlayer.turnOff();
        projector.turnOff();
        soundSystem.turnOff();
        screen.rollUp();
    }
}
