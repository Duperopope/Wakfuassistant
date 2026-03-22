/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Queue;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bYJ
 */
public class byj_1
implements aao_2 {
    private static final int lAI = 100;
    private static final int lAJ = 20;
    private static final int lAK = 1;
    public static final int lAL = 0;
    private static final byj_1 lAM = new byj_1();
    private long dxy = -1L;
    private long lAN = 0L;
    private long lAO = 0L;
    private final Queue<bye_1> lAP = new ArrayDeque<bye_1>();
    private final List<byl_1> lAQ = new ArrayList<byl_1>(1);

    public static byj_1 epo() {
        return lAM;
    }

    private byj_1() {
    }

    private void bkZ() {
        if (this.dxy < 0L) {
            fyw_0.gqw().d("wakfu.toast", cho_1.class);
            this.dxy = abb_2.bUA().a(this, 100L, 1);
        }
    }

    private void bhk() {
        fyw_0.gqw().tc("wakfu.toast");
        abb_2.bUA().hk(this.dxy);
        this.dxy = -1L;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (aam_22.d() == Integer.MIN_VALUE) {
            this.epp();
            return false;
        }
        return true;
    }

    public void b(boolean bl, int n) {
        this.lAO = GC.a(this.lAO, n, bl);
    }

    public void a(@NotNull bye_1 bye_12) {
        this.bkZ();
        this.lAP.add(bye_12);
    }

    private void epp() {
        if (this.aJG()) {
            this.bhk();
            return;
        }
        if (this.lAO == 0L) {
            while (!this.lAP.isEmpty() && this.c(this.lAP.peek())) {
                this.b(this.lAP.poll());
            }
        }
        for (byl_1 byl_12 : new ArrayList<byl_1>(this.lAQ)) {
            switch (byl_12.lAY.ordinal()) {
                case 2: {
                    byl_12.lAY = bym_1.lBe;
                    byl_12.lAZ = Instant.now();
                    byl_12.lAU.b(byl_12.lAX);
                    break;
                }
                case 3: {
                    if (!byl_12.eps()) break;
                    byj_1.a(byl_12);
                    break;
                }
                case 5: {
                    this.b(byl_12);
                    break;
                }
            }
        }
    }

    private void b(@NotNull bye_1 bye_12) {
        Object object;
        if (bye_12.eoW() != byf_1.lAn && ((OptionalInt)(object = this.a(bye_12.eoU()))).isPresent()) {
            if (bye_12.eoW() == byf_1.lAp) {
                this.a(bye_12, ((OptionalInt)object).getAsInt());
                return;
            }
            if (bye_12.eoW() == byf_1.lAo) {
                this.b(this.lAQ.get(((OptionalInt)object).getAsInt()));
            }
        }
        object = bye_12.eoV();
        String string = (String)object + this.lAN;
        ++this.lAN;
        byl_1 byl_12 = new byl_1(bye_12, string);
        byl_12.lAY = bym_1.lBc;
        fey_2 fey_22 = (fey_2)fyw_0.gqw().a(string, ccj_2.pe((String)object), 139280L);
        if (fey_22 == null) {
            return;
        }
        byl_12.lAX = fey_22;
        fey_22.a(new byk_1(this, fey_22, byl_12));
        byj_1.d(byl_12);
        this.lAQ.add(byl_12);
        bye_12.a(fey_22);
    }

    private void a(@NotNull bye_1 bye_12, int n) {
        byl_1 byl_12;
        byl_1 byl_13 = this.lAQ.get(n);
        byl_13.lAU.c(byl_13.lAX);
        byl_13.lAW = byl_12 = byl_13.d(bye_12);
        if (!byl_12.lAY.ept()) {
            byl_12.lAZ = Instant.now();
        }
        bye_12.e(byl_12.lAX);
        this.lAQ.set(n, byl_12);
    }

    private static void a(@NotNull byl_1 byl_12) {
        byl_12.lAY = bym_1.lBf;
        byl_12.lAU.f(byl_12.lAX);
        byj_1.g(byl_12);
        byj_1.h(byl_12);
    }

    private void b(@NotNull byl_1 byl_12) {
        int n = byl_12.lAX.getHeight();
        int n2 = this.lAQ.indexOf(byl_12);
        byl_12.lAY = bym_1.lBb;
        byl_12.lAU.c(byl_12.lAX);
        this.lAQ.remove(byl_12);
        for (int i = n2; i < this.lAQ.size(); ++i) {
            fey_2 fey_22 = this.lAQ.get((int)i).lAX;
            fey_22.setPosition(fey_22.getX(), fey_22.getY() + n);
        }
        fyw_0.gqw().tl(byl_12.lAV);
    }

    public void nP(@Nullable String string) {
        this.nS(string).ifPresent(this::b);
    }

    public void nQ(@Nullable String string) {
        this.nS(string).ifPresent(byl_12 -> {
            byl_12.lBa = Instant.now();
        });
    }

    public void nR(@Nullable String string) {
        this.nS(string).ifPresent(byl_12 -> {
            if (byl_12.lBa == null || byl_12.lAZ == null) {
                return;
            }
            byl_12.lAZ = Instant.now().minus(Duration.between(byl_12.lAZ, byl_12.lBa));
            byl_12.lBa = null;
        });
    }

    public void epq() {
        this.lAP.clear();
        for (byl_1 byl_12 : this.lAQ) {
            byl_12.lAY = bym_1.lBb;
            byl_12.lAU.c(byl_12.lAX);
            fyw_0.gqw().tl(byl_12.lAV);
        }
        this.lAQ.clear();
        this.bhk();
    }

    @Contract(pure=true)
    private boolean aJG() {
        return this.lAP.isEmpty() && this.lAQ.isEmpty();
    }

    @Contract(pure=true)
    int c(@NotNull byl_1 byl_12) {
        int n = 0;
        for (byl_1 byl_13 : this.lAQ) {
            if (byl_13.lAY.epu()) continue;
            if (byl_12.equals(byl_13)) break;
            n += byl_13.lAX.getHeight();
        }
        return n;
    }

    private boolean c(@NotNull bye_1 bye_12) {
        if (this.lAQ.size() < 1) {
            return true;
        }
        return bye_12.eoW() != byf_1.lAn && this.a(bye_12.eoU()).isPresent();
    }

    private static void d(@NotNull byl_1 byl_12) {
        fse_2 fse_22 = byj_1.a(byl_12, true);
        fse_22.a((fsr_2 fsr_22, fsg_2 fsg_22) -> {
            if (fsg_22 == fsg_2.veA) {
                byl_1 byl_13 = byj_1.e(byl_12);
                byl_13.lAY = bym_1.lBd;
            }
        });
        byl_12.lAX.x(fse_2.class);
        byl_12.lAX.a(fse_22);
    }

    @NotNull
    private static byl_1 e(@NotNull byl_1 byl_12) {
        byl_1 byl_13 = byl_12;
        while (byl_13.lAW != null) {
            byl_13 = byl_13.lAW;
        }
        return byl_13;
    }

    static void f(@NotNull byl_1 byl_12) {
        fey_2 fey_22 = byl_12.lAX;
        fey_22.x(fsb_2.class);
        fey_22.a(byj_1.b(byl_12, true));
    }

    private static void g(@NotNull byl_1 byl_12) {
        fse_2 fse_22 = byj_1.a(byl_12, false);
        fse_22.a((fsr_2 fsr_22, fsg_2 fsg_22) -> {
            if (fsg_22 == fsg_2.veA) {
                byl_12.lAY = bym_1.lBg;
            }
        });
        byl_12.lAX.x(fse_2.class);
        byl_12.lAX.a(fse_22);
    }

    private static void h(@NotNull byl_1 byl_12) {
        byl_12.lAX.x(fsb_2.class);
        byl_12.lAX.a(byj_1.b(byl_12, false));
    }

    private static fse_2 a(@NotNull byl_1 byl_12, boolean bl) {
        float f2 = bl ? 0.0f : 1.0f;
        float f3 = bl ? 1.0f : 0.0f;
        return new fse_2(f2, f3, byl_12.lAX, 0, byj_1.a(byl_12.lAU, bl), 1, abn.cdr);
    }

    private static fsb_2 b(@NotNull byl_1 byl_12, boolean bl) {
        return new fsb_2(0, (bl ? -1 : 1) * 20, (fes_2)byl_12.lAX, 0, byj_1.a(byl_12.lAU, bl), abn.cdr);
    }

    private static int a(@NotNull bye_1 bye_12, boolean bl) {
        return bl ? bye_12.eoX().epk() : bye_12.eoX().epm();
    }

    @NotNull
    private Optional<byl_1> nS(@Nullable String string) {
        if (string == null) {
            return Optional.empty();
        }
        return this.lAQ.stream().filter(byl_12 -> byl_12.lAV.equals(string)).findFirst();
    }

    @NotNull
    private OptionalInt a(@NotNull byh_1 byh_12) {
        for (int i = 0; i < this.lAQ.size(); ++i) {
            byl_1 byl_12 = this.lAQ.get(i);
            if (byl_12.lAY.epu() || byl_12.lAU.eoU() != byh_12) continue;
            return OptionalInt.of(i);
        }
        return OptionalInt.empty();
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

