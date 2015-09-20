/**
 * Created by HP on 9/19/2015.
 */
public class Student {


    private String studentName;
    private   String studentNo;
    private   Room room;

    public  Student(){

        }
    public  Student(String studentName, String studentNo, Room room) {
            this.studentName = studentName;
            this.studentNo = studentNo;
            this.room = room;
        }

    void setStudentName(String studentName){
        this.studentName = studentName;
    }

    void setStudentNo(String studentNo){
        this.studentNo = studentNo;
    }

    void setRoom(Room room){
        this.room = room;
    }
    String getStudentName() {
        return studentName;
    }
    String getStudentNo() {
        return studentNo;
    }
    Room getRoom() {
        return room;
    }
    void print(){
        System.out.println("Student No: "+getStudentNo() + ", " + getStudentName() + ", resides on " + room.getHallName()+" Hall, Room no, " + room.getRoomNo());
    }
}


