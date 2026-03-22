/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cQs
 */
public class cqs_1
extends cpm_1 {
    public static final String nld = "fight.marker";
    private bts_0 nle;
    private acd_1 lYg;

    @Override
    public cps_1 eLz() {
        return cps_1.njQ;
    }

    @Override
    public void run() {
        cub_1.eSi().a(this.nle.dIk(), this.lYg);
    }

    @Override
    public boolean bxO() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public String getStyle() {
        return this.nle.dIl();
    }

    @Override
    public String ely() {
        return nld;
    }

    @Override
    public cpm_1 eLD() {
        return new cqs_1();
    }

    public void a(bts_0 bts_02) {
        this.nle = bts_02;
    }

    public void Z(acd_1 acd_12) {
        this.lYg = acd_12;
    }
}

