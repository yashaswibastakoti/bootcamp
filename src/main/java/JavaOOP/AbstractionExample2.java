package JavaOOP;

public class AbstractionExample2 {
    public static void main(String[] args){
        Warrior knight = new Knight( "lancer Loft");
        Warrior archer = new Archer( "Robin hood");
        Warrior wizard = new Wizard("Wizard Gandalf");

        knight.attack();
        archer.attack();
        wizard.attack();

        System.out.println();

        knight.defend();
        archer.defend();
        wizard.defend();

        System.out.println();

        knight.takeDamage(10);
        archer.takeDamage(20);
        wizard.takeDamage(30);
    }
}
