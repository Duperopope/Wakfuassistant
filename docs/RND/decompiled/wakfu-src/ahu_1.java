/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.common.nio.Buffers
 *  com.jogamp.openal.AL
 *  com.jogamp.openal.ALC
 *  com.jogamp.openal.ALCcontext
 *  com.jogamp.openal.ALCdevice
 *  com.jogamp.openal.ALException
 *  com.jogamp.openal.ALExt
 *  com.jogamp.openal.ALFactory
 *  com.jogamp.openal.JoalVersion
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.jogamp.common.nio.Buffers;
import com.jogamp.openal.AL;
import com.jogamp.openal.ALC;
import com.jogamp.openal.ALCcontext;
import com.jogamp.openal.ALCdevice;
import com.jogamp.openal.ALException;
import com.jogamp.openal.ALExt;
import com.jogamp.openal.ALFactory;
import com.jogamp.openal.JoalVersion;
import java.io.IOException;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aHu
 */
public abstract class ahu_1
extends Thread
implements ahr_1 {
    private static ahu_1 dQr;
    protected static final Logger dQs;
    protected static final boolean dQt = true;
    protected static final boolean dQu = false;
    protected static final int dQv = 131072;
    public static final long dQw = 10L;
    private boolean btq;
    protected static final int[] dQx;
    protected static final int[] dQy;
    protected static final int[] dQz;
    private int dQA = -1;
    private int dQB = -1;
    private final ArrayList<agk_1> dQC = new ArrayList();
    private final Object dQD = new Object();
    protected agm_1 dMt;
    private volatile boolean dQE;
    private AL dhR;
    private ALC dhO;
    private ALExt dhS;
    private boolean dQF;
    private volatile boolean dQG;
    protected int[] dQH = new int[0];
    protected boolean dQI = false;
    private int dQJ;
    private int dQK;
    protected final aah_1<ahq_1> dQL = new aah_1();
    private boolean dQM = true;
    private boolean dQN = false;
    long dQO;
    int dQP;
    private static int dQQ;
    private static int dQR;

    protected ahu_1() {
        ahu_1.c(this);
    }

    protected static void c(ahu_1 ahu_12) {
        dQr = ahu_12;
    }

    public static ahu_1 cdi() {
        return dQr;
    }

    public final boolean cdj() {
        return this.dQE;
    }

    public final agm_1 cdk() {
        return this.dMt;
    }

    public void a(agm_1 agm_12) {
        this.dMt = agm_12;
    }

    public void cdl() {
        this.ed(false);
        try {
            this.join(500L);
        }
        catch (InterruptedException interruptedException) {
            dQs.debug((Object)"Thread interrupted while waiting for SoundManager to stop", (Throwable)interruptedException);
        }
        try {
            if (this.dhR != null || this.dhO != null || this.dhS != null) {
                dQs.info((Object)"SoundManager thread not closed in maximum time. Destroying AL");
                this.cdm();
            }
        }
        catch (ALException aLException) {
            dQs.error((Object)"Exception en detruisant OpenAL : ", (Throwable)aLException);
        }
    }

    public final void cdm() {
        if (this.dhR != null) {
            ALCcontext aLCcontext = this.cdt();
            if (avh_2.dhF.a(avg_2.dhw) && this.dhS != null) {
                this.dhS.alEventControlSOFT(dQz.length, dQz, 0, false);
            }
            if (avh_2.dhF.a(avg_2.dhx) && this.dhS != null && this.dQH.length > 0) {
                this.dhS.alcEventControlSOFT(this.dQH.length, this.dQH, 0, false);
            }
            if (aLCcontext != null) {
                if (this.dhS != null && this.dhR != null) {
                    this.a(aLCcontext);
                }
                if (this.dhO != null) {
                    this.d(aLCcontext);
                }
            }
        }
        this.dhR = null;
        this.dhO = null;
        this.dhS = null;
    }

    public final void ed(boolean bl) {
        this.btq = bl;
    }

    public final boolean cdn() {
        return this.btq;
    }

    public void cdo() {
        this.cdp();
        @Nullable ALCdevice aLCdevice = this.cdu();
        if (aLCdevice != null) {
            this.a(aLCdevice);
        }
    }

    public void cdp() {
        int n = this.dhR.alGetError();
        if (n != 0) {
            throw new ALException("OpenAL error : " + (String)(switch (n) {
                case -1 -> "AL_INVALID";
                case 40961 -> "AL_INVALID_NAME";
                case 40962 -> "AL_INVALID_ENUM";
                case 40963 -> "AL_INVALID_VALUE";
                case 40964 -> "AL_INVALID_OPERATION";
                case 40965 -> "AL_OUT_OF_MEMORY";
                default -> "unknown error with code : " + n;
            }));
        }
    }

    public void a(ALCdevice aLCdevice) {
        int n = this.dhO.alcGetError(aLCdevice);
        if (n != 0) {
            throw new ALException("OpenALC error : " + (String)(switch (n) {
                case 0 -> "ALC_INVALID";
                case 40962 -> "ALC_INVALID_CONTEXT";
                case 40961 -> "ALC_INVALID_DEVICE";
                case 40963 -> "ALC_INVALID_ENUM";
                case 40964 -> "ALC_INVALID_VALUE";
                case 40965 -> "ALC_OUT_OF_MEMORY";
                default -> "unknown error with code : " + n;
            }));
        }
    }

    public AL cdq() {
        return this.dhR;
    }

    public ALC cdr() {
        return this.dhO;
    }

    public ALExt cds() {
        return this.dhS;
    }

    public int cS(int n, int n2) {
        IntBuffer intBuffer = Buffers.newDirectIntBuffer((int)1);
        this.dhR.alGetSourcei(n, n2, intBuffer);
        int n3 = intBuffer.get(0);
        this.cdp();
        return n3;
    }

    public int a(ALCdevice aLCdevice, int n) {
        IntBuffer intBuffer = Buffers.newDirectIntBuffer((int)1);
        this.dhO.alcGetIntegerv(aLCdevice, n, intBuffer.capacity(), intBuffer);
        return intBuffer.get(0);
    }

    private void b(ALCdevice aLCdevice) {
        if (aLCdevice == null) {
            dQs.warn((Object)"Unable to retrieve number of sources available! (Missing device)");
            return;
        }
        this.dQJ = this.a(aLCdevice, 4112);
        dQs.info((Object)("Max available sources : " + this.dQJ));
    }

    @Nullable
    public ALCcontext cdt() {
        return this.dhO.alcGetCurrentContext();
    }

    @Nullable
    public ALCdevice cdu() {
        return this.c(this.cdt());
    }

    public boolean cdv() {
        return this.dQF;
    }

    @Nullable
    public ALCdevice c(ALCcontext aLCcontext) {
        if (aLCcontext == null) {
            return null;
        }
        return this.dhO.alcGetContextsDevice(aLCcontext);
    }

    @Nullable
    public List<String> cdw() {
        if (avh_2.dhF.a(avg_2.dhv)) {
            String[] stringArray = this.dhO.alcGetAllDeviceSpecifiers();
            return stringArray != null ? Arrays.asList(stringArray) : Collections.emptyList();
        }
        if (avh_2.dhF.a(avg_2.dhu)) {
            String[] stringArray = this.dhO.alcGetDeviceSpecifiers();
            return stringArray != null ? Arrays.asList(stringArray) : Collections.emptyList();
        }
        return null;
    }

    @Nullable
    public String cdx() {
        if (avh_2.dhF.a(avg_2.dhv)) {
            return this.dhO.alcGetString(null, 4114);
        }
        if (avh_2.dhF.a(avg_2.dhu)) {
            return this.dhO.alcGetString(null, 4100);
        }
        return null;
    }

    @Nullable
    public String cdy() {
        if (this.dQF) {
            return this.cdx();
        }
        ALCdevice aLCdevice = this.cdu();
        if (aLCdevice == null) {
            return null;
        }
        if (avh_2.dhF.a(avg_2.dhv)) {
            return this.dhO.alcGetString(aLCdevice, 4115);
        }
        if (avh_2.dhF.a(avg_2.dhu)) {
            return this.dhO.alcGetString(aLCdevice, 4101);
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ic(@Nullable String string) {
        IntBuffer intBuffer;
        boolean bl;
        ALCcontext aLCcontext = this.cdt();
        ALCdevice aLCdevice = this.c(aLCcontext);
        this.dQF = string == null || string.isEmpty();
        ALCdevice aLCdevice2 = this.dhO.alcOpenDevice(this.dQF ? null : string);
        if (aLCdevice2 == null && !this.dQF) {
            dQs.warn((Object)("Unable to use device supplied : " + string + " use default instead"));
            this.dQF = true;
            aLCdevice2 = this.dhO.alcOpenDevice(null);
        }
        if (aLCdevice2 == null && this.dQF) {
            throw new ALException("Unable to retrieve default device !");
        }
        if (aLCdevice != null && aLCdevice.getDirectBufferAddress() == aLCdevice2.getDirectBufferAddress()) {
            return;
        }
        boolean bl2 = avh_2.dhF.a(avg_2.dhz);
        boolean bl3 = bl = avh_2.dhF.a(avg_2.dht) && this.cdA();
        if (bl2 || bl) {
            intBuffer = IntBuffer.allocate(1 + (bl2 ? 2 : 0) + (bl ? 2 : 0));
            if (bl2) {
                intBuffer.put(6546);
                intBuffer.put(0);
            }
            if (bl) {
                intBuffer.put(6607);
                intBuffer.put(1);
            }
            intBuffer.put(0);
            intBuffer.rewind();
        } else {
            intBuffer = null;
        }
        ALCcontext aLCcontext2 = this.dhO.alcCreateContext(aLCdevice2, intBuffer);
        Object object = this.dQD;
        synchronized (object) {
            this.a(aLCcontext);
            if (!this.dhO.alcMakeContextCurrent(aLCcontext2)) {
                dQs.error((Object)("Unable to set new created context for following device : " + (this.dQF ? "null" : string) + ". So try to fallback to latest device..."));
                if (!this.dhO.alcMakeContextCurrent(aLCcontext)) {
                    dQs.error((Object)"Unable to fallback to last context. So disable SoundManager");
                    this.ed(false);
                    this.d(aLCcontext);
                    this.d(aLCcontext2);
                    return;
                }
                this.b(aLCdevice);
                this.b(aLCcontext);
                this.d(aLCcontext);
                return;
            }
            this.b(aLCdevice2);
            this.b(aLCcontext2);
            this.d(aLCcontext);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(@Nullable ALCcontext aLCcontext) {
        if (aLCcontext == null) {
            return;
        }
        if (avh_2.dhF.a(avg_2.dhw)) {
            this.dhS.alEventCallbackSOFT(null, aLCcontext);
        }
        if (avh_2.dhF.a(avg_2.dhx)) {
            this.dhS.alcEventCallbackSOFT(null, (Object)aLCcontext);
        }
        Object object = this.dQD;
        synchronized (object) {
            for (agk_1 agc_12 : this.dQC) {
                agc_12.a(aLCcontext);
            }
            for (ahk_1 ahk_12 : ahn_1.ccT().ccW()) {
                ahk_12.a(aLCcontext);
            }
            this.dQL.forEach(ahq_1::cdg);
        }
        this.cdH();
        if (avh_2.dhF.a(avg_2.dht) && this.cdA()) {
            this.dhS.alDebugMessageCallbackEXT(null, aLCcontext);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(@Nullable ALCcontext aLCcontext2) {
        if (aLCcontext2 == null) {
            return;
        }
        if (avh_2.dhF.a(avg_2.dht)) {
            if (this.cdA()) {
                this.dhR.alEnable(6578);
                this.dhS.alDebugMessageControlEXT(2, 2, 2, 0, null, true);
                this.dhS.alDebugMessageCallbackEXT((n, n2, n3, n4, string, aLCcontext) -> {
                    String string2 = switch (n) {
                        case 6581 -> "AL Runtime";
                        case 6582 -> "ALC Layer";
                        case 6583 -> "3rd party";
                        case 6584 -> "Application";
                        case 6585 -> "Other";
                        default -> String.format("Unknown (%d)", n);
                    };
                    String string3 = switch (n2) {
                        case 6586 -> "Error";
                        case 6587 -> "Deprecated behaviour";
                        case 6589 -> "Inconsistent behaviour";
                        case 6590 -> "Performance";
                        case 6591 -> "Custom";
                        case 6592 -> "New message group";
                        case 6593 -> "Leave message group";
                        case 6594 -> "Other";
                        default -> String.format("Unknown (%d)", n2);
                    };
                    String string4 = switch (n4) {
                        case 6595 -> "High";
                        case 6596 -> "Medium";
                        case 6597 -> "Low";
                        case 6598 -> "Notification";
                        default -> String.format("Unknown (%d)", n4);
                    };
                    String string5 = String.format("[AL] %s [%s:%s] %s (Related source id : %d)", string4, string2, string3, string, n3);
                    switch (n4) {
                        case 6595: 
                        case 6596: {
                            dQs.error((Object)string5);
                            break;
                        }
                        case 6597: {
                            dQs.warn((Object)string5);
                            break;
                        }
                        case 6598: {
                            dQs.info((Object)string5);
                            break;
                        }
                        default: {
                            dQs.warn((Object)String.format("Unknown severity (%s) for next message", n4));
                            dQs.info((Object)string5);
                        }
                    }
                }, aLCcontext2);
            } else {
                this.dhR.alDisable(6578);
            }
            boolean bl = this.dhR.alIsEnabled(6578);
            dQs.info((Object)("Current sound context has debug output " + (bl ? "enabled." : "disabled.")));
        }
        if (avh_2.dhF.a(avg_2.dhw)) {
            this.dhS.alEventCallbackSOFT((n, n2, n3, string, aLCcontext) -> {
                switch (n) {
                    case 6566: {
                        if (!this.cdz()) break;
                        this.dQI = true;
                    }
                }
            }, aLCcontext2);
        }
        if (avh_2.dhF.a(avg_2.dhx)) {
            this.dhS.alcEventCallbackSOFT((n, n2, aLCdevice, string, object) -> {
                switch (n) {
                    case 6614: {
                        if (!this.cdv()) break;
                        this.dQI = true;
                    }
                }
            }, (Object)aLCcontext2);
        }
        Object object2 = this.dQD;
        synchronized (object2) {
            this.dQL.forEach(ahq_1::cdf);
            for (ahk_1 ahk_12 : ahn_1.ccT().ccW()) {
                ahk_12.b(aLCcontext2);
            }
        }
    }

    public boolean cdz() {
        return this.dQM;
    }

    public void ee(boolean bl) {
        this.dQM = bl;
    }

    public boolean cdA() {
        return this.dQN;
    }

    public void ef(boolean bl) {
        this.dQN = bl;
    }

    public void d(@Nullable ALCcontext aLCcontext) {
        if (aLCcontext == null) {
            return;
        }
        ALCdevice aLCdevice = this.c(aLCcontext);
        this.dhO.alcDestroyContext(aLCcontext);
        if (aLCdevice != null && !this.dhO.alcCloseDevice(aLCdevice)) {
            dQs.warn((Object)("Unable to close following device : " + String.valueOf(aLCdevice) + " of following context : " + String.valueOf(aLCcontext)));
        }
    }

    public final synchronized boolean id(@Nullable String string) {
        if (!this.dQE) {
            try {
                this.dhR = ALFactory.getAL();
                this.dhO = ALFactory.getALC();
                this.dhS = ALFactory.getALExt();
                dQs.info((Object)"------- AL dump ---------");
                for (String string2 : JoalVersion.getALStrings((ALC)this.dhO, null).toString().split("\n")) {
                    dQs.info((Object)string2);
                }
                if (avh_2.dhF.a(avg_2.dhw)) {
                    this.dhS.alEventControlSOFT(dQz.length, dQz, 0, true);
                    this.cdp();
                }
                if (avh_2.dhF.a(avg_2.dhx)) {
                    if (avh_2.dhF.a(avg_2.dhy)) {
                        this.dQH = new int[]{6614};
                    }
                    if (this.dQH.length > 0) {
                        this.dhS.alcEventControlSOFT(this.dQH.length, this.dQH, 0, true);
                        this.cdp();
                    }
                }
                this.ic(string);
                this.dhR.alDistanceModel(53252);
                this.cdp();
                this.dQE = true;
            }
            catch (ALException aLException) {
                dQs.warn((Object)"Problem in SoundManager.initialize() -> Sound is disabled", (Throwable)aLException);
                this.dQE = false;
                this.dQG = true;
                return false;
            }
        }
        return !this.btq && this.cdE();
    }

    @Override
    public final synchronized void start() {
        if (!this.btq && this.dQE && !this.dQG) {
            this.setName("SoundManager");
            super.start();
            while (!this.btq) {
                try {
                    Thread.sleep(100L);
                }
                catch (InterruptedException interruptedException) {
                    dQs.error((Object)"Interrupted", (Throwable)interruptedException);
                }
            }
        } else if (this.btq) {
            dQs.error((Object)"SoundManager is already running");
        } else if (this.dQG) {
            dQs.error((Object)"SoundManager failed to initialize");
        } else {
            dQs.error((Object)"Initialize SoundManager first");
        }
    }

    protected void hR(long l) {
        if (this.dQI) {
            this.ic(null);
            this.dQI = false;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void cdB() {
        Object object = this.dQD;
        synchronized (object) {
            for (agk_1 agk_12 : this.dQC) {
                agk_12.cbR();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void run() {
        this.btq = true;
        dQs.info((Object)"SoundManager running");
        while (this.btq) {
            try {
                Thread.sleep(10L);
            }
            catch (InterruptedException interruptedException) {
                dQs.error((Object)"InterruptedException during SoundManager run", (Throwable)interruptedException);
            }
            long l = System.currentTimeMillis();
            try {
                this.hR(l);
            }
            catch (Throwable throwable) {
                dQs.error((Object)"Exception during SoundManager run", throwable);
            }
            Object object = this.dQD;
            synchronized (object) {
                for (agk_1 agk_12 : this.dQC) {
                    try {
                        if (agk_12.cbN() && !agk_12.cbP()) continue;
                        agk_12.hD(l);
                    }
                    catch (Throwable throwable) {
                        dQs.error((Object)"Exception during SoundManager run", throwable);
                    }
                }
            }
            for (int i = this.dQL.bTR() - 1; i >= 0; --i) {
                try {
                    this.dQL.vU(i).hM(l);
                    continue;
                }
                catch (Throwable throwable) {
                    dQs.error((Object)"Exception during SoundManager run", throwable);
                }
            }
        }
        try {
            this.cdF();
            this.cdm();
        }
        catch (Throwable throwable) {
            dQs.error((Object)"Exception during SoundManager run", throwable);
        }
        dQs.info((Object)"SoundManager stopped");
    }

    protected abstract boolean cdC();

    private ahx_1 a(ahz_1 ahz_12) {
        if (this.cdC()) {
            ahc_1 ahc_12 = (ahc_1)ahd_1.dRq.O(ahz_12.getDescription());
            if (ahc_12 != null) {
                return new ahf_1(ahc_12);
            }
            ahe_1 ahe_12 = new ahe_1();
            if (!ahe_12.b(ahz_12)) {
                return null;
            }
            try {
                if (ahz_12.bFH() < 131072L && (ahc_12 = new ahc_1(ahe_12)).cdX()) {
                    ahd_1.dRq.f(ahz_12.getDescription(), ahc_12);
                    return new ahf_1(ahc_12);
                }
            }
            catch (IOException iOException) {
                return null;
            }
            return ahe_12;
        }
        ahe_1 ahe_13 = new ahe_1();
        ahe_13.b(ahz_12);
        return ahe_13;
    }

    public final ahk_1 a(ahz_1 ahz_12, agk_1 agk_12, long l, long l2) {
        if (!this.dQE) {
            try {
                ahz_12.close();
            }
            catch (IOException iOException) {
                dQs.error((Object)("Probl\u00e8me \u00e0 la fermeture " + ahz_12.getDescription()));
            }
            return null;
        }
        ahx_1 ahx_12 = this.a(ahz_12);
        if (ahx_12 != null) {
            ahk_1 ahk_12 = ahn_1.ccT().l(l, l2);
            if (ahk_12 != null) {
                try {
                    if (ahk_12.a(this, agk_12, ahx_12)) {
                        ahx_12.cdN();
                        ahx_12.eg(true);
                        ahw_1.a("Adding " + ahk_12.ccQ(), agk_12.cbE());
                        return ahk_12;
                    }
                    if (ahk_12.cct()) {
                        ahn_1.ccT().d(ahk_12);
                    }
                    ahx_12.close();
                    return null;
                }
                catch (Exception exception) {
                    dQs.error((Object)("Erreur durant l'initialisation de la source : " + ahz_12.getDescription()));
                    if (ahk_12.cct()) {
                        ahn_1.ccT().d(ahk_12);
                    }
                    ahx_12.cdO();
                }
            } else {
                dQs.error((Object)"error : source is null");
            }
        } else {
            dQs.error((Object)("Unable to initialize stream from URL : " + ahz_12.getDescription()));
        }
        try {
            ahz_12.close();
        }
        catch (IOException iOException) {
            dQs.error((Object)("Probl\u00e8me \u00e0 la fermeture du stream de " + ahz_12.getDescription()));
        }
        return null;
    }

    public static void e(ahk_1 ahk_12) {
        if (ahk_12 == null) {
            return;
        }
        if (ahk_12.isPlaying()) {
            ahk_12.bhk();
        }
        ahk_12.close();
        if (ahk_12.cct()) {
            ahn_1.ccT().d(ahk_12);
        }
    }

    public boolean xY(int n) {
        if (n > this.dQJ - this.dQK) {
            return false;
        }
        this.dQK += n;
        dQs.debug((Object)("voices in use : " + this.dQK + "/" + this.dQJ));
        return true;
    }

    public boolean xZ(int n) {
        if (this.dQK < n) {
            return false;
        }
        this.dQK -= n;
        dQs.debug((Object)("voices in use : " + this.dQK + "/" + this.dQJ));
        return true;
    }

    protected int cdD() {
        return this.dQK;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(agk_1 agk_12) {
        if (agk_12 == null) {
            return;
        }
        Object object = this.dQD;
        synchronized (object) {
            if (!this.dQC.contains(agk_12)) {
                this.dQC.add(agk_12);
                agk_12.b(this);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void b(agk_1 agk_12) {
        if (agk_12 == null) {
            return;
        }
        Object object = this.dQD;
        synchronized (object) {
            try {
                this.dQC.remove(agk_12);
                agk_12.bhk();
                agk_12.b((ahu_1)null);
            }
            catch (Exception exception) {
                dQs.error((Object)"Exception during removeGroup", (Throwable)exception);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final agk_1 ie(String string) {
        if (string == null) {
            return null;
        }
        Object object = this.dQD;
        synchronized (object) {
            for (agk_1 agk_12 : this.dQC) {
                if (!agk_12.getName().equals(string)) continue;
                return agk_12;
            }
        }
        return null;
    }

    protected abstract boolean cdE();

    protected abstract void cdF();

    public static int cdG() {
        return dQy[0];
    }

    public abstract agw_1 a(agd_1 var1, int var2, int var3, int var4);

    private synchronized void cdH() {
        if (!avh_2.dhF.a(avg_2.dhr)) {
            return;
        }
        if (dQy[0] != 0) {
            this.dhS.alDeleteAuxiliaryEffectSlots(dQy.length, dQy, 0);
            this.cdp();
            ahu_1.dQy[0] = 0;
        }
        if (dQx[0] != 0) {
            this.dhS.alDeleteEffects(dQx.length, dQx, 0);
            this.cdp();
            ahu_1.dQx[0] = 0;
        }
        this.dQA = -1;
    }

    public synchronized void yj(int n) {
        if (!this.cdn()) {
            return;
        }
        if (!avh_2.dhF.a(avg_2.dhr)) {
            return;
        }
        if (dQy[0] == 0) {
            this.dhS.alGenAuxiliaryEffectSlots(dQy.length, dQy, 0);
            this.cdp();
        }
        if (dQx[0] == 0) {
            this.dhS.alGenEffects(dQx.length, dQx, 0);
            this.cdp();
        }
        if (this.dQA == n) {
            return;
        }
        this.dQA = n;
        agr_1 agr_12 = this.yn(this.dQA);
        if (agr_12 != null) {
            try {
                this.dhS.alEffecti(dQx[0], 32769, 1);
                this.cdp();
                this.dhS.alEffectf(dQx[0], 1, agr_12.cbU());
                this.cdp();
                this.dhS.alEffectf(dQx[0], 3, agr_12.cbV());
                this.cdp();
                this.dhS.alEffectf(dQx[0], 5, agr_12.cbW());
                this.cdp();
                this.dhS.alEffectf(dQx[0], 6, agr_12.cbX());
                this.cdp();
                this.dhS.alEffectf(dQx[0], 9, agr_12.cbY());
                this.cdp();
                this.dhS.alEffectf(dQx[0], 10, agr_12.cbZ());
                this.cdp();
                this.dhS.alAuxiliaryEffectSloti(dQy[0], 1, dQx[0]);
                this.cdp();
                this.yo(dQy[0]);
            }
            catch (Exception exception) {
                this.yo(0);
            }
        } else {
            this.yo(0);
        }
    }

    public void yk(int n) {
        if (!this.cdn()) {
            return;
        }
        if (this.dQB == n) {
            return;
        }
        this.dQB = n;
    }

    public void m(int n, long l) {
        if (!avh_2.dhF.a(avg_2.dhs)) {
            return;
        }
        ahq_1 ahq_12 = this.dQL.vK(n);
        if (ahq_12 == null) {
            agq_1 agq_12 = this.ym(this.dQB);
            if (agq_12 == null) {
                return;
            }
            ahq_12 = new ahq_1(agq_12.bBt(), agq_12.cbT(), n, this, this.sN(n));
            try {
                ahq_12.cdf();
            }
            catch (ALException aLException) {
                return;
            }
            this.dQL.b(n, ahq_12);
        }
        ahq_12.hO(l);
    }

    protected boolean sN(int n) {
        return true;
    }

    public void n(int n, long l) {
        if (!avh_2.dhF.a(avg_2.dhs)) {
            return;
        }
        ahq_1 ahq_12 = this.dQL.vK(n);
        if (ahq_12 != null) {
            ahq_12.hP(l);
        }
    }

    @Override
    public void yi(int n) {
        ahq_1 ahq_12 = this.dQL.wp(n);
        if (ahq_12 != null) {
            ahq_12.cdg();
        }
    }

    public abstract agz_1 yl(int var1);

    protected abstract agq_1 ym(int var1);

    protected abstract agr_1 yn(int var1);

    protected abstract void yo(int var1);

    static {
        dQs = Logger.getLogger(ahu_1.class);
        dQx = new int[]{0};
        dQy = new int[]{0};
        dQz = new int[]{6566};
    }
}

