public abstract class  Robot {
    //Создать абстрактный базовый класс Robot,
    // который в конструкторе принимает параметр типа String, который означает модель терминатора.
    // Параметр должен быть инкапсулирован.
    // Класс робота должен содержать два метода
    //один метод getModel, который должен возвращать модель робота
    //второй метод sayHello должен быть абстрактным
    private String model;

    public Robot(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }


    public abstract void sayHello();
}
