/*
 * Decompiled with CFR 0.152.
 */
/*
 * Signature claims super is aDm$aDp, not adp_2 - discarding signature.
 * Renamed from aFv
 */
class afv_1
extends adp_2 {
    afv_1(afs_1 afs_12, byte[] byArray) {
        super(afs_12, byArray);
    }

    @Override
    public long bLZ() {
        try {
            return ((byte[])this.dDw).length;
        }
        catch (NullPointerException nullPointerException) {
            return 0L;
        }
    }
}

