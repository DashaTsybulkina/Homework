package car;

public class Engine {
    private boolean isStart;
    private String typeEngine;
    private final double volume;

    public Engine(String typeEngine, double volume) {
        this.volume = volume;
        this.typeEngine = typeEngine;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "isStart=" + isStart +
                ", typeEngine='" + typeEngine + '\'' +
                ", volume=" + volume +
                '}';
    }

    public boolean getIsStart() {
        return isStart;
    }

    public void setStart(boolean start) {
        isStart = start;
    }

}
