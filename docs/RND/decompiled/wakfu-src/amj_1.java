/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from amJ
 */
public class amj_1
extends ang_2 {
    private final ang_2 cJb;
    private final ang_2 cJc;
    private final ang_2 cJd;

    public static amx_1 a(amx_1 amx_12, amx_1 amx_13, amx_1 amx_14) {
        if (amx_12 == null || amx_12.bDv() != amz_1.cJz) {
            throw new amw_2("La condition d'un if doit \u00eatre un bool\u00e9en");
        }
        if (amx_13 == null || amx_14 == null || amx_13.bDv() != amx_14.bDv()) {
            throw new amw_2("Les deux branches d'un if doivent exister et avoir le m\u00eame type ");
        }
        if (amx_13.bDv() == amz_1.cJz) {
            if (((ang_2)amx_12).bDp()) {
                if (((ang_2)amx_12).b(null, null, null, null)) {
                    if (((ang_2)amx_13).bDp()) {
                        return new amz_2(((ang_2)amx_13).b(null, null, null, null));
                    }
                    return amx_13;
                }
                if (((ang_2)amx_14).bDp()) {
                    return new amz_2(((ang_2)amx_14).b(null, null, null, null));
                }
                return amx_14;
            }
            return new amj_1((ang_2)amx_12, (ang_2)amx_13, (ang_2)amx_14);
        }
        if (amx_13.bDv() == amz_1.cJy || amx_13.bDv() == amz_1.cJC && amx_13.bDv() == amx_14.bDv()) {
            if (((ang_2)amx_12).bDp()) {
                if (((ang_2)amx_12).b(null, null, null, null)) {
                    return amx_13;
                }
                return amx_14;
            }
            return new amk_1((ang_2)amx_12, (amu_1)amx_13, (amu_1)amx_14);
        }
        throw new amw_2("Les deux branches d'un if doivent \u00eatre soit bool\u00e9ennes soit num\u00e9riques");
    }

    public amj_1(ang_2 ang_22, ang_2 ang_23, ang_2 ang_24) {
        this.cJb = ang_22;
        this.cJc = ang_23;
        this.cJd = ang_24;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (this.cJb.b(object, object2, object3, object4)) {
            return this.cJc.a(object, object2, object3, object4);
        }
        return this.cJd.a(object, object2, object3, object4);
    }

    @Override
    public boolean bDp() {
        return false;
    }

    @Override
    public Enum bDq() {
        return amg_2.cIJ;
    }
}

