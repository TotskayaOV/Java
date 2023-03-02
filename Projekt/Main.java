package Projekt;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static OurNotebook userVois(OurNotebook notebookUser) {
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("Какие параметры вы хотите видеть у своего ноутбука:\n1. Оперативная память\n2. Объем жесткого диска\n3. Предустановленная ОС\n4. цвет\nВведите номер пункта меню для выбора или введите 0: ");
            int userChoise = iScanner.nextInt();
            switch (userChoise) {
                case 1:
                    Scanner iScanner1 = new Scanner(System.in);
                    System.out.printf("Введите желаемое количество Оперативной памяти (число): ");
                    int userRum = iScanner1.nextInt();
                    notebookUser.ram = userRum;
                    userVois(notebookUser);
                    break;
                case 2:
                    Scanner iScanner2 = new Scanner(System.in);
                    System.out.printf("Введите желаемый объем жесткого диска (число): ");
                    int userHdd = iScanner2.nextInt();
                    notebookUser.hdd = userHdd;
                    userVois(notebookUser);
                    break;
                case 3:
                    Scanner iScanner3 = new Scanner(System.in);
                    System.out.printf("Введите желаемую операционную систему: ");
                    String userOSystem = iScanner3.nextLine();
                    notebookUser.oSystem = userOSystem;
                    userVois(notebookUser);
                    break;
                case 4:
                    Scanner iScanner4 = new Scanner(System.in);
                    System.out.printf("Введите желаемый цвет ноутбука: ");
                    String userColore = iScanner4.nextLine();
                    notebookUser.colore = userColore;
                    userVois(notebookUser);
                    break;
                case 0:
                    return notebookUser;
                default:
                    break;
            }
            iScanner.close();
            return notebookUser;
        }


    public static LinkedList resultUserVois(OurNotebook not1, OurNotebook not2) {
        LinkedList<Boolean> list = new LinkedList<>();
        if (not2.equalsColore(not1)){
            list.add(true);
        } else {
            list.add(false);
        }   
        if (not2.equalityRam(not1)){
            list.add(true);
        } else {
            list.add(false);
        } 
        if (not2.equalityHdd(not1)){
            list.add(true);
        } else {
            list.add(false);
        } 
        if (not2.equalsOS(not1)){
            list.add(true);
        } else {
            list.add(false);
        }
        return list;
    }

    /**
     * @param args
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws CloneNotSupportedException
     */

    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
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

        OurNotebook notebookDefault = new OurNotebook("default", "default", "default", 0, 0, "default", "default");
        OurNotebook notebookUserchoise = new OurNotebook("default", "default", "default", 0, 0, "default", "default");
        userVois((OurNotebook) notebookUserchoise);
        LinkedList<Boolean> markerList = resultUserVois(notebookDefault, notebookUserchoise);
        Set<OurNotebook> setResult = new HashSet<>();

        Iterator<OurNotebook> iterator = set.iterator();
        while (iterator.hasNext()) {
            OurNotebook element = iterator.next();
            if (markerList.get(0)) {
                if (markerList.get(1)) {
                    if (markerList.get(2)){
                        if (markerList.get(3)){ //не 0 не 1 не 2 не 3
                            break;
                            }
                        else {
                            if (element.equalsOS(notebookUserchoise)){ //не 0 не 1 не 2 а 3
                                setResult.add(element);
                            }
                        }
                    } else {
                        if (markerList.get(3)){ //не 0 не 1 а 2 не 3
                            if (element.equalityHdd(notebookUserchoise)){
                                setResult.add(element);
                            }
                        } else {                    //не 0 не 1 а 2 а 3
                            if (element.equalityHdd(notebookUserchoise) && element.equalsOS(notebookUserchoise)){
                                setResult.add(element);
                            }
                        }
                    }  
                } else {
                    if (markerList.get(2)){
                        if (markerList.get(3)){ //не 0 а 1 не 2 не 3
                            if (notebookUserchoise.equalityRam(element)){
                                setResult.add(element);
                            }
                        } else {
                                if (element.equalityRam(notebookUserchoise) && element.equalsOS(notebookUserchoise)){ //не 0 a 1 не 2 а 3
                                    setResult.add(element);
                                }
                        } 
                    } else {                                    
                        if (markerList.get(3)){         //не 0 a 1 а 2 не 3
                            if (notebookUserchoise.equalityRam(element) && element.equalityHdd(notebookUserchoise)){
                                setResult.add(element);
                            }
                        } else {                                 //не 0 a 1 а 2 a 3
                                if (element.equalityRam(notebookUserchoise) && element.equalsOS(notebookUserchoise) && element.equalityHdd(notebookUserchoise)){ 
                                    setResult.add(element);
                                }
                        }
                    }
                }
            } else {                
                if (markerList.get(1)) {            //0 не 1 не 2 не 3
                    if (markerList.get(2)){         //0 не 1 не 2 не 3
                        if (markerList.get(3)){     //0 не 1 не 2 не 3
                            if (element.equalsColore(notebookUserchoise)){
                                setResult.add(element);
                            }                            
                        } else {                            //0 не 1 не 2 а 3
                            if (element.equalsColore(notebookUserchoise) && element.equalsOS(notebookUserchoise)){
                                setResult.add(element);
                            }
                        }
                    } else {
                        if (markerList.get(3)){     //0 не 1 а 2 не 3
                            if (element.equalsColore(notebookUserchoise) && element.equalityHdd(notebookUserchoise)){
                                setResult.add(element);
                            }
                        } else {                            //0 не 1 а 2 а 3
                            if (element.equalityHdd(notebookUserchoise) && element.equalsColore(notebookUserchoise) && element.equalsOS(notebookUserchoise)){
                                setResult.add(element);           
                            }
                        }
                    }
                } else {
                    if (markerList.get(2)){         //0 а 1 не 2 не 3
                        if (markerList.get(3)){     //0 а 1 не 2 не 3
                            if (element.equalityRam(notebookUserchoise) && element.equalsColore(notebookUserchoise)){
                                setResult.add(element);
                            }
                        } else {                            //0 а 1 не 2 а 3
                            if (element.equalityHdd(notebookUserchoise) && element.equalityRam(notebookUserchoise) && element.equalsColore(notebookUserchoise) && element.equalsOS(notebookUserchoise)){
                                setResult.add(element);
                            }
                        } 
                    } else {                                //0 а 1 a 2 не 3
                        if (markerList.get(3)){      //0 а 1 a 2 не 3
                            if (element.equalityRam(notebookUserchoise) && element.equalsColore(notebookUserchoise) && element.equalityHdd(notebookUserchoise)){
                                setResult.add(element);
                            }
                        } else {                            //0 а 1 не 2 а 3
                            if (element.equalityHdd(notebookUserchoise) && element.equalityRam(notebookUserchoise) && element.equalsColore(notebookUserchoise) && element.equalsOS(notebookUserchoise)){
                                setResult.add(element);
                            }
                        } 
                    }
                }
            }
        }            
        int count = 1;
        if (setResult.isEmpty()){
            System.out.println("Ноутбуки в наличии: ");
            for (OurNotebook e : set) {
                System.out.println(count + ". " + e);
                count += 1;
            }
        } else {
            System.out.println("По вашему запросу найдены ноутбуки в наличии: ");
            for (OurNotebook e : setResult) {
                System.out.println(count + ". " + e);
                count += 1;
            }
        }
        
    }
}
