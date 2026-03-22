/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fSf
 */
public final class fsf_1
implements fjl_2 {
    private static final Logger vcY = Logger.getLogger(fsf_1.class);
    public static final String vcZ = "/";
    private final String vda;
    private Object aGT;
    private boolean uEm;
    private final List<fsi_1<fhi_2>> vdb = Collections.synchronizedList(new ArrayList());
    private final ConcurrentLinkedQueue<fsg_1> vdc = new ConcurrentLinkedQueue();
    private final List<fsf_1> vdd = new ArrayList<fsf_1>();
    private fsf_1 vde;
    private final boolean vdf;
    private boolean vdg;
    private int vdh;
    private String vdi;
    private fhs_2 nQt;
    private final Collection<fsc_1> vdj = new ArrayList<fsc_1>();
    private boolean vdk;
    public static final String vdl = "#";

    public fsf_1(String string, fhs_2 fhs_22) {
        this(string, fhs_22, false);
    }

    public fsf_1(String string, fhs_2 fhs_22, boolean bl) {
        this.vda = string;
        this.vdf = bl;
        this.nQt = fhs_22;
        if (this.nQt != null) {
            this.nQt.b(this);
        }
    }

    public fsf_1(String string, fsf_1 fsf_12, String string2, fhs_2 fhs_22) {
        this(string, fhs_22, true);
        this.vdi = string2;
        if (fsf_12 != null) {
            fsf_12.f(this);
        }
    }

    public fsf_1(String string, fsf_1 fsf_12, int n, fhs_2 fhs_22) {
        this(string, fhs_22, true);
        this.vde = fsf_12;
        this.vdg = true;
        this.vdh = n;
    }

    public String getName() {
        return this.vda;
    }

    public String gFw() {
        return this.vdi;
    }

    public void c(fsc_1 fsc_12) {
        this.vdj.add(fsc_12);
    }

    public void d(fsc_1 fsc_12) {
        this.vdj.remove(fsc_12);
        if (this.vdj.isEmpty() && this.vdb.isEmpty() && this.vdd.isEmpty()) {
            fse_1.gFu().c(this);
        }
    }

    public void pn(boolean bl) {
        this.vdk = bl;
    }

    public void setElementMap(fhs_2 fhs_22) {
        this.nQt = fhs_22;
    }

    public boolean gFx() {
        return this.nQt != null;
    }

    public boolean gFy() {
        return this.uEm;
    }

    public fhs_2 getElementMap() {
        return this.nQt;
    }

    public Object getValue() {
        return this.aGT;
    }

    public String dCm() {
        return Bw.k(this.aGT);
    }

    public boolean gFz() {
        return Bw.l(this.aGT);
    }

    public int bGI() {
        return Bw.m(this.aGT);
    }

    public short bGG() {
        return Bw.r(this.aGT);
    }

    public double bGJ() {
        return Bw.n(this.aGT);
    }

    public float bGH() {
        return Bw.o(this.aGT);
    }

    public long bGK() {
        return Bw.p(this.aGT);
    }

    public boolean aJG() {
        if (this.aGT instanceof String) {
            return "".equals(this.aGT);
        }
        return this.aGT == null;
    }

    @Nullable
    public static Object a(Object object, String string) {
        if (object instanceof aef_2 && string != null) {
            azx_1<Object, String> azx_12 = fsf_1.b(object, string);
            if (azx_12.getFirst() instanceof aef_2 && azx_12.aHI() != null) {
                aef_2 aef_22 = (aef_2)azx_12.getFirst();
                return aef_22.eu(azx_12.aHI());
            }
            return null;
        }
        return object;
    }

    public static azx_1<Object, String> b(Object object, String string) {
        azx_1<Object, Object> azx_12 = new azx_1<Object, Object>(object, null);
        String[] stringArray = string.split(vcZ);
        for (int i = 0; i < stringArray.length - 1; ++i) {
            if (!(object instanceof aef_2) || stringArray[i] == null) {
                azx_12.N(null);
                return azx_12;
            }
            object = ((aef_2)object).eu(stringArray[i]);
            azx_12.Q(object);
        }
        azx_12.N(stringArray[stringArray.length - 1]);
        return azx_12;
    }

    private Object vZ(String string) {
        if (this.aGT instanceof aef_2 && string != null) {
            aef_2 aef_22 = (aef_2)this.aGT;
            return aef_22.eu(string);
        }
        return this.aGT;
    }

    private Object wa(String string) {
        String[] stringArray = string.split(vcZ);
        Object object = this.aGT;
        for (int i = 0; i < stringArray.length; ++i) {
            if (!(object instanceof aef_2) || stringArray[i] == null) {
                return object;
            }
            object = ((aef_2)object).eu(stringArray[i]);
        }
        return object;
    }

    public Object wb(String string) {
        return this.vZ(string);
    }

    public String wc(String string) {
        return Bw.k(this.vZ(string));
    }

    public int wd(String string) {
        return Bw.m(this.vZ(string));
    }

    public void gFA() {
        aef_2[] aef_2Array = null;
        if (this.aGT instanceof aef_2[]) {
            aef_2Array = (aef_2[])this.aGT;
        }
        int n = this.vdd.size();
        for (int i = 0; i < n; ++i) {
            fsf_1 fsf_12 = this.vdd.get(i);
            if (fsf_12.vdg && aef_2Array != null && aef_2Array.length > fsf_12.vdh) {
                fsf_12.a(aef_2Array[fsf_12.vdh], false);
                continue;
            }
            fsf_12.a(this.wa(fsf_12.gFw()), false);
        }
    }

    public void we(String string) {
        int n = this.vdd.size();
        for (int i = 0; i < n; ++i) {
            fsf_1 fsf_12 = this.vdd.get(i);
            if (!string.equals(fsf_12.vdi)) continue;
            fsf_12.a(this.wa(fsf_12.vdi), false);
        }
    }

    public void gFB() {
        fsg_1 fsg_12 = this.vdc.poll();
        while (fsg_12 != null) {
            fsg_12.vdn.a((fsg_1)null);
            switch (fsg_12.vdo.ordinal()) {
                case 0: {
                    this.d(fsg_12.vdn, fsg_12.aGT);
                    break;
                }
                case 2: {
                    this.e(fsg_12.vdn, fsg_12.aGT);
                    break;
                }
                case 1: {
                    this.f(fsg_12.vdn, fsg_12.aGT);
                }
            }
            fsg_12 = this.vdc.poll();
        }
    }

    public void a(fsi_1<fhi_2> fsi_12, boolean bl) {
        String string = fsi_12.gFJ().substring(0, fsi_12.gFJ().indexOf(vcZ));
        fsf_1 fsf_12 = null;
        for (fsf_1 fsf_13 : this.vdd) {
            if (!fsf_13.gFw().equalsIgnoreCase(string)) continue;
            fsf_12 = fsf_13;
            break;
        }
        if (fsf_12 == null) {
            fsf_12 = new fsf_1(fsf_1.a(this, string), this, string, this.nQt);
            fsf_12.a(this.wb(string), false);
            fse_1.gFu().b(fsf_12);
        }
        fsi_12.wh(fsi_12.gFJ().substring(fsi_12.gFJ().indexOf(vcZ) + 1));
        fsf_12.b(fsi_12, bl);
    }

    public void a(fsi_1<fhi_2> fsi_12) {
        this.b(fsi_12, true);
    }

    public void b(fsi_1<fhi_2> fsi_12, boolean bl) {
        Object object;
        if (fsi_12.gFJ() != null && fsi_12.gFJ().contains(vcZ)) {
            this.a(fsi_12, bl);
            return;
        }
        if (this.vdb.contains(fsi_12)) {
            vcY.error((Object)("Ajout d'un client \u00e0 une propri\u00e9t\u00e9 qui le contient d\u00e9j\u00e0 : " + String.valueOf(fsi_12)));
        } else {
            this.vdb.add(fsi_12);
            fsi_12.gFH().b(this);
        }
        if (fsi_12.getResultProvider() != null) {
            fsi_12.getResultProvider().setResultProviderParent(this);
        }
        if (fsi_12.gFK()) {
            object = new StringBuilder();
            ((StringBuilder)object).append(this.vda);
            if (fsi_12.gFJ() != null) {
                ((StringBuilder)object).append(vcZ).append(fsi_12.gFJ());
            }
            ((fiz_1)((Object)fsi_12.gFH())).setContentProperty(((StringBuilder)object).toString(), this.nQt);
        }
        if (this.uEm) {
            object = null;
            object = this.aGT instanceof aef_2 && fsi_12.gFJ() != null ? ((aef_2)this.aGT).eu(fsi_12.gFJ()) : this.aGT;
            if (bl) {
                if (fsi_12.getResultProvider() != null) {
                    object = fsi_12.getResultProvider().getResult(object);
                }
                this.d(fsi_12, object);
            } else {
                this.a(fsi_12, object);
            }
        }
    }

    public void an(fhi_2 fhi_22) {
        if (fhi_22 == null) {
            return;
        }
        Iterator<fsg_1> iterator = this.vdc.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().vdn.gFH() != fhi_22) continue;
            iterator.remove();
        }
        ArrayList<fsi_1<fhi_2>> arrayList = new ArrayList<fsi_1<fhi_2>>();
        for (fsi_1<fhi_2> fsi_12 : this.vdb) {
            if (!fsi_12.gFH().equals(fhi_22)) continue;
            arrayList.add(fsi_12);
            if (!fsi_12.gFK()) continue;
            ((fiz_1)((Object)fsi_12.gFH())).setContentProperty(null, null);
        }
        this.vdb.removeAll(arrayList);
        fhi_22.c(this);
        if (this.vdf && this.vdj.isEmpty() && this.vdb.isEmpty() && this.vdd.isEmpty()) {
            if (this.vde != null) {
                this.vde.g(this);
            }
            fse_1.gFu().c(this);
        }
    }

    public void f(fsf_1 fsf_12) {
        fsf_12.vde = this;
        this.vdd.add(fsf_12);
    }

    public void g(fsf_1 fsf_12) {
        this.vdd.remove(fsf_12);
        if (this.vdf && this.vdb.isEmpty() && this.vdd.isEmpty() && this.vde != null) {
            this.vde.g(this);
        }
    }

    public fsf_1 wf(String string) {
        assert (string != null) : "On essaye de r\u00e9cup\u00e9rer une propri\u00e9t\u00e9 enfant avec un nom null !";
        for (int i = this.vdd.size() - 1; i >= 0; --i) {
            fsf_1 fsf_12 = this.vdd.get(i);
            if (!string.equals(fsf_12.gFw())) continue;
            return fsf_12;
        }
        return null;
    }

    private void a(fsi_1<fhi_2> fsi_12, Object object) {
        fsg_1 fsg_12 = fsi_12.gFP();
        if (fsg_12 != null) {
            if (fsg_12.vdn == fsi_12 && fsg_12.vdo == fsh_1.vdp) {
                fsg_12.aGT = fsg_12.vdn.getResultProvider() != null ? fsg_12.vdn.getResultProvider().getResult(object) : object;
            }
        } else {
            this.vdc.offer(new fsg_1(fsi_12, object, fsh_1.vdp));
        }
        fse_1.gFu().e(this);
    }

    private void b(fsi_1<fhi_2> fsi_12, Object object) {
        this.vdc.offer(new fsg_1(fsi_12, object, fsh_1.vdq));
        fse_1.gFu().e(this);
    }

    private void c(fsi_1<fhi_2> fsi_12, Object object) {
        this.vdc.offer(new fsg_1(fsi_12, object, fsh_1.vdr));
        fse_1.gFu().e(this);
    }

    private void d(fsi_1<fhi_2> fsi_12, Object object) {
        try {
            int n = fsi_12.getAttributeHash();
            if (object instanceof String && 3355 != n && 3556653 != n && 111972721 != n && -691307374 != n ? fsi_12.gFH().setXMLAttribute(fsi_12.getAttribute(), (String)object) : fsi_12.gFH().setPropertyAttribute(fsi_12.getAttribute(), object)) {
                return;
            }
            Method method = fsi_12.gFL();
            if (method == null || !ftb_1.a(method, object)) {
                method = fsi_12.gFI().e(fsi_12.getAttribute(), object == null ? null : object.getClass());
            }
            if (method != null) {
                this.a(method, fsi_12, object);
            } else {
                vcY.error((Object)("[" + this.vda + "]Impossible de trouver la m\u00e9thode set" + fsi_12.getAttribute() + " dans " + String.valueOf(fsi_12.gFH()) + " avec la classe " + String.valueOf(object == null ? null : object.getClass())));
            }
        }
        catch (Throwable throwable) {
            vcY.error((Object)"Exception dans Property : ", throwable);
        }
    }

    private void e(fsi_1<fhi_2> fsi_12, Object object) {
        try {
            int n = fsi_12.getAttributeHash();
            if (object instanceof String && 3355 != n && 3556653 != n && 111972721 != n && -691307374 != n ? fsi_12.gFH().aG(fsi_12.getAttribute(), (String)object) : fsi_12.gFH().m(fsi_12.getAttribute(), object)) {
                return;
            }
            Method method = fsi_12.gFN();
            if (!ftb_1.a(method, object)) {
                method = fsi_12.gFI().h(fsi_12.getAttribute(), object == null ? null : object.getClass());
            }
            if (method != null) {
                this.a(method, fsi_12, object);
            } else {
                vcY.error((Object)("Impossible de trouver la m\u00e9thode prepend" + fsi_12.getAttribute() + " avec la classe " + String.valueOf(object == null ? null : object.getClass())));
            }
        }
        catch (Throwable throwable) {
            vcY.error((Object)"Exception dans Property : ", throwable);
        }
    }

    private void f(fsi_1<fhi_2> fsi_12, Object object) {
        try {
            int n = fsi_12.getAttributeHash();
            if (object instanceof String && 3355 != n && 3556653 != n && 111972721 != n && -691307374 != n ? fsi_12.gFH().aF(fsi_12.getAttribute(), (String)object) : fsi_12.gFH().l(fsi_12.getAttribute(), object)) {
                return;
            }
            Method method = fsi_12.gFM();
            if (!ftb_1.a(method, object)) {
                method = fsi_12.gFI().g(fsi_12.getAttribute(), object == null ? null : object.getClass());
            }
            if (method != null) {
                this.a(method, fsi_12, object);
            } else {
                vcY.error((Object)("Impossible de trouver la m\u00e9thode append" + fsi_12.getAttribute() + " dans " + String.valueOf(fsi_12.gFH()) + " avec la classe " + String.valueOf(object == null ? null : object.getClass())));
            }
        }
        catch (Throwable throwable) {
            vcY.error((Object)"Exception dans Property : ", throwable);
        }
    }

    private void a(Method method, fsi_1<fhi_2> fsi_12, Object object) {
        try {
            if (method.getParameterTypes().length == 0) {
                return;
            }
            ftb_1.a(method, (Object)fsi_12.gFH(), new Object[]{object});
        }
        catch (IllegalArgumentException illegalArgumentException) {
            vcY.error((Object)("Exception illegalArgument : " + String.valueOf(illegalArgumentException)));
        }
        catch (Exception exception) {
            vcY.error((Object)("[" + exception.getClass().getSimpleName() + "] Erreur lors du InvokeMethodAccessor - Method=" + (method == null ? "null" : method.getName()) + " - PropertyClientData = " + String.valueOf(fsi_12) + " - Value = " + String.valueOf(object)));
        }
    }

    public void a(Object object, boolean bl) {
        if (!this.uEm) {
            this.uEm = true;
            fse_1.gFu().a(fsm_2.vdL, this);
        }
        if (!bl && object == this.aGT) {
            return;
        }
        this.aGT = object;
        if (this.vdk) {
            fse_1.gFu().a(fsm_2.vdM, this);
        }
        this.gFA();
        for (fsi_1<fhi_2> fsi_12 : this.vdb) {
            String string = fsi_12.gFJ();
            if (object instanceof aef_2 && string != null) {
                aef_2 aef_22 = (aef_2)object;
                Object object2 = aef_22.eu(string);
                this.a(fsi_12, object2);
                continue;
            }
            this.a(fsi_12, object);
        }
    }

    public void c(String string, Object object) {
        if (this.aGT instanceof aef_2 && string != null) {
            aef_2 aef_22 = (aef_2)this.aGT;
            aef_22.c(string, object);
            for (fsi_1<fhi_2> fsi_12 : this.vdb) {
                String string2 = fsi_12.gFJ();
                if (string2 == null || !string2.equals(string)) continue;
                this.a(fsi_12, object);
            }
        }
    }

    public void wg(String string) {
        this.a(string, null);
    }

    public void a(String string, aah_1<Object> aah_12) {
        this.a(new String[]{string}, aah_12);
    }

    public void a(String[] stringArray, aah_1<Object> aah_12) {
        if (!(this.aGT instanceof aef_2)) {
            return;
        }
        fsi_1[] fsi_1Array = new fsi_1[this.vdb.size()];
        this.vdb.toArray(fsi_1Array);
        int n = stringArray.length;
        for (int i = 0; i < n; ++i) {
            this.a(aah_12, fsi_1Array, stringArray[i]);
            this.we(stringArray[i]);
        }
    }

    private void a(aah_1<Object> aah_12, fsi_1<fhi_2>[] fsi_1Array, String string) {
        aef_2 aef_22 = (aef_2)this.aGT;
        int n = string != null ? string.hashCode() : 0;
        Object object = aah_12 != null ? aah_12.vK(n) : null;
        boolean bl = object != null;
        for (fsi_1<fhi_2> fsi_12 : fsi_1Array) {
            if (string == null || !string.equals(fsi_12.gFJ())) continue;
            if (!bl) {
                object = aef_22.eu(string);
                if (aah_12 != null) {
                    aah_12.b(n, object);
                }
                bl = true;
            }
            this.a(fsi_12, object);
        }
    }

    @Override
    public void a(fjj_2 fjj_22) {
        if (this.aGT instanceof aef_2) {
            aef_2 aef_22 = (aef_2)this.aGT;
            for (fsi_1<fhi_2> fsi_12 : this.vdb) {
                if (fsi_12.getResultProvider() != fjj_22) continue;
                String string = fsi_12.gFJ();
                if (string != null) {
                    this.a(fsi_12, aef_22.eu(string));
                    continue;
                }
                this.a(fsi_12, this.aGT);
            }
            this.gFA();
        } else if (this.uEm) {
            for (fsi_1<fhi_2> fsi_13 : this.vdb) {
                if (fsi_13.getResultProvider() != fjj_22) continue;
                this.a(fsi_13, this.aGT);
            }
        }
    }

    public void d(String string, Object object) {
        if (!(this.aGT instanceof aef_2)) {
            return;
        }
        aef_2 aef_22 = (aef_2)this.aGT;
        aef_22.d(string, object);
        for (fsi_1<fhi_2> fsi_12 : this.vdb) {
            if (!fsi_12.gFJ().equals(string)) continue;
            this.c(fsi_12, object);
        }
    }

    public void e(String string, Object object) {
        if (!(this.aGT instanceof aef_2)) {
            return;
        }
        aef_2 aef_22 = (aef_2)this.aGT;
        aef_22.e(string, object);
        for (fsi_1<fhi_2> fsi_12 : this.vdb) {
            if (!fsi_12.gFJ().equals(string)) continue;
            this.b(fsi_12, object);
        }
    }

    public void gFC() {
        if (this.aGT instanceof aef_2) {
            this.gFD();
        } else {
            this.gFE();
        }
    }

    private void gFD() {
        if (this.aGT == null) {
            return;
        }
        aef_2 aef_22 = (aef_2)this.aGT;
        String[] stringArray = aef_22.bxk();
        if (stringArray == null) {
            return;
        }
        for (String string : stringArray) {
            if (string == null) continue;
            Object object = null;
            if (!aef_22.hP(string)) {
                object = aef_22.eu(string);
            }
            for (int i = this.vdb.size() - 1; i >= 0; --i) {
                fsi_1<fhi_2> fsi_12 = this.vdb.get(i);
                String string2 = fsi_12.gFJ();
                if (string2 == null || !string2.equals(string)) continue;
                if (object == null) {
                    Method method = fsi_12.gFI().f(fsi_12.getAttribute(), null);
                    try {
                        object = method.invoke((Object)fsi_12.gFH(), new Object[0]);
                        aef_22.c(string, object);
                    }
                    catch (Exception exception) {
                        if (fsi_12.gFH() == null) {
                            vcY.error((Object)("[fieldProviderSynchronize] PropertyClientData avec un element null : field = " + fsi_12.gFJ()));
                            continue;
                        }
                        if (method == null) {
                            vcY.error((Object)("[fieldProviderSynchronize] La m\u00e9thode " + fsi_12.gFH().getClass().getName() + ".get" + fsi_12.getAttribute() + "() n'existe pas, impossible de la charger"));
                            continue;
                        }
                        vcY.error((Object)"Exception during fieldProviderSynchronize", (Throwable)exception);
                    }
                    continue;
                }
                this.a(fsi_12, object);
            }
        }
    }

    private void gFE() {
        if (this.vdb.isEmpty()) {
            return;
        }
        fsi_1<fhi_2> fsi_12 = this.vdb.get(this.vdb.size() - 1);
        Class<?> clazz = this.aGT == null ? null : this.aGT.getClass();
        Method method = fsi_12.gFI().f(fsi_12.getAttribute(), clazz);
        if (method == null) {
            return;
        }
        try {
            this.aGT = method.invoke((Object)fsi_12.gFH(), new Object[0]);
            if (!this.uEm) {
                this.uEm = true;
                fse_1.gFu().a(fsm_2.vdL, this);
            }
            if (this.vdk) {
                fse_1.gFu().a(fsm_2.vdM, this);
            }
            this.gFA();
            for (int i = 0; i < this.vdb.size() - 1; ++i) {
                fsi_1<fhi_2> fsi_13 = this.vdb.get(i);
                this.a(fsi_13, this.aGT);
            }
        }
        catch (Exception exception) {
            vcY.error((Object)("Impossible de synchroniser la propri\u00e9t\u00e9 " + this.vda + " avec " + fsi_12.gFH().getClass().getName() + ", l'attribut " + fsi_12.getAttribute() + " est incompatible !"));
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Property name=").append(this.vda);
        if (this.nQt != null) {
            stringBuilder.append(" elementMap=").append(this.nQt.getId());
        }
        stringBuilder.append(" value=").append(this.aGT);
        return stringBuilder.toString();
    }

    private static String a(fsf_1 fsf_12, String string) {
        return fsf_12.vda + vdl + string;
    }

    public boolean gFF() {
        return this.vde != null;
    }
}

