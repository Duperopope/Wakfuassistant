/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.function.Consumer;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fHi
 */
public abstract class fhi_2
implements ayx_2 {
    private static final Logger uvZ = Logger.getLogger(fhi_2.class);
    private static final boolean uwa = true;
    protected ObjectPool uth;
    protected boolean uwb = false;
    private int uwc = 0;
    private int uwd = 0;
    protected fhi_2 uwe;
    protected ArrayList<fsf_1> uwf = null;
    protected boolean uwg = false;
    protected boolean uwh = false;
    protected boolean uwi = false;
    private int uwj = -1;
    private int uwk = -1;
    private int uwl = -1;
    protected boolean uwm = false;
    private boolean uwn = false;
    private boolean uwo = false;
    private boolean uwp = false;
    private final Set<ffd_2> uwq = new HashSet<ffd_2>();
    private final Set<fia_2> uwr = new HashSet<fia_2>();
    public static final int uws = 1942574248;
    public static final int uwt = -1496919069;
    public static final int uwu = 1304010549;
    public static final int uwv = 93144203;
    static final int[] uww = new int[]{1942574248, -1496919069, 1304010549, 93144203, "xmlns:xsi".hashCode(), "xsi:noNamespaceSchemaLocation".hashCode()};

    public void b(fsf_1 fsf_12) {
        if (this.uwf == null) {
            this.uwf = new ArrayList(1);
        }
        if (!this.uwf.contains(fsf_12)) {
            this.uwf.add(fsf_12);
        }
    }

    public void c(fsf_1 fsf_12) {
        if (this.uwf != null) {
            this.uwf.remove(fsf_12);
        }
    }

    public void a(fhp_1 fhp_12) {
        fhp_12.setBasicParent(this);
    }

    public void d(fhv_1 fhv_12) {
        fhv_12.setBasicParent(this);
    }

    public void b(fhp_1 fhp_12) {
        this.a(fhp_12);
    }

    public void e(fhv_1 fhv_12) {
        this.d(fhv_12);
    }

    public void X(fhi_2 fhi_22) {
        fhi_22.setBasicParent(this);
        switch (fhi_22.getElementType()) {
            case uxB: {
                this.e((fhv_1)fhi_22);
                break;
            }
            case uxC: {
                this.b((fhp_1)fhi_22);
                break;
            }
        }
    }

    public int getLastPreProcessFrame() {
        return this.uwj;
    }

    public void setLastPreProcessFrame(int n) {
        this.uwj = n;
    }

    public int getLastMiddleProcessFrame() {
        return this.uwk;
    }

    public void setLastMiddleProcessFrame(int n) {
        this.uwk = n;
    }

    public int getLastPostProcessFrame() {
        return this.uwl;
    }

    public void setLastPostProcessFrame(int n) {
        this.uwl = n;
    }

    public void setNeedsToPreProcess() {
        if (!(this.uwm || !fhj_2.gBa().gBb() && this.uwg)) {
            fhj_2.gBa().ab(this);
            this.uwg = true;
        }
    }

    public void setNeedsToMiddleProcess() {
        if (!(this.uwm || !fhj_2.gBa().gBb() && this.uwh)) {
            fhj_2.gBa().ac(this);
            this.uwh = true;
        }
    }

    public void setNeedsToPostProcess() {
        if (!(this.uwm || !fhj_2.gBa().gBb() && this.uwi)) {
            fhj_2.gBa().ad(this);
            this.uwi = true;
        }
    }

    public <T> T getParentOfType(Class<T> clazz) {
        if (this.uwe == null) {
            return null;
        }
        if (clazz.isAssignableFrom(this.uwe.getClass())) {
            return (T)this.uwe;
        }
        return this.uwe.getParentOfType(clazz);
    }

    public void setBasicParent(fhi_2 fhi_22) {
        this.uwe = fhi_22;
    }

    public fhi_2 getBasicParent() {
        return this.uwe;
    }

    public boolean isChildOf(@NotNull fhi_2 fhi_22) {
        if (this.uwe == fhi_22) {
            return true;
        }
        if (this.uwe == null) {
            return false;
        }
        return this.uwe.isChildOf(fhi_22);
    }

    public boolean isUnloading() {
        return this.uwb;
    }

    public abstract fht_1 getElementType();

    public static String getTag(Class<? extends fhi_2> clazz) {
        try {
            return (String)clazz.getDeclaredField("TAG").get(null);
        }
        catch (Exception exception) {
            uvZ.error((Object)("Erreur lors de la r\u00e9cup\u00e9ration du tag de " + clazz.getSimpleName()));
            return null;
        }
    }

    public String getTag() {
        return "";
    }

    public String getStyleTag() {
        return this.getTag();
    }

    public int getTreeDepth() {
        return this.uwe != null ? this.uwe.getTreeDepth() : 0;
    }

    public int getTreePosition() {
        return this.uwe != null ? this.uwe.getTreePosition() : 0;
    }

    public boolean isInTreeDepthManager() {
        return this.uwn;
    }

    public void setInTreeDepthManager(boolean bl) {
        this.uwn = bl;
    }

    public boolean isAddedNextInTreeDepthManager() {
        return this.uwo;
    }

    public void setAddedNextInTreeDepthManager(boolean bl) {
        this.uwo = bl;
    }

    public void setIsATemplate(boolean bl) {
        this.uwm |= bl;
    }

    public boolean isATemplate() {
        return this.uwm;
    }

    public boolean setXMLAttribute(String string, String string2) {
        int n = string.hashCode();
        for (int n2 : uww) {
            if (n != n2) continue;
            return true;
        }
        if (!this.setXMLAttribute(n, string2, fic_1.gBr())) {
            uvZ.debug((Object)new StringBuilder("Impossible de trouver l'attribut ").append(string).append(" pour ").append(this.getClass().getSimpleName()));
            return false;
        }
        return true;
    }

    public boolean aF(String string, String string2) {
        if (!this.a(string.hashCode(), string2, fic_1.gBr())) {
            uvZ.debug((Object)new StringBuilder("Impossible de trouver l'attribut ").append(string).append(" pour ").append(this.getClass().getSimpleName()));
            return false;
        }
        return true;
    }

    public boolean aG(String string, String string2) {
        if (!this.b(string.hashCode(), string2, fic_1.gBr())) {
            uvZ.debug((Object)new StringBuilder("Impossible de trouver l'attribut ").append(string).append(" pour ").append(this.getClass().getSimpleName()));
            return false;
        }
        return true;
    }

    public boolean setPropertyAttribute(String string, Object object) {
        if (!this.setPropertyAttribute(string.hashCode(), object)) {
            uvZ.debug((Object)new StringBuilder("Impossible de trouver l'attribut ").append(string).append(" pour ").append(this.getClass().getSimpleName()));
            return false;
        }
        return true;
    }

    public boolean l(String string, Object object) {
        if (!this.g(string.hashCode(), object)) {
            uvZ.debug((Object)new StringBuilder("Impossible de trouver l'attribut ").append(string).append(" pour ").append(this.getClass().getSimpleName()));
            return false;
        }
        return true;
    }

    public boolean m(String string, Object object) {
        if (!this.h(string.hashCode(), object)) {
            uvZ.debug((Object)new StringBuilder("Impossible de trouver l'attribut ").append(string).append(" pour ").append(this.getClass().getSimpleName()));
            return false;
        }
        return true;
    }

    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        return false;
    }

    public boolean a(int n, String string, fic_1 fic_12) {
        return false;
    }

    public boolean b(int n, String string, fic_1 fic_12) {
        return false;
    }

    public boolean setPropertyAttribute(int n, Object object) {
        return false;
    }

    public boolean g(int n, Object object) {
        return false;
    }

    public boolean h(int n, Object object) {
        return false;
    }

    public boolean LZ(int n) {
        return false;
    }

    public boolean aaB(int n) {
        return false;
    }

    public boolean LY(int n) {
        return fhi_2.a(this.uwr, n);
    }

    public static boolean a(Set<fia_2> set, int n) {
        if (set.isEmpty()) {
            return false;
        }
        HashSet<fia_2> hashSet = new HashSet<fia_2>(set);
        LP lP = new LP(false);
        hashSet.forEach(fia_22 -> {
            try {
                boolean bl = fia_22.Mf(n);
                lP.aH(lP.aTe() || bl);
            }
            catch (Exception exception) {
                uvZ.error((Object)String.format("Error occured while calling %s(%s) with following args : \"%s\"", fia_22, fia_22.getClass().getName(), n), (Throwable)exception);
            }
        });
        return lP.aTe();
    }

    public boolean a(@NotNull fia_2 fia_22) {
        return this.uwr.add(fia_22);
    }

    public boolean b(@NotNull fia_2 fia_22) {
        return this.uwr.remove(fia_22);
    }

    public void abB(int n) {
        if (this.uwb) {
            return;
        }
        if (this.uwg) {
            this.uwg = false;
            if (fhv_2.gBn()) {
                boolean bl = this.LZ(n);
                this.uwg |= bl;
            }
            if (this.uwg) {
                fhj_2.gBa().Y(this);
            }
        }
    }

    public void abC(int n) {
        if (this.uwb) {
            return;
        }
        if (this.uwh) {
            this.uwh = false;
            if (fhv_2.gBn()) {
                boolean bl = this.aaB(n);
                this.uwh |= bl;
            }
            if (this.uwh) {
                fhj_2.gBa().Z(this);
            }
        }
    }

    public void abD(int n) {
        if (this.uwb) {
            return;
        }
        if (this.uwi) {
            this.uwi = false;
            if (fhv_2.gBn()) {
                boolean bl = this.LY(n);
                this.uwi |= bl;
            }
            if (this.uwi) {
                fhj_2.gBa().aa(this);
            }
        }
    }

    public void aZp() {
        try {
            if (this.uth != null) {
                this.uth.returnObject((Object)this);
            } else {
                this.aVH();
            }
        }
        catch (Exception exception) {
            uvZ.warn((Object)"Probl\u00e8me lors du retour dans un pool", (Throwable)exception);
            this.aVH();
        }
    }

    public void guy() {
    }

    private void gzP() {
        if (this.uwq.isEmpty()) {
            return;
        }
        HashSet<ffd_2> hashSet = new HashSet<ffd_2>(this.uwq);
        hashSet.forEach(ffd_22 -> {
            try {
                ffd_22.onChildrenAdded();
            }
            catch (Exception exception) {
                uvZ.error((Object)String.format("Error occured in call of following %s(%s)", ffd_22, ffd_22.getClass().getName()), (Throwable)exception);
            }
        });
    }

    public boolean a(@NotNull ffd_2 ffd_22) {
        boolean bl = this.uwq.add(ffd_22);
        if (bl && this.uwp) {
            try {
                ffd_22.onChildrenAdded();
            }
            catch (Exception exception) {
                uvZ.error((Object)String.format("Error occured in call of following %s(%s)", ffd_22, ffd_22.getClass().getName()), (Throwable)exception);
            }
        }
        return bl;
    }

    public boolean b(@NotNull ffd_2 ffd_22) {
        return this.uwq.remove(ffd_22);
    }

    public void onChildrenAdded() {
        this.gzP();
        this.uwp = true;
    }

    @Override
    public void aVH() {
        this.uwb = true;
        if (this.uwc >= this.uwd) {
            uvZ.error((Object)("Le nombre de checkIn ne correspond pas aux nombre de checkOut " + this.getClass().getSimpleName()));
        }
        ++this.uwc;
        this.uwe = null;
        if (this.uwf != null) {
            for (int i = this.uwf.size() - 1; i >= 0; --i) {
                this.uwf.get(i).an(this);
            }
            this.uwf = null;
        }
    }

    @Override
    public void aVI() {
        this.uwb = false;
        if (this.uwd != this.uwc) {
            uvZ.error((Object)("Le nombre de checkOut ne correspond pas aux nombre de checkIn " + this.getClass().getSimpleName()));
        }
        ++this.uwd;
        this.uwg = false;
        this.uwh = false;
        this.uwi = false;
        this.uwj = -1;
        this.uwk = -1;
        this.uwl = -1;
        this.uwp = false;
        this.uwq.clear();
        this.uwr.clear();
    }

    public void a(fhi_2 fhi_22) {
    }

    public void p(apd_1 apd_12) {
        ArrayList arrayList = apd_12.bEN();
        int n = arrayList != null ? arrayList.size() : 0;
        fiw_1<?> fiw_12 = fkc_2.gCQ().vR(apd_12.getName());
        for (int i = 0; i < n; ++i) {
            String string;
            apd_1 apd_13 = (apd_1)arrayList.get(i);
            String string2 = apd_13.getName();
            if (this.setXMLAttribute(string2, string = apd_13.bCt())) continue;
            fhq_2.a(this, fiw_12, string2, string);
        }
        this.guy();
    }

    public void a(apd_1 apd_12, fhv_1 fhv_12, Stack<fhs_2> stack, fhu_1 fhu_12) {
    }

    public void d(apd_1 apd_12, fhv_1 fhv_12, Stack<fhs_2> stack, fhu_1 fhu_12) {
    }

    public void e(apd_1 apd_12, fhv_1 fhv_12, Stack<fhs_2> stack, fhu_1 fhu_12) {
    }

    public void f(apd_1 apd_12, fhv_1 fhv_12, Stack<fhs_2> stack, fhu_1 fhu_12) {
    }

    public fhi_2 getNewElement(String string, fhv_1 fhv_12, Stack<fhs_2> stack, fhu_1 fhu_12) {
        fiw_1<?> fiw_12 = fkc_2.gCQ().vR(string);
        if (fiw_12 == null) {
            uvZ.error((Object)("Tag Inconnu : " + string));
            return null;
        }
        try {
            return (fhi_2)fiw_12.gBR();
        }
        catch (Exception exception) {
            uvZ.error((Object)new StringBuilder("Erreur lors de l'instanciation du tag ").append(string).append("."), (Throwable)exception);
            return null;
        }
    }

    public void b(apd_1 apd_12, fhv_1 fhv_12, Stack<fhs_2> stack, fhu_1 fhu_12) {
        ArrayList<? extends apd_1> arrayList = apd_12.getChildren();
        int n = arrayList.size();
        fhv_1 fhv_13 = this.getElementType() == fht_1.uxB ? (fhv_1)this : fhv_12;
        this.e(apd_12, fhv_12, stack, fhu_12);
        for (int i = 0; i < n; ++i) {
            fhi_2 fhi_22;
            apd_1 apd_13 = arrayList.get(i);
            String string = apd_13.getName();
            if (string.equals("#text") || string.equals("#comment") || (fhi_22 = this.getNewElement(string, fhv_13, stack, fhu_12)) == null) continue;
            fhi_22.a(apd_13, fhv_12, stack, fhu_12);
            fhi_22.p(apd_13);
            fhi_22.d(apd_13, fhv_12, stack, fhu_12);
            this.X(fhi_22);
            if (apd_13.fq("include") != null) {
                String string2 = apd_13.fq("includeId").bCt();
                if (string2 == null) {
                    uvZ.error((Object)"Pas d'id pour le tag Include, impossible de l'ajouter");
                    continue;
                }
                fhs_2 fhs_22 = stack.peek();
                String string3 = fhs_22 != null ? fhs_22.getId() : "";
                fhs_2 fhs_23 = fhu_12.uP(string3 + "." + string2);
                fhs_23.j(fhs_22);
                stack.push(fhs_23);
                fhi_22.b(apd_13, fhv_13, stack, fhu_12);
                stack.pop();
                continue;
            }
            fhi_22.b(apd_13, fhv_13, stack, fhu_12);
        }
        this.onChildrenAdded();
        this.f(apd_12, fhv_12, stack, fhu_12);
    }

    @Contract(value="_, null, null -> false")
    protected static <Type, I extends Iterable<Type>> boolean setIterableProperty(@Nullable Object object, @Nullable @Nullable Consumer<@Nullable Type[]> consumer, @Nullable Consumer<@NotNull I> consumer2) {
        if (consumer == null && consumer2 == null) {
            return false;
        }
        if (object == null) {
            if (consumer2 != null) {
                consumer2.accept(Collections.emptyList());
            } else {
                consumer.accept(null);
            }
            return true;
        }
        if (object.getClass().isArray()) {
            Object[] objectArray;
            try {
                objectArray = (Object[])object;
            }
            catch (ClassCastException classCastException) {
                uvZ.error((Object)"Array provided for content property have invalid content type (See exception related)", (Throwable)classCastException);
                return false;
            }
            if (consumer != null) {
                consumer.accept(objectArray);
            } else {
                consumer2.accept(Arrays.asList(objectArray));
            }
        } else {
            Set<Object> set;
            try {
                set = object instanceof Iterable ? (Set<Object>)object : Collections.singleton(object);
            }
            catch (ClassCastException classCastException) {
                uvZ.error((Object)"Value provided for content property have invalid content type (See exception related)", (Throwable)classCastException);
                return false;
            }
            if (consumer2 != null) {
                consumer2.accept(set);
            } else {
                uvZ.error((Object)String.format("Unable to convert %s (type: %s) to I from Type[], please provide an %s<I>", object, object.getClass(), Consumer.class));
            }
        }
        return true;
    }
}

