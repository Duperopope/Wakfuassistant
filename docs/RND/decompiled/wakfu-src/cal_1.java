/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cal
 */
public class cal_1
implements cpc_1 {
    static final Logger lFX = Logger.getLogger(cal_1.class);
    public static final cal_1 lFY = new cal_1();
    private final cam_1 lFZ = new cam_1("patchImagePath", "patchImageOffsetFile");
    private final cam_1 lGa = new cam_1("buildingImagePath", "buildingImageOffsetFile");

    private cal_1() {
        try {
            this.lFZ.aPg();
            this.lGa.aPg();
        }
        catch (Exception exception) {
            lFX.error((Object)"", (Throwable)exception);
        }
    }

    @Override
    public float ere() {
        return this.lFZ.getScale();
    }

    @Override
    public float erf() {
        return this.lGa.getScale();
    }

    @Override
    public acc_1 JW(int n) {
        return this.lFZ.Kc(n);
    }

    @Override
    public acc_1 JX(int n) {
        return this.lGa.Kc(n);
    }

    @Override
    public awk_1 JY(int n) {
        return this.lFZ.qW(n);
    }

    @Override
    public awk_1 JZ(int n) {
        return this.lGa.qW(n);
    }

    public acc_1 Ka(int n) {
        return this.lFZ.Kd(n);
    }

    public acc_1 Kb(int n) {
        return this.lGa.Kd(n);
    }

    @Override
    public void erg() {
        this.lFZ.erg();
        this.lGa.erg();
    }
}

