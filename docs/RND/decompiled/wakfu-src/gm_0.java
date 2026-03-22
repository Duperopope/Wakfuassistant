/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.GeneratedMessageV3$UnusedPrivateParameter
 *  com.google.protobuf.Internal
 *  com.google.protobuf.Internal$LongList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UninitializedMessageException
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/*
 * Renamed from gM
 */
public final class gm_0
extends GeneratedMessageV3
implements gp_1 {
    private static final long sW = 0L;
    int an;
    public static final int sX = 1;
    int sY;
    public static final int sZ = 2;
    int ta;
    public static final int tb = 3;
    boolean tc;
    public static final int td = 4;
    boolean te;
    public static final int tf = 5;
    boolean tg;
    public static final int th = 6;
    boolean ti;
    public static final int tj = 7;
    Internal.LongList tk;
    public static final int tl = 8;
    int kW;
    private byte Y = (byte)-1;
    private static final gm_0 tm = new gm_0();
    @Deprecated
    public static final Parser<gm_0> tn = new gn_0();

    gm_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private gm_0() {
        this.tk = gm_0.emptyLongList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new gm_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    gm_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block19: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block19;
                    }
                    case 8: {
                        this.an |= 1;
                        this.sY = codedInputStream.readInt32();
                        continue block19;
                    }
                    case 16: {
                        this.an |= 2;
                        this.ta = codedInputStream.readInt32();
                        continue block19;
                    }
                    case 24: {
                        this.an |= 4;
                        this.tc = codedInputStream.readBool();
                        continue block19;
                    }
                    case 32: {
                        this.an |= 8;
                        this.te = codedInputStream.readBool();
                        continue block19;
                    }
                    case 40: {
                        this.an |= 0x10;
                        this.tg = codedInputStream.readBool();
                        continue block19;
                    }
                    case 48: {
                        this.an |= 0x20;
                        this.ti = codedInputStream.readBool();
                        continue block19;
                    }
                    case 56: {
                        if ((n & 0x40) == 0) {
                            this.tk = gm_0.newLongList();
                            n |= 0x40;
                        }
                        this.tk.addLong(codedInputStream.readInt64());
                        continue block19;
                    }
                    case 58: {
                        int n3 = codedInputStream.readRawVarint32();
                        int n4 = codedInputStream.pushLimit(n3);
                        if ((n & 0x40) == 0 && codedInputStream.getBytesUntilLimit() > 0) {
                            this.tk = gm_0.newLongList();
                            n |= 0x40;
                        }
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            this.tk.addLong(codedInputStream.readInt64());
                        }
                        codedInputStream.popLimit(n4);
                        continue block19;
                    }
                    case 64: {
                        this.an |= 0x40;
                        this.kW = codedInputStream.readInt32();
                        continue block19;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue;
                bl = true;
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (UninitializedMessageException uninitializedMessageException) {
            throw uninitializedMessageException.asInvalidProtocolBufferException().setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if ((n & 0x40) != 0) {
                this.tk.makeImmutable();
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor Fo() {
        return gl_0.sQ;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gl_0.sR.ensureFieldAccessorsInitialized(gm_0.class, go_1.class);
    }

    @Override
    public boolean Fp() {
        return (this.an & 1) != 0;
    }

    @Override
    public int Fq() {
        return this.sY;
    }

    @Override
    public boolean Fr() {
        return (this.an & 2) != 0;
    }

    @Override
    public int Fs() {
        return this.ta;
    }

    @Override
    public boolean Ft() {
        return (this.an & 4) != 0;
    }

    @Override
    public boolean Fu() {
        return this.tc;
    }

    @Override
    public boolean Fv() {
        return (this.an & 8) != 0;
    }

    @Override
    public boolean Fw() {
        return this.te;
    }

    @Override
    public boolean Fx() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public boolean Fy() {
        return this.tg;
    }

    @Override
    public boolean Fz() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public boolean FA() {
        return this.ti;
    }

    @Override
    public List<Long> FB() {
        return this.tk;
    }

    @Override
    public int FC() {
        return this.tk.size();
    }

    @Override
    public long de(int n) {
        return this.tk.getLong(n);
    }

    @Override
    public boolean rH() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public int rI() {
        return this.kW;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.Fp()) {
            this.Y = 0;
            return false;
        }
        if (!this.Fr()) {
            this.Y = 0;
            return false;
        }
        if (!this.Ft()) {
            this.Y = 0;
            return false;
        }
        if (!this.Fv()) {
            this.Y = 0;
            return false;
        }
        if (!this.Fx()) {
            this.Y = 0;
            return false;
        }
        if (!this.Fz()) {
            this.Y = 0;
            return false;
        }
        if (!this.rH()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.sY);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.ta);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeBool(3, this.tc);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeBool(4, this.te);
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeBool(5, this.tg);
        }
        if ((this.an & 0x20) != 0) {
            codedOutputStream.writeBool(6, this.ti);
        }
        for (int i = 0; i < this.tk.size(); ++i) {
            codedOutputStream.writeInt64(7, this.tk.getLong(i));
        }
        if ((this.an & 0x40) != 0) {
            codedOutputStream.writeInt32(8, this.kW);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.sY);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.ta);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeBoolSize((int)3, (boolean)this.tc);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeBoolSize((int)4, (boolean)this.te);
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeBoolSize((int)5, (boolean)this.tg);
        }
        if ((this.an & 0x20) != 0) {
            n += CodedOutputStream.computeBoolSize((int)6, (boolean)this.ti);
        }
        int n2 = 0;
        for (int i = 0; i < this.tk.size(); ++i) {
            n2 += CodedOutputStream.computeInt64SizeNoTag((long)this.tk.getLong(i));
        }
        n += n2;
        n += 1 * this.FB().size();
        if ((this.an & 0x40) != 0) {
            n += CodedOutputStream.computeInt32Size((int)8, (int)this.kW);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof gm_0)) {
            return super.equals(object);
        }
        gm_0 gm_02 = (gm_0)object;
        if (this.Fp() != gm_02.Fp()) {
            return false;
        }
        if (this.Fp() && this.Fq() != gm_02.Fq()) {
            return false;
        }
        if (this.Fr() != gm_02.Fr()) {
            return false;
        }
        if (this.Fr() && this.Fs() != gm_02.Fs()) {
            return false;
        }
        if (this.Ft() != gm_02.Ft()) {
            return false;
        }
        if (this.Ft() && this.Fu() != gm_02.Fu()) {
            return false;
        }
        if (this.Fv() != gm_02.Fv()) {
            return false;
        }
        if (this.Fv() && this.Fw() != gm_02.Fw()) {
            return false;
        }
        if (this.Fx() != gm_02.Fx()) {
            return false;
        }
        if (this.Fx() && this.Fy() != gm_02.Fy()) {
            return false;
        }
        if (this.Fz() != gm_02.Fz()) {
            return false;
        }
        if (this.Fz() && this.FA() != gm_02.FA()) {
            return false;
        }
        if (!this.FB().equals(gm_02.FB())) {
            return false;
        }
        if (this.rH() != gm_02.rH()) {
            return false;
        }
        if (this.rH() && this.rI() != gm_02.rI()) {
            return false;
        }
        return this.unknownFields.equals((Object)gm_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + gm_0.Fo().hashCode();
        if (this.Fp()) {
            n = 37 * n + 1;
            n = 53 * n + this.Fq();
        }
        if (this.Fr()) {
            n = 37 * n + 2;
            n = 53 * n + this.Fs();
        }
        if (this.Ft()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashBoolean((boolean)this.Fu());
        }
        if (this.Fv()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashBoolean((boolean)this.Fw());
        }
        if (this.Fx()) {
            n = 37 * n + 5;
            n = 53 * n + Internal.hashBoolean((boolean)this.Fy());
        }
        if (this.Fz()) {
            n = 37 * n + 6;
            n = 53 * n + Internal.hashBoolean((boolean)this.FA());
        }
        if (this.FC() > 0) {
            n = 37 * n + 7;
            n = 53 * n + this.FB().hashCode();
        }
        if (this.rH()) {
            n = 37 * n + 8;
            n = 53 * n + this.rI();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static gm_0 aL(ByteBuffer byteBuffer) {
        return (gm_0)tn.parseFrom(byteBuffer);
    }

    public static gm_0 aH(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (gm_0)tn.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static gm_0 bA(ByteString byteString) {
        return (gm_0)tn.parseFrom(byteString);
    }

    public static gm_0 aH(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (gm_0)tn.parseFrom(byteString, extensionRegistryLite);
    }

    public static gm_0 aI(byte[] byArray) {
        return (gm_0)tn.parseFrom(byArray);
    }

    public static gm_0 aH(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (gm_0)tn.parseFrom(byArray, extensionRegistryLite);
    }

    public static gm_0 co(InputStream inputStream) {
        return (gm_0)GeneratedMessageV3.parseWithIOException(tn, (InputStream)inputStream);
    }

    public static gm_0 co(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gm_0)GeneratedMessageV3.parseWithIOException(tn, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gm_0 cp(InputStream inputStream) {
        return (gm_0)GeneratedMessageV3.parseDelimitedWithIOException(tn, (InputStream)inputStream);
    }

    public static gm_0 cp(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gm_0)GeneratedMessageV3.parseDelimitedWithIOException(tn, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gm_0 aH(CodedInputStream codedInputStream) {
        return (gm_0)GeneratedMessageV3.parseWithIOException(tn, (CodedInputStream)codedInputStream);
    }

    public static gm_0 dV(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gm_0)GeneratedMessageV3.parseWithIOException(tn, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public go_1 FD() {
        return gm_0.FE();
    }

    public static go_1 FE() {
        return tm.FF();
    }

    public static go_1 a(gm_0 gm_02) {
        return tm.FF().c(gm_02);
    }

    public go_1 FF() {
        return this == tm ? new go_1() : new go_1().c(this);
    }

    protected go_1 aH(GeneratedMessageV3.BuilderParent builderParent) {
        go_1 go_12 = new go_1(builderParent);
        return go_12;
    }

    public static gm_0 FG() {
        return tm;
    }

    public static Parser<gm_0> z() {
        return tn;
    }

    public Parser<gm_0> getParserForType() {
        return tn;
    }

    public gm_0 FH() {
        return tm;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aH(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.FF();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.FD();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.FF();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.FD();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.FH();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.FH();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ Internal.LongList FI() {
        return gm_0.emptyLongList();
    }

    static /* synthetic */ UnknownFieldSet b(gm_0 gm_02) {
        return gm_02.unknownFields;
    }

    static /* synthetic */ Internal.LongList FJ() {
        return gm_0.emptyLongList();
    }

    static /* synthetic */ Internal.LongList a(Internal.LongList longList) {
        return gm_0.mutableCopy((Internal.LongList)longList);
    }

    static /* synthetic */ Internal.LongList FK() {
        return gm_0.emptyLongList();
    }
}

