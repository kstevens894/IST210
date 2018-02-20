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
