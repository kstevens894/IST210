using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Stevens_C_craps
{
    enum Status {  CONTINUE, WON, LOST}

    enum DiceNames
    {
        SNAKE_EYES = 2,
        TREY = 3,
        SEVEN = 7,
        YO_LEVEN = 11,
        BOX_CARS = 12
    }
    class CrapsGame
    {
        public Status gameStatus { get; set; }

        private decimal balance;
        public decimal Balance
        {
            get { return balance; }
            set { if (value >= 0) balance = value; }
        }

        private decimal wager;
        public decimal Wager
        {
            get { return wager;}
            set { wager = value; }
        }

        public CrapsGame()
        {
            Balance = 1000;
            gameStatus = Status.CONTINUE;
        }

        public void Play()
        {
            int myPoint = 0;
            int sumOfDice = RollDice();
            switch ((DiceNames)sumOfDice)
            {
                case DiceNames.SEVEN:
                case DiceNames.YO_LEVEN:
                    gameStatus = Status.WON;
                    break;
                case DiceNames.SNAKE_EYES:
                case DiceNames.TREY:
                case DiceNames.BOX_CARS:
                    gameStatus = Status.LOST;
                    break;
                default:
                    gameStatus = Status.CONTINUE;
                    myPoint = sumOfDice;
                    Console.WriteLine("Point is {0}", myPoint);
                    break;
            }
            while (gameStatus == Status.CONTINUE)
            {
                sumOfDice = RollDice();

                if (sumOfDice == myPoint)
                    gameStatus = Status.WON;
                else if (sumOfDice == (int)DiceNames.SEVEN)
                    gameStatus = Status.LOST;
            }

            if(gameStatus == Status.WON)
            {
                Balance += Wager;
                Console.WriteLine("Congratulations!! You won. Your balance is {0:C}", Balance);
            }
            else
            {
                Console.WriteLine("Player losses");
                Balance -= Wager;
                if (Balance > 0)
                {
                    Console.WriteLine("Sorry, you lost, your balance is {):C}", Balance);
                }
                else
                {
                    Console.WriteLine("Sorry, your are busted, your balance is {0:C}", Balance);
                }
            }
            return;
        }
        public int RollDice()
        {
            Random randomNumbers = randomNumbers = new Random();

            int die1 = randomNumbers.Next(1, 7);
            int die2 = randomNumbers.Next(1, 7);

            int sum = die1 + die2;

            Console.WriteLine("Player rolled {0} + {1} = {2}",
                die1, die2, sum);
            return sum;
        }
    }
}

