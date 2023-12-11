public class Main {
    public static void main(String[] args) {
       Pet pet = new Cat();

       pet.setName ("Я - пушистик");

       System.out.println(pet.getName);
    }

    public static class Pet {
        public boolean getName;
        protected String name;

        public Pet() { }

     public final String getName() {
            return name;
      }

       public void setName(String name) {
            this.name = name;
        }

    }

    public static class Cat extends Pet {


        @Override
        public void setName(String name) {
            super.setName(StringStore.imCat);
        }
    }

}