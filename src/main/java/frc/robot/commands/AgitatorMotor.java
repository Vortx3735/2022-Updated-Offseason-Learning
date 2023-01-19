// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.subsystems.AgitatorSub;



/** An example command that uses an example subsystem. */
public class AgitatorMotor extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final AgitatorSub index;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public AgitatorMotor(AgitatorSub inputIndex) {
    index = inputIndex;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(index);
  }

  public void startMotor() {
    index.move(1);
  }



  public void stopMotor() {
    index.move(0);
  }
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (Robot.con1.square.getAsBoolean()) {
      startMotor();
    } else {
      stopMotor();
    }
  }


  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
