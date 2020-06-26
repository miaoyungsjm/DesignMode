package com.example.c11_command.demo1.invoker;

import com.example.c11_command.demo1.command.FallCommand;
import com.example.c11_command.demo1.command.LeftCommand;
import com.example.c11_command.demo1.command.RightCommand;
import com.example.c11_command.demo1.command.TransformCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ggz
 * @date 2020/6/26
 */
public class Buttons {
    private final int U_LOG_OPERATION_LEFT = 0;
    private final int U_LOG_OPERATION_RIGHT = 1;
    private final int U_LOG_OPERATION_FALL = 2;
    private final int U_LOG_OPERATION_TRANSFORM = 3;

    private LeftCommand leftCommand;
    private RightCommand rightCommand;
    private FallCommand fallCommand;
    private TransformCommand transformCommand;

    /**
     * 记录操作日志，添加回看功能
     */
    private List<Integer> mOperationLog = new ArrayList<>();

    public Buttons(LeftCommand leftCommand, RightCommand rightCommand,
                   FallCommand fallCommand, TransformCommand transformCommand) {
        this.leftCommand = leftCommand;
        this.rightCommand = rightCommand;
        this.fallCommand = fallCommand;
        this.transformCommand = transformCommand;
    }

    public void toLeft() {
        leftCommand.execute();
        mOperationLog.add(U_LOG_OPERATION_LEFT);
    }

    public void toRight() {
        rightCommand.execute();
        mOperationLog.add(U_LOG_OPERATION_RIGHT);
    }

    public void fall() {
        fallCommand.execute();
        mOperationLog.add(U_LOG_OPERATION_FALL);
    }

    public void transform() {
        transformCommand.execute();
        mOperationLog.add(U_LOG_OPERATION_TRANSFORM);
    }

    public void setLeftCommand(LeftCommand leftCommand) {
        this.leftCommand = leftCommand;
    }

    public void setRightCommand(RightCommand rightCommand) {
        this.rightCommand = rightCommand;
    }

    public void setFallCommand(FallCommand fallCommand) {
        this.fallCommand = fallCommand;
    }

    public void setTransformCommand(TransformCommand transformCommand) {
        this.transformCommand = transformCommand;
    }
}
