public class Seat_Reservation_Manager {

    class SeatManager {

        int n ;
        int i =1;
        boolean a [] ;
        public SeatManager(int n) {
            this.n=n;
            a= new boolean[n+1];
        }

        public int reserve() {
            while (a[i]!=false)
                i++;
            a[i]=true;
            return i++;
        }

        public void unreserve(int seatNumber) {

            a[seatNumber]=false;
            if(seatNumber<i)
            {
                i =seatNumber;
            }
        }
    }

}
