

/*
class for Poison monsters and attacks
*/
public class Poison extends MonsterDecorator
{

  /*
  @param monster
  */
  public Poison(Monster m)
  {
    super(m, "Posion " + m.getName(), 7);
  }

  /*
  @return a Poison attack damage amount
  */
  public int attack()
  {
    return 11 + super.attack();
  }
}