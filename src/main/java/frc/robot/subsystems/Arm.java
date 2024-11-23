package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Arm extends SubsystemBase{
    
    private VictorSP ArmMotor;

    public Arm(){
        ArmMotor = new VictorSP(2);
    }

    public void liftArm(double speed){
        ArmMotor.set(speed);
    }

    public void stop(){
        ArmMotor.stopMotor();
    }


}
