/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bLZ
 */
class blz_1
implements ezm_0 {
    private final long kvq;

    public blz_1(long l) {
        this.kvq = l;
    }

    @Override
    @Nullable
    public ezw ce(short s) {
        bjz_1 bjz_12 = bja_1.drJ().bC(s);
        if (bjz_12 == null) {
            return null;
        }
        short s2 = bjz_12.cqz();
        bmb_1 bmb_12 = new bmb_1(s, bjz_12.getName(), bjz_12.fhP().b(exx_2.rGi, s2), s2, this.kvq);
        bmb_12.a(bjz_12);
        return bmb_12;
    }
}

