/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  gnu.trove.iterator.TByteIntIterator
 *  gnu.trove.map.hash.TByteIntHashMap
 *  org.apache.log4j.Logger
 */
import com.google.protobuf.InvalidProtocolBufferException;
import gnu.trove.iterator.TByteIntIterator;
import gnu.trove.map.hash.TByteIntHashMap;
import java.util.Iterator;
import org.apache.log4j.Logger;

/*
 * Renamed from ezB
 */
public class ezb_0
extends ezw {
    private static ezb_0 prX;
    private static final Logger prY;
    protected fqP<fqE> kxu;
    protected final exh_1 prZ = new exh_1();
    protected int psa;
    protected int ciZ;
    protected dR mmE;
    protected TByteIntHashMap icA;

    public ezb_0() {
    }

    public ezb_0(short s, RW<fqE, ym_1> rW, RU<fqE> rU, boolean bl, boolean bl2, boolean bl3) {
        this.kxu = new fqP<fqE>(s, rW, rU, bl, bl2, bl3);
    }

    public static ezb_0 fmI() {
        return prX;
    }

    public static void a(ezb_0 ezb_02) {
        prX = ezb_02;
    }

    public ezb_0 b(short s, String string, int n, short s2, exP exP2, int n2, fqP<fqE> fqP2) {
        return new ezb_0(s, string, n, s2, exP2, n2, fqP2);
    }

    public ezb_0 edS() {
        return new ezb_0();
    }

    public ezb_0 b(short s, RW<fqE, ym_1> rW, RU<fqE> rU, boolean bl, boolean bl2, boolean bl3) {
        return new ezb_0(s, rW, rU, bl, bl2, bl3);
    }

    public ezb_0(short s, String string, int n, short s2, exP exP2, int n2, fqP<fqE> fqP2) {
        super(s, string, n, (short)Math.min(s2, exP2.cmL()));
        Object object;
        this.setName(exP2.getName());
        this.ciZ = exP2.aVt();
        this.psa = n2;
        this.kxu = fqP2;
        double d2 = (float)this.psa / 100.0f;
        eyp eyp2 = exP2.doV();
        this.prZ.aYH();
        exh_1 exh_12 = exP2.fhy();
        exa_1<exf_2> exa_12 = exh_12 != null ? exh_12 : exP2.fgM();
        for (exx_2 exx_22 : exx_2.values()) {
            if (exx_22.isExpandable()) {
                this.prZ.e(exx_22).ot(exa_12.h(exx_22));
                continue;
            }
            this.prZ.e(exx_22).op(exa_12.c(exx_22));
        }
        if (eyp2 instanceof eym) {
            ((eym)eyp2).fhV().a(this.prZ, s2);
        }
        this.prZ.e(exx_2.rGj).aYO();
        this.prZ.e(exx_2.rGl).op(exP2.c(exx_2.rGl));
        this.prZ.e(exx_2.rGk).aYO();
        this.prZ.e(exx_2.rGs).ot(0);
        for (eyr eyr2 : eys.fid().fie()) {
            int n3 = eyr2.fic();
            int n4 = eyr2.OT(s2);
            object = exx_2.c((byte)n3);
            if (object == null || this.prZ.e((pt_0)object) == null) continue;
            this.prZ.e((pt_0)object).Tg(n4);
        }
        if (d2 != 1.0) {
            for (exx_2 exx_23 : exx_2.values()) {
                if (exx_23 == exx_2.rGj || exx_23 == exx_2.rGk || exx_23 == exx_2.rGl) continue;
                object = this.prZ.e(exx_23);
                if (exx_23.isExpandable()) {
                    ((exf_2)object).ot((int)Math.ceil((double)((exf_2)object).aYD() * d2));
                    continue;
                }
                ((exf_2)object).op((int)Math.ceil((double)((exf_2)object).aYB() * d2));
            }
        }
        this.prZ.e(exx_2.rGi).op(exP2.c(exx_2.rGi));
        this.prZ.e(exx_2.rGi).ot((int)((double)exa_12.h(exx_2.rGi) * d2));
    }

    @Override
    public void a(exP exP2, exP exP3) {
        super.a(exP2, exP3);
        this.af(exP2);
        this.S(exP2);
    }

    private void af(exP exP2) {
        exP2.fgM().a(this.prZ);
        if (this.fmi() > 0) {
            exP2.e(exx_2.rGi).op(this.fmi());
        }
    }

    protected void S(exP exP2) {
        fqP<? extends fqE> fqP2 = exP2.dkB();
        if (fqP2 == null || this.kxu == null) {
            return;
        }
        for (fqE fqE2 : this.kxu) {
            try {
                ((Sg)fqP2).b((fqE)fqE2.bfg());
            }
            catch (sa_0 sa_02) {
                prY.error((Object)"InventoryCapacityReachedException lors de l'initialisation des sorts d'un double : ", (Throwable)sa_02);
            }
            catch (Sz sz) {
                prY.error((Object)"ContentAlreadyPresentException lors de l'initialisation des sorts d'un double : ", (Throwable)sz);
            }
        }
        this.kxu = fqP2;
    }

    @Override
    public byte aWO() {
        return this.mmE != null ? (byte)this.mmE.sY() : (byte)0;
    }

    @Override
    public boolean a(vy_1 vy_12) {
        vy_12.clear();
        super.a(vy_12);
        vy_12.afC = new vz_1();
        vy_12.afC.afH.acq = this.psa;
        vy_12.afC.afH.acr = this.ciZ;
        vy_12.afC.afH.acs = this.fmH();
        vy_12.afC.afH.RG = this.mmE.toByteArray();
        if (this.kxu != null) {
            this.kxu.a(vy_12.afC.afH.act);
        }
        this.prZ.a(vy_12.afC.afH.acu);
        vy_12.afC.afH.acv.clear();
        if (this.icA != null) {
            TByteIntIterator tByteIntIterator = this.icA.iterator();
            while (tByteIntIterator.hasNext()) {
                tByteIntIterator.advance();
                uf_2 uf_22 = new uf_2();
                uf_22.Tg = tByteIntIterator.key();
                uf_22.aaQ = tByteIntIterator.value();
                vy_12.afC.afH.acv.add(uf_22);
            }
        }
        return true;
    }

    protected byte fmH() {
        return 1;
    }

    @Override
    public boolean b(vy_1 vy_12) {
        boolean bl = super.b(vy_12);
        this.psa = vy_12.afC.afH.acq;
        this.ciZ = vy_12.afC.afH.acr;
        this.mmE = this.c(vy_12);
        if (this.kxu != null) {
            bl &= this.kxu.b(vy_12.afC.afH.act);
        }
        bl &= this.prZ.b(vy_12.afC.afH.acu);
        this.icA = null;
        if (vy_12.afC.afH.acv.size() > 0) {
            Iterator<uf_2> iterator = vy_12.afC.afH.acv.iterator();
            this.icA = new TByteIntHashMap();
            while (iterator.hasNext()) {
                uf_2 uf_22 = iterator.next();
                this.icA.put(uf_22.Tg, uf_22.aaQ);
            }
        }
        return bl;
    }

    private dR c(vy_1 vy_12) {
        try {
            return dR.ad(vy_12.afC.afH.RG);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new RuntimeException("Error when unserializing appearance", invalidProtocolBufferException);
        }
    }

    public fqP<fqE> dkB() {
        return this.kxu;
    }

    @Override
    public void clean() {
        super.clean();
        if (this.kxu != null) {
            this.kxu.beP();
            this.kxu.beY();
        }
    }

    static {
        prY = Logger.getLogger(ezb_0.class);
    }
}

