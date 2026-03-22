/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.procedure.TLongProcedure
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.procedure.TLongProcedure;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eWk
 */
public abstract class ewk_1<F extends exP>
extends TA {
    protected final ewt_2 rBe;
    private boolean rBf = false;
    @NotNull
    private final ewm_1 rBg;
    @NotNull
    protected final euc_0<F> rBh;
    final Map<Long, ews_2> rBi = new HashMap<Long, ews_2>();

    protected <TFight extends Uh & eub_0<F>> ewk_1(@NotNull TFight TFight, @NotNull ewm_1 ewm_12, @NotNull ewt_2 ewt_22, @NotNull TF tF, @NotNull TI tI) {
        super(((eub_0<F>)TFight).d(), tI, TFight, tF);
        this.rBg = ewm_12;
        this.rBh = TFight;
        this.rBe = ewt_22;
    }

    @Override
    public TLongArrayList bhD() {
        return super.bhD();
    }

    @Override
    public void bhH() {
        super.bhH();
        this.fNP();
    }

    private void fNP() {
        this.eLo().Aa(ewx_2.fOg());
    }

    public TLongArrayList bia() {
        return this.btb.biq();
    }

    public abstract void dIC();

    @Override
    protected void bhR() {
    }

    @NotNull
    public euc_0<F> fNQ() {
        return this.rBh;
    }

    @Override
    protected boolean eH(long l) {
        return Optional.ofNullable((exP)this.fNQ().ku(l)).map(exP2 -> !exP2.fhm().get(2)).orElse(true);
    }

    @Override
    public void a(long l, boolean bl, tw_0 tw_02) {
        if (this.rBi.containsKey(l)) {
            bsZ.error((Object)this.dk("\u00c9chec de l'ajout \u00e0 la Timeline de " + l + " (pr\u00e9sent dans les fighters stock\u00e9s)"));
            this.rd(l);
            return;
        }
        super.a(l, bl, tw_02);
    }

    @Override
    public void eV(long l) {
        if (!this.btb.fa(l)) {
            bsZ.error((Object)this.dk("\u00c9chec du stockage des \u00e9v\u00e9nements pour " + l + " : fighter absent"));
            return;
        }
        short s = this.btb.fd(l);
        if (this.eL(l)) {
            s = (short)(s + 1);
        }
        int n = this.eB(l);
        ews_2 ews_22 = new ews_2(s, n);
        this.btd.fi(l);
        this.rBi.put(l, ews_22);
        super.ew(l);
        this.bhT();
    }

    public void rd(long l) {
        if (!this.rBi.containsKey(l)) {
            bsZ.error((Object)this.dk("\u00c9chec de restauration des \u00e9v\u00e9nements pour " + l + " : absent des fighters stock\u00e9s"));
            return;
        }
        this.btd.fj(l);
        int n = this.rBi.remove(l).fOb();
        this.a(l, true, new tw_0(n, Tx.bsN));
        this.bhT();
    }

    @Override
    protected void eO(long l) {
        int n = this.bhD().indexOf(l);
        if (n == -1) {
            bsZ.warn((Object)"A onFighterAdded event was triggered but the fighter is not in the turn order");
            return;
        }
        this.rBi.forEach((l2, ews_22) -> {
            if (l2 == l) {
                return;
            }
            TLongArrayList tLongArrayList = this.btb.bir();
            if (tLongArrayList == null) {
                ews_22.SI(n);
                return;
            }
            int n2 = tLongArrayList.indexOf(l);
            int n3 = tLongArrayList.indexOf(l2.longValue());
            if (n2 != -1 && n3 != -1 && n2 > n3) {
                return;
            }
            ews_22.SI(n);
        });
    }

    @Override
    protected void j(long l, int n) {
        this.rBi.forEach((l2, ews_22) -> {
            if (l2 == l) {
                return;
            }
            TLongArrayList tLongArrayList = this.btb.bir();
            if (tLongArrayList == null) {
                ews_22.SI(n);
                return;
            }
            int n2 = ews_22.fOb();
            if (n > n2) {
                return;
            }
            ews_22.SI(n);
        });
    }

    @Override
    protected void eP(long l) {
        int n = this.bhD().indexOf(l);
        if (n == -1) {
            bsZ.warn((Object)"A onFighterRemoved event was triggered but the fighter is not in the turn order (may be logical)");
            return;
        }
        this.rBi.forEach((l2, ews_22) -> {
            if (l2 != l) {
                ews_22.SJ(n);
            }
        });
    }

    @Override
    public void k(long l, int n) {
        if (n == -1) {
            bsZ.warn((Object)"A onFighterRemoved event was triggered but the fighter is not in the turn order (may be logical)");
            return;
        }
        this.rBi.forEach((l2, ews_22) -> {
            if (l2 != l) {
                ews_22.SJ(n);
            }
        });
    }

    @Override
    public boolean ew(long l) {
        if (!this.rBi.containsKey(l)) {
            bsZ.error((Object)this.dk("Cannot remove fighter with id " + l + " from the timeline because it's not in it."));
            return false;
        }
        this.rBi.remove(l);
        return true;
    }

    @Override
    public short a(tz_0 tz_02) {
        if (this.btb.fa(tz_02.OO())) {
            return super.a(tz_02);
        }
        int n = tz_02.biN() - this.btf;
        if (tz_02.biM()) {
            ++n;
        }
        if (this.rBi.containsKey(tz_02.OO()) && !this.rBi.get(tz_02.OO()).es(this.btf)) {
            --n;
        }
        return (short)n;
    }

    @Override
    public int DN() {
        int n = super.DN() + 1;
        for (long l : this.rBi.keySet()) {
            n += 8 + this.rBi.get(l).DN();
        }
        int n2 = this.rBh.dGs().size();
        return n += 1 + n2 * 12;
    }

    @Override
    protected void eN(ByteBuffer byteBuffer) {
        super.eN(byteBuffer);
        byteBuffer.put((byte)this.rBi.size());
        Object object = this.rBi.keySet().iterator();
        while (object.hasNext()) {
            long l = object.next();
            byteBuffer.putLong(l);
            this.rBi.get(l).as(byteBuffer);
        }
        object = this.rBh.dGs();
        byteBuffer.put((byte)object.size());
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            exP exP2 = (exP)iterator.next();
            byteBuffer.putLong(exP2.Sn());
            byteBuffer.putInt(this.rBg.rj(exP2.Sn()));
        }
    }

    @Override
    protected void bhQ() {
        super.bhQ();
        this.rBi.clear();
    }

    public void re(long l) {
        this.a(l, new tw_0(1, Tx.bsM));
    }

    @Override
    protected void a(Tz tz, ByteBuffer byteBuffer) {
        int n;
        super.a(tz, byteBuffer);
        int n2 = byteBuffer.get();
        for (n = 0; n < n2; ++n) {
            long l = byteBuffer.getLong();
            ews_2 ews_22 = ews_2.a(tz, l, byteBuffer);
            this.rBi.put(l, ews_22);
        }
        n = byteBuffer.get();
        for (int i = 0; i < n; ++i) {
            long l = byteBuffer.getLong();
            int n3 = byteBuffer.getInt();
            ((ewn_2)this.rBg).ac(l, n3);
        }
    }

    @Override
    public StringBuilder bhV() {
        StringBuilder stringBuilder = super.bhV();
        stringBuilder.append(" S:[");
        if (!this.rBi.isEmpty()) {
            for (long l : this.rBi.keySet()) {
                stringBuilder.append(l).append(',');
            }
            stringBuilder.setLength(stringBuilder.length() - 1);
        }
        stringBuilder.append(']');
        stringBuilder.append(" E:[");
        this.bhD().forEach((TLongProcedure)new ewl_2(this, stringBuilder));
        stringBuilder.setLength(stringBuilder.length() - 1);
        stringBuilder.append("]/");
        stringBuilder.append(this.rBg.dIB());
        stringBuilder.append(" I:[");
        this.bia().forEach((TLongProcedure)new ewm_2(this, stringBuilder));
        stringBuilder.setLength(stringBuilder.length() - 1);
        stringBuilder.append(']');
        return stringBuilder;
    }

    @NotNull
    public ewm_1 eLo() {
        return this.rBg;
    }

    public void SD(int n) {
        this.rBf = false;
        this.rBg.Aa(n);
    }

    public long qR(long l) {
        exP exP2 = (exP)this.rBh.ku(l);
        if (exP2 == null) {
            bsZ.error((Object)("Tried to get the turn duration of the fighter with id " + l + " which doesn't exist in the timeline"));
            return -1L;
        }
        if (exP2.a(ezj_0.psW) || exP2.a(ezj_0.ptc)) {
            return ewo_0.oBF.j(ewr_0.oDX);
        }
        if (this.bht() && !exP2.fgk()) {
            return this.bhy();
        }
        long l2 = this.bhA();
        if (l2 < 5000L) {
            bsZ.error((Object)("[FIGHT] Turn for fighter [" + String.valueOf(exP2) + "] has a base duration of only " + l2 + " ms, that's a problem ; m_currentTurnEndTimestamp=" + this.bth + " ; current time =" + ue_0.bjV().getTimeInMillis()));
        }
        return l2;
    }

    @Override
    protected long ev(long l) {
        int n = this.rBg.rk(l) ? 30000 : 0;
        exP exP2 = (exP)this.rBh.ku(l);
        if (exP2 == null) {
            return n;
        }
        if (!exP2.a(eyp_0.pmQ) && !exP2.a(eyp_0.pmO)) {
            return n;
        }
        long l2 = ewo_0.oBF.j(ewr_0.oDY);
        long l3 = ewo_0.oBF.j(ewr_0.oDZ);
        long l4 = ewo_0.oBF.j(ewr_0.oEa);
        long l5 = ewo_0.oBF.j(ewr_0.oEb);
        int n2 = exP2.c(exx_2.rGj);
        int n3 = exP2.c(exx_2.rGk);
        int n4 = exP2.c(exx_2.rGl);
        long l6 = exP2.a(exe_1.rDY) ? 0L : l2 * (long)n2;
        long l7 = l3 * (long)n3;
        long l8 = (long)n4 * l4;
        long l9 = l6 + l7 + l8;
        return GC.a(l9, 0L, l5) + (long)n;
    }
}

