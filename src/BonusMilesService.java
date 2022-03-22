public class BonusMilesService {
    public int calculate(int cost) { //функция для рассчета миль

        int price = 10_000;
        int bonus = 20;
        int miles = price / bonus; //рассчет количества миль
        return miles;
    }


}
