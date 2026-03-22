/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aWk
 */
public class awk_0
extends aUS {
    private final byte[] huy;

    public awk_0(int n, int n2, int n3, int n4, byte[] byArray) {
        super(n, n2, n3, n4);
        this.huy = byArray;
    }

    @Override
    protected void cWv() {
        bsj_0 bsj_02 = (bsj_0)this.cja();
        if (bsj_02 == null) {
            dJP.error((Object)"Impossible de debuter un nouvezau tour de table, on ne connait pas le combat ");
            return;
        }
        if (this.cWs()) {
            bsj_02.dGQ().bhK();
        }
        cuu_1.eRU().bhR();
    }

    @Override
    protected void caV() {
    }
}

