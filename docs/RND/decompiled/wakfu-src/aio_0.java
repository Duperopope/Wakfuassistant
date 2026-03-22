/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.kohsuke.args4j.Option
 */
import org.jetbrains.annotations.Nullable;
import org.kohsuke.args4j.Option;

/*
 * Renamed from aIo
 */
public final class aio_0 {
    @Option(name="-c", aliases={"--config-file-path"}, usage="Configuration file path")
    @euL(fdo="WAKFU_CONFIG_FILE_PATH")
    private String dXo;
    @Option(name="-p", aliases={"--pref-file-directory", "--data-dir"}, usage="Directory containing preferences files")
    @euL(fdo="WAKFU_PREF_FILE_DIRECTORY")
    private String dXp;
    @Option(name="-n", aliases={"--cache-file-directory-"}, usage="Directory containing cache files")
    @euL(fdo="WAKFU_CACHE_FILE_DIRECTORY")
    private String dXq;
    @Option(name="-L", aliases={"--lang"}, usage="Language code for session")
    @euL(fdo="WAKFU_LANGUAGE")
    private String dXr;
    @Option(name="-C", aliases={"--country"}, usage="Country code for session")
    private String dXs;
    @Option(name="--install-folder", usage="Local path of installation")
    private String dXt;
    @Option(name="--updater-service-port", usage="Port to use for communication with updater", hidden=true)
    private int dXu;
    @Option(name="--update-state", usage="Initial update state (updating, uptodate) to consider", hidden=true)
    private String dXv;
    @Option(name="-P", aliases={"--active-profiler"}, usage="Active profiler", hidden=true)
    private boolean dXw;
    @Option(name="-T", aliases={"--particle-light-debug"}, usage="Active debugging of particle and light", hidden=true)
    private boolean dXx;
    @Option(name="-R", aliases={"--render-tree-debug"}, usage="Active debugging of render tree", hidden=true)
    private boolean dXy;
    @Option(name="-M", aliases={"--mem-pool-objects-debug"}, usage="Active debugging of memory pool objects", hidden=true)
    private boolean dXz;
    @Option(name="-t", aliases={"--pathfinding-debug"}, usage="Active debugging of pathfinding", hidden=true)
    private boolean dXA;
    @Option(name="-ugl", aliases={"--show-unsupported-gl-dialog"}, usage="Show unsupported GL Dialog", hidden=true)
    private boolean dXj;
    @Option(name="-esdl", aliases={"--enable-shopi-debug-logs"}, usage="Enable additionnal logs related to Shopi", hidden=true)
    private boolean dXB;
    @Option(name="-ewtdl", aliases={"--enable-web-tokens-debug-logs"}, usage="Enable additionnal logs related to Web tokens", hidden=true)
    private boolean dXC;
    @Option(name="-dscdoe", aliases={"--disable-shopi-cart-deletion-on-error"}, usage="Disable deletion of cart after an error during shopi process", hidden=true)
    private boolean dXD;
    @Option(name="-su", aliases={"--shop-used"}, usage="Specify shop to use (default: Use shop specified in sysconf) (values: '', haapi, shopi)", hidden=true)
    private String dXE;
    @Option(name="-exdll", aliases={"--enable-xulor-dialog-load-logs"}, usage="Enable xulor logs about load of dialogs", hidden=true)
    private boolean dXF;
    @Option(name="-doglc", aliases={"--debug-opengl-calls"}, usage="Enable debug of OpenGL calls", hidden=true)
    private boolean dXG;
    @Option(name="-tffoglc", aliases={"--trace-file-for-opengl-calls"}, usage="File used to trace OpenGL calls", hidden=true)
    private String dXH;
    @Option(name="-etdmal", aliases={"--enable-tree-depth-manager-additional-logs"}, usage="Enable TreeDepthManager additional logs", hidden=true)
    private boolean dXI;
    @Option(name="-ds", aliases={"--disable-sound"}, usage="Disable sounds", hidden=true)
    private boolean dXJ;
    @Option(name="-dv", aliases={"--disable-video-cinematics"}, usage="Disable video cinematics", hidden=true)
    private boolean dXK;
    @Option(name="-eoaldm", aliases={"--enable-openal-debug-messages"}, usage="Enable debug messages from OpenAL", hidden=true)
    private boolean dXL;
    @Option(name="--partner", usage="Partner (values : steam)", hidden=true)
    private String dXM;
    @Option(name="--app-id", usage="Use by updater to identify clients")
    private String dXN;

    public String cfQ() {
        return this.dXo;
    }

    public String cfR() {
        return this.dXp;
    }

    public String cfS() {
        return this.dXq;
    }

    public String cfT() {
        return this.dXr;
    }

    public String cfU() {
        return this.dXs;
    }

    public boolean cfV() {
        return this.dXw;
    }

    public boolean cfW() {
        return this.dXx;
    }

    public boolean cfX() {
        return this.dXy;
    }

    boolean cfY() {
        return this.dXz;
    }

    public boolean cfZ() {
        return this.dXA;
    }

    @Nullable
    public String cga() {
        return this.dXt == null || this.dXt.endsWith("/") ? this.dXt : this.dXt + "/";
    }

    public int cgb() {
        return this.dXu;
    }

    public String cgc() {
        return this.dXv;
    }

    public String cgd() {
        return this.dXM;
    }

    public boolean cge() {
        return this.dXj;
    }

    public boolean cgf() {
        return this.dXB;
    }

    public boolean cgg() {
        return this.dXC;
    }

    public boolean cgh() {
        return this.dXD;
    }

    public String cgi() {
        return this.dXE;
    }

    public boolean cgj() {
        return this.dXF;
    }

    public boolean cgk() {
        return this.dXG;
    }

    public boolean cgl() {
        return this.cgm() != null;
    }

    public String cgm() {
        return this.dXH;
    }

    public boolean cgn() {
        return this.dXI;
    }

    public boolean cgo() {
        return this.dXJ;
    }

    public boolean cgp() {
        return this.dXK;
    }

    public boolean cgq() {
        return this.dXL;
    }
}

