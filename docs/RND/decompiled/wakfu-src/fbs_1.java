/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fBs
 */
public class fbs_1 {
    private float cfH;
    private float tSD;
    private final ArrayList<ffm_1> tSE = new ArrayList();
    private final ArrayList<ffn_1> tSF = new ArrayList();
    private final ArrayList<ffo_1> tSG = new ArrayList();

    public float gsW() {
        return this.cfH;
    }

    public void fu(float f2) {
        this.cfH = f2;
    }

    public float gsX() {
        return this.tSD;
    }

    public void fv(float f2) {
        this.tSD = f2;
    }

    public void a(ffn_1 ffn_12) {
        this.tSF.add(ffn_12);
    }

    public void a(ffo_1 ffo_12) {
        this.tSG.add(ffo_12);
    }

    public void a(ffm_1 ffm_12) {
        this.tSE.add(ffm_12);
    }

    public ArrayList<ffm_1> gsY() {
        return this.tSE;
    }

    public ArrayList<ffn_1> gsZ() {
        return this.tSF;
    }

    public ArrayList<ffo_1> gta() {
        return this.tSG;
    }
}

