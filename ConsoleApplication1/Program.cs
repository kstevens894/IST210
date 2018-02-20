using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            do
            {
                Console.Write("Would you like to play a guessing game? [y/n]: ");
                char response = Console.ReadLine().ToLower()[0];
                if (response.Equals('y'))
                {
                    GameClass game = new GameClass();
                    game.playGame();
                }
                else
                {
                    break;
                }
            } while (true);Console.WriteLine("Good bye. Please come again...");
        }
    }
}
/*
Would you like to play a guessing game?[y / n]: y
 Please enter a guess: [1]1000]:
400
400 - Guess higher...
Please enter a guess: [1]1000]:
800
800 - Guess lower...
Please enter a guess: [1]1000]:
600
600 - Guess lower...
Please enter a guess: [1]1000]:
500
500 - Guess higher...
Please enter a guess: [1]1000]:
550
550 - Guess lower...
Please enter a guess: [1]1000]:
545
545 - Guess lower...
Please enter a guess: [1]1000]:
530
530 - Guess lower...
Please enter a guess: [1]1000]:
520
520 - Guess lower...
Please enter a guess: [1]1000]:
510
510 - Guess higher...
Please enter a guess: [1]1000]:
515
515 - Guess lower...
Please enter a guess: [1]1000]:
513
513 - Guess lower...
Please enter a guess: [1]1000]:
511
You should be able to do better!
Would you like to play a guessing game?[y / n]: n
 Good bye.Please come again...
Press any key to continue . . .*/
