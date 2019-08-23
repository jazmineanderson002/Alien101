public class Enemy implements Actor
{
  //instance variables
  int lives = 0, health = 0;
  String name, weapon;

  //constructors
  public Enemy()
  {
    name = "bblob";
    weapon = "none";
  }

  public Enemy(String name, String weapon, int lives, int health)
  {
    this.name = name;
    this.weapon = weapon;
    this.lives = lives;
    this.health = health;
  } //end 5 arg constructor

  // getters

  public int getLives()
  {
    return lives;
  }

  public int getHealth()
  {
    return health;
  }

  public String getName()
  {
    return name;
  }

  public String getWeapon()
  {
    return weapon;
  }

  //setters

  public void setLives(int lives)
  {
    this.lives = lives;
  }

  public void setHealth(int health)
  {
    this.health = health;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setWeapon(String weapon)
  {
    this.weapon = weapon;
  }

  @Override
  public void Attack(int damage)
  {

  }

  @Override
  public String toString()
  {
    return "Enemy: " +
            "\nLives: " + lives +
            "\nHealth: " + health +
            "\nName: " + name  +
            "\nWeapon: " + weapon ;
  }
}//end Enemy class
