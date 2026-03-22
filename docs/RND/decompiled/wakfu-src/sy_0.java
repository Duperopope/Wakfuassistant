/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from SY
 */
public class sy_0
implements sw_0 {
    private int bjW;
    private int bjX;
    private short bjY;
    private float brL;
    private float brM;
    private float brN;

    public sy_0(int n, int n2) {
        this.setSize(n, n2);
    }

    @Override
    public void e(int n, int n2, short s) {
        this.bjW = n;
        this.bjX = n2;
        this.bjY = s;
    }

    @Override
    public boolean Q(int n, int n2) {
        if ((float)(n -= this.bjW) <= -this.brL / 2.0f || (float)n > this.brL / 2.0f) {
            return false;
        }
        return !((float)(n2 -= this.bjX) <= -this.brM / 2.0f) && !((float)n2 > this.brM / 2.0f);
    }

    @Override
    public void bdt() {
        this.brL += 1.0f;
        this.brM += this.brN;
    }

    @Override
    public int bdu() {
        return (int)this.brL * (int)this.brM;
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

    public void setSize(int n, int n2) {
        assert (n >= 1);
        assert (n2 >= 1);
        this.brL = n;
        this.brM = n2;
        this.brN = this.brM / this.brL;
    }

    public int bgv() {
        return this.bjW;
    }

    public int bgu() {
        return this.bjX;
    }

    public short bgt() {
        return this.bjY;
    }

    public int getWidth() {
        return (int)this.brL;
    }

    public int aPs() {
        return (int)this.brM;
    }
}

