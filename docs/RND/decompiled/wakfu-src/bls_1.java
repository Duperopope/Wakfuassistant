/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bLS
 */
public final class bls_1
extends ezx {
    private static final Logger kvk = Logger.getLogger(bls_1.class);

    public bls_1() {
    }

    public bls_1 edR() {
        return new bls_1();
    }

    public bls_1(short s, String string, int n, short s2, exP exP2, int n2, fqP<fqE> fqP2) {
        super(s, string, n, s2, exP2, n2, fqP2);
    }

    public bls_1 a(short s, String string, int n, short s2, exP exP2, int n2, fqP<fqE> fqP2) {
        return new bls_1(s, string, n, s2, exP2, n2, fqP2);
    }

    public bls_1(short s, RW<fqE, ym_1> rW, RU<fqE> rU, boolean bl, boolean bl2, boolean bl3) {
        super(s, rW, rU, bl, bl2, bl3);
    }

    public bls_1 a(short s, RW<fqE, ym_1> rW, RU<fqE> rU, boolean bl, boolean bl2, boolean bl3) {
        return new bls_1(s, rW, rU, bl, bl2, bl3);
    }

    @Override
    public void a(exP exP2, exP exP3) {
        super.a(exP2, exP3);
        bhx_0 bhx_02 = (bhx_0)exP2;
        int n = blt_1.g(this.doG(), this.aWO(), (short)this.mmE.sU());
        bhx_02.CV(n);
        bhx_02.CK(n);
        bjf_2 bjf_22 = new bjf_2();
        bjf_22.a(new bjj_2(bft_2.dgp().o(this.doG(), this.aWO(), (short)this.mmE.sU()), ary_2.fT("VETEMENTCUSTOM")));
        bjf_22.a(new bji_2(arx_1.cTB, (axb_2)new awx_2(this.mmE.sI())));
        bjf_22.a(new bji_2(arx_1.cTC, (axb_2)new awx_2(this.mmE.sK())));
        bjf_22.a(new bji_2(arx_1.cTD, (axb_2)new awx_2(this.mmE.sM())));
        bjf_22.a(new bji_2(arx_1.cTE, (axb_2)new awx_2(this.mmE.sO())));
        bjf_22.a(new bji_2(arx_1.cTF, (axb_2)new awx_2(this.mmE.sQ())));
        bjf_22.a(new bji_2(arx_1.cTG, (axb_2)new awx_2(this.mmE.sS())));
        bhx_02.a(bjf_22);
        bhx_02.a(this.icA);
        bhx_02.dkr();
    }

    public /* synthetic */ ezb_0 b(short s, RW rW, RU rU, boolean bl, boolean bl2, boolean bl3) {
        return this.a(s, rW, rU, bl, bl2, bl3);
    }

    @Override
    public /* synthetic */ ezb_0 edS() {
        return this.edR();
    }

    public /* synthetic */ ezb_0 b(short s, String string, int n, short s2, exP exP2, int n2, fqP fqP2) {
        return this.a(s, string, n, s2, exP2, n2, fqP2);
    }
}

