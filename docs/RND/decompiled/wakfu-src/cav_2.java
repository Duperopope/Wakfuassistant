/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cav
 */
public class cav_2
extends fsq_0 {
    public static final int lGw = 2;
    private static final Logger lGx = Logger.getLogger(cav_2.class);
    private cab_1 lGy;
    private boolean lGz;
    private final TLongObjectHashMap<TLongArrayList> lGA = new TLongObjectHashMap();

    public cav_2(long l) {
        super(l);
    }

    protected cav_2(long l, int n, int n2, int n3, int n4) {
        super(l, n, n2, n3, n4);
    }

    private cav_2(cav_2 cav_22) {
        super(cav_22);
        this.lGz = true;
    }

    public static cav_2 a(byte[] byArray, byte[] byArray2) {
        cav_2 cav_22 = new cav_2(0L);
        cav_22.eb(byArray);
        cav_22.b(byArray2, false);
        cav_22.lGz = true;
        return cav_22;
    }

    public cav_2 erk() {
        return new cav_2(this);
    }

    private void erl() {
        if (this.lGz) {
            throw new UnsupportedOperationException("Ne doit pas \u00eatre appel\u00e9 avec un monde servant \u00e0 l'edition");
        }
    }

    public cag_2 Kg(int n) {
        return (cag_2)cah_1.lFD.Kh(n);
    }

    public void eb(byte ... byArray) {
        this.erl();
        this.H(-4, -10, 8, 11);
        this.fK(fsu.tdo);
        this.ec(byArray);
        this.ero();
    }

    private void ec(byte ... byArray) {
        this.erl();
        if (byArray == null || byArray.length == 0) {
            return;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        while (byteBuffer.hasRemaining()) {
            short s = byteBuffer.getShort();
            short s2 = byteBuffer.getShort();
            short s3 = byteBuffer.getShort();
            short s4 = byteBuffer.getShort();
            short s5 = byteBuffer.getShort();
            short s6 = byteBuffer.getShort();
            this.d(s, s2, s3, s4, s5, s6);
        }
    }

    public void a(short s, short s2, short s3, short s4, short s5, short s6) {
        this.erl();
        this.d(s, s2, s3, s4, s5, s6);
        this.K(s, s2);
        this.ero();
        this.erm();
    }

    public void a(far_0 far_02) {
        this.erl();
        boolean bl = this.a(far_02, true);
        if (bl |= this.d(far_02)) {
            this.erm();
        }
    }

    public void D(long l, int n) {
        this.erl();
        fam_0 fam_02 = this.av(l, n);
        if (fam_02 != null) {
            this.d(fam_02);
            this.erm();
        }
    }

    private void c(fam_0 fam_02) {
        this.erl();
        bQA bQA2 = bQB.kVP.IU(fam_02.fRb());
        if (bQA2 == null) {
            return;
        }
        afc_0 afc_02 = afe_0.bxS().se(bzz_2.lFa.d());
        afc_0 afc_03 = afe_0.bxS().se(bzz_2.lFc.d());
        ArrayList<bQC> arrayList = bQA2.bsL();
        for (bQC bQC2 : arrayList) {
            try {
                afc_0 afc_04 = bQC2.ejC() ? afc_03 : afc_02;
                afb_0 afb_02 = this.a(fam_02, bQC2, afc_04);
                afb_02.aPg();
                ZM.bqw().c(afb_02);
                this.F(fam_02.ZC(), afb_02.Sn());
            }
            catch (IOException iOException) {
                lGx.error((Object)"IOException during addBuildingVisuals", (Throwable)iOException);
            }
        }
    }

    private afb_0 a(fam_0 fam_02, bQC bQC2, afc_0 afc_02) {
        long l = aym_2.bSE();
        acd_1 acd_12 = bQC2.ejD();
        return afb_0.a(l, bQC2.aVt(), fam_02.fRc() + acd_12.getX(), fam_02.fRd() + acd_12.getY(), acd_12.bdi(), bQC2.bsr(), bQC2.bcN(), (byte)bQC2.bcB().wp(), afc_02, bQC2.aJi());
    }

    private void F(long l, long l2) {
        TLongArrayList tLongArrayList = (TLongArrayList)this.lGA.get(l);
        if (tLongArrayList == null) {
            tLongArrayList = new TLongArrayList();
            this.lGA.put(l, (Object)tLongArrayList);
        }
        tLongArrayList.add(l2);
    }

    private void mE(long l) {
        TLongArrayList tLongArrayList = (TLongArrayList)this.lGA.get(l);
        if (tLongArrayList == null) {
            return;
        }
        for (int i = 0; i < tLongArrayList.size(); ++i) {
            long l2 = tLongArrayList.get(i);
            ZM.bqw().fC(l2);
        }
        this.lGA.remove(l);
    }

    public void mF(long l) {
        fam_0 fam_02 = this.uK(l);
        if (fam_02 != null) {
            this.d(fam_02);
            this.erm();
        }
        this.mE(l);
    }

    private void K(short s, short s2) {
        WX.p(s, s2);
    }

    private void erm() {
        this.erl();
        if (this.lGy != null) {
            this.lGy.clear();
        }
        aie_0.cfn().bmC().bqL().bqH();
        cab_1 cab_12 = this.erp();
        caf_2.lFq.eqQ().a(cab_12);
        aaa_0.brC().brE();
        aaE.brU().brW();
        this.ern();
        bik_2.dZl().dZm();
    }

    private void ern() {
        adn_0.bvh().bpi();
        afh_0.bxU().bpi();
        bLe.ecw().bpi();
        ZM.bqw().bpi();
    }

    private boolean d(fam_0 fam_02) {
        aci_1 aci_12 = fam_02.fRf();
        for (int i = aci_12.cuS; i < aci_12.cuT; ++i) {
            for (int j = aci_12.cuQ; j < aci_12.cuR; ++j) {
                this.K((short)j, (short)i);
                WX.m(Wa.qh(j), Wa.qi(i), 0);
            }
        }
        return true;
    }

    public void b(byte[] byArray, boolean bl) {
        this.erl();
        if (byArray == null || byArray.length == 0) {
            return;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        while (byteBuffer.hasRemaining()) {
            far_0 far_02 = caj_2.fc(byteBuffer);
            this.a(far_02, bl);
        }
    }

    private boolean a(fam_0 fam_02, boolean bl) {
        this.j(fam_02);
        if (bl) {
            this.c(fam_02);
        }
        return true;
    }

    public void ero() {
        short[][] sArray = this.erq();
        for (int i = 0; i < this.gle(); ++i) {
            for (int j = 0; j < this.glf(); ++j) {
                int n;
                int n2 = i + this.bwS();
                if (!this.gs(n2, n = j + this.bwT()) || !cae_1.b(sArray, i, j)) continue;
                short s = cae_1.a(sArray, i, j);
                this.aq(n2, n, s);
            }
        }
    }

    public caz_2 L(short s, short s2) {
        this.erl();
        caz_2 caz_22 = new caz_2();
        caz_22.bp(s, s2);
        this.a(s, s2, caz_22);
        return caz_22;
    }

    public ajo_0 M(short s, short s2) {
        this.erl();
        cai_1 cai_12 = new cai_1();
        cai_12.u(s, s2);
        this.a(s, s2, cai_12);
        return cai_12;
    }

    public cab_1 erp() {
        this.erl();
        cab_1 cab_12 = new cab_1();
        for (int i = this.bwS(); i <= this.bgo(); ++i) {
            int n = i * 9;
            for (int j = this.bwT(); j <= this.bgp(); ++j) {
                cag_2 cag_22 = (cag_2)this.gu(i, j);
                if (cag_22 == null) continue;
                int n2 = j * 9;
                cab_12.a(n, n2, cag_22);
            }
        }
        this.y(new caw_2(this, cab_12));
        cab_12.erx();
        this.lGy = cab_12;
        return cab_12;
    }

    @Override
    public short[][] erq() {
        short[][] sArray = this.glg();
        for (int i = 0; i < sArray.length; ++i) {
            for (int j = 0; j < sArray[i].length; ++j) {
                if (fsu.aad(sArray[i][j]).bWx() != 1) continue;
                sArray[i][j] = fsu.tdo;
            }
        }
        return sArray;
    }

    @Override
    public short d(short[][] sArray, int n, int n2) {
        int n3 = n - this.bwS();
        int n4 = n2 - this.bwT();
        if (this.gs(n, n2) && cae_1.b(sArray, n3, n4)) {
            return cae_1.a(sArray, n3, n4);
        }
        return 0;
    }

    @Override
    public boolean y(TObjectProcedure<fam_0> tObjectProcedure) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        super.y(new cax_2(this, arrayList2, arrayList));
        for (fam_0 fam_02 : arrayList) {
            if (tObjectProcedure.execute((Object)fam_02)) continue;
            return false;
        }
        for (fam_0 fam_02 : arrayList2) {
            if (tObjectProcedure.execute((Object)fam_02)) continue;
            return false;
        }
        return true;
    }

    @Override
    public /* synthetic */ fsq_0 err() {
        return this.erk();
    }

    @Override
    public /* synthetic */ fsu Kh(int n) {
        return this.Kg(n);
    }

    @Override
    public /* synthetic */ fst ers() {
        return this.erk();
    }
}

