package ua.ithillel.java;

public class Steps {
    public static void main(String[] args) {
        // ctrl + alt + L
        Client client = new Client();
        client.name = "Victor Fedorovich Yanukovich";
        client.age = 56;
        client.sumMoney = 3_800_000;

        Car car = new Car();
        car.car = "Bugatti Divo";
        car.type = "Hyper Car";
        car.body = "Coupe";
        car.yearofIssue = "2018 year";
        car.cost = 5_800_000;
        client.bankCredit = (car.cost - client.sumMoney) / 36;
        client.creditSum = (car.cost - client.sumMoney);


        if (client.age >= 18) {
            System.out.println("Возраст клиента : " + client.age);
            System.out.println("Клиенту есть 18 лет.");
            if (client.sumMoney >= car.cost) {
                System.out.println("У клиента сумма :" + client.sumMoney + "А нужная сумма:" + car.cost);
            } else {
                System.out.println("Ваша сумма : " + client.sumMoney + " Стоимость автомобиля : " + car.cost);
                System.out.println("Вам нехватает: " + (car.cost - client.sumMoney));
                System.out.println("Желаете оформить кредит на 3 года? ");
                System.out.println("Ежемесячный платеж составит: " + client.bankCredit);

                if (client.sumMoney + client.creditSum >= car.cost) {

                    System.out.println("Вы оформили кредит! Сумма кредита : " + client.creditSum);
                    System.out.println("Вы стали обладателем крутого автомобиля : " + car.car);
                    System.out.println("Тип автомобиля : " + car.type);
                    System.out.println("Кузов автомобиля : " + car.body);
                    System.out.println("Год выпуска : " + car.yearofIssue);
                    System.out.println("ПОЗДРАВЛЯЕМ С ПОКУПКОЙ АВТОМОБИЛЯ!");
                } else {
                }

            }
        }

    }
}



