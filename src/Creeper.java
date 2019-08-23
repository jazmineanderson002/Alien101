public class Creeper extends Enemy
{
  boolean isAgressive = true;

  public Creeper(String name, String weapon, int lives, int health, boolean isAgressive)
  {
    super(name, weapon, lives, health);
    this.isAgressive = isAgressive;
  } //end full constructor

  // getter

  public boolean isAgressive()
  {
    return isAgressive;
  }

  // setter

  public void setAgressive(boolean agressive)
  {
    isAgressive = agressive;
  }

  @Override
  public void Attack(int damage)
  {
    if(isAgressive)
      health -= damage;
    else
      System.out.println("Your cat saved you");
  }
  @Override
  public String toString()
  {
    return "Creeper: " +
            "\nIs Agressive: " + isAgressive +
            "\nLives: " + lives +
            "\nHealth: " + health +
            "\nName: " + name +
            "\nWeapon: " + weapon ;
  }
} //end Creeper class
