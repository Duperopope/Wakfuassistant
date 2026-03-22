/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class VP
extends aho_2 {
    private static final Logger bKs = Logger.getLogger(VO.class);

    public VP(int n, int n2) {
        super(n, n2);
    }

    @Override
    public final int bkR() {
        return this.getWidth() * this.getHeight() * 2;
    }

    @Override
    public final ahl_2 av(int n, int n2) {
        int n3 = (int)Math.floor((double)(n - n2) / (2.0 * (double)this.getWidth()));
        int n4 = (int)Math.floor((double)(n + n2) / (2.0 * (double)this.getHeight()));
        return new ahl_2(n3, n4);
    }

    @Override
    public int aw(int n, int n2) {
        return (int)Math.floor((double)(n - n2) / (2.0 * (double)this.getWidth()));
    }

    @Override
    public int ax(int n, int n2) {
        return (int)Math.floor((double)(n + n2) / (2.0 * (double)this.getHeight()));
    }

    @Override
    public final ahl_2 ay(int n, int n2) {
        int n3 = n2 * this.getHeight() - n * this.getWidth();
        int n4 = 2 * n * this.getWidth() + n3;
        return new ahl_2(n4, n3);
    }

    @Override
    public final int az(int n, int n2) {
        return 2 * n * this.getWidth() + this.aA(n, n2);
    }

    @Override
    public final int aA(int n, int n2) {
        return n2 * this.getHeight() - n * this.getWidth();
    }

    @Override
    public final int au(int n, int n2) {
        int n3 = n + n2;
        int n4 = (n3 + 1) / 2;
        int n5 = n3 * this.getWidth() + (n - n4);
        assert (n5 < this.bkR()) : "x et y doivent \u00eatre les coordon\u00e9es d'une cellule dans la map et pas dans le monde";
        return n5;
    }

    @Override
    public int qa(int n) {
        assert (n < this.bkR() && n >= 0) : "tentative de r\u00e9cup\u00e9ration de cellule avec un indice incorrect";
        int n2 = n / this.getWidth();
        int n3 = (n2 + 1) / 2;
        int n4 = n - n2 * this.getWidth();
        return n3 + n4;
    }

    @Override
    public int qb(int n) {
        assert (n < this.bkR() && n >= 0) : "tentative de r\u00e9cup\u00e9ration de cellule avec un indice incorrect";
        int n2 = n / this.getWidth();
        int n3 = (n2 + 1) / 2;
        int n4 = n2 - n3;
        int n5 = n - n2 * this.getWidth();
        return n4 - n5;
    }

    @Override
    public byte bkS() {
        return 111;
    }

    public static void main(String[] stringArray) {
        VP vP = new VP(3, 4);
        System.out.println(String.valueOf(vP.yt(6)));
        System.out.println("" + vP.d(new ahl_2(4, 2)));
    }
}

