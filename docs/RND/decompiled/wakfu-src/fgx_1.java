/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fGx
 */
public final class fgx_1
implements Iterable<fgv_1> {
    public static final axb_2 uto = awx_2.dnG;
    private static final int utp = Integer.MAX_VALUE;
    private static final int utq = Integer.MAX_VALUE;
    public static final int utr = Integer.MAX_VALUE;
    private static final String uts = "...";
    private static final String utt = "\n";
    private fdz_1 utu = null;
    private Color utv = uto.bQn();
    private boolean tFJ = false;
    private fzY utw = fzY.tLy;
    private fzY utx = fzY.tLv;
    private fzu_0 uty = fzu_0.tKE;
    private final fgj_2 utz;
    private final ArrayList<fgv_1> utA = new ArrayList();
    private fgv_1 utB = null;
    private int djV = Integer.MAX_VALUE;
    private int djW = -1;
    private int cVt = -1;
    private boolean utC = true;
    private boolean utD = false;
    private fzk_0 utE = fzk_0.tHo;
    private final fff_2 utF = (fsm_12, fsm_13) -> this.gyB();
    private final ffe_2 utG = (fhv_12, fhv_13) -> {
        if (fhv_12 instanceof fes_2) {
            ((fes_2)fhv_12).b(this.utF);
        }
        if (fhv_13 instanceof fes_2) {
            ((fes_2)fhv_13).a(this.utF);
        }
        if (fhv_13 != fhv_12) {
            this.gyB();
        }
    };
    private boolean utH = false;
    private int utI = Integer.MAX_VALUE;
    private boolean jHv = false;
    private boolean utJ = false;
    private int utK = 0;
    private final fsm_1 utL = new fsm_1(0, 0);
    private final fsm_1 utM = new fsm_1(0, 0);
    private final fsm_1 utN = new fsm_1(0, 0);
    private boolean utO = true;
    private boolean utP = true;
    private boolean utQ = true;
    private boolean utR = false;
    private int utS = 0;
    private boolean utT = true;
    private boolean utU;
    private long utV = 0L;
    @NotNull
    private final List<fga_2> utW = new ArrayList<fga_2>();

    public fgx_1(fgj_2 fgj_22) {
        this.utz = fgj_22;
    }

    public void gya() {
        for (int i = this.utA.size() - 1; i >= 0; --i) {
            this.utA.get(i).aZp();
        }
        this.utA.clear();
    }

    public boolean a(fga_2 fga_22) {
        if (this.utW.contains(fga_22)) {
            return false;
        }
        return this.utW.add(fga_22);
    }

    public boolean b(fga_2 fga_22) {
        if (!this.utW.contains(fga_22)) {
            return false;
        }
        return this.utW.remove(fga_22);
    }

    public void b(fdz_1 fdz_12) {
        if (this.utu == fdz_12) {
            return;
        }
        this.utu = fdz_12;
    }

    public fdz_1 gyb() {
        return this.utu;
    }

    public awx_1 gyc() {
        return this.utz == null ? null : this.utz.gyc();
    }

    public void a(awx_1 awx_12) {
        if (this.utz.gyc() == awx_12) {
            return;
        }
        this.utz.a(awx_12);
        this.gyB();
        this.gyC();
    }

    public boolean isUseHighContrast() {
        return this.utz.isUseHighContrast();
    }

    public void setUseHighContrast(boolean bl) {
        if (this.utz.isUseHighContrast() == bl) {
            return;
        }
        this.utz.setUseHighContrast(bl);
    }

    public Color gyd() {
        return this.utv;
    }

    public void b(Color color) {
        if (this.utv == color) {
            return;
        }
        this.utv = color;
    }

    public void C(axb_2 axb_22) {
        if (axb_22 != null) {
            this.b(axb_22.bQn());
        } else {
            this.b((Color)null);
        }
    }

    public fzY gye() {
        return this.utw;
    }

    public void a(fzY fzY2) {
        if (this.utw == fzY2) {
            return;
        }
        this.utw = fzY2;
        this.gyC();
    }

    public fzY gyf() {
        return this.utx;
    }

    public void setVerticalAlignment(fzY fzY2) {
        if (this.utx == fzY2) {
            return;
        }
        this.utx = fzY2;
    }

    public fzu_0 getOrientation() {
        return this.uty;
    }

    public void setOrientation(fzu_0 fzu_02) {
        if (fzu_02 == null || this.uty == fzu_02) {
            return;
        }
        this.uty = fzu_02;
        this.gyB();
        this.gyC();
    }

    public boolean isJustify() {
        return this.tFJ;
    }

    public void setJustify(boolean bl) {
        if (this.tFJ == bl) {
            return;
        }
        this.tFJ = bl;
    }

    public Boolean gyg() {
        return this.utR;
    }

    public void setAutoHorizontalScrolled(boolean bl) {
        if (this.utR == bl) {
            return;
        }
        this.utR = bl;
    }

    public fgj_2 gyh() {
        return this.utz;
    }

    public String gyi() {
        if (this.utz != null) {
            return this.utz.gyi();
        }
        return null;
    }

    public boolean tY(@NotNull String string) {
        if (this.utz == null) {
            return string == null;
        }
        return this.utz.tY(string);
    }

    public void tZ(String string) {
        if (this.utz != null) {
            this.K(() -> {
                if (Objects.equals(this.utz.gyi(), string)) {
                    return;
                }
                this.utz.tZ(string);
                this.gyB();
                this.gyC();
            });
        }
    }

    public int gyj() {
        if (this.utz != null) {
            return this.utz.EE();
        }
        return 0;
    }

    public void ua(String string) {
        if (this.utz != null) {
            this.K(() -> {
                this.utz.ua(string);
                this.gyB();
                this.gyC();
            });
        }
    }

    public void gyk() {
        if (this.utz != null) {
            this.utz.gyk();
            this.gyB();
            this.gyC();
        }
    }

    public void a(fgk_2 fgk_22, int n) {
        if (this.utz != null) {
            this.oQ(this.utz.c(fgk_22, n));
        }
    }

    public void gyl() {
        if (this.utz != null) {
            this.oQ(this.utz.gzq());
        }
    }

    public void b(fgk_2 fgk_22, int n) {
        if (this.utz != null) {
            this.oQ(this.utz.d(fgk_22, n));
        }
    }

    public void gym() {
        if (this.utz != null) {
            this.oQ(this.utz.gzu());
        }
    }

    public ArrayList<fgv_1> gyn() {
        return this.utA;
    }

    public int getMaxWidth() {
        return this.djV;
    }

    public void setMaxWidth(int n) {
        if (this.djV == n) {
            return;
        }
        this.djV = n;
        this.gyB();
    }

    public int getMinWidth() {
        return this.djW;
    }

    public void setMinWidth(int n) {
        if (this.djW == n) {
            return;
        }
        this.djW = n;
        this.gyB();
    }

    public int getLineHeight() {
        return this.cVt;
    }

    public void setLineHeight(int n) {
        if (this.cVt == n) {
            return;
        }
        this.cVt = n;
        this.gyB();
    }

    public boolean gyo() {
        return this.utC;
    }

    public void oO(boolean bl) {
        if (this.utC == bl) {
            return;
        }
        this.utC = bl;
        this.gyB();
    }

    public boolean gyp() {
        return this.utD;
    }

    public void oP(boolean bl) {
        if (this.utD == bl) {
            return;
        }
        this.utD = bl;
        if (this.utu != null) {
            if (this.utD) {
                this.utu.a(this.utF);
                this.utu.a(this.utG);
                this.utG.onParentChanged(null, this.utu.getParentWidget());
            } else {
                this.utu.b(this.utF);
                this.utu.b(this.utG);
                this.gyB();
            }
        }
    }

    public fzk_0 getMinSizeComputationBehaviour() {
        return this.utE;
    }

    public void setMinSizeComputationBehaviour(fzk_0 fzk_02) {
        if (this.utE == fzk_02) {
            return;
        }
        this.utE = fzk_02;
        this.gyB();
    }

    public boolean isMultiline() {
        return this.utH;
    }

    public void setMultiline(boolean bl) {
        if (this.utH == bl) {
            return;
        }
        this.utH = bl;
        this.gyB();
    }

    public int getMaxLines() {
        return this.utI;
    }

    public void setMaxLines(int n) {
        if (this.utI == n) {
            return;
        }
        this.utI = n;
        if (this.isMultiline()) {
            this.gyB();
        }
    }

    public boolean isSelectable() {
        return this.jHv || this.utJ;
    }

    public void setSelectable(boolean bl) {
        if (this.jHv == bl) {
            return;
        }
        this.jHv = bl;
        this.gyB();
        this.gyD();
    }

    public boolean isEditable() {
        return this.utJ;
    }

    public void setEditable(boolean bl) {
        if (this.utJ == bl) {
            return;
        }
        this.utJ = bl;
        this.gyB();
        this.gyD();
    }

    public boolean isTextReduced() {
        return this.utU;
    }

    public boolean isEnableShrinking() {
        return this.utT;
    }

    public void setEnableShrinking(boolean bl) {
        if (this.utT == bl) {
            return;
        }
        this.utT = bl;
        this.gyB();
    }

    public int gyq() {
        if (this.gys()) {
            return this.utK;
        }
        return 0;
    }

    public void abp(int n) {
        if (this.utK == n) {
            return;
        }
        this.utK = Math.min(Math.max(0, n), this.gyr());
    }

    public int gyr() {
        return this.utA.size() - 1;
    }

    public boolean gys() {
        return this.isSelectable() && this.utH;
    }

    public boolean gyt() {
        return this.isSelectable() && !this.utH;
    }

    public boolean gyu() {
        return this.utT && (this.gys() || this.gyt());
    }

    public fsm_1 getSize() {
        return (fsm_1)this.utN.clone();
    }

    public void setSize(int n, int n2) {
        n = Math.max(0, n);
        n2 = Math.max(0, n2);
        if ((double)n == this.utN.getWidth() && (double)n2 == this.utN.getHeight()) {
            return;
        }
        this.utN.setSize(n, n2);
        this.gyC();
    }

    public int getOrientedWidth() {
        return this.uty.isHorizontal() ? this.utN.width : this.utN.height;
    }

    public int gyv() {
        return this.uty.isHorizontal() ? this.utM.width : this.utM.height;
    }

    public int gyw() {
        return this.guX() != null && this.guX().getAppliedZoom() < 1.0f ? this.gyv() : Math.min(this.gyN(), this.getOrientedWidth());
    }

    public int getOrientedHeight() {
        return this.uty.isHorizontal() ? this.utN.height : this.utN.width;
    }

    public fsm_1 getMinSize() {
        return (fsm_1)this.utL.clone();
    }

    public fsm_1 gyx() {
        return this.utM.gGg();
    }

    public boolean gyy() {
        return this.utQ;
    }

    public boolean gyz() {
        return this.utO;
    }

    public boolean gyA() {
        return this.utP;
    }

    public void gyB() {
        this.utQ = true;
        this.utu.setNeedsToPreProcess();
    }

    public void gyC() {
        this.utO = true;
        this.utu.setNeedsToMiddleProcess();
    }

    public void gyD() {
        this.utP = true;
        this.utu.setNeedsToMiddleProcess();
    }

    public void oQ(boolean bl) {
        if (!bl) {
            return;
        }
        if (this.utP) {
            return;
        }
        this.gyD();
    }

    public azx_1<fgb_2, fgz_1> gY(int n, int n2) {
        azx_1<Object, fgz_1> azx_12 = new azx_1<Object, fgz_1>(null, fgz_1.uua);
        n2 = this.gyE() - this.getOrientedHeight() - n2;
        int n3 = this.utA.size();
        for (int i = 0; i < n3; ++i) {
            fgv_1 fgv_12 = this.utA.get(i);
            if (!((double)n2 >= fgv_12.gxR().getMinY()) || !((double)n2 <= fgv_12.gxR().getMaxY())) continue;
            int n4 = fgv_12.getX();
            if (fgv_12.gxR().contains(n, n2)) {
                ArrayList<fgb_2> arrayList = fgv_12.gxY();
                for (int j = 0; j < arrayList.size(); ++j) {
                    fgb_2 fgb_22 = arrayList.get(j);
                    int n5 = fgb_22.getX() + n4;
                    if (n5 > n || n5 + fgb_22.getWidth() < n) continue;
                    azx_12.Q(fgb_22);
                    return azx_12;
                }
            }
            if (n < n4) {
                azx_12.Q(fgv_12.gxV());
                azx_12.N(fgz_1.utZ);
            } else {
                azx_12.Q(fgv_12.gxW());
                azx_12.N(fgz_1.uub);
            }
            return azx_12;
        }
        if (!this.utA.isEmpty()) {
            azx_12.Q(this.utA.get(this.utA.size() - 1).gxW());
            azx_12.N(fgz_1.uuc);
        }
        return azx_12;
    }

    public int gyE() {
        int n = 0;
        if (!this.utA.isEmpty()) {
            if (this.gys()) {
                fgv_1 fgv_12 = this.utA.get(this.gyq());
                if (fgv_12 != null) {
                    n = fgv_12.getY() + fgv_12.getHeight();
                }
            } else {
                fgv_1 fgv_13 = this.utA.get(this.utA.size() - 1);
                if (this.utx.grU()) {
                    n = this.getOrientedHeight() + fgv_13.getY();
                } else if (!this.utx.grT()) {
                    n = (this.getOrientedHeight() + fgv_13.getY()) / 2;
                }
            }
        }
        return n;
    }

    public void gyF() {
        if (this.utz != null) {
            this.oQ(this.utz.gzx());
        }
    }

    public void ub(String string) {
        if (this.utz != null) {
            this.K(() -> {
                if (this.utz.ug(string)) {
                    this.gyB();
                    this.gyC();
                }
            });
        }
    }

    public void gyG() {
        if (this.utz != null) {
            this.K(() -> {
                if (this.utz.gzz()) {
                    this.gyB();
                    this.gyC();
                }
            });
        }
    }

    public void gyH() {
        if (this.utz != null) {
            this.K(() -> {
                if (this.utz.gzA()) {
                    this.gyB();
                    this.gyC();
                }
            });
        }
    }

    public void gyI() {
        if (this.utz != null) {
            this.oQ(this.utz.gzB());
        }
    }

    public void gyJ() {
        if (this.utz != null) {
            this.oQ(this.utz.gzC());
        }
    }

    public void gyK() {
        fgb_2 fgb_22;
        if (this.utB != null && !this.utB.aJG() && (fgb_22 = this.utB.gxV()) != null) {
            this.b(fgb_22.gyW(), fgb_22.In());
        }
    }

    public void gyL() {
        if (this.utB == null) {
            return;
        }
        if (this.utB.aJG()) {
            return;
        }
        fgb_2 fgb_22 = this.utB.gxW();
        if (fgb_22 != null) {
            this.b(fgb_22.gyW(), fgb_22.fAI());
        }
    }

    public boolean abq(int n) {
        return this.utH ? n < this.utI : n == 0;
    }

    public int gyM() {
        if (this.djW > 0) {
            return this.djW;
        }
        if (this.utC && this.utu != null && !this.utu.isExpandable() && this.utu.getSpecifiedContentMinSize() != null && this.utu.getSpecifiedContentMinSize().getWidth() > 0.0) {
            fsm_1 fsm_12 = this.utu.getSpecifiedContentMinSize();
            return fsm_12.width;
        }
        return this.djW;
    }

    public int gyN() {
        if (this.djV != Integer.MAX_VALUE) {
            return this.djV;
        }
        if (this.utC && this.utu != null && this.utu.getSpecifiedContentMaxSize() != null && this.utu.getSpecifiedContentMaxSize().getWidth() > 0.0) {
            fsm_1 fsm_12 = this.utu.getSpecifiedContentMaxSize();
            return fsm_12.width;
        }
        if (this.utC && this.utu != null && !this.utu.isExpandable() && this.utu.getSpecifiedContentPrefSize() != null && this.utu.getSpecifiedContentPrefSize().getWidth() > 0.0) {
            fsm_1 fsm_13 = this.utu.getSpecifiedContentPrefSize();
            return fsm_13.width;
        }
        if (this.utD && this.utu != null && this.utu.getParentWidget() != null) {
            fes_2 fes_22 = this.utu.getParentWidget();
            int n = fes_22.getSize().width - (fes_22.getLeftMargin() + fes_22.getRightMargin());
            if (fes_22 instanceof faw_2) {
                faw_2 faw_22 = (faw_2)fes_22;
                fry_2 fry_22 = faw_22.getLayoutManager();
                faw_2 faw_23 = faw_22.getParentOfType(faw_2.class);
                if (fry_22 != null && faw_23 != null) {
                    fsm_1 fsm_14 = fry_22.getIncompressibleBounds(faw_23);
                    n -= fsm_14.width;
                }
            }
            return n;
        }
        return this.djV;
    }

    public void gyO() {
        double d2 = 0.0;
        double d3 = 0.0;
        int n = this.gyM();
        int n2 = this.gyN();
        boolean bl = this.utE.x(this.utz.aJG(), this.gyu());
        if (bl) {
            Point point = new Point(0, 0);
            boolean bl2 = false;
            fgv_1 fgv_12 = null;
            int n3 = 0;
            fzY fzY2 = this.utw;
            int n4 = this.gyt() ? Integer.MAX_VALUE : (n2 == Integer.MAX_VALUE && n > 0 ? n : Math.max(n, n2));
            block4: for (fgk_2 fgk_22 : this.utz) {
                fzY fzY3 = fgk_22.getAlignment();
                if (fzY3 == null) {
                    fzY3 = this.utw;
                }
                if (fzY3 != fzY2) {
                    fzY2 = fzY3;
                    bl2 = true;
                }
                int n5 = 0;
                switch (fgk_22.gzE()) {
                    case dSD: {
                        int n6;
                        fgk_2 fgk_23 = (fgl_2)fgk_22;
                        if (point.x != 0 && (n6 = n4 - point.x) < ((fgl_2)fgk_23).getWidth()) {
                            bl2 = true;
                        }
                        if (bl2 || fgv_12 == null) {
                            if (fgv_12 != null) {
                                d2 = Math.max((double)point.x, d2);
                                if (this.gyu() && this.gys()) {
                                    point.y = Math.min(point.y, fgv_12.getHeight());
                                    d3 = Math.max(d3, (double)fgv_12.getHeight());
                                } else {
                                    point.y -= fgv_12.getHeight();
                                    d3 += (double)fgv_12.getHeight();
                                }
                                point.x = 0;
                                fgv_12.aZp();
                            }
                            fgv_12 = fgv_1.gxN();
                            fgv_12.setAlignment(fzY2);
                            if (this.cVt >= 0) {
                                fgv_12.setHeight(this.cVt);
                            }
                            bl2 = false;
                            if (!this.abq(n3)) break;
                            ++n3;
                        }
                        fgv_12.setHeight(Math.max(((fgl_2)fgk_23).getHeight(), fgv_12.getHeight()));
                        fgv_12.a((fgl_2)fgk_23, point.x);
                        point.x += ((fgl_2)fgk_23).getWidth();
                        break;
                    }
                    case dSC: {
                        fgk_2 fgk_23 = (fgm_1)fgk_22;
                        awx_1 awx_12 = ((fgm_1)fgk_23).gzc();
                        if (awx_12 == null) {
                            awx_12 = this.gyc();
                        }
                        String string = ((fgm_1)fgk_23).dDG();
                        if (awx_12 == null || string == null) break;
                        int n7 = 0;
                        while (n7 != -1) {
                            int n8;
                            int n9;
                            String string2;
                            int n10 = n7;
                            String string3 = string2 = (n7 = string.indexOf(utt, n7 + 1)) == -1 ? string.substring(n10) : string.substring(n10, n7);
                            if (point.x != 0 && string2.length() != 0 && (n9 = awx_12.b(string2, n8 = n4 - point.x, false)) == 0) {
                                bl2 = true;
                            }
                            boolean bl3 = bl2 = bl2 || n5 != 0 || fgv_12 == null || string2.startsWith(utt);
                            if (string2.length() == 0) {
                                if (bl2) {
                                    if (fgv_12 != null) {
                                        d2 = Math.max((double)point.x, d2);
                                        if (this.gyu() && this.gys()) {
                                            point.y = Math.min(point.y, fgv_12.getHeight());
                                            d3 = Math.max(d3, (double)fgv_12.getHeight());
                                        } else {
                                            point.y -= fgv_12.getHeight();
                                            d3 += (double)fgv_12.getHeight();
                                        }
                                    }
                                    point.x = 0;
                                    if (fgv_12 != null) {
                                        fgv_12.aZp();
                                    }
                                    fgv_12 = fgv_1.gxN();
                                    fgv_12.setAlignment(fzY2);
                                    if (this.cVt >= 0) {
                                        fgv_12.setHeight(this.cVt);
                                    }
                                    bl2 = false;
                                    if (!this.abq(n3)) break;
                                    ++n3;
                                }
                                fgv_12.setHeight(Math.max(awx_12.bNx(), fgv_12.getHeight()));
                                fgv_12.a("", (fgm_1)fgk_23, n5, n5, point.x, 0);
                                continue;
                            }
                            n8 = 0;
                            while (n8 < string2.length()) {
                                if (bl2) {
                                    if (fgv_12 != null) {
                                        d2 = Math.max((double)point.x, d2);
                                        if (this.gyu() && this.gys()) {
                                            point.y = Math.min(point.y, fgv_12.getHeight());
                                            d3 = Math.max(d3, (double)fgv_12.getHeight());
                                        } else {
                                            point.y -= fgv_12.getHeight();
                                            d3 += (double)fgv_12.getHeight();
                                        }
                                    }
                                    point.x = awx_12.getFont().bNg();
                                    if (fgv_12 != null) {
                                        fgv_12.aZp();
                                    }
                                    fgv_12 = fgv_1.gxN();
                                    fgv_12.setAlignment(fzY2);
                                    if (this.cVt >= 0) {
                                        fgv_12.setHeight(this.cVt);
                                    }
                                    bl2 = false;
                                    if (!this.abq(n3)) break;
                                    ++n3;
                                }
                                if ((n9 = n4 - point.x) < 0) {
                                    n9 = Integer.MAX_VALUE;
                                }
                                int n11 = this.abq(n3) ? awx_12.h(string2.substring(n8), n9) : string2.substring(n8).length();
                                int n12 = n8 + Math.max(1, n11);
                                String string4 = string2.substring(n8, n12);
                                int n13 = awx_12.gj(string4);
                                int n14 = awx_12.gk(string4);
                                fgv_12.setHeight(Math.max(n14, fgv_12.getHeight()));
                                fgv_12.abm(Math.max(fgv_12.gxS(), awx_12.gp(string4)));
                                fgv_12.a(string4, (fgm_1)fgk_23, n5, n5 + string4.length(), point.x, n13);
                                n5 += string4.length();
                                n8 = n12;
                                if (n8 != string2.length()) {
                                    bl2 = true;
                                    d2 = Math.max(d2, (double)(point.x + n13));
                                    continue;
                                }
                                point.x += n13;
                            }
                            if (this.abq(n3)) continue;
                            break;
                        }
                        if (this.abq(n3)) continue block4;
                    }
                }
            }
            if (!bl2 && fgv_12 != null) {
                d3 = this.gyu() && this.gys() ? Math.max(d3, (double)fgv_12.getHeight()) : (d3 += (double)fgv_12.getHeight());
                d2 = Math.max((double)point.x, d2);
            }
            if (fgv_12 != null) {
                fgv_12.aZp();
            }
        } else {
            awx_1 awx_13 = this.gyc();
            if (awx_13 != null) {
                d2 = awx_13.bNw();
                d3 = awx_13.bNx();
            }
        }
        if (this.uty.isHorizontal()) {
            this.utM.setSize(d2, d3);
            this.utL.setSize(Math.max(Math.min((double)n2, d2), (double)n), d3);
        } else {
            this.utM.setSize(d3, d2);
            this.utL.setSize(d3, Math.max(Math.min((double)n2, d2), (double)n));
        }
        this.utQ = false;
    }

    public void cUN() {
        this.gya();
        this.utU = false;
        Point point = new Point(0, 0);
        boolean bl = false;
        boolean bl2 = false;
        fgv_1 fgv_12 = null;
        fzY fzY2 = this.utw;
        int n = this.gyt() ? Integer.MAX_VALUE : this.gyw();
        for (fgk_2 fgk_22 : this.utz) {
            fzY fzY3 = fgk_22.getAlignment();
            if (fzY3 == null) {
                fzY3 = this.utw;
            }
            if (fzY3 != fzY2) {
                fzY2 = fzY3;
                bl = true;
                bl2 = false;
            }
            int n2 = 0;
            switch (fgk_22.gzE()) {
                case dSD: {
                    int n3;
                    fgl_2 fgl_22 = (fgl_2)fgk_22;
                    if (point.x != 0 && (n3 = n - point.x) < fgl_22.getWidth()) {
                        bl = true;
                        bl2 = true;
                    }
                    if (bl || fgv_12 == null) {
                        fgv_1 fgv_13 = this.a(fgv_12, bl2, point, 0, fzY2);
                        if (fgv_13 == null) {
                            return;
                        }
                        fgv_12 = fgv_13;
                        if (this.cVt >= 0) {
                            fgv_12.setHeight(this.cVt);
                        }
                        bl = false;
                    }
                    fgv_12.setHeight(Math.max(fgl_22.getHeight(), fgv_12.getHeight()));
                    fgv_12.a(fgl_22, point.x);
                    point.x += fgl_22.getWidth();
                    break;
                }
                case dSC: {
                    fgm_1 fgm_12 = (fgm_1)fgk_22;
                    awx_1 awx_12 = fgm_12.gzc();
                    if (awx_12 == null) {
                        awx_12 = this.gyc();
                    }
                    String string = fgm_12.dDG();
                    if (awx_12 == null || string == null) break;
                    int n4 = 0;
                    while (n4 != -1) {
                        int n5;
                        int n6;
                        String string2;
                        int n7 = n4;
                        String string3 = string2 = (n4 = string.indexOf(utt, n4 + 1)) == -1 ? string.substring(n7) : string.substring(n7, n4);
                        if (point.x != 0 && string2.length() != 0 && (n6 = awx_12.b(string2, n5 = n - point.x, false)) == 0) {
                            bl = true;
                        }
                        bl = bl || n2 != 0 || fgv_12 == null || string2.startsWith(utt);
                        boolean bl3 = bl2 = bl && !string2.startsWith(utt);
                        if (string2.length() == 0) {
                            if (bl) {
                                fgv_1 fgv_14 = this.a(fgv_12, bl2, point, awx_12.getFont().bNg(), fzY2);
                                if (fgv_14 == null) {
                                    return;
                                }
                                point.y -= fgv_14.getHeight();
                                fgv_12 = fgv_14;
                                if (this.cVt >= 0) {
                                    fgv_12.setHeight(this.cVt);
                                }
                                bl = false;
                            }
                            fgv_12.setHeight(Math.max(awx_12.bNx(), fgv_12.getHeight()));
                            fgv_12.a("", fgm_12, n2, n2, point.x, 0);
                            continue;
                        }
                        n5 = 0;
                        while (n5 < string2.length()) {
                            if (bl) {
                                fgv_1 fgv_15 = this.a(fgv_12, bl2, point, awx_12.getFont().bNg(), fzY2);
                                if (fgv_15 == null) {
                                    return;
                                }
                                fgv_12 = fgv_15;
                                if (this.cVt >= 0) {
                                    fgv_12.setHeight(this.cVt);
                                }
                                bl = false;
                            }
                            if ((n6 = n - point.x) < 0) {
                                n6 = Integer.MAX_VALUE;
                            }
                            int n8 = awx_12.h(string2.substring(n5), n6);
                            int n9 = n5 + Math.max(1, n8);
                            String string4 = string2.substring(n5, n9);
                            int n10 = awx_12.gj(string4) - awx_12.getFont().bNg();
                            int n11 = awx_12.gk(string4);
                            fgv_12.setHeight(Math.max(n11, fgv_12.getHeight()));
                            fgv_12.abm(Math.max(fgv_12.gxS(), awx_12.gp(string4)));
                            fgv_12.a(string4, fgm_12, n2, n2 + string4.length(), point.x, n10);
                            n2 += string4.length();
                            n5 = n9;
                            if (n5 != string2.length()) {
                                bl = true;
                                bl2 = true;
                                continue;
                            }
                            point.x += n10;
                        }
                    }
                    break;
                }
            }
        }
        if (!bl && fgv_12 != null) {
            this.a(fgv_12, bl2, point, false);
            fgv_12 = null;
        }
        if (fgv_12 != null) {
            fgv_12.aZp();
        }
        this.gyP();
        this.utO = false;
    }

    public void gyP() {
        if (this.isSelectable()) {
            int n;
            int n2;
            int n3;
            Object object;
            int n4;
            int n5;
            int n6;
            int n7;
            this.utB = null;
            fgk_2 fgk_22 = this.utz.gzn();
            int n8 = this.utz.gzo();
            int n9 = this.utz.gzp();
            fgk_2 fgk_23 = this.utz.gzr();
            int n10 = this.utz.gzs();
            int n11 = this.utz.gzt();
            for (n7 = 0; n7 < this.utA.size(); ++n7) {
                fgv_1 fgv_12 = this.utA.get(n7);
                fgv_12.gxP();
            }
            n7 = -1;
            int n12 = -1;
            int n13 = -1;
            int n14 = -1;
            for (n6 = 0; n6 < this.utA.size() && n7 < 0; ++n6) {
                fgv_1 fgv_13 = this.utA.get(n6);
                fgv_13.gxP();
                n5 = n6 == 0 ? 1 : 0;
                ArrayList<fgb_2> arrayList = fgv_13.gxY();
                for (n4 = 0; n4 < arrayList.size() && n14 < 0; ++n4) {
                    object = arrayList.get(n4);
                    fgk_2 fgk_24 = ((fgb_2)object).gyW();
                    if (fgk_24 != fgk_22) continue;
                    boolean bl = n9 < ((fgb_2)object).In() + (n5 != 0 ? 0 : 1);
                    int n15 = n3 = n9 > ((fgb_2)object).fAI() ? 1 : 0;
                    if (bl || n3) continue;
                    int n16 = n9 - ((fgb_2)object).In() + (n5 != 0 ? 0 : -1);
                    n14 = fgv_13.a(this.gyc(), (fgb_2)object, n16);
                    n7 = n6;
                    n12 = n4;
                    n13 = n16;
                }
            }
            n6 = -1;
            int n17 = -1;
            n5 = -1;
            int n18 = -1;
            for (n4 = 0; n4 < this.utA.size() && n6 < 0; ++n4) {
                object = this.utA.get(n4);
                ((fgv_1)object).gxP();
                boolean bl = n4 == 0;
                ArrayList<fgb_2> arrayList = ((fgv_1)object).gxY();
                for (n3 = 0; n3 < arrayList.size() && n18 < 0; n3 += 1) {
                    fgb_2 fgb_22 = arrayList.get(n3);
                    fgk_2 fgk_25 = fgb_22.gyW();
                    if (fgk_25 != fgk_23) continue;
                    n2 = n11 < fgb_22.In() + (bl ? 0 : 1) ? 1 : 0;
                    int n19 = n = n11 > fgb_22.fAI() ? 1 : 0;
                    if (n2 != 0 || n != 0) continue;
                    int n20 = n11 - fgb_22.In() + (bl ? 0 : -1);
                    n18 = ((fgv_1)object).a(this.gyc(), fgb_22, n20);
                    n6 = n4;
                    n17 = n3;
                    n5 = n20;
                    this.utB = object;
                }
            }
            if (n7 >= 0 && n6 >= 0) {
                for (n4 = n7; n4 <= n6; ++n4) {
                    int n21;
                    int n22;
                    object = this.utA.get(n4);
                    if (n4 == n7 && n7 < n6) {
                        n22 = n14;
                        n21 = ((fgv_1)object).a(this.gyc(), ((fgv_1)object).gxW(), ((fgv_1)object).aPs()) - n14;
                        n3 = 0;
                    } else if (n7 < n4 && n4 < n6) {
                        n22 = 0;
                        n21 = ((fgv_1)object).a(this.gyc(), ((fgv_1)object).gxW(), ((fgv_1)object).aPs());
                        n3 = 0;
                    } else if (n4 == n6 && n7 < n6) {
                        n22 = 0;
                        n21 = ((fgv_1)object).a(this.gyc(), ((fgv_1)object).abo(n17), n5);
                        n3 = 0;
                    } else {
                        if (n7 != n6) continue;
                        n22 = n14;
                        n21 = Math.max(n18 - n14, 1);
                        n3 = n21 <= 1 ? 1 : 0;
                    }
                    int n23 = this.utu.getAppearance().getContentWidth();
                    int n24 = ((fgv_1)object).a(this.gyc(), ((fgv_1)object).gxW(), ((fgv_1)object).aPs());
                    if (n24 < Math.abs(this.utS) + n23) {
                        this.utS = n23 - n24;
                    } else if (n14 < Math.abs(this.utS)) {
                        this.utS = -n14;
                    } else if (n14 > n23 + Math.abs(this.utS)) {
                        this.utS = n23 - n14;
                    }
                    this.utS = Math.min(this.utS, 0);
                    n = ((fgv_1)object).gxU();
                    for (n2 = 0; n2 < n; ++n2) {
                        fgb_2 fgb_23 = ((fgv_1)object).abo(n2);
                        fgb_23.setX(this.utS);
                    }
                    n22 += this.utS;
                    n22 = Math.max(n22 - 1, 0);
                    ((fgv_1)object).r(n22, n21, n3 != 0);
                }
            }
        }
        this.utP = false;
    }

    private boolean a(@NotNull fgv_1 fgv_12, boolean bl, @NotNull Point point, boolean bl2) {
        int n;
        point.y -= fgv_12.getHeight();
        fgv_12.setY(point.y);
        if (this.tFJ && this.utH && bl) {
            Object object;
            fgf_2 fgf_22;
            Object object2;
            fgb_2 fgb_22 = fgv_12.gxW();
            if (fgb_22 != null && fgb_22.gyV() == fgc_2.uuh && (object2 = (fgf_22 = (fgf_2)fgb_22).getText()) != null && ((String)object2).endsWith(" ")) {
                fgf_22.setText(((String)object2).substring(0, ((String)object2).length() - 1));
                int n2 = fgv_12.getWidth();
                int n3 = fgf_22.getWidth();
                object = fgf_22.gzc();
                if (object == null) {
                    object = this.gyc();
                }
                String string = fgf_22.getText();
                int n4 = ((awx_1)object).gj(string);
                fgf_22.setWidth(((awx_1)object).gj(string));
                fgv_12.gxX();
                int n5 = fgv_12.getWidth();
                boolean bl3 = false;
            }
            n = 0;
            for (fgb_2 fgb_23 : fgv_12.gxY()) {
                fgf_2 fgf_23;
                if (fgb_23.gyV() != fgc_2.uuh || (object = (fgf_23 = (fgf_2)fgb_23).gza()) == null) continue;
                int n6 = BH.a(' ', (char[])object);
                fgf_23.abn(n6);
                n += n6;
            }
            fgv_12.abn(n);
        }
        fgv_12.setX(fgv_12.getAlignment().cf(fgv_12.getWidth(), this.gyw()));
        boolean bl4 = -point.y <= this.getOrientedHeight();
        int n7 = n = bl4 || this.gys() ? 1 : 0;
        if (n != 0) {
            this.utA.add(fgv_12);
        } else {
            fgv_12.aZp();
        }
        if (!this.utH || !this.gys() && !bl4 || !this.abq(this.utA.size())) {
            if (n == 0 || bl2) {
                this.gyQ();
                this.utO = false;
            }
            return false;
        }
        return true;
    }

    private fgv_1 a(fgv_1 fgv_12, boolean bl, Point point, int n, fzY fzY2) {
        point.x = n;
        if (fgv_12 != null && !this.a(fgv_12, bl, point, true)) {
            return null;
        }
        fgv_12 = fgv_1.gxN();
        fgv_12.setAlignment(fzY2);
        return fgv_12;
    }

    private void gyQ() {
        if (this.utA.isEmpty()) {
            return;
        }
        this.utU = true;
        fgv_1 fgv_12 = this.utA.get(this.utA.size() - 1);
        if (fgv_12 != null) {
            int n = fgv_12.gxU();
            while (n > 0) {
                fgb_2 fgb_22;
                if ((fgb_22 = fgv_12.abo(--n)).gyV() == fgc_2.uuh) {
                    fgf_2 fgf_22 = (fgf_2)fgb_22;
                    awx_1 awx_12 = fgf_22.gzc();
                    if (awx_12 == null) {
                        awx_12 = this.gyc();
                    }
                    if (awx_12 != null) {
                        int n2 = awx_12.gj(uts);
                        int n3 = this.gyw();
                        int n4 = n3 - fgf_22.getX();
                        if (n4 >= n2) {
                            int n5;
                            int n6;
                            char[] cArray = fgf_22.getText().toCharArray();
                            int n7 = 0;
                            for (n6 = 0; n6 < cArray.length && n7 + (n5 = awx_12.e(cArray[n6])) <= n4 - n2; ++n6) {
                                n7 += n5;
                            }
                            n5 = n6;
                            String string = fgf_22.getText().substring(0, n5);
                            int n8 = awx_12.gj(string);
                            int n9 = 5;
                            if (n4 - n8 + 5 >= 0) {
                                fgf_22.setText(string);
                                fgf_22.setWidth(n8);
                                fgf_2 fgf_23 = fgv_12.a(uts, null, 0, 0, fgf_22.getX() + n8, n2);
                                fgf_23.b(awx_12);
                                fgf_23.c(fgf_22.gze());
                                fgf_23.setAlignment(fgf_22.getAlignment());
                                fgf_23.oR(fgf_22.gzf());
                                fgf_23.oS(fgf_22.gzg());
                                fgv_12.gxX();
                                fgv_12.setX(fgv_12.getAlignment().cf(fgv_12.getWidth(), n3));
                                return;
                            }
                        }
                    }
                }
                fgv_12.abl(n);
            }
        }
    }

    @Override
    public Iterator<fgv_1> iterator() {
        return this.utA.iterator();
    }

    public void clean() {
        this.gya();
        this.utz.clean();
        this.tFJ = false;
        this.utv = Color.BLACK;
        this.utw = fzY.tLy;
        this.utx = fzY.tLv;
        this.uty = fzu_0.tKE;
        this.utu = null;
        this.utW.clear();
    }

    public fdz_1 guX() {
        return this.utu;
    }

    public void vd(long l) {
        if (this.utV == l) {
            return;
        }
        this.utV = l;
    }

    public long gyR() {
        return this.utV;
    }

    private void K(@NotNull Runnable runnable) {
        String string = this.gyi();
        runnable.run();
        String string2 = this.gyi();
        this.utW.forEach(fga_22 -> fga_22.onTextChanged(string, string2));
    }
}

