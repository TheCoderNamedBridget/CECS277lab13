

/*
Class to represent alien monsters
*/
public class Alien extends Monster
{
  /*
  constructs an ALien object
  */
  public Alien()
  {
    super("Alien", 6);
  }

  /*
  launches an alien attack
  */
  @Override
  int attack()
  {
    return 2;
  }
}