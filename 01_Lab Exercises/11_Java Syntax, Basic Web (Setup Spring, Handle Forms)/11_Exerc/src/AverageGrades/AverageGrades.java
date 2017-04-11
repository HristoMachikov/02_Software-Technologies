package AverageGrades;


import java.util.*;
import java.util.stream.Collectors;
import java.util.Comparator;

public class AverageGrades {
    public static void main (String[] args) {

        class Student {
            private String Name;

            private double[] ListOfGrade;

            private double AverageGrade;

            public double getAverageGrade() {
                return AverageGrade;
            }

            public void setAverageGrade(double averageGrade) {
                AverageGrade = averageGrade;
            }

            public Student(String name, double[] listOfGrade) {
                Name = name;
                ListOfGrade = listOfGrade;
            }

            public String getName() {
                return Name;
            }

            public void setName(String name) {
                Name = name;
            }

            public double[] getListOfGrade() {
                return ListOfGrade;
            }

            public void setListOfGrade(double[] listOfGrade) {
                ListOfGrade = listOfGrade;
            }
        }

        Scanner console = new Scanner(System.in);

        int numb = Integer.parseInt(console.nextLine());
        HashMap<String, Double> listOfStudents = new HashMap<String, Double>();
        Student[] student = new Student[numb];
        for (int i = 0; i < numb; i++)
        {
            String[] input = console.nextLine().split(" ");
            double[] ListOfGrade = new double[input.length - 1];
            Student inputStudent = new Student(input[0], ListOfGrade);

            for (int j = 0; j < input.length - 1; j++)
            {
                inputStudent.ListOfGrade[j] = Double.parseDouble(input[j + 1]);
            }

            double average = Arrays.stream(inputStudent.getListOfGrade()).sum()/inputStudent.getListOfGrade().length;
            double result = 0;
            for (double grade : inputStudent.getListOfGrade()){
                result += grade;
            }
            double averageResult = result/inputStudent.getListOfGrade().length;

            inputStudent.setAverageGrade(averageResult);

            student[i] = inputStudent;
        }

        //List<Student> allStudentsList = Arrays.asList(student);

        ArrayList<Student> allStudents = new ArrayList<Student>();
        for (Student stud: student) {
            if (stud.getAverageGrade() >= 5.00) {
                allStudents.add(stud);
            }
        }

//            Comparator<Student> ascName = new Comparator<Student>() {
//                @Override
//                public int compare(Student b1, Student b2) {
//                    return b1.getName().compareTo(b2.getName());
//                }
//            };
//
//            Comparator<Student> descAvGrade = new Comparator<Student>(){
//                @Override
//                public int compare(Student b1, Student b2){
//                    return Double.compare(b1.getAverageGrade(), b2.getAverageGrade());
//                }
//            };

            List<Student> sortedStudents = allStudents.stream().sorted((x, y) -> {
                int result = x.getName().compareTo(y.getName());
                if (result == 0){
                    return Double.compare(y.getAverageGrade(), x.getAverageGrade());
                }

                return result;
            })
                    //.filter((x) -> x.getAverageGrade() >= 5.00)
                    .collect(Collectors.toList());

        for (Student stud : sortedStudents)
        {
            System.out.printf("%s -> %.2f%n", stud.getName(), stud.getAverageGrade());
        }
    }
}