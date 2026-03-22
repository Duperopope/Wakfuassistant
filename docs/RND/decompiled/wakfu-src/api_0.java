/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aPi
 */
public class api_0
implements Comparable<api_0> {
    private int ewY = -1;
    private aPl ewZ;
    private long exa = -1L;
    private boolean aYW = true;
    private String exb;
    private List<Mv> exc = new ArrayList<Mv>();
    @Nullable
    private vb_0 exd = null;
    private String aCL;
    private final ux_0 exe;
    private final long exf;
    private boolean exg;
    private static long bgK = Long.MIN_VALUE;
    private boolean exh = false;

    public api_0(String string, String string2) {
        this.exb = string;
        this.aCL = aPe.iM(string2);
        this.exe = Uq.buK.bjc();
        if (bgK == Long.MAX_VALUE) {
            bgK = Long.MIN_VALUE;
        }
        this.exf = bgK++;
    }

    public api_0(String string) {
        this(null, string);
    }

    public api_0(long l, String string) {
        this(string);
        this.exa = l;
    }

    public api_0(String string, long l, String string2) {
        this(string, string2);
        this.exa = l;
    }

    public api_0(nn_0 nn_02) {
        this(nn_02.aWw(), nn_02.q());
        this.exa = nn_02.aWu();
        this.aYW = nn_02.aWv();
        this.exc = nn_02.aWx();
        this.exd = nn_02.aWy();
    }

    public api_0(om_0 om_02) {
        this(om_02.aWw(), om_02.q());
        this.exa = om_02.aWu();
        this.aYW = true;
        this.exc = om_02.aWx();
        this.exd = om_02.aWy();
    }

    public aPl czl() {
        return this.ewZ;
    }

    public void m(aPl aPl2) {
        this.ewZ = aPl2;
    }

    public void yW(int n) {
        this.ewY = n;
    }

    public int czm() {
        return this.ewY;
    }

    public long czn() {
        return this.exa;
    }

    public String czo() {
        return this.exb;
    }

    public String a(bsb_1 bsb_12) {
        return bsb_1.a(bsb_12, this.exb, this.exd, this.exc);
    }

    public void je(String string) {
        this.exb = string;
    }

    public String getMessage() {
        return this.aCL;
    }

    public String czp() {
        if (!this.exh) {
            return this.aCL;
        }
        aUQ aUQ2 = aue_0.cVJ().cVO();
        if (aUQ2 != null && evm_2.b(aUQ2.cWq(), evn_2.ovo)) {
            return "[" + aum_0.cWf().c("chat.deletedMessage", new Object[0]) + "] " + this.aCL;
        }
        return "[" + aum_0.cWf().c("chat.deletedMessage", new Object[0]) + "]";
    }

    public void co(String string) {
        this.aCL = string;
    }

    public ux_0 czq() {
        return this.exe;
    }

    public boolean czr() {
        return this.exg;
    }

    public void eC(boolean bl) {
        this.exg = bl;
    }

    public boolean czs() {
        return this.exh;
    }

    public void bLe() {
        this.exh = true;
    }

    public boolean aWv() {
        return this.aYW;
    }

    public void eD(boolean bl) {
        this.aYW = bl;
    }

    public void y(List<Mv> list) {
        this.exc = list;
    }

    public void a(vb_0 vb_02) {
        this.exd = vb_02;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        api_0 api_02 = (api_0)object;
        return this.exf == api_02.exf;
    }

    public int hashCode() {
        return Objects.hash(this.exf);
    }

    public int f(@NotNull api_0 api_02) {
        int n = this.exe.k(api_02.exe);
        if (n == 0) {
            return Long.compare(this.exf, api_02.exf);
        }
        return n;
    }

    public boolean a(bhJ bhJ2) {
        if (this.aYW) {
            return bhJ2.Sn() == this.exa;
        }
        return bhJ2.aZj() == this.exa;
    }

    public String czt() {
        if (this.ewZ.czE()) {
            return this.ewZ.czD();
        }
        return "";
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.f((api_0)object);
    }
}

