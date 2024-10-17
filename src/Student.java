public class Student {
    String name;
    int ID;
    double[] marks = new double[5];

    //Method to input student marks
    public void setMarks(double[] marks) {
        for (int i = 0; i < marks.length; i++) {
            //Input validation
            if(marks[i] < 0 || marks[i] > 100){
                throw new IllegalArgumentException("Marks must be between 0 and 100");
            }else{
                this.marks[i] = marks[i];
            }
        }
    }

    //Method to input student details i.e name and student ID
    public void setDetails(String name, int ID){
        this.name = name;
        this.ID = ID;
    }

    //Method to calculate the average of the five units
    public double calculateAverage(){
        double total = 0;
        for(int i = 0; i < marks.length; i++){
            total += marks[i];
        }

        return total/marks.length;
    }

    //Method to assign a grade to the student
    public String assignGrade(){
        double avg = calculateAverage();

        if(avg>=80 && avg<=100){
            return "Mastery";
        }else if(avg>=65 && avg<=79){
            return "Proficient";
        }else if(avg>=50 && avg<=64){
            return "competent";
        }else{
           return "Not yet competent";
        }
    }
}
