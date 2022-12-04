public class Main {
    public static void main(String[] args) {
        System.out.println("hw 8.1");
        int man = 19;
        if (man >=2 && man <=6){
            System.out.println("Если возраст человека равен " + man + ", то ему нужно ходить в детский сад");
        }else if (man >=7 && man <=18){
            System.out.println("Если возраст человека равен " + man + ", то ему нужно ходить в школу");
        }else if (man > 18 && man <= 24){
            System.out.println("Если возраст человека равен " + man + ", то ему нужно ходить в университет");
        }else if (man > 24){
            System.out.println("Если возраст человека равен " + man + ", то ему нужно ходить на работу");
        }

        System.out.println("hw 8.2");
        int kidAge = 7;
        if (kidAge < 5){
            System.out.println("Если возраст ребенка " + kidAge + ", то он не может кататься на аттракционе");
        } else if (kidAge > 5 && kidAge < 14){
            System.out.println("Если возраст ребенка " + kidAge + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }else if (kidAge > 14){
            System.out.println("Если возраст ребенка " + kidAge + ",то он может кататься без сопровождения взрослого");
        }

        System.out.println("hw 8.3");
        int one = 6;
        int two = 13;
        int three = 3;
        if (one >= two && one >= three){
            System.out.println("Число " + one + " больше");
        }else if (two >= one && two >= three){
            System.out.println("Число " + two + " больше");
        }else if (three >= one && three >= two){
            System.out.println("Число " + three + " больше");
        }
    }
}