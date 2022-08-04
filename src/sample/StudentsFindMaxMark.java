package sample;

public class StudentsFindMaxMark {

    public static void main(String[] args) {
        String[][] arrayStudents = {
                {"Иванов", "Иван", "10"},
                {"Петров", "Петр", "15"},
                {"Сидоров", "Сидр", "2"},
                {"Дроздов", "Андрей", "25"},
                {"Kузькин", "Кузьма", "25"}
        };

        StudentsFindMaxMark studentsFindMaxMark = new StudentsFindMaxMark();

        studentsFindMaxMark.showArray(arrayStudents);
        int maxMarkOfStudent = studentsFindMaxMark.findMaxMark(arrayStudents);
        System.out.println("Студунты с максимальной оценкой:");
        studentsFindMaxMark.showStudentWithMaxMark(maxMarkOfStudent, arrayStudents);
    }

    public void showStudentWithMaxMark(int maxMarkStudent, String[][] arrayStudents) {
        for (int line = 0; line < arrayStudents.length; line++) {
            for (int column = 0; column < arrayStudents[line].length; column++) {
                if (column == arrayStudents[line].length - 1) {
                    int currentMarkOfStudent = Integer.parseInt(arrayStudents[line][column]);
                    if (currentMarkOfStudent == maxMarkStudent) {
                        for (int i = 0; i < arrayStudents[line].length; i++) {
                            System.out.print(arrayStudents[line][i] + " ");
                        }
                        System.out.println();
                    }
                }
            }
        }
    }

    public int findMaxMark(String[][] arrayStudents) {
        int maxMarkStudent = 0;
        for (int line = 0; line < arrayStudents.length; line++) {
            for (int column = 0; column < arrayStudents[line].length; column++) {
                if (column == arrayStudents[line].length - 1) {
                    int currentMarkOfStudent = Integer.parseInt(arrayStudents[line][column]);
                    if (currentMarkOfStudent > maxMarkStudent) {
                        maxMarkStudent = currentMarkOfStudent;
                    }
                }
            }
        }
        return maxMarkStudent;
    }

    public void showArray(String[][] array) {
        for (int line = 0; line < array.length; line++) {
            for (int column = 0; column < array[line].length; column++) {
                System.out.print(array[line][column] + " ");
            }
            System.out.println();
        }
    }
}
