/*
Class to model different monster attributes and behaviors
*/


abstract class Monster
{
  int hp;
  String name;

  /*
  @param the name and hp of this monster
  */
  Monster(String n, int h)
  {
    name = n;
    hp = h;
  }

  /*
  @return the monster's name
  */
  String getName()
  {
    return name;
  }

  /*
  @return the monster's hp
  */
  int getHp()
  {
    return hp;
  }

   /*
  @descritpion: method to return attack strength
  */
  abstract int attack();

}