/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fTv
 */
public class ftv_2
extends ug_0 {
    private final aef_2 vgj;
    private final String[] vgk;

    public ftv_2(ux_0 ux_02, aef_2 aef_22, String ... stringArray) {
        super(ux_02);
        this.vgj = aef_22;
        this.vgk = new String[stringArray.length];
        System.arraycopy(stringArray, 0, this.vgk, 0, stringArray.length);
    }

    @Override
    public void a(ut_0 ut_02) {
        fse_1.gFu().a(this.vgj, this.vgk);
    }
}

