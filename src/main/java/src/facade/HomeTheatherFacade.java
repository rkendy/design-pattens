package src.facade;

import java.util.Scanner;

import src.facade.system.DvdPlayer;
import src.facade.system.Light;
import src.facade.system.PopcornMachine;
import src.facade.system.Projector;
import src.facade.system.Screen;

public class HomeTheatherFacade {

    Screen screen;
    DvdPlayer dvdPlayer;
    Projector projector;
    Light light;
    PopcornMachine popcornMachine;

    public HomeTheatherFacade() {
        screen = new Screen();
        dvdPlayer = new DvdPlayer();
        projector = new Projector();
        light = new Light();
        popcornMachine = new PopcornMachine();
    }

    public void watchMovie() {
        screen.down();
        popcornMachine.pop();
        light.off();
        projector.on();
        projector.dvdMode();
        dvdPlayer.on();
        dvdPlayer.play();
    }

    public void endMovie() {
        dvdPlayer.off();
        projector.off();
        light.on();
        screen.up();
    }
}