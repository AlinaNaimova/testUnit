package seminar5.task4;

/*
В данном коде проводится интеграционное тестирование класса School. Создаются объекты учебного заведения,
преподавателя и студентов, добавляются в учебное заведение, а затем проводятся проверки на наличие
преподавателя и студентов в учебном заведении. Также добавляется ещё один студент и проверяется его наличие
в учебном заведении.
*/

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SchoolIntegrationTest {

    @Test
    public void testSchoolIntegration() {
        // Задание:
        // 1. Создайте учебное заведение (School).
        School school = new School();

        // Создание преподавателя и студентов
        Person teacher = new Person("Леонид", true);
        Person student1 = new Person("Роман", false);
        Person student2 = new Person("Сергей", false);
        Person student3 = new Person("Алина", false);
        Person student4 = new Person("Максим", false);
        Person student5 = new Person("Александр", false);
        Person student6 = new Person("Олег", false);
        Person student7 = new Person("Инна", false);

        // 2. Добавьте преподавателя (Леонид) и студентов (Роман, Сергей, Алина, Максим, Александр, Олег, Инна) в учебное заведение.
        school.addPerson(teacher);
        school.addPerson(student1);
        school.addPerson(student2);
        school.addPerson(student3);
        school.addPerson(student4);
        school.addPerson(student5);
        school.addPerson(student6);
        school.addPerson(student7);

        // 3. Проверьте, что Леонид является преподавателем в учебном заведении.
        assertTrue(school.isTeacherInSchool("Леонид"));


        // 4. Проверьте, что Роман является студентом в учебном заведении.
        assertTrue(school.isStudentInSchool("Роман"));

        // 5. Попробуйте добавить ещё одного студента и убедитесь, что он также является студентом в учебном заведении.
        Person student8 = new Person("Дмитрий", false);
        school.addPerson(student8);
        assertTrue(school.isStudentInSchool("Дмитрий"));

        // Подсказка: Используйте методы addPerson, isTeacherInSchool и isStudentInSchool из класса School.
        // Проверьте, что результаты соответствуют ожиданиям.

    }
}