 
        
        System.out.println("The time has come...");
        System.out.println("You stood before the room for your exam...");
        System.out.println("Are you ready?");

        System.out.println("1. Yes");
        System.out.println("2. No");

        String fake = sc.nextLine();

        System.out.println("It doesn't matter, if you are ready or not");
        System.out.println("Best you can do it pray you studied enough");

        System.out.println("Taking a deep breath, you entered the room");

        System.out.println(performance);

        check = Exam.exam(study);

        performance += check;

     return performance;

}
