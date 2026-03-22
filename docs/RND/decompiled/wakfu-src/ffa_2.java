/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fFa
 */
public class ffa_2
extends fey_1<String, String> {
    public boolean tU(String string) {
        if (this.uot == null || ((String)this.uot).isEmpty()) {
            return true;
        }
        if (string == null) {
            return true;
        }
        return BH.bd(string).contains(BH.bd((String)this.uot));
    }

    @Override
    public void jR(boolean bl) {
    }

    @Override
    public void brX() {
    }

    @Override
    public /* synthetic */ boolean aG(Object object) {
        return this.tU((String)object);
    }
}

