------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Rekursiva Funktioner
PURPOSE OF PROJECT: Att skriva funktioner som arbetar rekursivt.
VERSION or DATE: 12/5-17
HOW TO START THIS PROJECT:
AUTHORS: Joakim Willard & Johan Martinson
USER INSTRUCTIONS:

A1: I reverseInput så tar vi och rekursivt går igenom raden tecken för tecken
    som användaren har skrivit in och testar om tecknet är '\n' om det är det
    så ska den skrivit ut tecknet och gå tillbaka alla körning upp.

A2:
A3: I countDigits tar vi och kollar basfallet om n < 10 om det är det så returnerar den 1,
    i alla andra fall så anropas funktionen med n/10.
    Detta för att om n är mindre än 10 så kan det inte utföras division med 10 och vara heltal
    fortfarande vilket betyder att man kommit till siffran som är entalssiffran och för varje steg i
    rekursionen så inkrementeras returvärdet med ett.

A4: I copy så testas om noden är null och om den är det så returneras null.
    Om den inte är null så returneras det en ny listNode som tar inargumentets element till cons metoden
    och som andra parameter till cons anropas copy på nytt med inargumentets next som argument.
    Detta görs tills next är null. Eftersom cons returnerar en ny instans av en listNode så byggs en helt
    ny lista upp allteftersom med de underliggande rekursionerna som följd noder.

A5: I append så kollar vi först om l1 listan är null och om detta är fallet returneras en kopia av l2 listan.
    Om den inte är null så returneras det en ny listNode som tar l1:s inarguments element till cons metoden
    och som andra parameter anropas append metoden med l1.next som första arguement och l2 som andra parametern.
    Detta kommer återupprepa sig tills man når slutet av l1 då l1.next = null som är basfallet och l2 returneras.

B1: I getHeight så testas basfallet om mobilen är simpel, om den är det så returneras 1.
    Om den inte är simpel så skapas en vänster int och en höger int som tilldelas värdet 1 + getHeight för
    underliggande mobiler.
    Sedan returneras det högsta värdet av de två.

B2: I flatten testas basfallet om mobilen är simpel, om den är det så skrivs weight ut.
    Om den inte är simpel så anropas flatten för vänster och höger mobilerna, detta görs
    tills den når botten av mobilerna. För att flatten ska skriva ut i omvänd ordning
    så byter man ordning på vilken sida som anropas först.
    I prettyPrint görs samma som i flatten men i det generella fallet så lägger man
    till i utskriften [ och armlängderna mellan de rekursiva anropen och ].

B3: I mirror testas om mobilen inte är simpel, om det är fallet så så skapas en temp
    variabel som används för att byta värden på mobilens armar.
    På samma sätt byter vi också vänster och höger mobilerna med varandra,
    sedan utförs det rekursiva anropet för både vänster och höger mobilen.
    Detta görs tills mobilen är simpel och inget ska ändras.

B4: I metoden equals så testar vi först om de två mobilerna är simpla om det är fallet
    så testas det om vikterna i båda mobilerna är lika om detta också stämmer returneras true annars false.
    Om mobilen inte är simpel så testas vänster och höger armarna mellan de två mobilerna mot varandra om
    båda dessa är samma så utförs det rekursiva anropet till equals för både vänster och höger mobilen.
    Detta görs tills den når basfallet att mobilen är simpel.

B5: I clone testas basfallet om den är simpel, om detta är fallet så returneras en ny instans av
    mobilen som har samma weight.
    Om den inte är simpel så returneras en ny instans av mobil som tar rekursivt anrop av clone
    på den vänstra mobilen och vänster armens längd och rekursivt anrop av clone på den högra mobilen
    och höger armens längd.

C1: Vi får sen tidigare hur convex triangle ska se ut efter rekursioner med olika grad. Eftersom convex är motsatsen till concave som är vad resultatet ska visa så
    inverterar vi alla gradtal för vinklarna som nästa linje ska ritas med i förhållande till den föregående linjen.
C2: Här ser fraktalen annorlunda ut. Linjen blir som ett kantigt omega som bildar den andra itterationen av rekursionen.
C3: vi byter här ut standard fallet att om n = 0 så ritar vi en linje till att om n = 0 så ritar vi en triangel.
