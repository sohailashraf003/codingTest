#Project Setup
I have create the main Animal class as abstract call and added the method
implementation of eat, as all the animals can eat but cannot walk

###A. Let’s start with the basics
####I have created a abstract bird class with walk method implementation and abstract sign method.
1. Can you implement the sing() method for the bird? <br>
   > We can implemnent the sign method in the individual bird class as all the birds sign differently.
1. How did you unit test it?
   > We can use spay or mock the inner calling method as the methods don't return anything.
   > We can test the individual bird classes like Duck, Chicken etc.
2. How did you optimize the code for maintainability? (Ask yourself the same
   question for all following exercises )
   > We can have the implementation of the walk method as it's is generic for all the birds. The sign method should be abstract.
>
<br>

####2. Now, we have 2 special kinds of birds: the Duck and the Chicken ... Can you
implement them to make their own special sound?
1. A duck says: “Quack , quack ”
   > I have created the duck class and inherited with FlyingBird and implemented the Swimmer interface
2. A duck can swim
   > I have created the duck class and inherited with FlyingBird and implemented the Swimmer interface
3. A chicken says: “ Cluck, cluck ”
   > I have created the Chicken class and inherited with Bird class
4. A chicken cannot fly (assumption: its wings are clipped but ignore that )
   >  > The chicken  class inherit from Bird class and not all birds can fly
>
<br>

####Now how would you model a rooster?
1. A rooster says: “ Cock-a-doodle-doo ”
   > We can implement Roaster class from bird and implement sign method.
2. How is the rooster related to the chicken?
   > Roster can inherit from chiken as `Roster is a Chicken`.
3. Can you think of other ways to model a rooster without using inheritance?
   > We can use composition

<br>

####4. Can you model a parrot? We are specifically interested in three parrots, one that lived
in a house with dogs one in a house with cats , the other lived on a farm next to
the rooster.
1. A parrot living with dogs says: “Woof, woof”
2. A parrot living with cats says: “ Me ow”
3. A parrot living near the rooster says: “ Cock-a-doodle-doo ”
4. How do you keep the parrot maintainable? What if we need another parrot lives
   near a Duck? Or near a phone that rings frequently?
   > I have created three different class for each type of parrot which implements FlyingBird
>
<br>

###B. Model fish as well as other swimming animals
####1. In addition to the birds, can you model a fish?
1. Fish es don’t sing
2. Fish es don’t walk
3. Fish es can swim
   > I have created a abstract  Fish class which inherits from Animal class and implements Swimmer class.
   <br>
####2. Can you specialize the fish as a Shark and as a Clownfish?
1. Sharks are large and grey
2. Clownfish are small and colourful (orange)
3. Clownfish make jokes
4. Sharks eat other fish
   <br>
   > Created two concreate classes for Shark and Clownfish with their attribute and these classes inherits from Fish Class.
####3. Dolphin s are not exactly f ish, yet, they are good swimmers
1. Can you model a dolphin that swims without inheriting from a fish class?
2. How do you avoid duplicating code or introducing unneeded overhead?
> This can be achieved by inheriting from Animal Class an implementing Swimmer class.

####C. Model animals that change their behaviour over time
1. Can you model a butterfly?
1. A butterfly can fly
2. A butterfly does not make a sound
2. Can you optimize your model to account for the metamorphosis from caterpillar to
   butterfly?
1. A caterpillar cannot fly
2. A caterpillar can walk (crawl)
> We can use Factory pattern to get the instance of this based on some condtion.
>

<br>

D. Counting animals
Suppose you have an array of animals, e.g.

Animal[] animals = new Animal[]{
new Bird(),
new Duck(),
new Chicken(),
new Rooster(),
new Parrot(),
new Fish(),
new Shark(),
new Clownfish(),
new Dolhpin (),
new Frog (),
new Dog(),
new Butterfly (),
new Cat()
};

> We can use instanceof operator to know the type of the object