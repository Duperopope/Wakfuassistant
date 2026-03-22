/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public abstract class WL<GP extends aez_0<?, ?>>
implements ahd_0 {
    private static final Logger bPs = Logger.getLogger(WL.class);
    protected static final String bPt = "userPreferences.properties";
    public static final String bPu = "gamePreferences";
    public static final String bPv = "hardwareManager";
    private static final String bPw = "Initialization-Tasks-%d";
    protected alt_2 bPx;
    protected als_2 bPy;
    private static final byte bPz = 3;
    protected final aaO[] bPA = new aaO[3];
    protected aam_0 bPB;
    private final List<@NotNull afl> bPC = new ArrayList<afl>();
    protected GP bPD;
    private afx_0 bPE;
    private ExecutorService bPF;

    protected WL() {
        this.bmF();
        this.a(this.bmI());
        this.bmJ();
        abb_2.bUA().start();
    }

    public abstract ahv bmB();

    protected void a(als_2 als_22) {
        this.bPy = als_22;
    }

    public aam_0 bmC() {
        return this.bPB;
    }

    public aaO[] bmD() {
        return this.bPA;
    }

    public final axm_1 bmE() {
        return this.bmB().bmE();
    }

    protected abstract void bmF();

    protected void bmG() {
        ((aez_0)this.bmH()).a(new aeb_1(bPt));
    }

    public GP bmH() {
        if (this.bPD == null) {
            this.a(this.bmI());
        }
        return this.bPD;
    }

    protected void a(GP GP) {
        this.bPD = GP;
    }

    protected abstract GP bmI();

    public void bmJ() {
        this.bmG();
        GP GP = this.bmH();
        if (GP != null) {
            try {
                ((aez_0)GP).bxo().buq();
            }
            catch (IOException iOException) {
                bPs.error((Object)"Unable to load DefaultPreferenceStore from userPreference file");
            }
            aeg_2.caa().f(bPu, GP);
            aeg_2.caa().f(bPv, avh_2.dhF);
        }
    }

    public void aPg() {
        if (this.bmK()) {
            age_1.a(new alh_2());
            alb_2.a(new alg_1());
        } else {
            age_1.a(new alf_2());
            alb_2.a(new ale_2());
        }
        this.bmB().a(this);
    }

    protected abstract boolean bmK();

    protected void bmL() {
        this.bPy.a(this.bmB());
        this.bmM();
    }

    public void bmM() {
    }

    protected abstract alt_2 bmN();

    protected abstract void a(alt_2 var1);

    protected abstract aff_0 bmO();

    protected void a(aaj_0 aaj_02) {
    }

    protected boolean a(ahm ahm2, boolean bl) {
        this.bmB().aPg();
        this.bmE().du(bl);
        this.bmB().d(ahm2);
        return true;
    }

    protected abstract void bmP();

    protected abstract void bmQ();

    public void bmR() {
        try {
            this.bmT();
            this.bmU();
        }
        catch (Exception exception) {
            bPs.error((Object)"Erreur lors du resomePostDiagnosticLoading : ", (Throwable)exception);
            JOptionPane.showMessageDialog(this.bmB().bAR(), exception.getMessage() + " (" + exception.getClass().getName() + ")");
        }
    }

    protected final void dH(String string) {
        for (int i = 0; i < this.bPA.length; ++i) {
            this.bPA[i] = new aaO();
            this.bPA[i].ec(string);
        }
    }

    protected void b(boolean bl, boolean bl2) {
        this.bPx.a(new WM(this, bl, bl2));
    }

    protected void a(axm_1 axm_12, alu_2 alu_22) {
        axm_12.a(asj_2.bJt(), true);
        this.bPB = this.bmO();
        this.dH(this.bmS());
        this.bmL();
        this.bPx = this.bmN();
        this.bPx.a(alu_22);
        this.a(this.bPx);
        if (this.bPx != null) {
            axm_12.a(this.bPx, true);
            axm_12.a(this.bPx, true);
            axm_12.a(this.bPx, false);
            axm_12.a(this.bPx, false);
        }
        this.a(this.bPB);
        if (this.bPB != null) {
            axm_12.a(this.bPB, false);
            axm_12.a(this.bPB, false);
            axm_12.a(this.bPB, false);
            axm_12.a(this.bPB, false);
            for (int i = 0; i < this.bPA.length; ++i) {
                this.bPA[i].a(this.bPB);
            }
        }
    }

    protected abstract String bmS();

    protected void a(@NotNull afl afl2) {
        if (this.bPC.contains(afl2)) {
            bPs.warn((Object)String.format("Following %s : %s is already registered (%s).", afl.class, afl2.getName(), afl2.getClass()));
            return;
        }
        this.bPC.add(afl2);
    }

    protected void bmT() {
    }

    protected void bmU() {
        this.bPF = Executors.newSingleThreadExecutor(new ThreadFactoryBuilder().setNameFormat(bPw).build());
        this.qt(this.bPC.size());
        this.qs(0);
    }

    protected void c(@NotNull Runnable runnable) {
        if (this.bPF == null) {
            throw new IllegalStateException("Initialization task should not be submitted when the game is already started");
        }
        this.bPF.submit(runnable);
    }

    public synchronized void b(@NotNull afl afl2) {
        int n = this.bPC.indexOf(afl2);
        if (n == -1) {
            bPs.error((Object)String.format("Unregistered %s : %s is done (%s). WTF ?", afl.class, afl2.getName(), afl2.getClass()));
            return;
        }
        this.a(afl2, n);
        this.qs(n + 1);
    }

    protected synchronized void qs(int n) {
        if (n >= this.bPC.size()) {
            this.bmV();
            this.start();
            return;
        }
        afl afl2 = this.bPC.get(n);
        this.c(() -> {
            try {
                this.c(afl2);
            }
            catch (RuntimeException runtimeException) {
                bPs.error((Object)String.format("An exception occured during call of onContentInitializerStart with following %s : %s (%s)", afl.class, afl2.getName(), afl2.getClass()), (Throwable)runtimeException);
            }
            try {
                afl2.a(this);
            }
            catch (Exception exception) {
                bPs.error((Object)String.format("An exception occured during call of init with following %s : %s (%s)", afl.class, afl2.getName(), afl2.getClass()), (Throwable)exception);
                this.a(afl2, exception);
            }
        });
    }

    protected void qt(int n) {
    }

    protected void bmV() {
    }

    protected void c(@NotNull afl afl2) {
    }

    protected void a(@NotNull afl afl2, @NotNull Exception exception) {
    }

    protected void a(@NotNull afl afl2, int n) {
    }

    protected void start() {
        if (this.bPF != null && !this.bPF.isTerminated()) {
            this.bPF.shutdown();
            this.bPF = null;
        }
    }

    public void bmW() {
        this.bmY();
    }

    public void bmX() {
        this.bmY();
    }

    private void bmY() {
        try {
            adn_0.bvh().bvj();
        }
        catch (RuntimeException runtimeException) {
            bPs.error((Object)"Exception lors du nettoyage des mobiles", (Throwable)runtimeException);
        }
        try {
            this.bPy.bCg();
        }
        catch (RuntimeException runtimeException) {
            bPs.error((Object)"Exception lors du nettoyage du TextureManager", (Throwable)runtimeException);
        }
    }

    @Override
    public void bmZ() {
    }

    @Override
    public void bna() {
        ahm ahm2 = this.bmB().bAI();
        if (ahm2 == null) {
            return;
        }
        ((aez_0)this.bmH()).a((afe)aff.cpJ, ahm2.bzY());
    }

    @Override
    public void a(ahm ahm2) {
        ((aez_0)this.bmH()).a((afe)aff.cpJ, ahm2.bzY());
    }

    @Override
    public void b(ahm ahm2) {
        ((aez_0)this.bmH()).a((afe)aff.cpJ, ahm2.bzY());
    }

    @Override
    public void c(ahm ahm2) {
    }

    @Override
    public void bu(boolean bl) {
        axm_1 axm_12 = this.bmE();
        if (axm_12 == null) {
            return;
        }
        axm_12.dq(bl);
        ava_2.bMH().bMM();
        this.bmB().bAA();
    }

    @Override
    public void bv(boolean bl) {
        axm_1 axm_12 = this.bmE();
        if (axm_12 == null) {
            return;
        }
        axm_12.dr(!bl);
        ava_2.bMH().bMM();
        this.bmB().bAA();
    }

    public abstract void bnb();

    public void bw(boolean bl) {
        if (this.bnc() == bl) {
            return;
        }
        if (this.bmB() == null) {
            return;
        }
        if (bl) {
            if (this.bPE == null) {
                this.bPE = new afx_0(this);
                this.bmB().b(this.bPE);
            }
            this.bPE.reset();
            this.a(this.bPE);
        } else if (this.bPE != null) {
            this.bmB().bAx();
            this.bPE.reset();
            this.bPE = null;
        }
    }

    protected void a(afx_0 afx_02) {
        afx_02.n(afq_0.class);
        afx_02.n(afu_0.class);
        afx_02.n(afs_0.class);
        afx_02.n(afw_0.class);
    }

    public boolean bnc() {
        return this.bPE != null && this.bPE.isVisible();
    }
}

