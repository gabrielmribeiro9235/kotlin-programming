package org.example.basicsyntax.classes

import java.time.LocalDate

fun main() {
    val company: Company = Company()

    val john = Employee("01", "John", "Programmer", 2500.0, LocalDate.of(2024, 10, 20))
    john.addPaycheck(LocalDate.of(2026, 7, 1))
    john.addPaycheck(LocalDate.of(2026, 8, 1))
    john.addPaycheck(LocalDate.of(2026, 9, 1))

    val mary = Employee("02", "Mary", "Programmer", 3000.0, LocalDate.of(2022, 10, 20))
    mary.addPaycheck(LocalDate.of(2026, 6, 1))
    mary.addPaycheck(LocalDate.of(2026, 7, 1))
    mary.addPaycheck(LocalDate.of(2026, 8, 1))
    mary.addPaycheck(LocalDate.of(2026, 9, 1))

    company.hire(john)
    company.hire(mary)
    company.hire("03", "Anthony", "Marketing", LocalDate.of(2021, 10, 20), 4000.0)
    company.hire("04", "Joshua", "Trainee", LocalDate.of(2023, 9, 20), 1800.0)

    println("--------------------------------------------------------------------------------------------------------");
    println("Company employees:");
    company.getEmployees().forEach { println(it) }

    println("--------------------------------------------------------------------------------------------------------");
    company.fire("04");
    println("Joshua has been fired");

    println("--------------------------------------------------------------------------------------------------------");
    println("Company employees:");
    company.getEmployees().forEach { println(it) }

    println("--------------------------------------------------------------------------------------------------------")
    println("Company programmers:")
    company.getEmployees("Programmer").forEach { println(it) }

    println("--------------------------------------------------------------------------------------------------------")
    company.increaseSalary("01", 3500.0)
    println("John received a raise")
    println(company.getEmployees().first { it.id == "01" })

    println("--------------------------------------------------------------------------------------------------------")
    company.getEmployees().forEach { company.pay(it.id) }
    println("Company employees has received their payment of October")

    println("--------------------------------------------------------------------------------------------------------")
    println("Average salary of programmers: US$ ${String.format("%.2f", company.averageSalary("Programmer"))}")

    println("--------------------------------------------------------------------------------------------------------")
    println("Average company salary from 06/01/2026 to 09/30/2026: US$ ${String.format("%.2f", company.averageSalary(LocalDate.of(2026, 6, 1), LocalDate.of(2026, 9, 30)))}")

    println("--------------------------------------------------------------------------------------------------------")
    println("Average company salary (all-time): US$ ${String.format("%.2f", company.averageSalary(LocalDate.of(2026, 6, 1), LocalDate.now()))}")
}