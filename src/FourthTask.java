import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Scanner scan = new Scanner(System.in);
        int slot;
        while(true){
            System.out.println("У игрока " + player.getSlotsCount() + " слотов с оружием, " +
                    "введите номер, что бы выстрелить, -1 что бы выйти");
            slot = scan.nextInt();
            if (slot == -1) break;
            player.shotWithWeapon(slot);
        }
        System.out.println("Game over");
    }
}

class Player{
    private Weapon[] weaponSlots = new Weapon[5];
    public Player(){
        weaponSlots[0] = new RPG();
        weaponSlots[1] = new WaterPistol();
        weaponSlots[2] = new Pistol();
        weaponSlots[3] = new Rifle();
        weaponSlots[4] = new Slingshot();
    }
    public int getSlotsCount() {
        return weaponSlots.length;
    }
    public void shotWithWeapon(int slot){
        if (slot >= weaponSlots.length) throw new IllegalArgumentException("sry buddy dont have weapon on this slot");
        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}
class Weapon{
    public void shot(){
        System.out.println("Выстрел еее круто");
    }
}

class RPG extends Weapon{
    @Override
    public void shot(){
        System.out.println("ема че за выстрел вау");
    }
}
class WaterPistol extends Weapon{
    @Override
    public void shot(){
        System.out.println("что за жалкий выстрел фуууу");
    }
}
class Pistol extends Weapon{
    @Override
    public void shot(){
        System.out.println("-30hp");
    }
}
class Rifle extends Weapon{
    @Override
    public void shot(){
        System.out.println("-60hp");
    }
}
class Slingshot extends Weapon{
    @Override
    public void shot(){
        System.out.println("чуть лучше чем водный пистолет а так все равно жалко");
    }
}
