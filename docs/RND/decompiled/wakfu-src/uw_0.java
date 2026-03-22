/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from Uw
 */
public class uw_0
implements ux_0 {
    private static final Logger bvF = Logger.getLogger(uw_0.class);
    public static final TimeZone bvG = TimeZone.getTimeZone("UTC");
    private static final GregorianCalendar bvH = new GregorianCalendar(bvG);
    public static final long bvI = 0L;
    public static final ux_0 bvJ;
    private int bvK;
    private int bvL;
    private int bvM;
    private int bvN;
    private int bvO;
    private int bvP;
    private long bvQ;

    private uw_0() {
    }

    public uw_0(ux_0 ux_02) {
        if (ux_02 != null) {
            this.f(ux_02);
        } else {
            this.f(bvJ);
        }
    }

    public uw_0(int n, int n2, int n3) {
        this.a(0, 0, 0, n, n2, n3);
    }

    public uw_0(int n, int n2, int n3, int n4, int n5, int n6) {
        this.a(n, n2, n3, n4, n5, n6);
    }

    public static uw_0 a(LocalDate localDate) {
        uw_0 uw_02 = new uw_0();
        uw_02.a(0, 0, 0, localDate.getDayOfMonth(), localDate.getMonthValue(), localDate.getYear());
        return uw_02;
    }

    public static uw_0 a(LocalDateTime localDateTime) {
        uw_0 uw_02 = new uw_0();
        uw_02.a(localDateTime.getSecond(), localDateTime.getMinute(), localDateTime.getHour(), localDateTime.getDayOfMonth(), localDateTime.getMonthValue(), localDateTime.getYear());
        return uw_02;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void cH(long l) {
        if (l == 0L) {
            this.bjw();
            return;
        }
        GregorianCalendar gregorianCalendar = bvH;
        synchronized (gregorianCalendar) {
            bvH.clear();
            bvH.setTimeZone(bvG);
            bvH.setTimeInMillis(l);
            this.bvK = bvH.get(13);
            this.bvL = bvH.get(12);
            this.bvM = bvH.get(11);
            this.bvN = bvH.get(5);
            this.bvO = bvH.get(2) + 1;
            this.bvP = bvH.get(0) == 1 ? bvH.get(1) : 1 - bvH.get(1);
            this.bvQ = bvH.getTimeInMillis();
        }
    }

    public void f(@NotNull ux_0 ux_02) {
        if (ux_02.bjv()) {
            this.bjw();
        } else {
            this.a(ux_02.bjH(), ux_02.bjF(), ux_02.bjE(), ux_02.bjD(), ux_02.bjG(), ux_02.bjI());
        }
    }

    public void a(int n, int n2, int n3, int n4, int n5, int n6) {
        this.bvP = n6;
        this.bvO = n5;
        this.bvN = n4;
        this.bvM = n3;
        this.bvL = n2;
        this.bvK = n;
        this.bjt();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void bjt() {
        GregorianCalendar gregorianCalendar = bvH;
        synchronized (gregorianCalendar) {
            bvH.clear();
            bvH.setTimeZone(bvG);
            bvH.set(this.bvP, this.bvO - 1, this.bvN, this.bvM, this.bvL, this.bvK);
            this.bvQ = bvH.getTimeInMillis();
            this.bvK = bvH.get(13);
            this.bvL = bvH.get(12);
            this.bvM = bvH.get(11);
            this.bvN = bvH.get(5);
            this.bvO = bvH.get(2) + 1;
            this.bvP = bvH.get(0) == 1 ? bvH.get(1) : 1 - bvH.get(1);
        }
    }

    public static uw_0 bju() {
        uw_0 uw_02 = new uw_0();
        uw_02.bjw();
        return uw_02;
    }

    public static void a(TimeZone timeZone) {
        bvH.setTimeZone(timeZone);
    }

    @Override
    public boolean bjv() {
        return this.bvQ == 0L;
    }

    private void bjw() {
        this.bvQ = 0L;
        this.bvP = bvJ.bjI();
        this.bvO = bvJ.bjG();
        this.bvN = bvJ.bjD();
        this.bvM = bvJ.bjE();
        this.bvL = bvJ.bjF();
        this.bvK = bvJ.bjH();
    }

    @Override
    public boolean g(@NotNull ux_0 ux_02) {
        return this.bjv() || this.k(ux_02) < 0;
    }

    @Override
    public boolean h(@NotNull ux_0 ux_02) {
        return this.bjv() || this.k(ux_02) <= 0;
    }

    @Override
    public boolean i(@NotNull ux_0 ux_02) {
        return !this.bjv() && this.k(ux_02) > 0;
    }

    @Override
    public boolean j(@NotNull ux_0 ux_02) {
        return !this.bjv() && this.k(ux_02) >= 0;
    }

    @Override
    public int k(@NotNull ux_0 ux_02) {
        if (this.bjv()) {
            return ux_02.bjv() ? 0 : -1;
        }
        if (ux_02.bjv()) {
            return 1;
        }
        if (this.bvP > ux_02.bjI()) {
            return 1;
        }
        if (this.bvP < ux_02.bjI()) {
            return -1;
        }
        if (this.bvO > ux_02.bjG()) {
            return 1;
        }
        if (this.bvO < ux_02.bjG()) {
            return -1;
        }
        if (this.bvN > ux_02.bjD()) {
            return 1;
        }
        if (this.bvN < ux_02.bjD()) {
            return -1;
        }
        if (this.bvM > ux_02.bjE()) {
            return 1;
        }
        if (this.bvM < ux_02.bjE()) {
            return -1;
        }
        if (this.bvL > ux_02.bjF()) {
            return 1;
        }
        if (this.bvL < ux_02.bjF()) {
            return -1;
        }
        if (this.bvK > ux_02.bjH()) {
            return 1;
        }
        if (this.bvK < ux_02.bjH()) {
            return -1;
        }
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        uw_0 uw_02 = (uw_0)object;
        if (this.bjv()) {
            return uw_02.bjv();
        }
        if (this.bvN != uw_02.bvN) {
            return false;
        }
        if (this.bvM != uw_02.bvM) {
            return false;
        }
        if (this.bvL != uw_02.bvL) {
            return false;
        }
        if (this.bvO != uw_02.bvO) {
            return false;
        }
        if (this.bvK != uw_02.bvK) {
            return false;
        }
        return this.bvP == uw_02.bvP;
    }

    public uw_0 a(@NotNull ua_0 ua_02) {
        if (this.bjv()) {
            return this;
        }
        this.d(ua_02.bjH(), ua_02.bjF(), ua_02.bjE(), ua_02.bjR());
        return this;
    }

    public uw_0 b(@NotNull ua_0 ua_02) {
        if (this.bjv()) {
            return this;
        }
        this.e(ua_02.bjH(), ua_02.bjF(), ua_02.bjE(), ua_02.bjR());
        return this;
    }

    public ux_0 a(@NotNull uk_0 uk_02) {
        return this.b(uk_02.bjH(), uk_02.bjF(), uk_02.bjE(), uk_02.bjR(), uk_02.bke(), uk_02.bkd());
    }

    public ux_0 b(@NotNull uk_0 uk_02) {
        return this.c(uk_02.bjH(), uk_02.bjF(), uk_02.bjE(), uk_02.bjR(), uk_02.bke(), uk_02.bkd());
    }

    @Override
    @NotNull
    public ux_0 a(@NotNull TimeUnit timeUnit, int n) {
        uw_0 uw_02 = new uw_0();
        uw_02.cH(this.bjB() - timeUnit.toMillis(n));
        return uw_02;
    }

    @Override
    @NotNull
    public ux_0 b(@NotNull TimeUnit timeUnit, int n) {
        uw_0 uw_02 = new uw_0();
        uw_02.cH(this.bjB() + timeUnit.toMillis(n));
        return uw_02;
    }

    @Override
    public uz_0 l(ux_0 ux_02) {
        assert (!this.bjv()) : "Onessaye de calculer une diff\u00e9rence \u00e0 partir d'une date nulle.";
        assert (!ux_02.bjv()) : "On essaye de calculer une diff\u00e9rence avec une date nulle";
        long l = (ux_02.bjB() - this.bjB()) / 1000L;
        return new uz_0(l);
    }

    @Override
    public ux_0 a(ux_0 ux_02, ua_0 ua_02) {
        return this.a(ux_02, ua_02, false);
    }

    @Override
    public ux_0 a(ux_0 ux_02, ua_0 ua_02, boolean bl) {
        assert (!this.bjv()) : "On essaye de calculer une date \u00e0 partir d'une date nulle.";
        assert (!ux_02.bjv()) : "On essaye de calculer une date avec une date nulle";
        assert (!ua_02.aJG()) : "On essaye de calculer une date avec un interval nul";
        uz_0 uz_02 = ux_02.l(this);
        int n = uz_02.aYI() ? 0 : -1;
        int n2 = bl ? 1 : 0;
        uz_0 uz_03 = new uz_0(ua_02);
        int n3 = uz_02.f(ua_02) + n + n2;
        uz_03.pQ(n3);
        uw_0 uw_02 = new uw_0(ux_02);
        uw_02.a(uz_03);
        return uw_02;
    }

    public int m(ux_0 ux_02) {
        uw_0 uw_02 = new uw_0(0, 0, 0, this.bvN, this.bvO, this.bvP);
        uw_0 uw_03 = new uw_0(0, 0, 0, ux_02.bjD(), ux_02.bjG(), ux_02.bjI());
        uz_0 uz_02 = new uz_0((uw_03.bjB() - uw_02.bjB()) / 1000L);
        int n = uz_02.bjR();
        if (uz_02.bjE() > 12) {
            ++n;
        }
        return n;
    }

    public uw_0 b(int n, int n2, int n3, int n4, int n5, int n6) {
        if (this.bjv()) {
            return this;
        }
        this.bvK += n;
        this.bvL += n2;
        this.bvM += n3;
        this.bvN += n4;
        this.bvO += n5;
        this.bvP += n6;
        this.bjt();
        return this;
    }

    public uw_0 d(int n, int n2, int n3, int n4) {
        return this.b(n, n2, n3, n4, 0, 0);
    }

    public uw_0 pD(int n) {
        this.bvO += n;
        this.bjt();
        return this;
    }

    public uw_0 pE(int n) {
        this.bvP += n;
        this.bjt();
        return this;
    }

    public uw_0 e(int n, int n2, int n3, int n4) {
        if (this.bjv()) {
            return this;
        }
        this.bvK -= n;
        this.bvL -= n2;
        this.bvM -= n3;
        this.bvN -= n4;
        this.bjt();
        return this;
    }

    public uw_0 c(int n, int n2, int n3, int n4, int n5, int n6) {
        if (this.bjv()) {
            return this;
        }
        this.bvK -= n;
        this.bvL -= n2;
        this.bvM -= n3;
        this.bvN -= n4;
        this.bvO -= n5;
        this.bvP -= n6;
        this.bjt();
        return this;
    }

    public void bjx() {
        if (this.bjv()) {
            return;
        }
        this.bvM = 0;
        this.bvL = 0;
        this.bvK = 0;
        this.bjt();
    }

    public void bjy() {
        if (this.bjv()) {
            return;
        }
        this.bvL = 0;
        this.bvK = 0;
        this.bjt();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int pF(int n) {
        GregorianCalendar gregorianCalendar = bvH;
        synchronized (gregorianCalendar) {
            bvH.setTimeInMillis(this.bvQ);
            return bvH.get(n);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static uw_0 g(Date date) {
        GregorianCalendar gregorianCalendar = bvH;
        synchronized (gregorianCalendar) {
            bvH.clear();
            bvH.setTimeZone(bvG);
            bvH.setTime(date);
            int n = bvH.get(0) == 1 ? bvH.get(1) : 1 - bvH.get(1);
            return new uw_0(bvH.get(13), bvH.get(12), bvH.get(11), bvH.get(5), bvH.get(2) + 1, n);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static uw_0 fn(long l) {
        GregorianCalendar gregorianCalendar = bvH;
        synchronized (gregorianCalendar) {
            bvH.clear();
            bvH.setTimeZone(bvG);
            bvH.setTimeInMillis(l);
            int n = bvH.get(0) == 1 ? bvH.get(1) : 1 - bvH.get(1);
            return new uw_0(bvH.get(13), bvH.get(12), bvH.get(11), bvH.get(5), bvH.get(2) + 1, n);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public long bjz() {
        assert (!this.bjv()) : "On essaye de calculer les heurs d'une date nulle";
        GregorianCalendar gregorianCalendar = bvH;
        synchronized (gregorianCalendar) {
            bvH.clear();
            bvH.setTimeZone(bvG);
            bvH.set(this.bvP, this.bvO - 1, this.bvN, this.bvM, 0, 0);
            return bvH.getTimeInMillis();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public long bjA() {
        assert (!this.bjv()) : "On essaye de calculer les jours d'une date nulle";
        GregorianCalendar gregorianCalendar = bvH;
        synchronized (gregorianCalendar) {
            bvH.clear();
            bvH.setTimeZone(bvG);
            bvH.set(this.bvP, this.bvO - 1, this.bvN, 0, 0, 0);
            return bvH.getTimeInMillis();
        }
    }

    @Override
    public long bjB() {
        return this.bvQ;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Date bjC() {
        assert (!this.bjv()) : "On essaye de convertir une date nulle";
        GregorianCalendar gregorianCalendar = bvH;
        synchronized (gregorianCalendar) {
            bvH.clear();
            bvH.setTimeZone(bvG);
            bvH.set(this.bvP, this.bvO - 1, this.bvN, this.bvM, this.bvL, this.bvK);
            return bvH.getTime();
        }
    }

    @Override
    public int bjD() {
        return this.bvN;
    }

    @Override
    public int bjE() {
        return this.bvM;
    }

    @Override
    public int bjF() {
        return this.bvL;
    }

    @Override
    public int bjG() {
        return this.bvO;
    }

    @Override
    public int bjH() {
        return this.bvK;
    }

    @Override
    public int bjI() {
        return this.bvP;
    }

    @Override
    public int bjJ() {
        return this.pF(3);
    }

    public void pG(int n) {
        this.bvK = n;
        this.bjt();
    }

    public void pH(int n) {
        this.bvL = n;
        this.bjt();
    }

    public void pI(int n) {
        this.bvM = n;
        this.bjt();
    }

    public void pJ(int n) {
        this.bvN = n;
        this.bjt();
    }

    public void pK(int n) {
        this.bvO = n;
        this.bjt();
    }

    public void pL(int n) {
        this.bvP = n;
        this.bjt();
    }

    public void bjK() {
    }

    @Override
    public ux_0 bjL() {
        return new uw_0(this.bjD() + 1, this.bjG(), this.bjI());
    }

    @Override
    public String toString() {
        if (this.bjv()) {
            return "Date{ nulle }";
        }
        int n = bvH.getTimeZone().getRawOffset() / 3600000;
        if (n >= 0) {
            return up_0.a("{Date : %d/%M/%Y %h:%m:%s UTC+" + n + "}", this);
        }
        return up_0.a("{Date : %d/%M/%Y %h:%m:%s UTC" + n + "}", this);
    }

    @Override
    public String bjM() {
        if (this.bjv()) {
            return "null date";
        }
        return up_0.a("%d/%M/%Y %hH%mmin", this);
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.k((ux_0)object);
    }

    static {
        bvF.info((Object)("GameDate initialized. Timezone : " + String.valueOf(bvH.getTimeZone())));
        bvJ = uw_0.fn(0L);
    }
}

