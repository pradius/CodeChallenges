class Darts {
    int distance;
    Darts(double x, double y) {

        if (Math.abs(x)  < 1 || Math.abs(y)  < 1) {
            distance =  (int)Math.abs(x + y);
            System.out.println("intial values when equal: " + x + " " + y);
            System.out.println("distance: " + distance);
        }else if (Math.abs(x) == Math.abs(y)){
            distance = (int)(Math.abs(x) + Math.abs(y)) / 2;
            System.out.println("intial values adding/equal: " + x + " " + y);
            System.out.println("distance: " + distance);
        }
        else{
            distance = (int)Math.sqrt((Math.abs(x) * 2) - (Math.abs(y) * 2));
            System.out.println("intial values subtracting: " + x + " " + y);
            System.out.println("distance: " + distance);
        }

    }

    int score() {
        if(distance < 9 && distance > 5){
            return 1;
        }
        else if (distance <= 5 && distance > 1){
            return 5;
        }
        else if (distance == 1 || distance == 0){
            return 10;
        }
        return 0;
    }

}
