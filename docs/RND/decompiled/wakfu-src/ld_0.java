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
 * Renamed from ld
 */
public final class ld_0
extends GeneratedMessageV3
implements lg_0 {
    private static final long HH = 0L;
    int an;
    public static final int HI = 1;
    int HJ;
    public static final int HK = 2;
    int HL;
    private byte Y = (byte)-1;
    private static final ld_0 HM = new ld_0();
    @Deprecated
    public static final Parser<ld_0> HN = new le();

    ld_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ld_0() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ld_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ld_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    case 8: {
                        this.an |= 1;
                        this.HJ = codedInputStream.readInt32();
                        continue block12;
                    }
                    case 16: {
                        this.an |= 2;
                        this.HL = codedInputStream.readInt32();
                        continue block12;
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

    public static final Descriptors.Descriptor afk() {
        return kF.Ge;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.Gf.ensureFieldAccessorsInitialized(ld_0.class, lf_0.class);
    }

    @Override
    public boolean afl() {
        return (this.an & 1) != 0;
    }

    @Override
    public int afm() {
        return this.HJ;
    }

    @Override
    public boolean afn() {
        return (this.an & 2) != 0;
    }

    @Override
    public int afo() {
        return this.HL;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.afl()) {
            this.Y = 0;
            return false;
        }
        if (!this.afn()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.HJ);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.HL);
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.HJ);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.HL);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ld_0)) {
            return super.equals(object);
        }
        ld_0 ld_02 = (ld_0)object;
        if (this.afl() != ld_02.afl()) {
            return false;
        }
        if (this.afl() && this.afm() != ld_02.afm()) {
            return false;
        }
        if (this.afn() != ld_02.afn()) {
            return false;
        }
        if (this.afn() && this.afo() != ld_02.afo()) {
            return false;
        }
        return this.unknownFields.equals((Object)ld_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ld_0.afk().hashCode();
        if (this.afl()) {
            n = 37 * n + 1;
            n = 53 * n + this.afm();
        }
        if (this.afn()) {
            n = 37 * n + 2;
            n = 53 * n + this.afo();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ld_0 bL(ByteBuffer byteBuffer) {
        return (ld_0)HN.parseFrom(byteBuffer);
    }

    public static ld_0 bH(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ld_0)HN.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ld_0 cQ(ByteString byteString) {
        return (ld_0)HN.parseFrom(byteString);
    }

    public static ld_0 bH(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ld_0)HN.parseFrom(byteString, extensionRegistryLite);
    }

    public static ld_0 bI(byte[] byArray) {
        return (ld_0)HN.parseFrom(byArray);
    }

    public static ld_0 bH(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ld_0)HN.parseFrom(byArray, extensionRegistryLite);
    }

    public static ld_0 eo(InputStream inputStream) {
        return (ld_0)GeneratedMessageV3.parseWithIOException(HN, (InputStream)inputStream);
    }

    public static ld_0 eo(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ld_0)GeneratedMessageV3.parseWithIOException(HN, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ld_0 ep(InputStream inputStream) {
        return (ld_0)GeneratedMessageV3.parseDelimitedWithIOException(HN, (InputStream)inputStream);
    }

    public static ld_0 ep(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ld_0)GeneratedMessageV3.parseDelimitedWithIOException(HN, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ld_0 bH(CodedInputStream codedInputStream) {
        return (ld_0)GeneratedMessageV3.parseWithIOException(HN, (CodedInputStream)codedInputStream);
    }

    public static ld_0 gV(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ld_0)GeneratedMessageV3.parseWithIOException(HN, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public lf_0 afp() {
        return ld_0.afq();
    }

    public static lf_0 afq() {
        return HM.afr();
    }

    public static lf_0 c(ld_0 ld_02) {
        return HM.afr().e(ld_02);
    }

    public lf_0 afr() {
        return this == HM ? new lf_0() : new lf_0().e(this);
    }

    protected lf_0 bH(GeneratedMessageV3.BuilderParent builderParent) {
        lf_0 lf_02 = new lf_0(builderParent);
        return lf_02;
    }

    public static ld_0 afs() {
        return HM;
    }

    public static Parser<ld_0> z() {
        return HN;
    }

    public Parser<ld_0> getParserForType() {
        return HN;
    }

    public ld_0 aft() {
        return HM;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bH(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.afr();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.afp();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.afr();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.afp();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aft();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aft();
    }

    static /* synthetic */ boolean afu() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet d(ld_0 ld_02) {
        return ld_02.unknownFields;
    }
}

