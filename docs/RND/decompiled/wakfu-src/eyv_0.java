/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.Calendar;
import java.util.Date;
import org.apache.log4j.Logger;

/*
 * Renamed from eyV
 */
public abstract class eyv_0
implements ayz_2,
gq_0<uo_1> {
    public static final int poq = 48;
    protected static final Logger por = Logger.getLogger(eyv_0.class);
    protected long bxw;
    protected long aDh;
    protected String aFD;
    protected long aDL;
    protected acd_1 bio;
    protected long brw;
    protected Date pos;
    private String lMZ;
    private long pot;

    public final long flJ() {
        return this.bxw;
    }

    public final void pk(long l) {
        this.bxw = l;
    }

    public final long flK() {
        return this.aDh;
    }

    public final void pl(long l) {
        this.aDh = l;
    }

    public final String flL() {
        return this.aFD;
    }

    public final void rO(String string) {
        this.aFD = string;
    }

    public long Ya() {
        return this.aDL;
    }

    public void jQ(long l) {
        this.aDL = l;
    }

    public final acd_1 flM() {
        return this.bio;
    }

    public final void ap(acd_1 acd_12) {
        this.bio = acd_12;
    }

    public final long flN() {
        return this.brw;
    }

    public final void pm(long l) {
        this.brw = l;
    }

    public final String flO() {
        return this.lMZ;
    }

    public final void rP(String string) {
        this.lMZ = string;
    }

    public final long flP() {
        return this.pot;
    }

    public final void pn(long l) {
        this.pot = l;
    }

    public abstract void a(tl_1 var1);

    public abstract void b(tl_1 var1);

    public final Date flQ() {
        return this.pos;
    }

    public final void m(Date date) {
        this.pos = date;
    }

    @Override
    public final boolean a(uo_1 uo_12) {
        uo_12.aba = this.bxw;
        uo_12.acM = this.aDh;
        uo_12.acN = this.aFD;
        uo_12.TL = this.aDL;
        uo_12.acO = this.bio.getX();
        uo_12.acP = this.bio.getY();
        uo_12.acQ = this.bio.bdi();
        uo_12.acR = this.brw;
        uo_12.acT = this.pos.getTime();
        uo_12.TD = this.lMZ;
        uo_12.TE = this.pot;
        this.b(uo_12.acS);
        return true;
    }

    @Override
    public final boolean b(uo_1 uo_12) {
        this.bxw = uo_12.aba;
        this.aDh = uo_12.acM;
        this.aFD = uo_12.acN;
        this.aDL = uo_12.TL;
        this.bio = new acd_1(uo_12.acO, uo_12.acP, uo_12.acQ);
        this.brw = uo_12.acR;
        this.pos = new Date(uo_12.acT);
        this.lMZ = uo_12.TD;
        this.pot = uo_12.TE;
        this.a(uo_12.acS);
        return true;
    }

    @Override
    public void aVH() {
        this.bxw = 0L;
        this.aDh = 0L;
        this.aDL = 0L;
        this.aFD = null;
        this.bio = null;
        this.brw = 0L;
        this.pos = null;
        this.lMZ = null;
        this.pot = 0L;
    }

    @Override
    public void aVI() {
    }

    public final boolean flR() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.pos);
        calendar.add(10, 48);
        return calendar.getTimeInMillis() < System.currentTimeMillis();
    }

    public final byte[] flS() {
        ByteBuffer byteBuffer;
        uo_1 uo_12 = new uo_1();
        if (this.a(uo_12) && uo_12.aF(byteBuffer = ByteBuffer.allocate(uo_12.DN()))) {
            return byteBuffer.array();
        }
        return null;
    }
}

