public class cat {

        public static void main(String[] args) {
            Woman woman = new Woman();
            Cat cat = new Cat();
            Dog dog = new Dog();
            Fish fish = new Fish();

            cat.owner = woman;



            //напишите тут ваш код
        }

        public static class Cat {
            public Woman owner;
        }

        public static class Dog {
            public Woman owner;
        }

        public static class Fish {
            public Woman owner;
        }

        public static class Woman {
        }
    }

