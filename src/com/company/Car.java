package com.company;

public class Car {
    private int id;
    private String brand, model, color;
    private int year, numberModel;
    private float price;


    public Car(int id,String br, String mod, String col, int year, int num, float price)
    {
        this.id=id;
        this.brand=br;
        this.model=mod;
        this.color=col;
        this.year=year;
        this.numberModel=num;
        this.price=price;

    }
    public int getId()
    {
        return this.id;
    }
    public String getBrand()
    {
        return this.brand;
    }
    public String getModel()
    {
        return this.model;
    }
    public String getColor()
    {
        return this.color;
    }
    public int getYear()
    {
        return this.year;
    }


    public float getPrice()
    {
        return this.price;
    }

    public int getNumber()
    {
        return this.numberModel;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void setBrand(String carBrand)
    {
        brand = carBrand;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    public void setNumberModel(int num)
    {
        this.numberModel=num;
    }
    public void setPrice(float price)
    {
        this.price = price;
    }

    @Override
    public String toString() {
        String str="\nid: " + id +
                ", Brand: " + this.brand +
                ", Model: " + this.model +
                ", Year: " + this.year +
                ", Color: " + this.color +
                ",  Price: " + this.price +
                ",  Number of Model: " + this.numberModel;

        return str;

    }

}
