using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class GameClass
    {
        private static Random rand;
        private int secretNumber;
        private int guess;
        private int numberOfTries;

        public GameClass()
        {
            rand = new Random();
            secretNumber = 0;
            guess = 0;
        }
        public void playGame()
        {
            secretNumber = GetRandomNumber();
            do
            {
                numberOfTries++;
                guess = promptAndGetResponse();
                if (guess == -1)
                {
                    Console.WriteLine("Good Bye...");
                    return;
                }
                bool gameOver = CheckStatus(secretNumber, guess);
                if (gameOver)
                    break;
            } while (true);
        }
        private bool CheckStatus (int secretnumber, int guess)
        {
            bool gameOver = false;
            if (secretNumber == guess)
            {
                if (numberOfTries == 10) Console.WriteLine("Aha! You know the scret!");
                else if (numberOfTries > 10) Console.WriteLine("You should be able to do better!");
                else Console.WriteLine("Either you know the scret or you got lucky");
                gameOver = true;
            }
            else if (secretNumber < guess)
            {
                Console.WriteLine($"{guess} - Guess lower...");
            }
            else
            {
                Console.WriteLine($"{guess} - Guess higher...");
            }
            return gameOver;
        }
        private int promptAndGetResponse()
        {
            Console.WriteLine("Please enter a guess: [1]1000]: ");
            return int.Parse(Console.ReadLine());
        }
        private int GetRandomNumber()
        {
            return rand.Next(1, 1001);
        }
    }
}
