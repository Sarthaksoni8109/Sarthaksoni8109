 package com.mytodolist;
import java.util.ArrayList;
import java.util.Scanner;

    class App{
        private static ArrayList<String> toDoList = new ArrayList<>();

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            while (running) {
                System.out.println("To-Do List Application");
                System.out.println("1. Add a task");
                System.out.println("2. View tasks");
                System.out.println("3. Remove a task");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        addTask(scanner);
                        break;
                    case 2:
                        viewTasks();
                        break;
                    case 3:
                        removeTask(scanner);
                        break;
                    case 4:
                        running = false;
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose again.");
                }
            }

            scanner.close();
        }

        private static void addTask(Scanner scanner) {
            System.out.print("Enter a task: ");
            String task = scanner.nextLine();
            toDoList.add(task);
            System.out.println("Task added.");
        }

        private static void viewTasks() {
            System.out.println("To-Do List:");
            for (int i = 0; i < toDoList.size(); i++) {
                System.out.println((i + 1) + ". " + toDoList.get(i));
            }
        }

        private static void removeTask(Scanner scanner) {
            System.out.print("Enter the task number to remove: ");
            int taskNumber = scanner.nextInt();
            if (taskNumber > 0 && taskNumber <= toDoList.size()) {
                toDoList.remove(taskNumber - 1);
                System.out.println("Task removed.");
            } else {
                System.out.println("Invalid task number.");
            }
        }
    }


