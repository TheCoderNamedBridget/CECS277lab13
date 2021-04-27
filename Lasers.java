

/*
class for Lasers monsters and attacks
*/
public class Lasers extends MonsterDecorator
{

  /*
  @param monster
  */
  public Lasers(Monster m)
  {
    super(m, "Lasers " + m.getName(), 3);
  }

  /*
  @return a Lasers attack damage amount
  */
  public int attack()
  {
    return 5 + super.attack();
  }
}