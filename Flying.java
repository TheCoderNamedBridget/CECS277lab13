

/*
class for Flying monsters and attacks
*/
public class Flying extends MonsterDecorator
{

  /*
  @param monster
  */
  public Flying(Monster m)
  {
    super(m, "Flying " + m.getName(), 4);
  }

  /*
  @return a Flying attack damage amount
  */
  public int attack()
  {
    return 3 + super.attack();
  }
}