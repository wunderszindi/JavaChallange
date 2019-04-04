class Newtonian extends Telescope {

    private boolean needToCollimate;

    public Newtonian(int diameter, int focalLength) {
        super(diameter, focalLength);
    }
    Telescope telescope = new Telescope(getDiameter(), getFocalLength());

    public Newtonian(int diameter, int focalLength, boolean needToCollimate) {
        super(diameter, focalLength);
        this.needToCollimate = needToCollimate;
    }

    public boolean isNeedToCollimate() {
        return needToCollimate;
    }

    public void setNeedToCollimate(boolean needToCollimate) {
        this.needToCollimate = needToCollimate;
    }

    public Telescope getTelescope() {
        return telescope;
    }

    public void setTelescope(Telescope telescope) {
        this.telescope = telescope;
    }

    @Override
    public String toString() {
        return "Newtonian{" +
                "needToCollimate=" + needToCollimate +
                ", telescope=" + telescope +
                '}';
    }
}
