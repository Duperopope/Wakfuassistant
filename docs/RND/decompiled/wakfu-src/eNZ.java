/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public abstract class eNZ
extends ero_0 {
    private static final BitSet rag = new BitSet();
    protected byte rah = 0;
    protected byte rai = 0;
    protected int raj = 0;
    protected int rak = 0;
    protected int ral = 0;
    protected boolean ram = false;
    protected HashSet<Long> ran = null;

    public abstract eNZ fBT();

    public eNZ fBU() {
        eNZ eNZ2 = this.fBT();
        eNZ2.ran = this.ran;
        eNZ2.rah = this.rah;
        eNZ2.rai = this.rai;
        eNZ2.raj = this.raj;
        eNZ2.rak = this.rak;
        eNZ2.ral = this.ral;
        return eNZ2;
    }

    @Override
    public BitSet bbx() {
        return rag;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bbt()) {
            this.ran.add(this.bgF.Sn());
        }
        this.mk(true);
    }

    @Override
    public void E(QD qD) {
        this.aQL -= (int)((float)(this.rah * this.rak * this.aQL) / 100.0f);
        if (this.bgF != null) {
            this.ran.add(this.bgF.Sn());
        }
    }

    @Override
    public boolean bbI() {
        if (this.bgF instanceof QQ && !((QQ)this.bgF).bcS()) {
            return false;
        }
        return super.bbI();
    }

    @Override
    public void bbS() {
        this.rah = (byte)(this.rah + 1);
        if (this.rah > this.rai) {
            return;
        }
        int n = this.raj - (int)((float)(this.rah * this.rak * this.raj) / 100.0f);
        if (n <= 0) {
            return;
        }
        if (this.bgJ == null || this.bgJ.bah() == null) {
            return;
        }
        if (!this.bgF.a(exx_2.rGi)) {
            return;
        }
        if (this.bgF instanceof QQ && !((QQ)this.bgF).bcS()) {
            return;
        }
        ArrayList<azx_1<Integer, qu_0>> arrayList = new ArrayList<azx_1<Integer, qu_0>>();
        if (!(this.bgF instanceof eta_0)) {
            Iterator<qu_0> iterator = this.fBV();
            while (iterator.hasNext()) {
                qu_0 qu_02 = iterator.next();
                if (!qu_02.a(exx_2.rGi) || !qu_02.bEf()) continue;
                this.a(arrayList, qu_02);
            }
        }
        if (!arrayList.isEmpty()) {
            this.aJ(arrayList);
        }
        super.bbS();
    }

    private Iterator<qu_0> fBV() {
        return this.bgJ.bae().ban();
    }

    private void a(ArrayList<azx_1<Integer, qu_0>> arrayList, qu_0 qu_02) {
        boolean bl;
        boolean bl2;
        int n;
        int n2 = this.ral;
        if (this.ran.contains(qu_02.Sn())) {
            return;
        }
        ang_2 ang_22 = ((enk_0)this.bgC).fAx();
        if (ang_22 != null && (n = (int)(ang_22.b(this.bgE, qu_02, this.bbf(), this.bbh()) ? 1 : 0)) == 0) {
            return;
        }
        n = amf_1.c((amg_1)qu_02, this.bgF);
        boolean bl3 = bl2 = n > n2;
        if (bl2) {
            return;
        }
        if (qu_02 instanceof QQ && !((QQ)qu_02).bcS()) {
            return;
        }
        if (!(qu_02 instanceof eSN)) {
            if (!(this.bgE instanceof ant_1) || !(qu_02 instanceof ant_1)) {
                return;
            }
            if (!this.a((ant_1)((Object)this.bgE), (ant_1)((Object)qu_02))) {
                return;
            }
        }
        if (!(bl = this.a(qu_02, this.bgF))) {
            return;
        }
        this.a(arrayList, qu_02, n);
    }

    protected abstract boolean a(ant_1 var1, ant_1 var2);

    private boolean a(qu_0 qu_02, qu_0 qu_03) {
        boolean bl;
        rh_0 rh_02 = this.bgJ.bag();
        if (rh_02 == null) {
            bgA.warn((Object)("pas de fightmap sur le context " + String.valueOf(this.bgJ)));
            return false;
        }
        sj_0 sj_02 = sj_0.bfS();
        sj_02.k(qu_03.bcC(), qu_03.bcD(), qu_03.bcE());
        sj_02.l(qu_02.bcC(), qu_02.bcD(), qu_02.bcE());
        sj_02.a(rh_02);
        if (qu_03 instanceof rj_0) {
            rh_02.d((rj_0)((Object)qu_03));
        }
        try {
            if (sj_02.bfV()) {
                rh_02.bdH();
                sj_02.aZp();
                return true;
            }
            if (qu_02.bcN() <= 0) {
                rh_02.bdH();
                sj_02.aZp();
                return false;
            }
            sj_02.k(qu_03.bcC(), qu_03.bcD(), (short)(qu_02.bcE() + qu_02.bcN()));
            sj_02.l(qu_02.bcC(), qu_02.bcD(), (short)(qu_03.bcE() + qu_03.bcN()));
            bl = sj_02.bfV();
            sj_02.aZp();
        }
        catch (Exception exception) {
            bgA.error((Object)"Exception levee", (Throwable)exception);
            rh_02.bdH();
            return false;
        }
        return bl;
    }

    void a(List<azx_1<Integer, qu_0>> list, qu_0 qu_02, int n) {
        if (list == null) {
            return;
        }
        if (list.isEmpty()) {
            list.add(new azx_1<Integer, qu_0>(n, qu_02));
        } else {
            boolean bl = false;
            int n2 = 0;
            for (azx_1<Integer, qu_0> azx_12 : list) {
                if (azx_12.getFirst() > n) {
                    list.add(n2, new azx_1<Integer, qu_0>(n, qu_02));
                    bl = true;
                    break;
                }
                if (azx_12.getFirst() == n && azx_12.aHI().a(exx_2.rGi) && qu_02.a(exx_2.rGi) && azx_12.aHI().c(exx_2.rGi) > qu_02.c(exx_2.rGi)) {
                    list.add(n2, new azx_1<Integer, qu_0>(n, qu_02));
                    bl = true;
                    break;
                }
                ++n2;
            }
            if (!bl) {
                list.add(list.size(), new azx_1<Integer, qu_0>(n, qu_02));
            }
        }
    }

    private void aJ(List<azx_1<Integer, qu_0>> list) {
        if (!this.fHo()) {
            return;
        }
        if (!this.ram) {
            this.aK(list);
        } else {
            this.aL(list);
        }
    }

    void aK(List<azx_1<Integer, qu_0>> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        qu_0 qu_02 = list.get(0).aHI();
        if (this.ran != null) {
            this.ran.add(qu_02.Sn());
        }
        this.p(qu_02);
    }

    void aL(List<azx_1<Integer, qu_0>> list) {
        if (list == null) {
            return;
        }
        int n = Math.min(this.rai, list.size());
        for (int i = 0; i < n; ++i) {
            qu_0 qu_02 = list.get(i).aHI();
            if (this.ran != null && !this.ran.contains(qu_02.Sn())) {
                this.ran.add(qu_02.Sn());
                this.p(qu_02);
            }
            n = Math.min(this.rai, list.size());
        }
    }

    private void p(qu_0 qu_02) {
        eNZ eNZ2 = (eNZ)this.bbn();
        eNZ2.g(qu_02);
        eNZ2.aZp();
    }

    @Override
    public boolean bbA() {
        return true;
    }

    @Override
    public boolean bbB() {
        return true;
    }

    @Override
    public boolean bbC() {
        return false;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.rah = 0;
        this.rai = 0;
        this.raj = 0;
        this.rak = 0;
        this.ral = 0;
        this.ran = null;
        this.ram = false;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fBU();
    }
}

