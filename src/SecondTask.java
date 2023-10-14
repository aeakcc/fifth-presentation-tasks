import static java.lang.Math.random; //

class Main {
    public static void main(String[] args) {
        String[] firstArr = {"nana", "nono", "nini"};
        String[] secondArr = {"Demon souls", "Dark souls 1", "Dark souls 2", "Bloodborn", "Dark souls 3", "Sekiro", "Elden ring"};
        String[] thirdArr = {"100", "200", "300", "400", "500", "1000"};
        int firstRandomNumber = (int) (random() * firstArr.length);
        int secondRanomNumber = (int) (random() * secondArr.length);
        int thirdRanomNumber = (int) (random() * thirdArr.length);
        String[] answer = new String[3];
        answer[0] = firstArr[firstRandomNumber] + " ";
        answer[1] = secondArr[secondRanomNumber] + " ";
        answer[2] = thirdArr[thirdRanomNumber] + " ";
        for (int i = 0; i < 3; i++){
            System.out.print(answer[i]);
        }
    }
}
