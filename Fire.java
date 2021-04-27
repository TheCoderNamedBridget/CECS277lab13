

/*
class for fire monsters and attacks
*/
public class Fire extends MonsterDecorator
{

  /*
  @param monster
  */
  public Fire(Monster m)
  {
    super(m, "Fiery " + m.getName(), 2);
  }

  /*
  @return a fire attack damage amount
  */
  public int attack()
  {
    return 3 + super.attack();
  }
}