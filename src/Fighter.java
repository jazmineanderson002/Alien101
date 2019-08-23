public class Fighter implements Actor
{
  //Instance Variables
  boolean isBattling;
  int level = 0 , xp = 0;
  int lives = 0, health = 0;
  String rank = "";
  String name = "", weapon = "";
  private static final int NUMLIVES =3;

  // Constructors
  public Fighter()
  {
    isBattling = false;
    level = 0;
    xp = 0;
    lives = 0;
    health = 0;
    rank = "none";
    name = "John Doe";
    weapon = "noodle";
  } // default constructor
  public Fighter(String rank, String name, String weapon, int level, int xp, boolean isBattling)
  {
    this.rank = rank;
    this.name = name;
    this.lives = lives;
    this.isBattling = isBattling;
    this.level = level;
    this.xp = xp;
  } // end 3 arg constructor
  // Getters

  public boolean isBattling()
  {
    return isBattling;
  }

  public int getLevel()
  {
    return level;
  }

  public int getXp()
  {
    return xp;
  }

  public int getLives()
  {
    return lives;
  }

  public int getHealth()
  {
    return health;
  }

  public String getRank()
  {
    return rank;
  }

  public String getName()
  {
    return name;
  }

  public String getWeapon()
  {
    return weapon;
  }

  // Setters

  public void setBattling(boolean battling)
  {
    isBattling = battling;
  }

  public void setLevel(int level)
  {
    this.level = level;
  }

  public void setXp(int xp)
  {
    this.xp = xp;
  }

  public void setLives(int lives)
  {
    this.lives = lives;
  }

  public void setHealth(int health)
  {
    this.health = health;
  }

  public void setRank(String rank)
  {
    this.rank = rank;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setWeapon(String weapon)
  {
    this.weapon = weapon;
  }


  //Brain Methods

  @Override
  public void Attack(int damage)
  {
  if(isBattling)
    health -= damage*2;
    else
    System.out.println("May there be peace");
  }

  // toString

  @Override
  public String toString()
  {
    return "Fighter: " +
            "\nLevel: " + level +
            "\nXp: " + xp +
            "\nLives: " + lives +
            "\nHealth: " + health +
            "\nRank: " + rank +
            "\nName: " + name +
            "\nWeapon: " + weapon ;
  }
} // end object class Fighter
