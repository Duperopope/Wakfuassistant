/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fhF
 */
public class fhf_0
extends fhi_0 {
    @Override
    public boolean isEditable() {
        return false;
    }

    @Override
    public boolean e(byte by, int n) {
        return false;
    }

    @Override
    public boolean f(byte by, int n) {
        throw new fgE("Impossible d'equiper une gemme sur un ImmutableShards");
    }

    @Override
    public int gB(byte by) {
        throw new fgE("Impossible de retirer une gemme sur un ImmutableShards");
    }
}

