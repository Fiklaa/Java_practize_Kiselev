package practize24.chairs;

interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);
    MagicChair createMagicianChair();
    FunctionChair createFunctionalChair();
}
