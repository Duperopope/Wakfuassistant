/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from UE
 */
public class ue_0
extends ut_0
implements azb_2 {
    private static final ue_0 bww = new ue_0();
    protected static final Logger bwx;
    private boolean bwy;
    private ArrayList<uf_0> bwz;
    private boolean bwA;
    private float bwB;
    private float bwC;
    private Uu bwD;

    public static ue_0 bjV() {
        return bww;
    }

    @Override
    public void fm(long l) {
        if (this.bjc() == null) {
            this.bwD = (uv, ut_02) -> {
                if (uv == Uv.bvA) {
                    super.fm(l);
                    this.b(this.bwD);
                }
            };
            this.a(this.bwD);
            return;
        }
        super.fm(l);
    }

    @Override
    protected void bjj() {
        uk_0 uk_02 = new uk_0(ud_0.bws);
        bwx.info((Object)("WakfuGameCalendar : adding periodic ClimateUpdateEvent event, period=" + String.valueOf(uk_02)));
        this.a(new ui_0(this.bjc(), uk_02));
        ux_0 ux_02 = bww.bjc();
        int n = ux_02.bjI();
        uw_0 uw_02 = new uw_0(this.bjc());
        uw_02.bjy();
        this.a(new um_0(uw_02));
        uw_02.bjx();
        this.a(new ul_0(uw_02));
        super.bjj();
    }

    @Override
    public void fk(long l) {
        super.fk(l);
        this.bjW();
    }

    @Override
    public void run() {
        super.run();
        if (this.bvy) {
            this.bjW();
        }
    }

    public void a(uf_0 uf_02) {
        if (uf_02 == null) {
            return;
        }
        if (this.bwz == null) {
            this.bwz = new ArrayList(2);
        }
        this.bwz.add(uf_02);
    }

    private void bjW() {
        boolean bl = this.bwA;
        long l = this.bji() / 1000L;
        long l2 = ud_0.bwq;
        long l3 = l % l2;
        this.bwC = (float)l3 / (float)l2 * 100.0f;
        int n = 25;
        int n2 = 75;
        this.bwA = !(this.bwC >= 75.0f) && !(this.bwC < 25.0f);
        this.bwB = ue_0.a(this.bwC, 75, 25);
        if (bl != this.bwA && this.bwz != null) {
            int n3 = this.bwz.size();
            for (int i = 0; i < n3; ++i) {
                this.bwz.get(i).bq(this.bwA);
            }
        }
        this.bwy = true;
    }

    private static float a(float f2, int n, int n2) {
        int n3;
        int n4 = Math.min(n, n2);
        int n5 = Math.max(n, n2);
        int n6 = n5 - n4;
        int n7 = 100 - n6;
        int n8 = n3 = f2 > (float)n4 && f2 <= (float)n5 ? n6 : n7;
        float f3 = f2 >= (float)n5 ? (f2 - (float)n5) / (float)n3 : (f2 < (float)n4 ? 1.0f + (f2 - (float)n4) / (float)n3 : (f2 - (float)n4) / (float)n3);
        return f3 * 100.0f;
    }

    @Override
    public boolean bjr() {
        return this.bwA;
    }

    public float bjX() {
        return this.bwB;
    }

    @Override
    public float bjf() {
        return this.bwC;
    }

    public boolean bjY() {
        return this.bwy;
    }

    private ue_0() {
        super(1970, 1);
    }

    @Override
    public long bjZ() {
        return this.bjg();
    }

    static {
        bww.setFirstDayOfWeek(2);
        bwx = Logger.getLogger(ue_0.class);
    }
}

