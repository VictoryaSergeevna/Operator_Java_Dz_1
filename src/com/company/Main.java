package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        List<Car> cars=new ArrayList <Car>();
        cars.add(new Car(1,"Ford", "Focus", "red", 2013, 1222,20000));
        cars.add(new Car(2,"Audi", "Q7", "black", 2015, 2222,30000));
        cars.add(new Car(3,"Tesla", "Model3", "white",2018, 1554,50000));
        cars.add(new Car(4,"BMV", "X5", "brown", 2016, 7878,40000));
        cars.add(new Car(5,"Ferrary", "F8 Tributo", "orange", 2019, 7878,150000));
        Scanner scanner = new Scanner(System.in);
        if (scanner != null) {
            int key;
            do {
                printMenu();
                System.out.print("Введите номер меню: ");
                key = scanner.nextInt();
                switch (key) {
                    case 1:
                        System.out.println("Введите марку машины: ");
                        String brand = reader.readLine();;
                        System.out.println("Выборка авто марки "+brand);
                        List<Car> arr1=ListOfCarByBrand(cars, brand);
                        for (Car car : arr1) {
                            System.out.println(car.toString());
                        }

                        break;
                    case 2:
                        System.out.println("Выборка авто сроком эксплуатации больше 10 лет: ");
                        List<Car> arr2=ListOfCarByYear(cars,2010,10);
                        for (Car car : arr2) {
                            System.out.println(car.toString());
                        }
                        break;
                    case 3:
                        System.out.println("Выборка авто с годом выпуска <2015> и ценой больше 100000:");
                        List<Car> arr3 = ListOfCarByPrice(cars,2015,100000);
                        for (Car car : arr3) {
                            System.out.println(car.toString());
                        }
                        break;
                    case 4:
                        System.out.println("Завершение программы...");
                        break;
                    default:
                        System.out.println("Вы ввели неверное значение меню...\n");
                }
            } while (key != 4);
        }
    }
    static void printMenu() {
        System.out.println("1. Для создания списка марок автомобилей из созданного массива объектов нажмите 1");
        System.out.println("2. Для создания списока автомобилей, которые эксплуатируются больше 10 лет нажмите 2");
        System.out.println("3. Для создания списока автомобилей заданного года выпуска, цена которых больше указанной нажмите 3");
        System.out.println("4. Для выхода из приложения нажмите 4");

    }


//    a)список марок автомобилей из созданного массиваобъектов;
    private static List<Car> ListOfCarByBrand(List<Car> cars, String brand) {
        List<Car> res = new ArrayList<Car>();
        for (Car car :cars) {
            if (car.getBrand().equals(brand)) {
                res.add(car);
            }
        }
        return res;
    }
        //b)список автомобилей, которые эксплуатируются больше n лет;

    private static List<Car> ListOfCarByYear(List<Car> cars, int yearTill, int numOfYears) {
        List<Car> res = new ArrayList<Car>();
        for (Car car :cars) {
            if (yearTill-car.getYear() > numOfYears) {
                res.add(car);
            }
        }
        return res;
    }
    //c)список автомобилей заданного года выпуска, цена которых больше указанной.


    private static List<Car> ListOfCarByPrice(List<Car> cars,int year, int price) {
        List<Car> res=new ArrayList <Car>();
        for (Car car :cars) {
            if (car.getYear()==year && car.getPrice() > price) {
                res.add(car);
            }
        }
        return res;
    }


}
