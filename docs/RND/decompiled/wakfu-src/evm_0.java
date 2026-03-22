/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eVM
 */
class evm_0
extends evb_0 {
    final /* synthetic */ evb_0[] rAx;

    evm_0(evb_0[] evb_0Array) {
        this.rAx = evb_0Array;
    }

    @Override
    public boolean a(exP exP2, eVw eVw2) {
        for (evb_0 evb_02 : this.rAx) {
            if (!evb_02.a(exP2, eVw2)) continue;
            return true;
        }
        return false;
    }

    @Override
    protected String name() {
        StringBuilder stringBuilder = new StringBuilder("or(");
        for (int i = 0; i < this.rAx.length; ++i) {
            evb_0 evb_02 = this.rAx[i];
            stringBuilder.append(evb_02.name()).append(", ");
        }
        if (this.rAx.length > 0) {
            stringBuilder.setLength(stringBuilder.length() - 2);
        }
        return stringBuilder.append(")").toString();
    }
}

