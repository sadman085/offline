/**
 * Created by HP on 9/19/2015.
 */
public class Room {

        private String hallName;
        private int roomNo;
        private boolean status;

        public Room(){

        }
        public Room(String hallName, int roomNo){
            this.hallName = hallName;
            this.roomNo = roomNo;
            status = false;
        }

        void setHallName(String hallName){
            this.hallName = hallName;
        }

        void setRoomNo(int roomNo){
            this.roomNo = roomNo;
        }

        void setStatus(boolean status ){
            this.status = status ;
        }
        String getHallName(){
        return hallName;
    }
        int getRoomNo(){
        return roomNo;
    }
        boolean getStatus(){
        return status;
    }
        void print(){
            if(getStatus()){
                System.out.println("Room No, " + getRoomNo() + " of " + getHallName() + " Hall is currently alloted.");
            } else {
                System.out.println("Room No, " +getRoomNo()+ " of " + getHallName() + " Hall is currently available for allotment.");
            }
        }
    }



