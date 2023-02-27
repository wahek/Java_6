import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> laptopList = new ArrayList<>();
        ArrayList<Object> laptopSelection = new ArrayList<>();
        laptopList = createLaptopList();
        System.out.println(laptopList);
        Laptop laptopSearch = new Laptop();
        while (true) {
            System.out.println("Приветствуем в нашем магазине электроники\n" +
                    "Выбери интерисующие тебя товары\n" +
                    "1: Ноутбуки\n" +
                    "2: Компьютеры\n" +
                    "0: Выход");
            Scanner scanner = new Scanner(System.in);
            int choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("Выберете интерисующий пункт:\n" +
                            "1: Показать весь список ноутбуков:\n" +
                            "2: Добавить фильтр\n" +
                            "3: Показать списпок фильтров\n" +
                            "4: Вывести спискок ноутбуков подходящих по фильтрам\n" +
                            "0: Выход:");
                    int input = scanner.nextInt();
                    switch (input) {
                        case 1:
                            System.out.println(laptopList);
                            continue;
                        case 2:
                            System.out.println("Выбирете фильтр:\n" +
                                    "1: Цвет\n" +
                                    "2: Процессор\n" +
                                    "3: Объём оперативной памяти\n" +
                                    "4: Объём жёсткого диска\n" +
                                    "5: Операционная система");
                            int input1 = scanner.nextInt();
                            switch (input1) {
                                case 3:
                                    System.out.println("Выбирете:\n" +
                                            "1: 4 гб\n" +
                                            "2: 8 гб\n" +
                                            "3: 16 гб\n" +
                                            "4: 32 гб");
                                    int input2 = scanner.nextInt();
                                    switch (input2) {
                                        case 1:
                                            laptopSearch.dram = "4 гб";
                                            continue;
                                        case 2:
                                            laptopSearch.dram = "8 гб";
                                            continue;
                                        case 3:
                                            laptopSearch.dram = "16 гб";
                                            continue;
                                        case 4:
                                            laptopSearch.dram = "32 гб";
                                            continue;
                                    }
                                case 1:
                                    System.out.println("Выбирете:\n" +
                                            "1: Белый\n" +
                                            "2: Серый\n" +
                                            "3: Чёрный");
                                    int input3 = scanner.nextInt();
                                    switch (input3) {
                                        case 1:
                                            laptopSearch.color = "Белый";
                                            continue;
                                        case 2:
                                            laptopSearch.color = "Серый";
                                            continue;
                                        case 3:
                                            laptopSearch.color = "Чёрный";
                                            continue;
                                    }
                                case 2:
                                    System.out.println("Выбирете:\n" +
                                            "1: intel 3\n" +
                                            "2: intel 5\n" +
                                            "3: intel 7\n" +
                                            "4: Ryzen 3\n" +
                                            "5: Ryzen 5\n" +
                                            "6: Ryzen 7");
                                    int input4 = scanner.nextInt();
                                    switch (input4) {
                                        case 1:
                                            laptopSearch.cpu = "intel 3";
                                            continue;
                                        case 2:
                                            laptopSearch.cpu = "intel 5";
                                            continue;
                                        case 3:
                                            laptopSearch.cpu = "intel 7";
                                            continue;
                                        case 4:
                                            laptopSearch.cpu = "Ryzen 3";
                                            continue;
                                        case 5:
                                            laptopSearch.cpu = "Ryzen 5";
                                            continue;
                                        case 6:
                                            laptopSearch.cpu = "Ryzen 7";
                                            continue;
                                    }
                                case 4:
                                    System.out.println("Выбирете:\n" +
                                            "1: 256 гб\n" +
                                            "2: 512 гб\n" +
                                            "3: 1 тб\n" +
                                            "4: 2 тб");

                                    int input5 = scanner.nextInt();
                                    switch (input5) {
                                        case 1:
                                            laptopSearch.memory = "256 гб";
                                            continue;
                                        case 2:
                                            laptopSearch.memory = "512 гб";
                                            continue;
                                        case 3:
                                            laptopSearch.memory = "1 тб";
                                            continue;
                                        case 4:
                                            laptopSearch.memory = "2 тб";
                                            continue;
                                    }
                                case 5:
                                    System.out.println("Выбирете:\n" +
                                            "1: Windows\n" +
                                            "2: Linux\n" +
                                            "3: macOS\n");
                                    int input6 = scanner.nextInt();
                                    switch (input6) {
                                        case 1:
                                            laptopSearch.operationSystem = "Windows";
                                            continue;
                                        case 2:
                                            laptopSearch.operationSystem = "Linux";
                                            continue;
                                        case 3:
                                            laptopSearch.operationSystem = "macOS";
                                            continue;
                                    }
                            }
                        case 3:
                            System.out.println(laptopSearch);
                            continue;
                        case 4:
                            if (laptopSelection.size() == 0){
                                for (int i = 0; i < laptopList.size(); i++) {
                                    System.out.println(laptopSelection.equals(laptopList.get(i)));
                                }
                            }else laptopSelection.clear();
                            continue;
                        case 0:
                            System.out.println("Пока пока");
                            return;

                    }
                case 2:
                    System.out.println("Компьютеры скоро появятся. Данный блок в разработке");
                case 0:
                    System.out.println("До встречи");
                    return;
            }
        }
    }

    public static ArrayList createLaptopList() {
        int countLaptop = 20;
        ArrayList<Object> arrayList = new ArrayList<>();
        for (int i = 0; i < countLaptop; i++) {
            Laptop laptop = new Laptop();
            laptop.setColor(createColor());
            laptop.setCpu(createCPU());
            laptop.setDram(createDRAM());
            laptop.setMemory(createMemory());
            laptop.setOperationSystem(createOperationSystem());
            arrayList.add(i, laptop);
        }
        return arrayList;
    }

    public static String createColor() {
        String[] colorArray = {"Белый", "Серый", "Чёрный"};
        Random random = new Random();
        int number = random.nextInt(3);
        return colorArray[number];
    }

    public static String createDRAM() {
        String[] dramArray = {"4 гб", "8 гб", "16 гб", "32 гб"};
        Random random = new Random();
        int number = random.nextInt(4);
        return dramArray[number];
    }

    public static String createCPU() {
        String[] cpuArray = {"intel 3", "intel 5", "intel 7", "Ryzen 3", "Ryzen 5", "Ryzen 7"};
        Random random = new Random();
        int number = random.nextInt(6);
        return cpuArray[number];
    }

    public static String createMemory() {
        String[] memoryArray = {"256 гб", "512 гб", "1 тб", "2 тб"};
        Random random = new Random();
        int number = random.nextInt(4);
        return memoryArray[number];
    }

    public static String createOperationSystem() {
        String[] systemArray = {"Linux", "Windows", "macOS"};
        Random random = new Random();
        int number = random.nextInt(3);
        return systemArray[number];
    }
}