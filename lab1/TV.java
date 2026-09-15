public class TV {
    public int channel;
    public int brightness;
    public float gamma;
    public String name;

    public TV(int c, int b, float g, String n){
        channel = c;
        brightness = b;
        gamma = g;
        name = n;
    }

    public TV(){
        this(1, 50, 2.0f, "");
    }

    public TV(String n){
        this(1, 50, 2.0f, n);
    }
}