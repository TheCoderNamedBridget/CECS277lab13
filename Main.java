
/*
Names: Bridget Naylor, Johan T
Date: 4/26/2021
Lab 13
Description: Monster Maker – Decorator Pattern
*/

class Main {
  public static void main(String[] args) {
    Monster m = null; 
    // make a menu
    //choose monster and repaetd ask to add decorator
    boolean quit = false;
    boolean monsterChosen = false;
    System.out.println("Monster Creator!");
    int userMonsterChoice = 0;
    int userDecorChoice = 0;
    
    while ( !quit )
    {
      if ( !monsterChosen )
      {
        System.out.println("Choose a base monster:");
        System.out.println("1. Alien");
        System.out.println("2. Beast");
        System.out.println("3. Undead");
        userMonsterChoice = CheckInput.getIntRange(1,3);
        if (userMonsterChoice == 1)
        {
          m = new Alien();
        }
        else if (userMonsterChoice == 2)
        {
          m = new Beast();
        }
        else if (userMonsterChoice == 3)
        {
          m = new Undead();
        }
        monsterChosen = true;
      }

    
      System.out.println("Add an ability:");
      System.out.println("1. Fire");
      System.out.println("2. Flying");
      System.out.println("3. Lasers");
      System.out.println("4. Poison");
      System.out.println("5. Quit");
      userDecorChoice = CheckInput.getIntRange(1,5);
      if (userDecorChoice == 1)
      {
        m = new Fire(m);
      }
      else if (userDecorChoice == 2)
      {
        m = new Flying(m);
      }
      else if (userDecorChoice == 3)
      {
        m = new Lasers(m);
      }
      else if (userDecorChoice == 4)
      {
        m = new Poison(m);
      }

      if ( userDecorChoice == 5 )
      {
        quit = true;
        System.out.println("Quitting");
      }
      else
      {
        //print out current monster stats 
        System.out.println(m.getName() + " has " + m.getHp() + " hp, and attacks for " + m.attack() + " damage." );
      }
      
      
      
    }
  }
}