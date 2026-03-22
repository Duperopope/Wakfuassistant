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
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from lJ
 */
public final class lj_0
extends GeneratedMessageV3
implements lm_1 {
    private static final long IY = 0L;
    int an;
    public static final int IZ = 10;
    int ws;
    public static final int Ja = 11;
    int Jb;
    public static final int Jc = 12;
    int Jd;
    public static final int Je = 14;
    int Jf;
    private byte Y = (byte)-1;
    private static final lj_0 Jg = new lj_0();
    @Deprecated
    public static final Parser<lj_0> Jh = new lk_0();

    lj_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private lj_0() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new lj_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    lj_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block14: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block14;
                    }
                    case 80: {
                        this.an |= 1;
                        this.ws = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 88: {
                        this.an |= 2;
                        this.Jb = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 96: {
                        this.an |= 4;
                        this.Jd = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 112: {
                        this.an |= 8;
                        this.Jf = codedInputStream.readInt32();
                        continue block14;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
                bl2 = true;
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
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor aip() {
        return kF.FW;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.FX.ensureFieldAccessorsInitialized(lj_0.class, ll_1.class);
    }

    @Override
    public boolean Ly() {
        return (this.an & 1) != 0;
    }

    @Override
    public int Lz() {
        return this.ws;
    }

    @Override
    public boolean aiq() {
        return (this.an & 2) != 0;
    }

    @Override
    public int air() {
        return this.Jb;
    }

    @Override
    public boolean ais() {
        return (this.an & 4) != 0;
    }

    @Override
    public int ait() {
        return this.Jd;
    }

    @Override
    public boolean aiu() {
        return (this.an & 8) != 0;
    }

    @Override
    public int aiv() {
        return this.Jf;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.Ly()) {
            this.Y = 0;
            return false;
        }
        if (!this.aiq()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(10, this.ws);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(11, this.Jb);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(12, this.Jd);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeInt32(14, this.Jf);
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
            n += CodedOutputStream.computeInt32Size((int)10, (int)this.ws);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)11, (int)this.Jb);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)12, (int)this.Jd);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeInt32Size((int)14, (int)this.Jf);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof lj_0)) {
            return super.equals(object);
        }
        lj_0 lj_02 = (lj_0)object;
        if (this.Ly() != lj_02.Ly()) {
            return false;
        }
        if (this.Ly() && this.Lz() != lj_02.Lz()) {
            return false;
        }
        if (this.aiq() != lj_02.aiq()) {
            return false;
        }
        if (this.aiq() && this.air() != lj_02.air()) {
            return false;
        }
        if (this.ais() != lj_02.ais()) {
            return false;
        }
        if (this.ais() && this.ait() != lj_02.ait()) {
            return false;
        }
        if (this.aiu() != lj_02.aiu()) {
            return false;
        }
        if (this.aiu() && this.aiv() != lj_02.aiv()) {
            return false;
        }
        return this.unknownFields.equals((Object)lj_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + lj_0.aip().hashCode();
        if (this.Ly()) {
            n = 37 * n + 10;
            n = 53 * n + this.Lz();
        }
        if (this.aiq()) {
            n = 37 * n + 11;
            n = 53 * n + this.air();
        }
        if (this.ais()) {
            n = 37 * n + 12;
            n = 53 * n + this.ait();
        }
        if (this.aiu()) {
            n = 37 * n + 14;
            n = 53 * n + this.aiv();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static lj_0 bT(ByteBuffer byteBuffer) {
        return (lj_0)Jh.parseFrom(byteBuffer);
    }

    public static lj_0 bP(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (lj_0)Jh.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static lj_0 cZ(ByteString byteString) {
        return (lj_0)Jh.parseFrom(byteString);
    }

    public static lj_0 bP(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (lj_0)Jh.parseFrom(byteString, extensionRegistryLite);
    }

    public static lj_0 bQ(byte[] byArray) {
        return (lj_0)Jh.parseFrom(byArray);
    }

    public static lj_0 bP(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (lj_0)Jh.parseFrom(byArray, extensionRegistryLite);
    }

    public static lj_0 eE(InputStream inputStream) {
        return (lj_0)GeneratedMessageV3.parseWithIOException(Jh, (InputStream)inputStream);
    }

    public static lj_0 eE(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lj_0)GeneratedMessageV3.parseWithIOException(Jh, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lj_0 eF(InputStream inputStream) {
        return (lj_0)GeneratedMessageV3.parseDelimitedWithIOException(Jh, (InputStream)inputStream);
    }

    public static lj_0 eF(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lj_0)GeneratedMessageV3.parseDelimitedWithIOException(Jh, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lj_0 bP(CodedInputStream codedInputStream) {
        return (lj_0)GeneratedMessageV3.parseWithIOException(Jh, (CodedInputStream)codedInputStream);
    }

    public static lj_0 ht(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lj_0)GeneratedMessageV3.parseWithIOException(Jh, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ll_1 aiw() {
        return lj_0.aix();
    }

    public static ll_1 aix() {
        return Jg.aiy();
    }

    public static ll_1 b(lj_0 lj_02) {
        return Jg.aiy().d(lj_02);
    }

    public ll_1 aiy() {
        return this == Jg ? new ll_1() : new ll_1().d(this);
    }

    protected ll_1 bP(GeneratedMessageV3.BuilderParent builderParent) {
        ll_1 ll_12 = new ll_1(builderParent);
        return ll_12;
    }

    public static lj_0 aiz() {
        return Jg;
    }

    public static Parser<lj_0> z() {
        return Jh;
    }

    public Parser<lj_0> getParserForType() {
        return Jh;
    }

    public lj_0 aiA() {
        return Jg;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bP(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aiy();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aiw();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aiy();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aiw();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aiA();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aiA();
    }

    static /* synthetic */ boolean el() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet c(lj_0 lj_02) {
        return lj_02.unknownFields;
    }
}

