package pl.sda.lukaszewicz;

 class Bear extends Animal implements Attackable{

     private AttackStrategy attackStrategy;
     private Arena arena;

     public void setArena(Arena arena) {
         this.arena = arena;
     }


     public Bear(AttackStrategy attackStrategy, int weight, String name) {
            super(weight, name);
            this.attackStrategy = attackStrategy;
     }

     @Override
     public void attack(Animal animal) {
         attackStrategy.attack(this, animal);
     }

     //zaimplementowac klase posredniczaca - zrobione
}
