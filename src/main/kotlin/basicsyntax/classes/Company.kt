package org.example.basicsyntax.classes

import java.time.LocalDate
import kotlin.streams.asSequence

class Company {
    private val employees = mutableMapOf<String, Employee>()

    fun hire(id: String, name: String, jobTitle: String, dateOfEmployment: LocalDate, salary: Double) {
        employees[id] = Employee(id, name, jobTitle, salary, dateOfEmployment)
    }

    fun hire(employee: Employee) {
        employees[employee.id] = employee
    }

    fun fire(id: String) {
        employees.remove(id)
    }

    fun getEmployees(): List<Employee> {
        return employees.values.toList()
    }

    fun getEmployees(jobTitle: String): List<Employee> {
        return employees.values.filter { it.jobTitle == jobTitle }.toList()
    }

    fun pay(id: String) {
        val employee = employees.getValue(id)

        employee.addPaycheck(LocalDate.now())
    }

    fun increaseSalary(id: String, newSalary: Double) {
        val employee = employees.getValue(id)

        employee.setSalary(newSalary)
    }

    fun averageSalary(jobTitle: String): Double {
        return employees.values
            .filter { it.jobTitle == jobTitle }
            .flatMap { it.paychecks() }
            .map { it.salary }
            .average()
            .takeIf { !it.isNaN() } ?: 0.0
    }

    fun averageSalary(start: LocalDate, end: LocalDate): Double {
        return employees.values
            .flatMap { it.paychecks() }
            .filter { it.payday in start..end }
            .map { it.salary }
            .average()
            .takeIf { !it.isNaN() } ?: 0.0
    }
}