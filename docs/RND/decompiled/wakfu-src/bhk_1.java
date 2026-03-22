/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bHK
 */
public class bhk_1
extends bhq_2 {
    public bhk_1(short s, short s2, bhl_1 bhl_12) {
        super(s, s2, bhl_12::dVd);
    }

    @Override
    public bhh_1 dWS() {
        return bhh_1.kcq;
    }

    @Override
    public void b(fiu_0 fiu_02) {
        if (!this.isValid()) {
            this.c(fiu_02);
            return;
        }
        fiu_02.fk((short)this.kcI);
        fiu_02.fl((short)this.kcJ);
    }

    @Override
    protected void c(fiu_0 fiu_02) {
        fiu_02.fk((short)-1).fl((short)-1);
    }

    @Override
    public String dDG() {
        short s;
        short s2 = (short)this.ls(0L);
        if (s2 == (s = (short)this.lt(245L))) {
            return aum_0.cWf().c("levelShort.custom", s2);
        }
        return aum_0.cWf().c("levelShort.custom", s2 + " - " + s);
    }
}

