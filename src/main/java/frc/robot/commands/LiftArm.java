package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Arm;

public class LiftArm extends Command{
    private double speed;
    private Arm arm;

    public LiftArm(Arm arm, double speed){
        this.arm = arm;
        this.speed = speed;
        addRequirements(arm);
    }

    @Override
    public void execute(){
        arm.liftArm(speed);
    }

    @Override
    public void end(boolean a){
        arm.stop();
    }
}
