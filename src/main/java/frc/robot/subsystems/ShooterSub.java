// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSub extends SubsystemBase {
  TalonFX ShooterRightTalon;
  TalonFX ShooterLeftTalon;

  /** Creates a new ExampleSubsystem. */
  public ShooterSub(int leftID, int rightID) {
    ShooterRightTalon = new TalonFX(leftID);
    ShooterLeftTalon = new TalonFX(rightID);

    ShooterRightTalon.setNeutralMode(NeutralMode.Coast);
    ShooterLeftTalon.setNeutralMode(NeutralMode.Coast);

    ShooterLeftTalon.follow(ShooterRightTalon);
    ShooterRightTalon.setInverted(true);
  }

  public void move(double percentSpeed){
    ShooterRightTalon.set(TalonFXControlMode.PercentOutput, percentSpeed);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
