package com.designpatterns.structural.facade;

//Client code
public class FacadeMain {
    public static void main(String[] args) {
        HomeTheaterFacade theaterFacade = new HomeTheaterFacade();

        // Watching a movie
        System.out.println("Getting ready to watch a movie...");
        theaterFacade.watchMovie();

        // Ending the movie
        System.out.println("\nMovie's over. Shutting down...");
        theaterFacade.endMovie();
    }
}
