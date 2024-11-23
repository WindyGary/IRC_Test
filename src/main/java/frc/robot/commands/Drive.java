package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;

public class Drive extends Command{
    
private Drivetrain drivetrain;
private Joystick leftJoystick, rightJoystick;

    public Drive(Drivetrain drivetrain, Joystick lefJoystick, Joystick righJoystick){
        this.drivetrain = drivetrain;
        this.leftJoystick = lefJoystick;
        this.rightJoystick = righJoystick;
        addRequirements(drivetrain);
    }

    @Override
    public void execute(){
        drivetrain.drive(leftJoystick.getY(),rightJoystick.getY());
    }

    @Override
    public void end(boolean interrupted){
        drivetrain.stop();
    }

}
