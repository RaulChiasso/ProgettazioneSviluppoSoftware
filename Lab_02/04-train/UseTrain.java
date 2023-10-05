class UseTrain {
    public static void main(String[] args) {
                
        Train treno = new Train();
        treno.build(100, 20, 80);
        treno.reserveFirstClassSeats(5);
        System.out.println(treno.getFirstClassOccupancyRatio() + "%");
        treno.reserveSecondClassSeats(8);
        System.out.println(treno.getSecondClassOccupancyRatio() + "%");
        treno.deleteAllReservations();
        treno.reserveFirstClassSeats(3);
        System.out.println(treno.getFirstClassOccupancyRatio() + "%");
        treno.reserveSecondClassSeats(9);
        System.out.println(treno.getSecondClassOccupancyRatio() + "%");
    }
}
