/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from caU
 */
public class cau_1
extends caj_2 {
    private static final long lHS = 1000000L;
    private final int lHT;

    public cau_1(@NotNull fti_0 fti_02) {
        super(1000000L + (long)fti_02.cZa(), 0, fti_02.bkP(), fti_02.bkQ());
        this.lHT = fti_02.glK();
        this.dZe();
    }

    @Override
    public int conn() {
        return this.lHT;
    }

    @Override
    public fbk_0 erN() {
        return caw_1.lHV;
    }
}

