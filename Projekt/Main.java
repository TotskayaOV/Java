package Projekt;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public OurNotebook userVois(OurNotebook notebookUser) {
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("Какие параметры вы хотите видеть у своего ноутбука:\n1. Оперативная память\n2. Объем жесткого диска\n3. Предустановленная ОС\n4. цвет\nВведите номер пункта меню для выбора или введите 0");
            int userChoise = iScanner.nextInt();
            switch (userChoise) {
                case 1:
                    Scanner iScanner = new Scanner(System.in);
                    System.out.printf("Введите желаемое количество Оперативной памяти (число): ");
                    int userRum = iScanner.nextInt();
                    notebookUser.ram = userRum;
                    break;
                case 2:
                    Scanner iScanner = new Scanner(System.in);
                    System.out.printf("Введите желаемый объем жесткого диска (число): ");
                    int userHdd = iScanner.nextInt();
                    notebookUser.hdd = userHdd;
                    break;
                case 3:
                    Scanner iScanner = new Scanner(System.in);
                    System.out.printf("Введите желаемую операционную систему: ");
                    String userOSystem = iScanner.nextLine();
                    notebookUser.oSystem = userOSystem;
                    break;
                case 4:
                    Scanner iScanner = new Scanner(System.in);
                    System.out.printf("Введите желаемый цвет ноутбука: ");
                    String userColore = iScanner.nextLine();
                    notebookUser.colore = userColore;
                    break;
                default:
                    break;
            }
            iScanner.close();
            return notebookUser;
        }

    public static void main(String[] args) {
        Set<OurNotebook> set = new HashSet<>();
        
        OurNotebook notebook1 = new OurNotebook("ASD098FD39048", "GameKiller", "black", 16, 256, "Linux", "Core i3");
        OurNotebook notebook2 = new OurNotebook("FGHD098FD3943", "Banan", "black", 16, 512, "Windows", "Core i");
        OurNotebook notebook3 = new OurNotebook("QGHD098567948", "Turbo", "pink", 64, 512, "Linux", "Core i7");
        OurNotebook notebook4 = new OurNotebook("VDFHD05667991", "Turbo", "black", 64, 512, "Linux", "Core i7");
        OurNotebook notebook5 = new OurNotebook("12HD09FG67948", "GMV500", "pink", 32, 256, "Windows", "Core i5");
        OurNotebook notebook6 = new OurNotebook("BMFGW85679041", "GMV500", "pink", 32, 256, "Windows", "Core i5");
        OurNotebook notebook7 = new OurNotebook("QGHD098567945", "GMV500", "black", 32, 256, "Linux", "Core i5");
        OurNotebook notebook8 = new OurNotebook("JKLD011567444", "GMV500", "black", 32, 256, "Linux", "Core i5");

        set.add(notebook1);
        set.add(notebook2);
        set.add(notebook3);
        set.add(notebook4);
        set.add(notebook5);
        set.add(notebook6);
        set.add(notebook7);
        set.add(notebook8);

        // System.out.println(notebook5.equals(notebook6));
        // System.out.println(notebook5.equality(notebook6));
        
        
        OurNotebook notebookUserchoise = new OurNotebook("None", "None", "None", 0, 0, "None", "None");
        notebookUserchoise = userVois(notebookUserchoise);
    }
}
