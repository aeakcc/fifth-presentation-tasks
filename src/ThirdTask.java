import static java.lang.Math.random;

class GameLauncher {
    public static void main(String[] args) {
        GuessGame gg = new GuessGame();
        gg.startGame();
    }
}



class Player{
    int number;
    void guess(){
        number = (int) (random() * 10);
        System.out.println("Думаю это число " + number);
    }
}



class GuessGame{
    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();
    void startGame(){
        while(true){
            boolean winner;
            int randomAnswer = (int) (random() * 10);
            System.out.println("Я загадываю число от 0 до 9...");
            System.out.println("Число которое нужно угадать, - " + randomAnswer);
            p1.guess();
            p2.guess();
            p3.guess();
            if (p1.number == randomAnswer || p2.number == randomAnswer || p3.number == randomAnswer){
                System.out.println("У нас есть победитель!");
                winner = p1.number == randomAnswer;
                System.out.println("Первый игрок угадал? " + winner);
                winner = p2.number == randomAnswer;
                System.out.println("Второй игрок угадал? " + winner);
                winner = p3.number == randomAnswer;
                System.out.println("Третий игрок угадал? " + winner);
                System.out.println("Конец игры.");
                break;
            }
            System.out.println("Игроки должны подумать еще раз.");
        }
    }
}
