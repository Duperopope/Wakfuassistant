/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.openal.ALException
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.jogamp.openal.ALException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aHd
 */
public class ahd_2
extends agk_1 {
    private static final boolean dOd = false;
    private static final Logger dOe = Logger.getLogger(ahd_2.class);
    public static final byte dOf = 4;
    private ahk_1 dOg;
    private ahk_1 dOh;
    private ahk_1 dOi;
    private boolean dOj = false;
    private ahk_1 dOk;
    private ahf_2 dOl = ahf_2.dOD;
    private ahf_2 dOm = ahf_2.dOD;
    private ArrayList<ahc_2> dOn = null;
    private boolean dOo;
    private int dOp = 0;
    private int dOq = 0;
    private int dOr = 0;
    private int dOs = 0;
    private int dOt = 0;
    private long dOu = 0L;
    private ahc_2 dOv = null;
    private float dOw = 0.0f;
    private boolean dOx = false;
    private boolean dOy = false;
    public boolean dOz = false;
    private int chV = 4000;
    private int chW = 4000;
    private final Object dOA = new Object();

    public ahd_2(String string) {
        this(string, -1);
    }

    public ahd_2(String string, byte by) {
        this(string, 0, by);
    }

    public ahd_2(String string, byte by, byte by2) {
        super(string, by, by2);
        this.dP(true);
        this.dOg = null;
        this.dOh = null;
        this.dOi = null;
    }

    public boolean cck() {
        return this.dOz;
    }

    public void dT(boolean bl) {
        this.dOz = bl;
        this.dOr = 0;
        if (this.cck()) {
            this.dOl = ahf_2.dOE;
        }
    }

    public final ahk_1 ccl() {
        return this.dOg;
    }

    public final void yb(int n) {
        this.chV = n;
    }

    public final void yc(int n) {
        this.chW = n;
    }

    public final synchronized ahk_1 a(ahz_1 ahz_12, float f2, long l) {
        return this.a(ahz_12, f2, false, l);
    }

    public synchronized void dU(boolean bl) {
        if (this.dOv != null && this.dOx != bl) {
            this.dOy = true;
        }
        this.dOx = bl;
    }

    @Override
    public void cbR() {
    }

    public final synchronized ahk_1 e(long l, float f2) {
        return this.a(l, f2, false);
    }

    public final synchronized void dV(boolean bl) {
        if (bl == this.dOj) {
            return;
        }
        this.dOj = bl;
        if (this.dOj) {
            this.dOk = this.dOg;
            if (this.dOk != null) {
                this.dOk.br(0.0f, this.chW);
                this.dOk.ea(true);
            }
            this.dOm = this.dOl;
            this.dOl = ahf_2.dOJ;
            this.dOg = null;
        } else {
            if (this.dOk != null) {
                this.dOk.ccE();
                if (this.dOm == ahf_2.dOD) {
                    this.dOk.br(0.0f, this.chW);
                    this.dOk.dZ(true);
                } else {
                    this.c(this.dOk);
                }
            } else if (this.dOg != null) {
                this.dOg.br(0.0f, this.chW);
                this.dOg.dZ(true);
            }
            this.dOl = this.dOm;
            this.dOk = null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public synchronized void hD(long l) {
        super.hD(l);
        Object object = this.dOA;
        synchronized (object) {
            acp_1 acp_12 = acp_1.dAX;
            try {
                if (this.dOg != null) {
                    this.dOg.a(acp_12);
                    try {
                        switch (this.dOg.hG(l)) {
                            case dPF: 
                            case dPD: {
                                ahu_1.e(this.dOg);
                                this.dOg = null;
                                if (this.dOl != ahf_2.dOF && this.dOl != ahf_2.dOG) break;
                                this.dOl = ahf_2.dOH;
                            }
                        }
                    }
                    catch (ALException aLException) {
                        dOe.error((Object)"OpenALException during MusicGroup update", (Throwable)aLException);
                        ahu_1.e(this.dOg);
                        this.dOg = null;
                    }
                }
                if (this.dOh != null) {
                    this.dOh.a(acp_12);
                    try {
                        switch (this.dOh.hG(l)) {
                            case dPF: 
                            case dPD: {
                                ahu_1.e(this.dOh);
                                this.dOh = null;
                            }
                        }
                    }
                    catch (ALException aLException) {
                        dOe.error((Object)"OpenALException during MusicGroup update", (Throwable)aLException);
                        ahu_1.e(this.dOh);
                        this.dOh = null;
                    }
                }
                if (this.dOk != null) {
                    this.dOk.a(acp_12);
                    try {
                        switch (this.dOk.hG(l)) {
                            case dPF: 
                            case dPD: {
                                ahu_1.e(this.dOk);
                                this.dOk = null;
                            }
                        }
                    }
                    catch (ALException aLException) {
                        dOe.error((Object)"OpenALException during MusicGroup update", (Throwable)aLException);
                        ahu_1.e(this.dOk);
                        this.dOk = null;
                    }
                }
            }
            catch (Exception exception) {
                dOe.error((Object)"Exception during MusicGroup update", (Throwable)exception);
            }
            if (this.dOh != null && this.dOg == null) {
                this.dOg = this.dOh;
                this.dOh = null;
            }
            if (this.dOh == null && this.dOi != null) {
                ahk_1 ahk_12 = this.dOi;
                this.dOi = null;
                this.c(ahk_12);
            }
            switch (this.dOl.ordinal()) {
                case 0: {
                    break;
                }
                case 1: {
                    long l2;
                    this.dOp = 0;
                    if (this.dOn == null) break;
                    this.dOv = this.dOn.get(this.dOp);
                    long l3 = l2 = this.dOx ? this.dOv.ccg() : this.dOv.ccf();
                    if (this.dOk != null && this.dOk.ccR() != l2) {
                        ahu_1.e(this.dOk);
                        this.dOk = null;
                        this.dOj = false;
                        this.dOm = ahf_2.dOF;
                    }
                    ahk_1 ahk_13 = this.a(l2, (float)this.dOv.cch() / 100.0f, true);
                    this.dOq = this.dOv.ccj() == -1 || ahk_13 == null ? -1 : this.dOv.ccj() * ahk_13.ccG();
                    this.dOr = 0;
                    this.dOl = ahf_2.dOF;
                    break;
                }
                case 2: {
                    if (!this.dOz) {
                        this.dOr = (int)((long)this.dOr + (l - this.dOu));
                    }
                    if (this.dOq != -1 && this.dOr + this.chW > this.dOq) {
                        if (this.dOg != null) {
                            this.dOg.br(0.0f, this.chW);
                            this.dOg.dZ(true);
                        }
                        this.dOl = ahf_2.dOG;
                        break;
                    }
                    if (!this.dOy) break;
                    long l4 = 0L;
                    if (!this.dOg.ccM()) break;
                    if (this.dOg != null) {
                        l4 = this.dOg.ccK();
                    }
                    long l5 = this.dOx ? this.dOv.ccg() : this.dOv.ccf();
                    int n = this.chW;
                    int n2 = this.chV;
                    this.chV = 200;
                    this.chW = 250;
                    ahk_1 ahk_14 = this.a(l5, (float)this.dOv.cch() / 100.0f, true);
                    this.chV = n2;
                    this.chW = n;
                    if (ahk_14 != null) {
                        ahk_14.hI(l4);
                    }
                    this.dOy = false;
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    if (this.dOn == null) break;
                    short s = this.dOn.get(this.dOp).cci();
                    this.dOv = null;
                    this.dOl = ahf_2.dOI;
                    this.dOs = s * 1000;
                    this.dOt = 0;
                    break;
                }
                case 5: {
                    if (this.dOn == null) break;
                    this.dOt = (int)((long)this.dOt + (l - this.dOu));
                    if (this.dOt <= this.dOs) break;
                    this.dOt = 0;
                    this.dOs = 0;
                    ++this.dOp;
                    if (this.dOp == this.dOn.size()) {
                        if (this.dOo) {
                            this.dOp = 0;
                        } else {
                            this.dOn = null;
                            this.dOl = ahf_2.dOD;
                            break;
                        }
                    }
                    this.dOv = this.dOn.get(this.dOp);
                    long l6 = this.dOx ? this.dOv.ccg() : this.dOv.ccf();
                    ahk_1 ahk_15 = this.a(l6, (float)this.dOv.cch() / 100.0f, true);
                    this.dOq = this.dOv.ccj() == -1 || ahk_15 == null ? -1 : this.dOv.ccj() * ahk_15.ccG();
                    this.dOr = 0;
                    this.dOl = ahf_2.dOF;
                    break;
                }
                case 6: {
                    break;
                }
            }
            this.dOu = l;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final synchronized void bhk() {
        Object object = this.dOA;
        synchronized (object) {
            if (this.dOg != null) {
                ahu_1.e(this.dOg);
                this.dOg = null;
            }
            if (this.dOh != null) {
                ahu_1.e(this.dOh);
                this.dOh = null;
            }
            if (this.dOi != null) {
                ahu_1.e(this.dOi);
                this.dOi = null;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final synchronized void b(ahk_1 ahk_12) {
        Object object = this.dOA;
        synchronized (object) {
            if (this.dOg == ahk_12) {
                ahu_1.e(this.dOg);
                this.dOg = null;
            }
            if (this.dOh == ahk_12) {
                ahu_1.e(this.dOh);
                this.dOh = null;
            }
            if (this.dOi == ahk_12) {
                ahu_1.e(this.dOi);
                this.dOi = null;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public synchronized void bVm() {
        Object object = this.dOA;
        synchronized (object) {
            if (this.dOg != null) {
                this.dOg.bhk();
            }
            if (this.dOh != null) {
                this.dOh.bhk();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public synchronized void cbS() {
        Object object = this.dOA;
        synchronized (object) {
            if (this.dOg != null) {
                try {
                    this.dOg.ccA();
                }
                catch (Exception exception) {
                    dOe.warn((Object)"Impossible de red\u00e9marrer la musique");
                }
            }
            if (this.dOh != null) {
                try {
                    this.dOh.ccA();
                }
                catch (Exception exception) {
                    dOe.warn((Object)"Impossible de red\u00e9marrer la musique");
                }
            }
        }
    }

    @Override
    public boolean ya(int n) {
        assert (false) : "On peut pas appliquer de reverb sur de la musique";
        return true;
    }

    @Override
    public Collection<ahk_1> cbQ() {
        ArrayList<ahk_1> arrayList = new ArrayList<ahk_1>();
        if (this.dOg != null) {
            arrayList.add(this.dOg);
        }
        if (this.dOh != null) {
            arrayList.add(this.dOh);
        }
        if (this.dOi != null) {
            arrayList.add(this.dOi);
        }
        if (this.dOk != null) {
            arrayList.add(this.dOk);
        }
        return arrayList;
    }

    @Override
    public ahk_1 a(ahz_1 ahz_12, boolean bl, boolean bl2, boolean bl3, long l, long l2) {
        assert (false) : "Ne doit pas \u00eatre appel\u00e9";
        return null;
    }

    @Override
    public void a(ahk_1 ahk_12) {
        assert (false) : "Ne doit pas \u00eatre appel\u00e9";
    }

    @Override
    public final synchronized void dR(float f2) {
        float f3 = this.bBt();
        if (this.dOg != null) {
            this.dOg.dM(f3);
        }
        if (this.dOh != null) {
            this.dOh.dM(f3);
        }
        if (this.dOi != null) {
            this.dOi.dM(f3);
        }
    }

    @Override
    public final void bs(float f2, float f3) {
    }

    @Override
    public final void bt(float f2, float f3) {
    }

    @Override
    public final synchronized void g(boolean bl, boolean bl2) {
        if (this.dOg != null) {
            this.dOg.dO(bl2);
        }
        if (this.dOh != null) {
            this.dOh.dO(bl2);
        }
        if (this.dOi != null) {
            this.dOi.dO(bl2);
        }
    }

    public final ahf_2 ccm() {
        return this.dOl;
    }

    public final synchronized void s(@Nullable ArrayList<ahc_2> arrayList) {
        this.a(arrayList, false);
    }

    public final synchronized void a(@Nullable ArrayList<ahc_2> arrayList, boolean bl) {
        if (this.dOn == arrayList) {
            return;
        }
        this.dOo = bl;
        ahf_2 ahf_22 = arrayList == null ? ahf_2.dOD : ahf_2.dOE;
        if (this.dOl == ahf_2.dOJ) {
            this.dOm = ahf_22;
        } else {
            this.dOl = ahf_22;
        }
        if (this.dOl == ahf_2.dOD && this.dOg != null) {
            this.dOg.br(0.0f, this.chW);
            this.dOg.dZ(true);
        }
        this.dOn = arrayList;
    }

    public final synchronized void dW(float f2) {
        if (this.dOg != null) {
            this.dOg.br(0.0f, f2);
            this.dOg.dZ(true);
        }
        if (this.dOh != null) {
            this.dOh.br(0.0f, f2);
            this.dOh.dZ(true);
        }
        if (this.dOk != null) {
            this.dOk.br(0.0f, f2);
            this.dOk.dZ(true);
        }
        if (this.dOi != null) {
            ahu_1.e(this.dOi);
            this.dOi = null;
        }
    }

    public final synchronized void ccn() {
        this.dW(this.chW);
    }

    @Nullable
    private ahk_1 a(long l, float f2, boolean bl) {
        if (this.dMv != null) {
            ahz_1 ahz_12;
            try {
                ahz_12 = this.dMv.hE(l);
            }
            catch (IOException iOException) {
                dOe.error((Object)("Impossible de charger le son d'id " + l));
                return null;
            }
            if (ahz_12 != null) {
                return this.a(ahz_12, f2, bl, l);
            }
        } else {
            dOe.error((Object)"AudioResourceHelper non sp\u00e9cifi\u00e9.");
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Nullable
    private ahk_1 a(ahz_1 ahz_12, float f2, boolean bl, long l) {
        Object object = this.dOA;
        synchronized (object) {
            ahk_1 ahk_12;
            if (this.dOg != null && this.dOg.isPlaying() && this.dOg.bBt() > 0.0f) {
                if (this.dOg.ccs().getDescription().equals(ahz_12.getDescription())) {
                    return this.dOg;
                }
            } else if (this.dOh != null && this.dOh.isPlaying() && this.dOh.bBt() > 0.0f && this.dOh.ccs().getDescription().equals(ahz_12.getDescription())) {
                return this.dOh;
            }
            if ((ahk_12 = this.a(ahz_12, l, -1L)) != null) {
                ahk_12.cy(true);
                ahk_12.dQ(f2);
                ahk_12.dM(this.bBt());
                this.c(ahk_12);
                if (!bl) {
                    this.cco();
                }
            }
            return ahk_12;
        }
    }

    private void c(ahk_1 ahk_12) {
        if (ahk_12 == null) {
            return;
        }
        if (this.dOh == null) {
            if (this.dOg != null) {
                this.dOg.br(0.0f, this.chW);
                this.dOg.dZ(true);
            }
        } else {
            if (this.dOi != null) {
                ahu_1.e(this.dOi);
            }
            this.dOi = ahk_12;
            return;
        }
        this.dOh = this.dOg;
        this.dOg = ahk_12;
        ahk_12.dO(this.cbN());
        try {
            ahk_12.cI(0.0f);
            ahk_12.ccA();
            ahk_12.br(ahk_12.bwE(), this.chV);
        }
        catch (Exception exception) {
            dOe.error((Object)"Exception lev\u00e9e durant le crossfading :", (Throwable)exception);
            ahu_1.e(ahk_12);
            this.dOg = null;
            this.dOi = null;
            this.dOh = null;
        }
    }

    private void cco() {
        this.dOl = ahf_2.dOD;
        this.dOn = null;
    }
}

