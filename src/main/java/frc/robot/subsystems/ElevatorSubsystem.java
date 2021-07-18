// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

/** Add your docs here. */
public class ElevatorSubsystem extends SubsystemBase {
  

  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public ElevatorSubsystem() {
    CommandScheduler.getInstance().registerSubsystem(this);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }

  public void elevatorDownCommand() {
    
  }
  
  public void elevatorUpCommand() {

  }
}
