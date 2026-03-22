/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from fHv
 */
public abstract class fhv_1
extends fhi_2
implements aey_1,
ayx_2,
fsf_2,
Comparable<fhv_1> {
    protected static final Logger uxJ = Logger.getLogger(fhv_1.class);
    protected final ArrayList<fhv_1> uxK = new ArrayList();
    protected fhv_1 uxL;
    private final Set<ffe_2> uxM = new HashSet<ffe_2>();
    private aah_1<ArrayList<fis_1>> uxN;
    private aah_1<ArrayList<fis_1>> uxO;
    private EnumSet<fzq_0> uxP;
    protected ArrayList<fes_2> uxQ = null;
    private boolean uxR = false;
    private int uxS;
    private int uxT;
    private short uxU = (short)-1;
    protected fhs_2 nQt;
    protected boolean uxV = false;
    protected String cHc = null;
    protected boolean hZs = false;
    protected boolean uwp = false;
    protected fcv_1 uxW;
    protected ftj_2 uxX = null;
    protected ArrayList<fsr_2> cwD;
    protected ArrayList<fsr_2> uxY;
    protected boolean uxZ = true;
    public static final int uya = 3355;

    @Override
    public void d(fhv_1 fhv_12) {
        this.a(fhv_12, true);
    }

    public void a(fhv_1 fhv_12, boolean bl) {
        if (fhv_12 != null) {
            assert (!this.uwb) : "Object is already checked-in" + this.getClass().getSimpleName();
            super.d(fhv_12);
            this.uxK.add(fhv_12);
            fhv_12.setParent(this);
            fhv_12.setTreeDepth(this.uxS + 1);
            fhj_2.gBa().gAW();
            if (bl && fhv_12 instanceof fes_2) {
                this.l((fes_2)fhv_12);
            }
            if (this.isInTree()) {
                fhv_12.gvr();
            }
            fhv_12.setIsATemplate(this.uwm);
        } else {
            uxJ.error((Object)("Tentative d'ajout un element null \u00e0 " + this.getClass().getSimpleName()));
        }
    }

    public void j(fhv_1 fhv_12) {
        if (this.uxK != null) {
            if (fhv_12 instanceof fes_2) {
                this.n((fes_2)fhv_12);
            }
            fhv_12.gAJ();
            this.uxK.remove(fhv_12);
            fhv_12.setParent(null);
        }
    }

    public void m(fhv_1 fhv_12) {
        this.j(fhv_12);
        fhv_1.p(fhv_12);
    }

    public void gAC() {
        if (this.uxL != null) {
            this.uxL.j(this);
        }
    }

    public void gAD() {
        if (this.uxL != null) {
            this.uxL.m(this);
        } else {
            fhv_1.p(this);
        }
    }

    public void bJk() {
        if (this.uxK != null) {
            for (int i = this.uxK.size() - 1; i >= 0; --i) {
                this.j(this.uxK.get(i));
            }
            this.uxK.clear();
        }
    }

    public void gAE() {
        if (this.uxK != null) {
            for (int i = this.uxK.size() - 1; i >= 0; --i) {
                this.m(this.uxK.get(i));
            }
            this.uxK.clear();
        }
    }

    public void l(fes_2 fes_22) {
        if (this.uxL != null) {
            this.uxL.l(fes_22);
        } else {
            if (this.uxQ == null) {
                this.uxQ = new ArrayList();
            }
            this.uxQ.add(fes_22);
            this.setNeedsToPreProcess();
        }
    }

    public void n(fes_2 fes_22) {
        if (this.uxL != null) {
            this.uxL.n(fes_22);
        }
    }

    public void setWidgetOnTop(fes_2 fes_22) {
        if (this.uxL != null) {
            this.uxL.setWidgetOnTop(fes_22);
        }
    }

    @Override
    public void a(fsr_2 fsr_22) {
        if (this.cwD == null) {
            this.cwD = new ArrayList(5);
        }
        this.cwD.add(fsr_22);
        fsr_22.a(this);
        this.setNeedsToPreProcess();
    }

    @Override
    public void b(fsr_2 fsr_22) {
        if (fsr_22 == null) {
            return;
        }
        if (this.uxY == null) {
            this.uxY = new ArrayList(5);
        }
        if (!this.uxY.contains(fsr_22)) {
            this.uxY.add(fsr_22);
            this.setNeedsToPreProcess();
        }
    }

    public boolean x(Class<? extends fsr_2> clazz) {
        if (this.cwD == null) {
            return false;
        }
        boolean bl = false;
        for (int i = this.cwD.size() - 1; i >= 0; --i) {
            fsr_2 fsr_22 = this.cwD.get(i);
            if (!fsr_22.getClass().equals(clazz)) continue;
            this.b(fsr_22);
            bl = true;
        }
        return bl;
    }

    public boolean y(Class<? extends fsr_2> clazz) {
        if (this.cwD == null) {
            return false;
        }
        for (int i = this.cwD.size() - 1; i >= 0; --i) {
            if (!this.cwD.get(i).getClass().equals(clazz)) continue;
            return true;
        }
        return false;
    }

    @Nullable
    public <T extends fsr_2<?>> T getFirstTweenOfType(Class<T> clazz) {
        if (this.cwD == null) {
            return null;
        }
        for (int i = this.cwD.size() - 1; i >= 0; --i) {
            fsr_2 fsr_22 = this.cwD.get(i);
            if (!fsr_22.getClass().equals(clazz)) continue;
            return (T)fsr_22;
        }
        return null;
    }

    @NotNull
    public <T extends fsr_2<?>> List<T> getTweensOfType(Class<T> clazz) {
        if (this.cwD == null) {
            return Collections.emptyList();
        }
        ArrayList<fsr_2> arrayList = new ArrayList<fsr_2>();
        for (int i = this.cwD.size() - 1; i >= 0; --i) {
            fsr_2 fsr_22 = this.cwD.get(i);
            if (!fsr_22.getClass().equals(clazz)) continue;
            arrayList.add(fsr_22);
        }
        return arrayList;
    }

    public void a(fzq_0 fzq_02, fis_1 fis_12, boolean bl) {
        this.a(fzq_02, fis_12, bl, null);
    }

    public void a(fzq_0 fzq_02, fis_1 fis_12, boolean bl, @Nullable Integer n) {
        int n2 = fzq_02.ordinal();
        if (bl) {
            ArrayList<fis_1> arrayList;
            if (this.uxN == null) {
                this.uxN = new aah_1(5);
            }
            if ((arrayList = this.uxN.vK(n2)) == null) {
                arrayList = new ArrayList();
                this.uxN.b(n2, arrayList);
            }
            if (!arrayList.contains(fis_12)) {
                if (n == null) {
                    arrayList.add(fis_12);
                } else {
                    arrayList.add(n, fis_12);
                }
            }
        } else {
            ArrayList<fis_1> arrayList;
            if (this.uxO == null) {
                this.uxO = new aah_1(5);
            }
            if ((arrayList = this.uxO.vK(n2)) == null) {
                arrayList = new ArrayList();
                this.uxO.b(n2, arrayList);
            }
            if (!arrayList.contains(fis_12)) {
                if (n == null) {
                    arrayList.add(fis_12);
                } else {
                    arrayList.add(n, fis_12);
                }
            }
        }
    }

    public void b(fzq_0 fzq_02, fis_1 fis_12, boolean bl) {
        int n = fzq_02.ordinal();
        if (bl) {
            if (this.uxN == null) {
                return;
            }
            ArrayList<fis_1> arrayList = this.uxN.vK(n);
            if (arrayList != null) {
                arrayList.remove(fis_12);
                if (arrayList.isEmpty()) {
                    this.uxN.wp(n);
                }
            }
        } else {
            if (this.uxO == null) {
                return;
            }
            ArrayList<fis_1> arrayList = this.uxO.vK(n);
            if (arrayList != null) {
                arrayList.remove(fis_12);
                if (arrayList.isEmpty()) {
                    this.uxO.wp(n);
                }
            }
        }
    }

    public void gAF() {
        if (this.uxN != null) {
            this.uxN.clear();
            this.uxN = null;
        }
        if (this.uxO != null) {
            this.uxO.clear();
            this.uxO = null;
        }
    }

    @Nullable
    public ArrayList<fis_1> getListeners(fzq_0 fzq_02, boolean bl) {
        if (bl && this.uxN != null) {
            return this.uxN.vK(fzq_02.ordinal());
        }
        if (!bl && this.uxO != null) {
            return this.uxO.vK(fzq_02.ordinal());
        }
        return null;
    }

    @Override
    public fht_1 getElementType() {
        return fht_1.uxB;
    }

    public fhv_1 getParent() {
        return this.uxL;
    }

    public void setParent(fhv_1 fhv_12) {
        assert (fhv_12 != this) : "On ne peut pas se d\u00e9finir soi-m\u00eame en parent";
        fhv_1 fhv_13 = this.uxL;
        this.uxL = fhv_12;
        if (this.uxL != null && this.nQt == null) {
            this.nQt = this.uxL.getElementMap();
        }
        this.b(fhv_13, this.uxL);
    }

    public fhv_1 getFirstParentWithId() {
        if (this.uxL == null) {
            return null;
        }
        if (this.uxL.getId() != null) {
            return this.uxL;
        }
        return this.uxL.getFirstParentWithId();
    }

    public fhv_1 getParentWithId(String string) {
        if (this.uxL == null) {
            return null;
        }
        if (Objects.equals(this.uxL.getId(), string)) {
            return this.uxL;
        }
        return this.uxL.getParentWithId(string);
    }

    private void b(fhv_1 fhv_12, fhv_1 fhv_13) {
        if (this.uxM.isEmpty()) {
            return;
        }
        HashSet<ffe_2> hashSet = new HashSet<ffe_2>(this.uxM);
        hashSet.forEach(ffe_22 -> {
            try {
                ffe_22.onParentChanged(fhv_12, fhv_13);
            }
            catch (Exception exception) {
                uxJ.error((Object)String.format("Error occured in call of following %s(%s) with followings args : \"%s\", \"%s\"", ffe_22, ffe_22.getClass().getName(), fhv_12, fhv_13), (Throwable)exception);
            }
        });
    }

    public boolean a(@NotNull ffe_2 ffe_22) {
        return this.uxM.add(ffe_22);
    }

    public boolean b(@NotNull ffe_2 ffe_22) {
        return this.uxM.remove(ffe_22);
    }

    public ArrayList<fhv_1> getChildren() {
        return this.uxK;
    }

    public @Unmodifiable @NotNull List<fhv_1> getIndirectChildren() {
        return Collections.emptyList();
    }

    @Nullable
    public <T extends fhv_1> T getElementRecursively(String string, Predicate<fhv_1> predicate) {
        LinkedList<fhv_1> linkedList = new LinkedList<fhv_1>();
        linkedList.add(this);
        HashSet<fhv_1> hashSet = new HashSet<fhv_1>();
        while (!linkedList.isEmpty()) {
            fhv_1 fhv_12 = (fhv_1)linkedList.remove(0);
            if (fhv_12 == null || hashSet.contains(fhv_12)) continue;
            hashSet.add(fhv_12);
            if (string.equals(fhv_12.cHc) && predicate.test(fhv_12)) {
                return (T)fhv_12;
            }
            linkedList.addAll(fhv_12.uxK);
        }
        return null;
    }

    public fhv_1 getChildWithId(String string) {
        if (this.uxK.isEmpty()) {
            return null;
        }
        for (fhv_1 fhv_12 : this.uxK) {
            if (!Objects.equals(fhv_12.getId(), string)) continue;
            return fhv_12;
        }
        for (fhv_1 fhv_12 : this.uxK) {
            fhv_1 fhv_13 = fhv_12.getChildWithId(string);
            if (fhv_13 == null) continue;
            return fhv_13;
        }
        return null;
    }

    public String getId() {
        return this.cHc;
    }

    public void setId(String string) {
        if (this.cHc != null && !this.cHc.equalsIgnoreCase(string) && this.nQt != null) {
            this.nQt.aL(this.cHc, string);
            this.cHc = string;
        } else if (this.cHc == null && string != null && this.nQt != null) {
            this.cHc = string;
            this.nQt.a(string, this);
        } else {
            this.cHc = string;
        }
    }

    public short getModalLevel() {
        return this.uxU;
    }

    public void setModalLevel(short s) {
        this.uxU = s;
    }

    public boolean isValidAdd(fhi_2 fhi_22) {
        return fhi_22 != this;
    }

    @Override
    public int getTreePosition() {
        return this.uxT;
    }

    public void setTreePosition(int n) {
        this.uxT = n;
    }

    public void setTreeDepth(int n) {
        this.uxS = n;
        if (this.uxK != null) {
            int n2 = this.uxK.size();
            for (int i = 0; i < n2; ++i) {
                this.uxK.get(i).setTreeDepth(n + 1);
            }
        }
    }

    @Override
    public int getTreeDepth() {
        return this.uxS;
    }

    @Override
    public void setIsATemplate(boolean bl) {
        this.uwm |= bl;
        for (int i = this.uxK.size() - 1; i >= 0; --i) {
            this.uxK.get(i).setIsATemplate(bl);
        }
    }

    public void a(Consumer<fhv_1> consumer, Set<Class> set) {
        this.uxK.forEach(fhv_12 -> {
            if (!set.contains(fhv_12.getClass())) {
                consumer.accept((fhv_1)fhv_12);
            }
        });
        this.uxK.forEach(fhv_12 -> {
            if (!set.contains(fhv_12.getClass())) {
                fhv_12.a(consumer, set);
            }
        });
    }

    @Override
    public boolean isATemplate() {
        return this.uwm;
    }

    public boolean a(fzq_0 fzq_02) {
        if (this.uxN != null && this.uxN.vZ(fzq_02.ordinal())) {
            return true;
        }
        return this.uxO != null && this.uxO.vZ(fzq_02.ordinal());
    }

    public boolean isValid() {
        return this.hZs;
    }

    public boolean setAppearance(fys_0 fys_02) {
        uxJ.warn((Object)("Tentative d'ajout d'une apparence " + fys_02.getClass().getSimpleName() + " \u00e0 un " + this.getClass().getSimpleName()));
        fys_02.gAD();
        return false;
    }

    public fes_2 getParentWidget() {
        if (this.uxL != null) {
            if (this.uxL instanceof fes_2) {
                return (fes_2)this.uxL;
            }
            return this.uxL.getParentWidget();
        }
        return null;
    }

    public boolean n(fhv_1 fhv_12) {
        if (this.uxL == null) {
            return false;
        }
        if (this.uxL == fhv_12) {
            return true;
        }
        return this.uxL.n(fhv_12);
    }

    public Object getElementValue() {
        return this;
    }

    public void setElementMap(fhs_2 fhs_22) {
        this.nQt = fhs_22;
    }

    public fhs_2 getElementMap() {
        if (this.nQt == null && this.uxL != null) {
            return this.uxL.getElementMap();
        }
        return this.nQt;
    }

    public boolean isElementMapRoot() {
        return this.uxV;
    }

    public void setElementMapRoot(boolean bl) {
        this.uxV = bl;
    }

    public fcv_1 getRenderableParent() {
        return this.uxW;
    }

    public void setRenderableParent(fcv_1 fcv_12) {
        if (this.uxW != fcv_12) {
            this.uxW = fcv_12;
        }
    }

    public void setChildrenAdded(boolean bl) {
        this.uwp = bl;
    }

    public boolean gAG() {
        return this.uwp;
    }

    public ftj_2 getUserDefinedManager() {
        return this.uxX;
    }

    public void setUserDefinedManager(ftj_2 ftj_22) {
        this.uxX = ftj_22;
    }

    public void a(fzq_0 fzq_02, boolean bl) {
        if (bl && this.uxP != null) {
            this.uxP.remove((Object)fzq_02);
        } else if (!bl) {
            if (this.uxP == null) {
                this.uxP = EnumSet.noneOf(fzq_0.class);
            }
            this.uxP.add(fzq_02);
        }
    }

    protected void b(fiq_1 fiq_12, boolean bl) {
    }

    public void setCanBeCloned(boolean bl) {
        this.uxZ = bl;
    }

    public boolean gsn() {
        return this.uxZ;
    }

    @Override
    public void propertyChange(aex_1 aex_12) {
    }

    public void gAH() {
        if (this.uxX != null) {
            this.uxX.gAH();
        }
    }

    public void gAI() {
        if (this.uxX != null) {
            this.uxX.gAI();
        }
    }

    public boolean isInTree() {
        if (this.uxL == null) {
            return false;
        }
        return this.uxL.isInTree();
    }

    public void gvr() {
        int n = this.uxK.size();
        for (int i = 0; i < n; ++i) {
            this.uxK.get(i).gvr();
        }
    }

    public void gAJ() {
        if (this.uxX != null) {
            this.uxX.gAI();
            this.uxX.gGE();
            aeb_1 aeb_12 = fyw_0.gqw().gqE().bCh();
            if (aeb_12 != null) {
                aeb_12.b(this);
            }
        }
        int n = this.uxK.size();
        for (int i = 0; i < n; ++i) {
            this.uxK.get(i).gAJ();
        }
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fhv_1 fhv_12 = (fhv_1)fhi_22;
        super.a(fhi_22);
        fhv_12.cHc = this.cHc;
        fhv_12.uwp = this.uwp;
        fhv_12.uxU = this.uxU;
        fhv_12.nQt = this.nQt;
        if (this.uxN != null) {
            fhv_12.uxN = this.a(fhv_12.uxN, this.uxN);
        }
        if (this.uxO != null) {
            fhv_12.uxO = this.a(fhv_12.uxO, this.uxO);
        }
        if (this.uxK != null) {
            int n = this.uxK.size();
            for (int i = 0; i < n; ++i) {
                fhv_1 fhv_13 = this.uxK.get(i);
                if (!fhv_13.gsn()) continue;
                fhv_12.d(fhv_13.gAK());
            }
        }
    }

    private aah_1<ArrayList<fis_1>> a(aah_1<ArrayList<fis_1>> aah_12, aah_1<ArrayList<fis_1>> aah_13) {
        int n = aah_13.bTR();
        if (aah_12 != null) {
            aah_12.vS(aah_12.bTR() + n);
        } else {
            aah_12 = new aah_1(n);
        }
        for (int i = 0; i < n; ++i) {
            int n2 = aah_13.wa(i);
            ArrayList<fis_1> arrayList = aah_13.vU(i);
            ArrayList<fis_1> arrayList2 = aah_12.vK(n2);
            int n3 = arrayList.size();
            if (arrayList2 == null) {
                arrayList2 = new ArrayList(n3);
                aah_12.b(n2, arrayList2);
            } else {
                arrayList2.ensureCapacity(n3 + arrayList2.size());
            }
            for (int j = 0; j < n3; ++j) {
                arrayList2.add(arrayList.get(j));
            }
        }
        return aah_12;
    }

    public fhv_1 gAK() {
        try {
            fhv_1 fhv_12;
            try {
                fhv_12 = (fhv_1)fkc_2.gCQ().D(this.getClass()).gBR();
            }
            catch (NullPointerException nullPointerException) {
                uxJ.error((Object)("pas de factory trouv\u00e9e pour " + this.getClass().getSimpleName()), (Throwable)nullPointerException);
                return null;
            }
            this.a(fhv_12);
            return fhv_12;
        }
        catch (Throwable throwable) {
            uxJ.error((Object)"Exception during cloneElementStructure", throwable);
            return null;
        }
    }

    public int o(@NotNull fhv_1 fhv_12) {
        return fhv_12.getTreeDepth() - this.uxS;
    }

    public boolean c(fiq_1 fiq_12, boolean bl) {
        this.b(fiq_12, bl);
        fiq_12.w(this);
        boolean bl2 = false;
        if (this.uxP == null || !this.uxP.contains((Object)fiq_12.gBy())) {
            bl2 = bl ? this.M(fiq_12) : this.N(fiq_12);
        }
        if (bl2) {
            return true;
        }
        if (fiq_12.gBE() == this && !fiq_12.gBC()) {
            fiq_12.oY(true);
            bl = false;
        } else if (fiq_12.gBE() == this && fiq_12.gBC()) {
            fiq_12.oY(false);
        }
        if (bl) {
            fhv_1 fhv_12 = fiq_12.gBA();
            if (fhv_12 != null) {
                return fhv_12.c(fiq_12, true);
            }
        } else {
            if (fiq_12.gBC()) {
                return ((fhv_1)fiq_12.gBE()).c(fiq_12, false);
            }
            if (this.uxL != null) {
                return this.uxL.c(fiq_12, false);
            }
        }
        return false;
    }

    public boolean isChildOf(@NotNull String string) {
        fhv_1 fhv_12 = this;
        do {
            if (!string.equals(fhv_12.cHc)) continue;
            return true;
        } while ((fhv_12 = fhv_12.uxL) != null);
        return false;
    }

    public void L(fiq_1 fiq_12) {
        if (this.uxO != null) {
            boolean bl = false;
            ArrayList<fis_1> arrayList = this.uxO.vK(fiq_12.gBy().ordinal());
            if (arrayList != null) {
                for (int i = 0; i < arrayList.size() && !(bl |= arrayList.get(i).run(fiq_12)); ++i) {
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean h(fiq_1 fiq_12) {
        if (fiq_12 == null) {
            uxJ.error((Object)"L'event est null, impossible de le traiter");
            return false;
        }
        try {
            if (fiq_12.gBE() == null) {
                uxJ.error((Object)("[" + String.valueOf((Object)fiq_12.gBy()) + "] L'event n'a pas de target, impossible de le traiter"));
                boolean bl = false;
                return bl;
            }
            fiq_12.x(this);
            boolean bl = true;
            fhv_1 fhv_12 = this instanceof fbj_1 ? this : this.uxL;
            fiq_12.v(this);
            while (fhv_12 != null && !(fhv_12 instanceof fbj_1)) {
                fiq_12.v(fhv_12);
                fhv_12 = fhv_12.uxL;
            }
            if (fhv_12 != null) {
                boolean bl2 = fhv_12.c(fiq_12, true);
                return bl2;
            }
            boolean bl3 = false;
            return bl3;
        }
        finally {
            fiq_12.aZp();
        }
    }

    public static void p(fhv_1 fhv_12) {
        if (!fhv_12.isUnloading()) {
            fhv_12.aZp();
        }
    }

    public void grg() {
        this.hZs = true;
    }

    public void bFM() {
        this.hZs = false;
        this.setNeedsToPostProcess();
    }

    @Override
    public void onChildrenAdded() {
        super.onChildrenAdded();
        this.uwp = true;
    }

    public void gtN() {
        this.uxR = true;
        this.setNeedsToMiddleProcess();
    }

    @Override
    public boolean LZ(int n) {
        int n2;
        int n3;
        boolean bl = super.LZ(n);
        if (this.uxQ != null && !this.uxQ.isEmpty()) {
            n3 = this.uxQ.size();
            for (n2 = 0; n2 < n3; ++n2) {
                this.l(this.uxQ.get(n2));
            }
            this.uxQ.clear();
        }
        if (this.uxY != null && (n3 = this.uxY.size()) > 0) {
            for (n2 = 0; n2 < n3; ++n2) {
                this.uxY.get(n2).cbz();
            }
            if (this.cwD != null) {
                this.cwD.removeAll(this.uxY);
            }
            this.uxY.clear();
        }
        if (this.cwD != null && (n3 = this.cwD.size()) > 0) {
            for (n2 = 0; n2 < n3; ++n2) {
                this.cwD.get(n2).Ma(n);
            }
        }
        if (this.cwD != null && this.cwD.size() > 0) {
            bl = true;
        }
        return bl;
    }

    @Override
    public boolean aaB(int n) {
        boolean bl = super.aaB(n);
        if (!this.uxR) {
            this.gtN();
        }
        return bl;
    }

    @Override
    public boolean LY(int n) {
        boolean bl = super.LY(n);
        if (!this.hZs) {
            this.grg();
        }
        return bl;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean M(fiq_1 fiq_12) {
        if (this.uxN == null) {
            return false;
        }
        ArrayList<fis_1> arrayList = this.getListeners(fiq_12.gBy(), true);
        if (arrayList != null) {
            ArrayList<fis_1> arrayList2 = arrayList;
            synchronized (arrayList2) {
                for (int i = 0; i < arrayList.size(); ++i) {
                    if (!arrayList.get(i).run(fiq_12)) continue;
                    return true;
                }
            }
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean N(fiq_1 fiq_12) {
        if (this.uxO == null) {
            return false;
        }
        ArrayList<fis_1> arrayList = this.getListeners(fiq_12.gBy(), false);
        if (arrayList != null) {
            ArrayList<fis_1> arrayList2 = arrayList;
            synchronized (arrayList2) {
                for (int i = 0; i < arrayList.size(); ++i) {
                    if (!arrayList.get(i).run(fiq_12)) continue;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void aVH() {
        super.aVH();
        if (this.uxK != null) {
            for (int i = this.uxK.size() - 1; i >= 0; --i) {
                this.m(this.uxK.get(i));
            }
            this.uxK.clear();
        }
        if (this.uxQ != null) {
            this.uxQ.clear();
            this.uxQ = null;
        }
        this.uth = null;
        this.uxL = null;
        this.uxM.clear();
        this.gAF();
        this.uxN = null;
        this.uxO = null;
        this.uxP = null;
        if (this.nQt != null) {
            if (this.cHc != null) {
                this.nQt.uL(this.cHc);
            }
            if (this.uxV) {
                fyw_0.gqw().tn(this.nQt.getId());
                this.nQt.gqC().uQ(this.nQt.getId());
            }
            this.nQt = null;
        }
        this.cHc = null;
        this.uxW = null;
        if (this.cwD != null) {
            this.cwD.clear();
            this.cwD = null;
        }
        if (this.uxY != null) {
            this.uxY.clear();
            this.uxY = null;
        }
        this.uxX = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.uxR = false;
        this.uxU = (short)-1;
        this.uxS = 0;
        this.uxV = false;
        this.hZs = false;
        this.uwp = false;
        this.uwm = false;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (3355 != n) {
            return false;
        }
        this.setId(fic_12.a(string, this.nQt));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (3355 == n) {
            this.setId((String)object);
            return true;
        }
        return false;
    }

    @Override
    public void a(apd_1 apd_12, fhv_1 fhv_12, Stack<fhs_2> stack, fhu_1 fhu_12) {
        fhs_2 fhs_22;
        fhs_2 fhs_23 = fhs_22 = stack != null ? stack.peek() : null;
        if (fhs_22 == null && fhv_12 != null) {
            fhs_22 = fhv_12.getElementMap();
        }
        this.setElementMap(fhs_22);
        super.a(apd_12, fhv_12, stack, fhu_12);
    }

    public void grv() {
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.o((fhv_1)object);
    }
}

