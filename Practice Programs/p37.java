class Box {
    int height;
    int width;
    int depth;

    int volume() {
        int vol = height * width * depth;
        return vol;
    }
}

class AdvBox {
    int height;
    int width;
    int depth;

    void getData(int h, int w, int d) {
        this.height = h;
        this.width = w;
        this.depth = d;
    }

    int volume() {
        int vol = height * width * depth;
        return vol;
    }
}

public class p37 {
    public static void main(String args[]) {
        int height = 10;
        int width = 10;
        int depth = 10;
        Box myBox1 = new Box();
        myBox1.height = height;
        myBox1.width = width;
        myBox1.depth = depth;
        System.out.println("Volume: " + myBox1.volume());

        AdvBox myAdvBox = new AdvBox();
        myAdvBox.getData(20, 20, 20);
        System.out.println("Volume: " + myAdvBox.volume());

    }
}
