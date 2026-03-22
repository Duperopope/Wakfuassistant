/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TIntLongHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 *  org.apache.log4j.Logger
 */
import com.google.common.collect.ImmutableList;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TIntLongHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from bcd
 */
public final class bcd_2
implements PN {
    private static final int hDq = 5;
    private static final boolean hDr = true;
    private static final Logger hDs = Logger.getLogger(bcd_2.class);
    private int hDt;
    final TIntObjectHashMap<bcm_2> hDu = new TIntObjectHashMap();
    final TIntObjectHashMap<bbu_2> hDv = new TIntObjectHashMap();
    final TIntObjectHashMap<bcj_1> hDw = new TIntObjectHashMap();
    final TIntObjectHashMap<TIntArrayList> hDx = new TIntObjectHashMap();
    private final TIntArrayList hDy = new TIntArrayList();
    private final ArrayList<bbx_2> hDz = new ArrayList();
    private bca_2 hDA;
    private final TIntLongHashMap hDB = new TIntLongHashMap();

    bcd_2(int n, TIntObjectHashMap<bcm_2> tIntObjectHashMap, TIntObjectHashMap<bbu_2> tIntObjectHashMap2) {
        this.hDt = n;
        tIntObjectHashMap.forEachEntry((TIntObjectProcedure)new bce_1(this));
        tIntObjectHashMap2.forEachEntry((TIntObjectProcedure)new bcf_1(this));
    }

    bcd_2(bcd_2 bcd_22) {
        this(bcd_22.hDt, bcd_22.hDu, bcd_22.hDv);
    }

    public void a(bca_2 bca_22) {
        this.hDA = bca_22;
    }

    public bca_2 daE() {
        return this.hDA;
    }

    public TIntArrayList AR(int n) {
        return (TIntArrayList)this.hDx.get(n);
    }

    public void o(int n, long l) {
        bcm_2 bcm_22 = (bcm_2)this.hDu.get(n);
        if (bcm_22 != null) {
            long l2 = bcm_22.apJ();
            bcm_22.jh(l);
            if (this.hDA != null) {
                this.hDA.a(bcm_22, l - l2);
            }
        } else {
            throw new RuntimeException("Variable inconnue : " + n);
        }
    }

    @Override
    public boolean oc(int n) {
        bcj_1 bcj_12 = (bcj_1)this.hDw.get(n);
        if (bcj_12 != null) {
            return bcj_12.daJ();
        }
        throw new RuntimeException("Objectif inconnu : " + n);
    }

    @Override
    public boolean ob(int n) {
        return this.hDw.containsKey(n);
    }

    public boolean AS(int n) {
        return this.hDu.containsKey(n);
    }

    @Override
    public boolean iV(int n) {
        return this.hDv.containsKey(n);
    }

    public boolean a(int n, PO pO) {
        bbu_2 bbu_22 = (bbu_2)this.hDv.get(n);
        if (bbu_22 != null) {
            return bbu_22.b(pO);
        }
        throw new RuntimeException("Achievement inconnu : " + n);
    }

    public boolean b(int n, PO pO) {
        bbu_2 bbu_22 = (bbu_2)this.hDv.get(n);
        if (bbu_22 != null) {
            return bbu_22.a(pO);
        }
        throw new RuntimeException("Achievement inconnu : " + n);
    }

    @Override
    public boolean og(int n) {
        bbu_2 bbu_22 = (bbu_2)this.hDv.get(n);
        if (bbu_22 != null) {
            return PK.c(bbu_22, Uq.buK.bjc());
        }
        throw new RuntimeException("Achievement inconnu : " + n);
    }

    @Override
    public boolean oh(int n) {
        bbu_2 bbu_22 = (bbu_2)this.hDv.get(n);
        if (bbu_22 != null) {
            return PK.a(bbu_22, Uq.buK.bjc()) && !bbu_22.app();
        }
        throw new RuntimeException("Achievement inconnu : " + n);
    }

    @Override
    public long oi(int n) {
        bbu_2 bbu_22 = (bbu_2)this.hDv.get(n);
        if (bbu_22 != null) {
            return bbu_22.aYu();
        }
        throw new RuntimeException("Specified achievement with id " + n + " doesn't exists");
    }

    @Override
    public boolean of(int n) {
        bbu_2 bbu_22 = (bbu_2)this.hDv.get(n);
        if (bbu_22 != null) {
            return bbu_22.aYo();
        }
        throw new RuntimeException("Achievement inconnu : " + n);
    }

    @Override
    public boolean oe(int n) {
        bbu_2 bbu_22 = (bbu_2)this.hDv.get(n);
        if (bbu_22 != null) {
            return bbu_22.app();
        }
        throw new RuntimeException("Achievement inconnu : " + n);
    }

    @Override
    public PM de(String string) {
        return bcb_1.hDb.de(string);
    }

    @Override
    public boolean od(int n) {
        bbu_2 bbu_22 = (bbu_2)this.hDv.get(n);
        if (bbu_22 != null) {
            return PK.a(bbu_22, Uq.buK.bjc());
        }
        throw new RuntimeException("Achievement inconnu : " + n);
    }

    @Override
    public PQ oj(int n) {
        return bcb_1.hDb.AN(n);
    }

    @Override
    public long ok(int n) {
        bcm_2 bcm_22 = (bcm_2)this.hDu.get(n);
        if (bcm_22 != null) {
            return bcm_22.apJ();
        }
        throw new RuntimeException("Variable inconnue : " + n);
    }

    @Override
    public boolean ol(int n) {
        return this.hDy.contains(n);
    }

    @Override
    public boolean a(int n, boolean bl) {
        return bl ? this.AT(n) : this.AU(n);
    }

    private boolean AT(int n) {
        if (this.hDy.contains(n)) {
            return false;
        }
        if (this.oe(n)) {
            return false;
        }
        if (this.hDy.size() >= 4) {
            this.AU(this.hDy.get(0));
        }
        this.hDy.add(n);
        this.hDA.r(n, true);
        return true;
    }

    private boolean AU(int n) {
        if (!aeb_2.a(this.hDy, n)) {
            return false;
        }
        this.hDA.r(n, false);
        return true;
    }

    public void p(int n, long l) {
        bbu_2 bbu_22 = (bbu_2)this.hDv.get(n);
        if (bbu_22 != null) {
            this.hDA.a(bbu_22, l);
        }
    }

    public void AV(int n) {
        this.s(n, true);
    }

    public void s(int n, boolean bl) {
        bbu_2 bbu_22 = (bbu_2)this.hDv.get(n);
        if (bbu_22 != null) {
            boolean bl2;
            bbu_22.reset();
            bbu_22.T(false);
            if (bl) {
                this.hDA.c(bbu_22);
            }
            if (bl2 = this.a(n, false)) {
                this.hDA.r(n, false);
            }
        }
    }

    @Override
    public TIntArrayList aYv() {
        return this.hDy;
    }

    public void AW(int n) {
        bcj_1 bcj_12 = (bcj_1)this.hDw.get(n);
        if (bcj_12 != null) {
            bcj_12.fk(true);
            if (this.hDA != null) {
                this.hDA.b(bcj_12);
            }
            hDs.info((Object)("Achievement objective completed : " + n));
        } else {
            hDs.error((Object)("Impossible de trouver l'objectif " + n + " dans le contexte du joueur"));
        }
    }

    public void AX(int n) {
        bcj_1 bcj_12 = (bcj_1)this.hDw.get(n);
        if (bcj_12 != null) {
            bcj_12.reset();
            if (this.hDA != null) {
                this.hDA.c(bcj_12);
            }
            hDs.info((Object)("Achievement objective reset : " + n));
        } else {
            hDs.error((Object)("Impossible de trouver l'objectif " + n + " dans le contexte du joueur"));
        }
    }

    public void AY(int n) {
        bbu_2 bbu_22 = (bbu_2)this.hDv.get(n);
        if (bbu_22 != null) {
            bbu_22.cCb();
            hDs.info((Object)("Achievement activated : " + n));
            if (this.hDA != null) {
                this.hDA.b(bbu_22);
            }
        } else {
            hDs.error((Object)("Impossible de trouver l'achievement " + n + " dans le contexte du joueur"));
        }
    }

    public void q(int n, long l) {
        bbu_2 bbu_22 = (bbu_2)this.hDv.get(n);
        if (bbu_22 != null) {
            bbu_22.a(this);
            hDs.info((Object)("! Achievement unlocked ! : " + n + " on " + String.valueOf(new Date(l)) + " (server time)"));
            this.hDz.add(new bbx_2(n, l));
            int n2 = this.hDz.size();
            if (n2 > 5) {
                this.hDz.remove(0);
            }
            boolean bl = this.a(n, false);
            if (this.hDA != null) {
                this.hDA.a(bbu_22);
                if (bl) {
                    this.hDA.r(n, false);
                }
            }
        } else {
            hDs.error((Object)("Impossible de trouver l'achievement " + n + " dans le contexte du joueur"));
        }
    }

    public ArrayList<bbx_2> daF() {
        return this.hDz;
    }

    public bbu_2 AZ(int n) {
        return (bbu_2)this.hDv.get(n);
    }

    public TIntObjectIterator<bbu_2> daG() {
        return this.hDv.iterator();
    }

    private void daH() {
        this.hDv.forEachEntry((TIntObjectProcedure)new bcg_1(this));
    }

    public void dS(byte[] byArray) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        hDs.info((Object)("D\u00e9serialisation des achievements : size=" + byArray.length));
        this.hDt = byteBuffer.getInt();
        int n6 = byteBuffer.get() & 0xFF;
        for (n5 = 0; n5 < n6; ++n5) {
            n4 = byteBuffer.getInt();
            long l = byteBuffer.getLong();
            this.hDz.add(new bbx_2(n4, l));
        }
        n5 = byteBuffer.getInt();
        for (n4 = 0; n4 < n5; ++n4) {
            int n7 = byteBuffer.getInt();
            long l = byteBuffer.getLong();
            bcm_2 bcm_22 = (bcm_2)this.hDu.get(n7);
            if (bcm_22 == null) continue;
            bcm_22.jh(l);
        }
        n4 = byteBuffer.getInt();
        for (n3 = 0; n3 < n4; ++n3) {
            bbu_2 bbu_22;
            int n8 = byteBuffer.getInt();
            n2 = byteBuffer.get() == 1 ? 1 : 0;
            boolean bl = byteBuffer.get() == 1;
            boolean bl2 = true;
            boolean bl3 = true;
            if (this.hDt >= 4) {
                bl2 = byteBuffer.get() == 1;
                bl3 = byteBuffer.get() == 1;
            }
            long l = 0L;
            if (this.hDt >= 1 && this.hDt < 4 || this.hDt >= 4 && bl2) {
                l = byteBuffer.getLong();
            }
            long l2 = 0L;
            if (this.hDt >= 2 && this.hDt < 4 || this.hDt >= 4 && bl3) {
                l2 = byteBuffer.getLong();
            }
            boolean bl4 = false;
            if (this.hDt >= 5) {
                boolean bl5 = bl4 = byteBuffer.get() == 1;
            }
            if ((bbu_22 = (bbu_2)this.hDv.get(n8)) != null) {
                bbu_22.T(n2 != 0);
                bbu_22.fk(bl);
                bbu_22.dd(l);
                bbu_22.hq(l2);
                bbu_22.fl(bl4);
                continue;
            }
            hDs.warn((Object)("Achievement inexistant : Id=" + n8));
        }
        n3 = byteBuffer.getInt();
        for (n = 0; n < n3; ++n) {
            n2 = byteBuffer.getInt();
            bcj_1 bcj_12 = (bcj_1)this.hDw.get(n2);
            if (bcj_12 != null) {
                bcj_12.fk(true);
                continue;
            }
            hDs.warn((Object)("Objectif inexistant : Id=" + n2));
        }
        n = byteBuffer.get() & 0xFF;
        for (n2 = 0; n2 < n; n2 += 1) {
            int n9 = byteBuffer.getInt();
            if (this.AZ(n9) != null) {
                this.hDy.add(n9);
                continue;
            }
            aaw_1.bUq().h(new vt_0(() -> csc_1.H(n9, false)));
        }
        this.daH();
        if (this.hDA != null) {
            this.hDA.b(this);
        }
    }

    public void Ba(int n) {
        long l = System.currentTimeMillis();
        long l2 = this.hDB.get(n);
        if (l2 == 0L || l2 + 30000L > l) {
            this.hDB.put(n, l);
            this.hDA.AK(n);
        }
    }

    @Override
    public boolean om(int n) {
        bbu_2 bbu_22 = (bbu_2)this.hDv.get(n);
        if (bbu_22 == null) {
            return false;
        }
        return PK.b(bbu_22, Uq.buK.bjc());
    }

    @Override
    public void a(PO pO, int n) {
    }

    @Override
    public void b(PO pO, int n) {
    }

    @Override
    public void c(PO pO, int n) {
    }

    public List<bbu_2> on(int n) {
        bcc_1 bcc_12 = bcb_1.hDb.AM(n);
        return bcc_12 != null && bcc_12.aYz() != null ? ImmutableList.copyOf(bcc_12.aYz()) : ImmutableList.of();
    }

    public void Bb(int n) {
        bbu_2 bbu_22 = (bbu_2)this.hDv.get(n);
        if (bbu_22 == null) {
            hDs.error((Object)("Unknown achievement for reset " + n));
            return;
        }
        bbu_22.reset();
        ArrayList<bcj_1> arrayList = bbu_22.dau();
        for (int i = 0; i < arrayList.size(); ++i) {
            bcj_1 bcj_12 = arrayList.get(i);
            this.hDw.put(bcj_12.d(), (Object)bcj_12);
            bcj_1 bcj_13 = bcb_1.hDb.AN(bcj_12.d());
            bcm_2[] bcm_2Array = bcj_13.daV();
            for (int j = 0; bcm_2Array != null && j < bcm_2Array.length; ++j) {
                this.o(bcm_2Array[j].d(), 0L);
            }
        }
        if (this.hDA != null) {
            this.hDA.d(bbu_22);
        }
    }

    public boolean Bc(int n) {
        return this.ol(n);
    }
}

