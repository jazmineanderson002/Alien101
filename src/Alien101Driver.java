import com.sun.org.apache.xalan.internal.xsltc.dom.SortingIterator;

public class Alien101Driver
{
  public static void main(String[] args)
  {
    Fighter joe = new Fighter("Captain", "Joe", "Spork", 28, 1000, true);
    //Enemy generic = new Enemy("generic", "floon", 356, 5);
    Creeper creepie = new Creeper("Creepie", "TNT", 1, 20, true);
    Klingon worf = new Klingon("Worf", "Phaser", 1, 1000, true);
    Klingon burtog = new Klingon("Burtog", "bat'leth", 1, 1000, false);


    joe.setHealth(50);
    joe.Attack(5);
    creepie.setAgressive(false);
    creepie.Attack(5);
    worf.setLives(9);
    worf.Attack(5);
    burtog.setWeapon("burrito");
    burtog.Attack(5);

    Actor[] cast = {creepie, worf, burtog};
    for (Actor e: cast)
    {
      System.out.println(e);
      System.out.println();
    }
//    System.out.println(joe);
//    System.out.println();
//    System.out.println(generic);
//    System.out.println();
//    System.out.println(creepie);
//    System.out.println();
//    System.out.println(worf);
//    System.out.println();
//    System.out.println(burtog);
//    creepie.Attack(10);
//    System.out.println(creepie);
  }
}
