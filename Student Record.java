class Stundent {
    String name;
    int marks;

    void display() {
        System.out.println("Name:" + name);
         System.out.println("Marks:" + marks);
    }
    public static void main(String[] args){
        Stundent s = new Stundent();
        s.name = "Rahul";
        s.marks = 85;
        s.display();
    }
}