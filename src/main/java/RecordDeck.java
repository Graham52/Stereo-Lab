public class RecordDeck extends Component implements IControl{

    int playSpeeds;

    public RecordDeck(String make, String model, int playSpeeds){
        super(make, model);
        this.playSpeeds = playSpeeds();
    }

    public int playSpeeds() {
        return 45;
    }

    @Override
    public String play() {
        return "Playing Record";
    }

    @Override
    public String volume() {
        return "Volume Lowered";
    }
}
