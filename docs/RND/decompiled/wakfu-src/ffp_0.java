/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ffP
 */
public class ffp_0<ItemType extends ffV> {
    private byte sgr = 1;
    private ffs_0 sgs;
    private ItemType sgt;
    private long kVl;
    private int ejM;
    public static final byte sgu = 0;
    public static final byte sgv = 1;
    public static final byte sgw = 2;
    public static final byte sgx = 3;
    public static final byte sgy = 4;

    public byte fVH() {
        return this.sgr;
    }

    public void gi(byte by) {
        this.sgr = by;
    }

    public ffs_0 fVI() {
        return this.sgs;
    }

    public void h(ffs_0 ffs_02) {
        this.sgs = ffs_02;
    }

    public ItemType fVJ() {
        return this.sgt;
    }

    public void cB(ItemType ItemType) {
        this.sgt = ItemType;
    }

    public long eAU() {
        return this.kVl;
    }

    public void lk(long l) {
        this.kVl = l;
    }

    public int oP() {
        return this.ejM;
    }

    public void Fq(int n) {
        this.ejM = n;
    }

    public boolean aGv() {
        return this.sgr == 0;
    }
}

