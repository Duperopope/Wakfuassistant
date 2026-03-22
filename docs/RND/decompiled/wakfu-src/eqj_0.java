/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eQJ
 */
public class eqj_0
extends ero_0 {
    private static final aox_1 rgr = new enz_0(new eny_0("Param standard", new enx_0("id des zones d'heure", eNA.qYB), new enx_0("id de la zone de l'heure courante", eNA.qYB)));
    private final List<QQ> rgs = new ArrayList<QQ>();
    private long rgt;
    private byte rgu;
    private int rgv;

    @Override
    public aox_1 bEt() {
        return rgr;
    }

    public eqj_0 fFM() {
        eqj_0 eqj_02 = new eqj_0();
        eqj_02.rgt = this.rgt;
        eqj_02.rgs.clear();
        return eqj_02;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        eSW eSW2 = eTo.fIZ().iV(this.aQL);
        if (eSW2 == null) {
            this.fHg();
            return;
        }
        eSW eSW3 = eTo.fIZ().iV(this.rgv);
        if (eSW3 == null) {
            bgA.error((Object)("Unable to find area " + this.rgv + ". Using " + this.aQL + " as the area even for the 'current' hour"));
            eSW3 = eSW2;
        }
        this.d(qD, bl);
        int[][] nArray = this.fFN();
        this.a(eSW2, eSW3, nArray);
    }

    private int[][] fFN() {
        int[][] nArrayArray = new int[][]{{1, -2}, {2, -1}, {3, 0}, {2, 1}, {1, 2}, {0, 3}, {-1, 2}, {-2, 1}, {-3, 0}, {-2, -1}, {-1, -2}, {0, -3}};
        if (this.bgE == null) {
            bgA.error((Object)"pas de caster ");
            return nArrayArray;
        }
        abi_1 abi_12 = this.bgE.bcB();
        switch (abi_12) {
            case dzq: {
                break;
            }
            case dzo: {
                for (int[] nArray : nArrayArray) {
                    int n;
                    int n2 = nArray[0];
                    nArray[0] = n = nArray[1];
                    nArray[1] = -n2;
                }
                break;
            }
            case dzm: {
                for (int[] nArray : nArrayArray) {
                    nArray[0] = -nArray[0];
                    nArray[1] = -nArray[1];
                }
                break;
            }
            case dzk: {
                for (int[] nArray : nArrayArray) {
                    int n = nArray[0];
                    int n3 = nArray[1];
                    nArray[0] = -n3;
                    nArray[1] = n;
                }
                break;
            }
        }
        return nArrayArray;
    }

    private void a(eSW eSW2, eSW eSW3, int[][] nArray) {
        byte by = 0;
        if (this.bgJ == null || this.bgJ.bag() == null) {
            if (this.bgJ == null) {
                bgA.warn((Object)"Unable to spawn hours : context is null");
            } else {
                bgA.warn((Object)"Unable to spawn hours : context has no fightmap");
            }
            return;
        }
        for (int[] nArray2 : nArray) {
            by = (byte)(by + 1);
            int n = this.bgG.getX() + nArray2[0];
            int n2 = this.bgG.getY() + nArray2[1];
            if (!this.bgJ.bag().S(n, n2)) continue;
            boolean bl = by % 12 == this.rgu % 12;
            short s = this.bgJ.bag().Z(n, n2);
            long l = this.rgt + (long)by;
            if (s != Short.MIN_VALUE) {
                eSW eSW4 = bl ? eSW3 : eSW2;
                eSW eSW5 = (eSW)eSW4.b(new etj_0(l, n, n2, s, this.bgJ, this.bgE.Sn(), this.bgE, this.fHf(), this.bgE.bcB()));
                eSW5.bc(by);
                eSW5.fh(bl);
                this.bgJ.bai().a(eSW5);
                this.rgs.add(eSW5);
                continue;
            }
            bgA.warn((Object)("La cellule [" + this.bgG.getX() + nArray2[0] + ":" + this.bgG.getY() + nArray2[1] + "] n'existe pas"));
        }
    }

    @Override
    public void E(QD qD) {
        short s = this.fHf();
        if (this.bgC != null) {
            this.aQL = ((enk_0)this.bgC).a(0, s, ene_0.qPu);
            this.rgv = ((enk_0)this.bgC).a(1, s, ene_0.qPu);
        }
        long l = this.bgJ.bah().bam();
        this.rgt = l << 8;
        if (l > Integer.MAX_VALUE) {
            bgA.error((Object)"probl\u00e8me possible entre les Ids des effects Users");
        }
        this.rgu = (byte)ue_0.bjV().bjc().bjE();
    }

    @Override
    public void bbS() {
        if (this.rgs != null) {
            for (QQ qQ : this.rgs) {
                this.bgJ.bai().b(qQ);
            }
        }
        super.bbS();
    }

    @Override
    public boolean bbA() {
        return false;
    }

    @Override
    public boolean bbB() {
        return false;
    }

    @Override
    public boolean bbC() {
        return true;
    }

    @Override
    protected void a(io_1 io_12) {
        super.a(io_12);
        io_12.a(iq_1.RF().ap(this.rgt).eN(this.rgv).eO(this.rgu).RL());
    }

    @Override
    protected void e(im_1 im_12) {
        super.e(im_12);
        if (im_12.QJ()) {
            iq_1 iq_12 = im_12.QK();
            this.rgt = iq_12.Rx();
            this.rgv = iq_12.Rz();
            this.rgu = GC.ct(iq_12.RB());
        }
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fFM();
    }
}

