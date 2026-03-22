/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bqI
 */
public class bqi_0
implements bru_0 {
    public static final aox_1 jaY = new brw_0(new brv_0("standard", new aou_1[0]), new brv_0("filtr\u00e9", new aou_1("Coordonn\u00e9es de partition quitt\u00e9e {x,y}"), new aou_1("Coordonn\u00e9es de partition entr\u00e9e {x,y}")));
    private final String jaZ;
    private final String jba;

    public bqi_0(bze_2 bze_22, bze_2 bze_23) {
        this.jaZ = "{" + bze_22.getX() + "," + bze_22.getY() + "}";
        this.jba = "{" + bze_23.getX() + "," + bze_23.getY() + "}";
    }

    @Override
    public String[] dEy() {
        return new String[]{this.jaZ, this.jba};
    }

    @Override
    public aox_1 bEt() {
        return jaY;
    }

    @Override
    public int d() {
        return brx_0.jdV.d();
    }
}

