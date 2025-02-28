package task1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();

        
        for (int i = 0; i < numStudents; i++)
        {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            int grade = scanner.nextInt();
            grades.add(grade);
        }

        
        int highest = findHighest(grades);
        int lowest = findLowest(grades);
        double average = calculateAverage(grades);

        
        System.out.println("\n Grade Summary");
        System.out.println("Grades: " + grades);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.printf("Average Score: %.2f%n", average);

        scanner.close();
    }

    
    private static int findHighest(ArrayList<Integer> grades) 
    {
        int max = grades.get(0);
        for (int grade : grades) 
        {
            if (grade > max)
            {
                max = grade;
            }
        }
        return max;
    }

    
    private static int findLowest(ArrayList<Integer> grades) 
    {
        int min = grades.get(0);
        for (int grade : grades)
        {
            if (grade < min)
            {
                min = grade;
            }
        }
        return min;
    }

    
    private static double calculateAverage(ArrayList<Integer> grades)
    {
        int sum = 0;
        for (int grade : grades) 
        {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
}

