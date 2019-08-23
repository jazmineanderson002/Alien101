public class Klingon extends Enemy
{
  boolean isFriendly = false;

  public Klingon(String name, String weapon, int lives, int health, boolean isFriendly)
  {
    super(name, weapon, lives, health);
    this.isFriendly = isFriendly;
  }//end full constructor with super

  // getters

  public boolean isFriendly()
  {
    return isFriendly;
  }

  // setters

  public void setFriendly(boolean friendly)
  {
    isFriendly = friendly;
  }

  @Override
  public void Attack(int damage)
  {
    if(isFriendly)
      health += damage;
    else
      health -= damage;
  }

  @Override
  public String toString()
  {
    return "Klingon: " +
            "\nIs Friendly: " + isFriendly +
            "\nLives: " + lives +
            "\nHealth: " + health +
            "\nName: " + name +
            "\nWeapon: " + weapon;
  }
}
