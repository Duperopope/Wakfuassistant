/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eVO
 */
class evo_0
extends evb_0 {
    final /* synthetic */ evb_0[] rAy;

    evo_0(evb_0[] evb_0Array) {
        this.rAy = evb_0Array;
    }

    @Override
    public boolean a(exP exP2, eVw eVw2) {
        for (evb_0 evb_02 : this.rAy) {
            if (evb_02.a(exP2, eVw2)) continue;
            return false;
        }
        return true;
    }

    @Override
    protected String name() {
        StringBuilder stringBuilder = new StringBuilder("and(");
        for (int i = 0; i < this.rAy.length; ++i) {
            evb_0 evb_02 = this.rAy[i];
            stringBuilder.append(evb_02.name()).append(", ");
        }
        if (this.rAy.length > 0) {
            stringBuilder.setLength(stringBuilder.length() - 2);
        }
        return stringBuilder.append(")").toString();
    }
}

