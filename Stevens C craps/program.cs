using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Stevens_C_craps
{
    class program
    {
        static void Main(string[] args)
        {
            CrapsGame game = new CrapsGame();

            do
            {
                Console.Write("\nWould you like to pllay the game of craps: [y/n]");
                char response = Console.ReadLine().ToLower()[0];
                if (!response.Equals('y'))
                    break;
                Console.WriteLine("Enter Wager or -1 to Quit. Your current balance is {0:C}: ", game.Balance);
                game.Wager = Convert.ToDecimal(Console.ReadLine());
                if (game.Wager == -1)
                    break;
                game.Wager = ValidateWager(game.Wager, game.Balance);
                if (game.Wager == -1)
                    break;
                game.Play();
                if (game.Balance <= 0)
                    break;
            } while (true);
            Console.WriteLine("Good Bye...");
        }

        private static decimal ValidateWager(decimal wag, decimal bal)
        {
            decimal newWager = wag;
            while (newWager <= 0 || newWager > bal)
            {
                Console.Write("{0} is invalid. Wager must be greater than - and it cannot exceed balance: {1:C} ", newWager, bal);
                newWager = Convert.ToDecimal(Console.ReadLine());
                if (wag == -1)
                    break;
            }
            return newWager;
        }
    }
}
/*
Would you like to pllay the game of craps: [y/n]y
Enter Wager or -1 to Quit. Your current balance is $1,000.00:
300
Player rolled 5 + 3 = 8
Point is 8
Player rolled 5 + 3 = 8
Congratulations!! You won. Your balance is $1,300.00

Would you like to pllay the game of craps: [y/n]y
Enter Wager or -1 to Quit. Your current balance is $1,300.00:
100
Player rolled 5 + 1 = 6
Point is 6
Player rolled 5 + 1 = 6
Congratulations!! You won. Your balance is $1,400.00

Would you like to pllay the game of craps: [y/n]y
Enter Wager or -1 to Quit. Your current balance is $1,400.00:
500
Player rolled 3 + 5 = 8
Point is 8
Player rolled 3 + 5 = 8
Congratulations!! You won. Your balance is $1,900.00

Would you like to pllay the game of craps: [y/n]y
Enter Wager or -1 to Quit. Your current balance is $1,900.00:
300
Player rolled 2 + 5 = 7
Congratulations!! You won. Your balance is $2,200.00

Would you like to pllay the game of craps: [y/n]y
Enter Wager or -1 to Quit. Your current balance is $2,200.00:
310
Player rolled 2 + 6 = 8
Point is 8
Player rolled 5 + 4 = 9
Player rolled 5 + 4 = 9
Player rolled 5 + 4 = 9
Player rolled 5 + 4 = 9
Player rolled 5 + 4 = 9
Player rolled 5 + 4 = 9
Player rolled 5 + 4 = 9
Player rolled 5 + 4 = 9
Player rolled 5 + 4 = 9
Player rolled 5 + 4 = 9
Player rolled 5 + 4 = 9
Player rolled 5 + 4 = 9
Player rolled 5 + 4 = 9
Player rolled 5 + 4 = 9
Player rolled 4 + 1 = 5
Player rolled 4 + 1 = 5
Player rolled 4 + 1 = 5
Player rolled 4 + 1 = 5
Player rolled 6 + 5 = 11
Player rolled 6 + 5 = 11
Player rolled 6 + 5 = 11
Player rolled 6 + 5 = 11
Player rolled 6 + 5 = 11
Player rolled 6 + 5 = 11
Player rolled 6 + 5 = 11
Player rolled 6 + 5 = 11
Player rolled 6 + 5 = 11
Player rolled 6 + 5 = 11
Player rolled 6 + 5 = 11
Player rolled 6 + 5 = 11
Player rolled 6 + 5 = 11
Player rolled 6 + 5 = 11
Player rolled 6 + 5 = 11
Player rolled 5 + 1 = 6
Player rolled 5 + 1 = 6
Player rolled 5 + 1 = 6
Player rolled 1 + 5 = 6
Player rolled 1 + 5 = 6
Player rolled 1 + 5 = 6
Player rolled 1 + 5 = 6
Player rolled 1 + 5 = 6
Player rolled 1 + 5 = 6
Player rolled 1 + 5 = 6
Player rolled 1 + 5 = 6
Player rolled 1 + 5 = 6
Player rolled 1 + 5 = 6
Player rolled 1 + 5 = 6
Player rolled 1 + 5 = 6
Player rolled 1 + 5 = 6
Player rolled 1 + 5 = 6
Player rolled 3 + 3 = 6
Player rolled 3 + 3 = 6
Player rolled 3 + 3 = 6
Player rolled 2 + 6 = 8
Congratulations!! You won. Your balance is $2,510.00

Would you like to pllay the game of craps: [y/n]n
Good Bye...
Press any key to continue . . .*/
