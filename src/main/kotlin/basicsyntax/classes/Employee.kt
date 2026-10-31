package org.example.basicsyntax.classes

import java.time.LocalDate
import java.time.Period
import java.util.stream.Stream

class Employee(
    val id: String,
    val name: String,
    val jobTitle: String,
    initialSalary: Double,
    val dateOfEmployment: LocalDate,
) {
    private val paychecks: MutableList<Paycheck> = mutableListOf()
    var salary = initialSalary
        private set

    fun setSalary(salary: Double) {
        if (this.salary <= 0) {
            throw IllegalArgumentException("Salary must be greater than zero!")
        }

        this.salary = salary
    }

    override fun toString(): String {
        return "Employee(id='$id', name='$name', jobTitle='$jobTitle', salary=$salary, dateOfEmployment=$dateOfEmployment)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Employee

        return id == other.id
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }

    fun getYearsOfService(): Int {
        return Period.between(dateOfEmployment, LocalDate.now()).years
    }

    fun addPaycheck(payday: LocalDate) {
        paychecks.add(Paycheck(payday, salary))
    }

    fun removePaycheck(paycheck: Paycheck) {
        paychecks.remove(paycheck)
    }

    fun iteratorPaycheck(): Iterator<Paycheck> {
        return paychecks.iterator()
    }

    fun paychecks(): Stream<Paycheck> {
        return paychecks.stream()
    }
}