

/*
Class to represent undead monsters
*/
public class Undead extends Monster
{
  /*
  constructs an Undead object
  */
  public Undead()
  {
    super("Undead", 8);
  }

  /*
  launches an Undead attack
  */
  @Override
  int attack()
  {
    return 2;
  }
}