package singletonPattern;

/**
 * this  Case will create multiple instance of Singleton class,
 * but we want a single instance of the class
 */

class SingletonDesignPattern {
    public static void main(String[] args) {
        Singleton instance = new Singleton();
        Singleton instance1 = new Singleton();
        Singleton instance2 = new Singleton();

        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        //this will toString of the method result
        System.out.println(instance);
        System.out.println(instance1);
        System.out.println(instance2);

    }
}

//create a class for Agar Approach Example
class Singleton {
    //class constructor should be private so that we con't access from outside
    Singleton() {
    }
}

/**
 * Singleton Eagar Approach
 */

//for singleton Eagar Approach code
class SingletonDesignPattern1 {
    public static void main(String[] args) {
        SingletonEager instance = SingletonEager.getInstance();
        SingletonEager instance1 = SingletonEager.getInstance();
        SingletonEager instance2 = SingletonEager.getInstance();

        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        //this will toString of the method result
        System.out.println(instance);
        System.out.println(instance1);
        System.out.println(instance2);

    }
}


//create a class for Agar Approach Example
class SingletonEager {
    //create an instance in initialize it
    private static final SingletonEager instance = new SingletonEager();

    //class constructor should be private so that we con't access from outside
    private SingletonEager() {
    }

    //create a method for get class instance
    public static SingletonEager getInstance() {
        return instance;
    }
}


/**
 * Singleton Lazy initialization Approach
 */

class SingletonDesignPattern2 {
    public static void main(String[] args) {
        SingletonLazy instance = SingletonLazy.getInstance();
        SingletonLazy instance1 = SingletonLazy.getInstance();
        SingletonLazy instance2 = SingletonLazy.getInstance();

        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        //this will toString of the method result
        System.out.println(instance);
        System.out.println(instance1);
        System.out.println(instance2);

    }
}


//create a class for SingletonLazy Approach Example
class SingletonLazy {
    //create an instance
    private static SingletonLazy instance;

    //class constructor should be private so that we con't access from outside
    private SingletonLazy() {
    }

    //create a method for get class instance
    public static SingletonLazy getInstance() {
        //we check if  instance is null than create new instance ,
        // if not return old instance
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}


/**
 * Singleton Lazy Synchronized initialization Approach
 */

class SingletonDesignPattern3 {
    public static void main(String[] args) {
        SingletonSynchronized instance = SingletonSynchronized.getInstance();
        SingletonSynchronized instance1 = SingletonSynchronized.getInstance();
        SingletonSynchronized instance2 = SingletonSynchronized.getInstance();

        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        //this will toString of the method result
        System.out.println(instance);
        System.out.println(instance1);
        System.out.println(instance2);

    }
}


//create a class for Synchronized Approach Example
class SingletonSynchronized {
    //create an instance
    private static SingletonSynchronized instance;

    //class constructor should be private so that we con't access from outside
    private SingletonSynchronized() {
    }

    //create a synchronized method for class instance so if two thread
    // required  this instance at same time it wil handle ,so only one
    // thread can get access of class instance ot one time
    public static synchronized SingletonSynchronized getInstance() {
        //we check if  instance is null than create new instance ,
        // if not return old instance
        if (instance == null) {
            instance = new SingletonSynchronized();
        }
        return instance;
    }
}


/**
 * Singleton Lazy SingletonDoubleCheck initialization Approach
 */

class SingletonDesignPattern4 {
    public static void main(String[] args) {
        SingletonDoubleCheck instance = SingletonDoubleCheck.getInstance();
        SingletonDoubleCheck instance1 = SingletonDoubleCheck.getInstance();
        SingletonDoubleCheck instance2 = SingletonDoubleCheck.getInstance();

        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        //this will toString of the method result
        System.out.println(instance);
        System.out.println(instance1);
        System.out.println(instance2);

    }
}


//create a class for  SingletonDoubleCheck Example
class SingletonDoubleCheck {
    //create an instance
    private static SingletonDoubleCheck instance;

    //class constructor should be private so that we con't access from outside
    private SingletonDoubleCheck() {
    }

    //create a synchronized method for class instance so if two thread
    // required  this instance at same time it wil handle ,so only one
    // thread can get access of class instance ot one time
    public static synchronized SingletonDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
