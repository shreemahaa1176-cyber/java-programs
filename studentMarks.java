
    public static void main(string[]args){
        int[] marks = { 70, 45, 80, 35, 90};
        //1.traversal - print all marks
        System.out.println("Student Marks:");
        for (int i = 0; i < marks.length; i++){
         System.out.println(marks[i]);
        }
       // 2. Seacrch - find 80
       int seacrch = 80
       for (int i = 0; i < marks.length; i++){
        if (marks[i]== seacrch){
        System.out.println("80 found at index" + i);
        }
       }
       //3. counting - count student who passsed
       int count = 0;
       for(int i = 0; i < marks.length; i++){
         
        if (marks[i]> = 40){
            count++;
        }
       }
       System.out.println("Number of students passed:" + count);
       //4.Extrems - find highest and lowest
       int highest = marks[0];
       int lowest  = marks[0];
       for (int i = 1; i < marks.length; i++){
        if (marks[i]> highest){
            highest = marks[i];
        }
        if (marks[i]< lowest){
            lowest = marks[i;]

        }
       }
       System.out.println("Heighest marks:"+ highest);
       System.out.println("Lowest marks:" + lowest);
    }

