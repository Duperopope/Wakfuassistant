/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aHL
 */
public class ahl_2 {
    private int bap;
    private int baq;

    public ahl_2(int n, int n2) {
        this.bap = n;
        this.baq = n2;
    }

    public ahl_2(acc_1 acc_12) {
        this.bap = acc_12.bWx();
        this.baq = acc_12.bWy();
    }

    public final int cek() {
        return this.bap;
    }

    public final int cel() {
        return this.baq;
    }

    public final void cT(int n, int n2) {
        this.bap += n;
        this.baq += n2;
    }

    public final void a(ahl_2 ahl_22) {
        this.bap += ahl_22.bap;
        this.baq += ahl_22.baq;
    }

    public final void b(ahl_2 ahl_22) {
        this.bap -= ahl_22.bap;
        this.baq -= ahl_22.baq;
    }

    public final void cU(int n, int n2) {
        this.bap = n;
        this.baq = n2;
    }

    public String toString() {
        return "Coord(" + this.bap + ";" + this.baq + ")";
    }

    public final int hashCode() {
        long l = 31L * (31L + (long)this.bap) + (long)this.baq;
        return (int)(l ^ l >> 32);
    }

    public final boolean cV(int n, int n2) {
        return this.bap == n && this.baq == n2;
    }

    public final boolean c(ahl_2 ahl_22) {
        return this.bap == ahl_22.bap && this.baq == ahl_22.baq;
    }
}

