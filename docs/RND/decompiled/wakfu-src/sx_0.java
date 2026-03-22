/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from SX
 */
public class sx_0
implements sw_0 {
    private int bjW;
    private int bjX;
    private short bjY;
    private int brI;
    private int brJ;

    public sx_0(int n) {
        this.setRadius(n);
    }

    @Override
    public void e(int n, int n2, short s) {
        this.bjW = n;
        this.bjX = n2;
        this.bjY = s;
    }

    @Override
    public boolean Q(int n, int n2) {
        return (this.bjW - n) * (this.bjW - n) + (this.bjX - n2) * (this.bjX - n2) <= this.brJ;
    }

    @Override
    public void bdt() {
        this.setRadius(this.brI + 1);
    }

    @Override
    public int bdu() {
        return (int)Math.ceil((double)this.brJ * Math.PI);
    }

    @Override
    public boolean bdv() {
        return false;
    }

    @Override
    public ArrayList<acd_1> f(int n, int n2, short s) {
        assert (false) : "Use flood fill algorithm to fill the shape";
        return null;
    }

    public void setRadius(int n) {
        this.brI = n;
        this.brJ = n * n;
    }

    public int getRadius() {
        return this.brI;
    }

    public short bgt() {
        return this.bjY;
    }

    public int bgu() {
        return this.bjX;
    }

    public int bgv() {
        return this.bjW;
    }
}

