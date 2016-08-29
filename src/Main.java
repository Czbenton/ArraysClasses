import sun.tools.tree.IfStatement;

public class Main {

    public static void main(String[] args) {
        System.out.println("My Weekend Plans\n");

       /* example
       Test test = new Test();
        test.field = 1;
        */
            Car car = new Car();
            Archery archery = new Archery();
            Family family = new Family();
            Family family2 = new Family();
            IceCream iceCream = new IceCream();
            Score score = new Score();



        archery.arrows = 12;
        archery.bow = "Bear Kodiak Magnum Recurve";
        archery.quiver = "Three Rivers rear facing quiver";
        family.age = 22;
        family.relation = "sister";
        family2.age = 29;
        family2.relation = "wife";
        car.doors = 4;
        car.engineSize = 2.5;
        car.makeModel = "Ford Escape";
        car.year = 2010;
        iceCream.price = 5;
        iceCream.size = "small";
        iceCream.size2 = "medium";
        iceCream.size3 = "large";
        //iceCream.flavors[0,1,2] <<size of array
        score.score = 95;
        score.targetHit = 10;
        score.firstPlace = score.score >= 97;
        score.secondPlace = score.score < 97;



        System.out.println("Today I am going to an archery shoot with my " +family2.age+ " year old " +family2.relation+" and my "
        +family.age+ " year old " +family.relation+".\n");
        System.out.println("We will be taking my " +car.year+ " " +car.doors+ " door " +car.makeModel+
                " with a " +car.engineSize+ " liter engine.\n");
        System.out.println("In today's shoot, I am using my " + archery.bow + " and my " + archery.quiver+
                " will hold my " +archery.arrows+ " arrows.");

        if (score.firstPlace) {
            System.out.println("\n" + "During the shoot I did well. However I only scored one bullseye worth" + score.targetHit + " points. " +
                    "In the end, I got First Place!");
        }
        else if (score.secondPlace) {
            System.out.println("\n" + "During the shoot I did well. However I only scored one bullseye worth" + score.targetHit + " points. " +
                    "In the end, I got Second Place!");
        }

        System.out.println("\nOn the way home we decided to get ice cream. I got a " +iceCream.size2+ " " +iceCream.flavors[0] +
        ". My " +family.relation+ " and " +family2.relation+ " split a " +iceCream.size3+ " " +iceCream.flavors[2]+ ".");



    }
}
