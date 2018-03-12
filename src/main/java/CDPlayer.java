public class CDPlayer extends Component implements IControl, IComponents{

    int numberOfCDS;

    public CDPlayer(String make, String model, int numberOfCDS){
        super(make, model);
        this.numberOfCDS = numberOfCDS;
    }

    public int numberOfCDS(){
        return 3;
    }

    @Override
    public String play() {
        return "Playing CD";
    }

    @Override
    public String volume() {
        return "Volume mute";
    }

    @Override
    public String pause() {
        return "CD Paused";
    }

    @Override
    public String stop() {
        return "CD Stopped";
    }
}
