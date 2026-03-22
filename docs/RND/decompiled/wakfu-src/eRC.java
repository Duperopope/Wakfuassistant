/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class eRC
extends ero_0 {
    private static final aox_1 rin = new enz_0(new eny_0("Param standard : toutes les auras", new enx_0[0]));
    private long rgq;

    @Override
    public aox_1 bEt() {
        return rin;
    }

    public eRC fGS() {
        eRC eRC2 = new eRC();
        eRC2.rgq = this.rgq;
        return eRC2;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        ArrayList arrayList = new ArrayList();
        for (QD qD2 : this.bgF.baz()) {
            if (qD2.d() != enf_0.qTR.d() && qD2.d() != enf_0.qTS.d()) continue;
            arrayList.add(qD2);
        }
        for (QD qD2 : arrayList) {
            qD2.bbO();
        }
    }

    @Override
    public void E(QD qD) {
    }

    @Override
    public void bbS() {
        super.bbS();
    }

    @Override
    public boolean bbA() {
        return false;
    }

    @Override
    public boolean bbB() {
        return true;
    }

    @Override
    public boolean bbC() {
        return true;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fGS();
    }
}

