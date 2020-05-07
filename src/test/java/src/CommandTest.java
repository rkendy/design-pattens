package src;

import src.command.Command;
import src.command.MacroCommand;
import src.command.RemoteControll;
import src.command.SimpleRemoteControl;
import src.command.concretecommand.CeilingFanHighCommand;
import src.command.concretecommand.CeilingFanLowCommand;
import src.command.concretecommand.CeilingFanMediumCommand;
import src.command.concretecommand.CeilingFanOffCommand;
import src.command.concretecommand.GarageDoorCloseCommand;
import src.command.concretecommand.GarageDoorOpenCommand;
import src.command.concretecommand.LightOffCommand;
import src.command.concretecommand.LightOnCommand;
import src.command.concretecommand.StereoOffWithCDCommand;
import src.command.concretecommand.StereoOnWithCDCommand;
import src.command.receptor.CeilingFan;
import src.command.receptor.GarageDoor;
import src.command.receptor.Light;
import src.command.receptor.Stereo;

/**
 * CommandTest
 */
public class CommandTest {

    public static void main(String[] args) {
        new CommandTest().simpleRemoteControlTest();
        new CommandTest().remoteControlTest();
        new CommandTest().ceilingFanRemoteControlTest();
        new CommandTest().macroCommandTest();
    }

    void simpleRemoteControlTest() {
        System.out.println("===== Simple Remote Control Test =====");
        Light livingRoomLight = new Light("Living Room");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);

        SimpleRemoteControl simpleRemote = new SimpleRemoteControl();
        simpleRemote.setCommand(livingRoomLightOn);
        simpleRemote.buttonWasPressed();
    }

    void remoteControlTest() {
        System.out.println("===== Remote Control Test =====");
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo();
        GarageDoor garageDoor = new GarageDoor();

        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        StereoOffWithCDCommand stereoOff = new StereoOffWithCDCommand(stereo);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        RemoteControll remoteControl = new RemoteControll();
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, stereoOn, stereoOff);
        remoteControl.setCommand(3, garageDoorOpen, garageDoorClose);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        remoteControl.undoButtonWasPushed();
    }

    void ceilingFanRemoteControlTest() {
        System.out.println("===== Ceiling Fan Remote Control Test =====");
        CeilingFan fan = new CeilingFan("Living Room");

        CeilingFanHighCommand highCommand = new CeilingFanHighCommand(fan);
        CeilingFanMediumCommand mediumCommand = new CeilingFanMediumCommand(fan);
        CeilingFanLowCommand lowCommand = new CeilingFanLowCommand(fan);
        CeilingFanOffCommand offCommand = new CeilingFanOffCommand(fan);

        RemoteControll remoteControl = new RemoteControll();
        remoteControl.setCommand(0, highCommand, offCommand);
        remoteControl.setCommand(1, mediumCommand, offCommand);
        remoteControl.setCommand(2, lowCommand, offCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();
    }

    void macroCommandTest() {
        System.out.println("===== Macro Command Test =====");
        Light livingRoomLight = new Light("Living Room");
        Stereo stereo = new Stereo();
        GarageDoor garageDoor = new GarageDoor();
        CeilingFan fan = new CeilingFan("Living Room");

        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        StereoOffWithCDCommand stereoOff = new StereoOffWithCDCommand(stereo);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(fan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(fan);

        Command[] partyOn = { livingRoomLightOn, stereoOn, garageDoorOpen, ceilingFanHigh };
        Command[] partyOff = { livingRoomLightOff, stereoOff, garageDoorClose, ceilingFanOff };
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        RemoteControll remoteControl = new RemoteControll();
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
    }

}