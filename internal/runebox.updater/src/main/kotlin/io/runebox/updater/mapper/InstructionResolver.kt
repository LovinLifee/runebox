package io.runebox.updater.mapper

import io.runebox.updater.asm.Class2
import io.runebox.updater.asm.Field2
import io.runebox.updater.asm.Instruction2
import io.runebox.updater.asm.Method2

interface InstructionResolver<T> {

    fun resolve(instruction: Instruction2): T

    interface Class : InstructionResolver<Class2> {
        override fun resolve(instruction: Instruction2): Class2 {
            return instruction.jar[instruction.classId]
        }
    }

    interface Field : InstructionResolver<Field2> {
        override fun resolve(instruction: Instruction2): Field2 {
            return instruction.jar[instruction.fieldId]
        }
    }

    interface Method : InstructionResolver<Method2> {
        override fun resolve(instruction: Instruction2): Method2 {
            return instruction.jar[instruction.methodId]
        }
    }
}