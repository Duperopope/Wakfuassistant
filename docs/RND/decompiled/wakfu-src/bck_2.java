/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

/*
 * Renamed from bcK
 */
public class bck_2
extends bcy_1 {
    public static final int hIG = -1;
    public static final String[] hIH = new String[]{"name", "achievements", "isHistory"};

    public bck_2(long l) {
        super(l);
        this.hFF = -1;
    }

    @Override
    public String[] bxk() {
        return hIH;
    }

    @Override
    protected String getName() {
        return aum_0.cWf().c("achievement.history", new Object[0]);
    }

    @Override
    public boolean dbG() {
        return true;
    }

    @Override
    public int d() {
        return -1;
    }

    @Override
    public void a(bch_2 bch_22) {
    }

    @Override
    public LinkedHashMap<Integer, bch_2> dbH() {
        return null;
    }

    @Override
    protected ArrayList<bci_1> dbI() {
        ArrayList<bci_1> arrayList = new ArrayList<bci_1>();
        for (bbx_2 bbx_22 : this.hFH.daF()) {
            bci_1 bci_12 = bcm_1.hIK.t(this.hFG, bbx_22.apw());
            if (bci_12 == null || !bci_12.isVisible() || bcm_1.hIK.w(this.hFG, bci_12.d())) continue;
            arrayList.add(bci_12);
        }
        return arrayList;
    }

    @Override
    public void a(Collection<bug_0<bci_1>> collection, bde_2 bde_22) {
    }

    protected boolean dct() {
        return false;
    }
}

