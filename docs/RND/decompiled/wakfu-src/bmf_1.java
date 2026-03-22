/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bMf
 */
public class bmf_1
extends bmq_0 {
    private final eSS kvS;

    public bmf_1(eSS eSS2, short s) {
        this.kvS = eSS2;
        this.ejt = s;
    }

    @Override
    public Object eu(String string) {
        switch (string) {
            case "nameWithFormat": {
                return aum_0.cWf().a(6, (long)((short)this.kvS.bcw()), new Object[0]);
            }
            case "iconUrl": {
                return auc_0.cVq().a("effectAreasIconsPath", null, (short)this.kvS.bcw());
            }
            case "effectDescription": 
            case "nonCriticalEffectDescription": {
                eLW eLW2 = new eLW(this.kvS, this.ejt, 0);
                return eLW2.fzQ();
            }
        }
        return super.eu(string);
    }

    @Override
    public short eel() {
        short s = (short)this.kvS.Fq();
        return s == 0 ? (short)245 : (short)s;
    }

    @Override
    public short eem() {
        return (short)this.kvS.bcw();
    }
}

