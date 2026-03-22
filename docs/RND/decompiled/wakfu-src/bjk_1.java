/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bjk
 */
public class bjk_1 {
    private long aXv;
    private short inX;
    private short ejt;

    protected bjk_1(long l, short s, short s2) {
        this.aXv = l;
        this.inX = s;
        this.ejt = s2;
    }

    public long Sn() {
        return this.aXv;
    }

    public void dC(long l) {
        this.aXv = l;
    }

    public short drh() {
        return this.inX;
    }

    public void bB(short s) {
        this.inX = s;
    }

    public short cmL() {
        return this.ejt;
    }

    public void bw(short s) {
        this.ejt = s;
    }

    public String a(boolean bl, bdq_2 bdq_22) {
        Object object;
        StringBuilder stringBuilder = new StringBuilder();
        bjz_1 bjz_12 = bja_1.drJ().bC(this.inX);
        if (bl) {
            stringBuilder.append("[").append(this.aXv).append("] ");
        }
        if (bdq_22 != bdq_2.hLg) {
            stringBuilder.append(bjz_12.getName());
        } else {
            stringBuilder.append(aum_0.cWf().c("hooded.monster", new Object[0]));
        }
        switch (bdq_22) {
            case hLd: {
                object = new ahv_2();
                ((ahv_2)object).ceC();
                ((ahv_2)object).ih(bJN.kmB.bQk());
                ((ahv_2)object).c(aum_0.cWf().a(77, aue_0.cVJ().cVK().aqZ(), new Object[0])).ceD();
                stringBuilder.append("\n").append(((ahv_2)object).ceL());
                break;
            }
            case hLf: {
                break;
            }
            case hLg: {
                break;
            }
            case hLe: {
                stringBuilder.append("\n(").append(aum_0.cWf().c("levelShort.custom", this.ejt)).append(")");
            }
        }
        if (bl && (object = bgg_0.dlO().ju(this.aXv)) != null && object instanceof bhx_0) {
            bhx_0 bhx_02 = (bhx_0)object;
            for (ezj_0 ezj_02 : ezj_0.values()) {
                if (!bhx_02.a(ezj_02)) continue;
                stringBuilder.append("\n");
                stringBuilder.append(ezj_02.name());
            }
        }
        return stringBuilder.toString();
    }
}

