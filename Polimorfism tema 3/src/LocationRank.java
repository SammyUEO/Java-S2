public enum LocationRank {

    I(1), II(2), III(3), VI(4);

    private int rank;

    private LocationRank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }
}
