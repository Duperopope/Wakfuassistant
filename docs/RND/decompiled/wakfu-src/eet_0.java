/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eEt
 */
abstract class eet_0
extends eAH {
    protected boolean pvJ;
    protected eEu pBJ;

    eet_0() {
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        boolean bl;
        exP exP2 = eAs.a(false, object, object2, object4, object3);
        if (exP2 == null) {
            return -1;
        }
        etu_0 etu_02 = eAs.aO(object4);
        if (etu_02 == null) {
            return -1;
        }
        acd_1 acd_12 = null;
        if (this.pvJ) {
            if (object2 instanceof exP) {
                acd_12 = ((exP)object2).eap();
            } else if (object2 instanceof acd_1) {
                acd_12 = (acd_1)object2;
            }
            if (acd_12 == null) {
                return 0;
            }
        } else {
            acd_12 = exP2.aZw();
        }
        if (bl = this.a(exP2, etu_02, acd_12)) {
            return 0;
        }
        return -1;
    }

    protected abstract boolean a(exP var1, etu_0 var2, acd_1 var3);

    protected void rU(String string) {
        if (string.equalsIgnoreCase(eEu.pBK.toString())) {
            this.pBJ = eEu.pBK;
        } else if (string.equalsIgnoreCase(eEu.pBL.toString())) {
            this.pBJ = eEu.pBL;
        }
    }
}

