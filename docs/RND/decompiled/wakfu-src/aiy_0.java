/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;

/*
 * Renamed from aIy
 */
public class aiy_0 {
    private static final awx_2 dYu = new awx_2(0.8f, 0.4f, 0.5f, 0.8f);
    public static final aiy_0 dYv = new aiy_0();
    private final TIntArrayList dYw = new TIntArrayList();

    private aiy_0() {
    }

    public void clear() {
        int n = this.dYw.size();
        for (int i = 0; i < n; ++i) {
            aIz.yD(this.dYw.getQuick(i));
        }
        this.dYw.clear();
    }

    public void yB(int n) {
        this.clear();
    }

    public void reset() {
        this.clear();
    }

    public void yC(int n) {
        ux_0 ux_02 = Uq.buK.bjc();
        switch (n) {
            case 42: {
                this.cgN();
                return;
            }
            case 48: {
                this.cgH();
                return;
            }
            case 49: {
                this.cgG();
                return;
            }
            case 50: {
                this.f(bzn_1.lCz);
                return;
            }
            case 54: {
                aIz.h(new aca(1.0f));
                return;
            }
            case 55: {
                this.b(new aca(1.0f));
                return;
            }
            case 56: {
                this.b(new abz_0(25, ux_02.bjB()));
                return;
            }
            case 57: {
                this.d(new abz_0(abz_0.a(10, 0.3f, 1.0f), 10, ux_02.bjB()));
                return;
            }
            case 58: {
                this.e(new abz_0(abz_0.a(10, 0.3f, 1.0f), 10, ux_02.bjB()));
                return;
            }
        }
        int n2 = (int)WX.bhh();
        switch (n2) {
            case 98: 
            case 99: 
            case 101: 
            case 115: 
            case 141: {
                this.cgI();
                return;
            }
            case 575: 
            case 576: {
                this.f(new aca(1.0f));
                return;
            }
            case 237: 
            case 240: 
            case 243: 
            case 247: 
            case 248: 
            case 249: 
            case 250: 
            case 251: 
            case 252: 
            case 253: 
            case 254: 
            case 255: 
            case 256: 
            case 257: 
            case 258: 
            case 259: 
            case 301: 
            case 302: {
                this.cgK();
                return;
            }
            case 210: 
            case 213: 
            case 214: 
            case 215: 
            case 216: 
            case 217: {
                this.cgL();
                return;
            }
            case 323: {
                this.cgG();
                return;
            }
            case 327: {
                this.cgG();
                this.b(dYu, new bzb_1());
                return;
            }
            case 336: 
            case 339: {
                this.f(dYu);
                return;
            }
            case 370: 
            case 371: {
                this.cgM();
                return;
            }
            case 524: {
                this.cgG();
                return;
            }
            case 802: {
                this.c(new aca(1.0f));
                return;
            }
        }
    }

    private void cgG() {
        this.dYw.add(aIz.cgX());
    }

    private void cgH() {
        this.dYw.add(aIz.cgV());
    }

    private void cgI() {
        this.dYw.add(aIz.cgQ());
    }

    private void cgJ() {
        aIz.cgT();
    }

    private void cgK() {
        aIz.cgU();
    }

    private void cgL() {
        this.dYw.add(aIz.cgW());
        abq_0 abq_02 = new abq_0();
        abq_02.b(this.bmC().bqL());
        abq_02.a(new abg_1(-18.0f, 18.0f, -18.0f, 18.0f, -18.0f, 18.0f));
        abq_02.rw(1000);
        abq_02.c(1.0f, 1.0f, 0.0f, 1.0f, 0.1f);
        abq_02.a(10.0f, 500.0f, 5000.0f, 0.4f, 2.0f, 0.02f);
        abq_02.rA(100);
        ast_1.bJG().a(abq_02);
        this.dYw.add(abq_02.d());
    }

    private void f(axb_2 axb_22) {
        this.b(axb_22, new bzn_1());
    }

    private void a(axb_2 axb_22, bzn_1 bzn_12) {
        this.b(axb_22, bzn_12);
    }

    private void b(axb_2 axb_22, bzn_1 bzn_12) {
        bzn_12.setColor(axb_22);
        bzn_12.bX(true);
        bzn_12.b(this.bmC().bqL());
        ast_1.bJG().a(bzn_12);
        this.dYw.add(bzn_12.d());
    }

    private void b(aca aca2) {
        byw_2 byw_22 = new byw_2();
        byw_22.bX(true);
        byw_22.a(aca2);
        byw_22.b(this.bmC().bqL());
        ast_1.bJG().a(byw_22);
        this.dYw.add(aIz.k(aca2));
    }

    private void c(aca aca2) {
        this.dYw.add(aIz.l(aca2));
    }

    private void d(aca aca2) {
        this.dYw.add(aIz.i(aca2));
    }

    private void e(aca aca2) {
        this.dYw.add(aIz.j(aca2));
    }

    private void f(aca aca2) {
        bzm_1 bzm_12 = new bzm_1();
        bzm_12.bX(true);
        bzm_12.a(aca2);
        bzm_12.b(this.bmC().bqL());
        ast_1.bJG().a(bzm_12);
    }

    private void cgM() {
        bzq_1.lCJ.d(fsc.tbi);
        bzq_1.lCJ.eP(0.9f);
    }

    private aam_0 bmC() {
        return aie_0.cfn().bmC();
    }

    private void g(aca aca2) {
        bze_1 bze_12 = new bze_1();
        bze_12.bX(true);
        bze_12.a(aca2);
        bze_12.b(this.bmC().bqL());
        ast_1.bJG().a(bze_12);
        this.dYw.add(aIz.m(aca2));
    }

    private void cgN() {
        acb acb2 = new acb(5000, 17500, 7500);
        acb2.bK(0.6f);
        this.dYw.add(aIz.h(acb2));
        this.dYw.add(aIz.cgS());
        this.a(new awx_2(0.6f, 0.6f, 0.6f, 0.4f), new bzf_1());
    }
}

