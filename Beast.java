

/*
Class to represent beast monsters
*/
public class Beast extends Monster
{
  /*
  constructs an Beast object
  */
  public Beast()
  {
    super("Beast", 3);
  }

  /*
  launches an Beast attack
  */
  @Override
  int attack()
  {
    return 2;
  }
}