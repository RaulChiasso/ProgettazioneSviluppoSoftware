public class Train {
    int nTotSeats;
    int nFirstClassSeats;
    int nSecondClassSeats;
    int nFirstClassReservedSeats;
    int nSecondClassReservedSeats;

    void build(int nTotSeats, int nFirstClassSeats, int nSecondClassSeats) {
        this.nTotSeats = nTotSeats;
        this.nFirstClassSeats = nFirstClassSeats;
        this.nSecondClassSeats = nSecondClassSeats;
    }

    void reserveFirstClassSeats(int nSeats){
        if (nSeats < (nFirstClassSeats - nFirstClassReservedSeats)){
            nFirstClassReservedSeats += nSeats;
            System.out.println("Hai risevato " + nSeats + " posti in prima classe");
        }else{
            System.out.println("Non ci sono abbastanza posti disponibili");
        }
    }

    void reserveSecondClassSeats(int nSeats){
        if (nSeats < (nSecondClassSeats - nSecondClassReservedSeats)){
            nSecondClassReservedSeats += nSeats;
            System.out.println("Hai risevato " + nSeats + " posti in seconda classe");
        }else{
            System.out.println("Non ci sono abbastanza posti disponibili");
        }
    }

    double getTotOccupancyRatio(){
        double ratio = (((double)nFirstClassReservedSeats + (double)nSecondClassReservedSeats) / nTotSeats) *100;
        return ratio;
    }

    double getFirstClassOccupancyRatio(){
        double ratio = ((double)nFirstClassReservedSeats / (double)nFirstClassSeats) * 100;
        return ratio;
    }

    double getSecondClassOccupancyRatio(){
        double ratio = ((double)nSecondClassReservedSeats / (double)nSecondClassSeats) * 100;
        return ratio;
    }

    void deleteAllReservations(){
        nFirstClassReservedSeats=0;
        nSecondClassReservedSeats=0;
    }
}
