# tennisGame
In order to compile and run this kata import the git project in your eclipse IDE and make sure your IDE is configured to run Junit5. Run the TennisGameTest.java class as a junit test case and observe the results. If you just want to run without an IDE make sure you compile with Junit5 libraries included in your classpath. Feel free to add more test cases in TennisGameTest.java to try out more cases, although I have covered a lot of edge cases.


Steps taken to write code
1) Configuring git, downloading and installing eclipse IDE and java locally. This took approximately 30 minutes
2) Folowing the red,green,refactor cycle of TDD to fulfill the requirements and commiting the changes
3) Revisiting refactoring of the business logic (scoring) to reduce cyclomatic complexity according to fowler's recommendations from his second refactoring book

Possible improvements in code:
1) Some of the constants can be enumed
2) Scoring System can be extracted from TennisGame into an interface and if rules of the game change you just have to implement it. Also this is simplified tennis (Wii version) but regular tennis set comprises of many games, not just 1. So extracting scoring system seems to make sense.
3) The Game can also be perceived as a state machine and possible application of state/strategy pattern can be looked into
4) Instead of Player class, Side class can be created which can represent one player or two. 
