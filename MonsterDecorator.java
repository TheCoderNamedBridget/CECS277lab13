
/*
decorator that defines the different attacks of a monster
*/

abstract class MonsterDecorator extends Monster
{
  private Monster monster;

  /*
  @param monster, hp, and name
  */
  MonsterDecorator(Monster m, String addName, int addHp)
  {
    super(addName , addHp);
    monster = m;
    
  }

  @Override
  int attack()
  {
    return monster.attack();
  }
}