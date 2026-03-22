/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aWp
 */
public class awp_0
extends aUS {
    public awp_0(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
    }

    @Override
    protected void cWv() {
        bsj_0 bsj_02;
        bgy bgy2 = this.iD(this.caQ());
        if (bgy2 == null) {
            dJP.error((Object)"D\u00e9but de tour demand\u00e9 pour un fighter inexistant ??");
            return;
        }
        if (this.cWs() && !(bsj_02 = (bsj_0)this.cja()).br(bgy2)) {
            dJP.error((Object)("impossible de d\u00e9buter le tour du fighter " + bgy2.Sn()));
            bsj_02.dGM();
        }
    }

    @Override
    protected void caV() {
    }
}

