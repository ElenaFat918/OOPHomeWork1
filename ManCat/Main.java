public class Main {
    public static void main(String[] args) {

        Man man = new Man("Артём", "доброжелательный");
        Man man2 = new Man("Денис", "злой");
        Cat cat = new Cat("Пушок");
        man.call(man.getDemeanour(), cat);

        System.out.print("\n");
        man2.call(man2.getDemeanour(), cat);
    }
}
/*
 * Подумать как описать логику взаимодействия человека и домашнего питомца.
 * Сценарий: “Человек “зовёт” котика “кис-кис”, котик отзывается. 
 * Какое ещё взаимодействие может быть?
 */
//**Проект работает только если открыть папку отдельно от других заданий/
/*
 * Описываем логику:
 * Создаем 2х человек (экземпляр класса Man с именем и поведением(настроением) в отношении кошки 
 * в качестве аргументов конструктора) 
 * Создаем кошку (экземпляр класса Cat с именем в качестве аргумента конструктора) 
 * Используя метод call, отвечающий за реакцию кошки на голос человека, Человек1 зовет кошку
 *  и происходит реакция кошки на этот зов, она подходит
 *  Используя метод call, отвечающий за реакцию кошки на голос человека, Человек2 зовет кошку
 *  и происходит реакция кошки на этот зов, кошка убегает
*/