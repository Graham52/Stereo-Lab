public class Radio extends Component implements IControl {


    public Radio(String make, String model){
        super(make, model);
    }

    public String tune() {
        return "Forth One";
    }

    @Override
    public String play() {
        return "Playing song";
    }

    @Override
    public String volume() {
        return "Volume raised";
    }
}
