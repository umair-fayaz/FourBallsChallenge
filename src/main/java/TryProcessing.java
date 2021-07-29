import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;
    int x = 0;
    int y = 0;
    int z = 0;
    int a = 0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        println("Called from the setup method!");
    }

    @Override
    public void draw() {
        ellipse(x,HEIGHT/5,10,10);
        ellipse(y,HEIGHT*2/5,10,10);
        ellipse(z,HEIGHT*3/5,10,10);
        ellipse(a,HEIGHT*4/5,10,10);

        x++;
        y += 2;
        z += 3;
        a += 4;
    }
}
