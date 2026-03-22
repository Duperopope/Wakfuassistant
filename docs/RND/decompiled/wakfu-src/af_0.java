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
 * Renamed from AF
 */
public final class af_0
extends GeneratedMessageV3
implements AI {
    private static final long aqX = 0L;
    int an;
    public static final int aqY = 1;
    int aqZ;
    public static final int ara = 2;
    int arb;
    private byte Y = (byte)-1;
    private static final af_0 arc = new af_0();
    @Deprecated
    public static final Parser<af_0> ard = new AG();

    af_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private af_0() {
        this.aqZ = 1;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new af_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    af_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        int n2 = codedInputStream.readEnum();
                        aq_0 aq_02 = aq_0.lu(n2);
                        if (aq_02 == null) {
                            builder.mergeVarintField(1, n2);
                            continue block12;
                        }
                        this.an |= 1;
                        this.aqZ = n2;
                        continue block12;
                    }
                    case 16: {
                        this.an |= 2;
                        this.arb = codedInputStream.readInt32();
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

    public static final Descriptors.Descriptor aEb() {
        return zS.apD;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zS.apE.ensureFieldAccessorsInitialized(af_0.class, AH.class);
    }

    @Override
    public boolean aEc() {
        return (this.an & 1) != 0;
    }

    @Override
    public aq_0 aEd() {
        aq_0 aq_02 = aq_0.lu(this.aqZ);
        return aq_02 == null ? aq_0.arp : aq_02;
    }

    @Override
    public boolean aEe() {
        return (this.an & 2) != 0;
    }

    @Override
    public int aEf() {
        return this.arb;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.aEc()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeEnum(1, this.aqZ);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.arb);
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
            n += CodedOutputStream.computeEnumSize((int)1, (int)this.aqZ);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.arb);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof af_0)) {
            return super.equals(object);
        }
        af_0 af_02 = (af_0)object;
        if (this.aEc() != af_02.aEc()) {
            return false;
        }
        if (this.aEc() && this.aqZ != af_02.aqZ) {
            return false;
        }
        if (this.aEe() != af_02.aEe()) {
            return false;
        }
        if (this.aEe() && this.aEf() != af_02.aEf()) {
            return false;
        }
        return this.unknownFields.equals((Object)af_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + af_0.aEb().hashCode();
        if (this.aEc()) {
            n = 37 * n + 1;
            n = 53 * n + this.aqZ;
        }
        if (this.aEe()) {
            n = 37 * n + 2;
            n = 53 * n + this.aEf();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static af_0 ez(ByteBuffer byteBuffer) {
        return (af_0)ard.parseFrom(byteBuffer);
    }

    public static af_0 cN(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (af_0)ard.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static af_0 er(ByteString byteString) {
        return (af_0)ard.parseFrom(byteString);
    }

    public static af_0 cN(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (af_0)ard.parseFrom(byteString, extensionRegistryLite);
    }

    public static af_0 cP(byte[] byArray) {
        return (af_0)ard.parseFrom(byArray);
    }

    public static af_0 cN(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (af_0)ard.parseFrom(byArray, extensionRegistryLite);
    }

    public static af_0 gA(InputStream inputStream) {
        return (af_0)GeneratedMessageV3.parseWithIOException(ard, (InputStream)inputStream);
    }

    public static af_0 gA(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (af_0)GeneratedMessageV3.parseWithIOException(ard, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static af_0 gB(InputStream inputStream) {
        return (af_0)GeneratedMessageV3.parseDelimitedWithIOException(ard, (InputStream)inputStream);
    }

    public static af_0 gB(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (af_0)GeneratedMessageV3.parseDelimitedWithIOException(ard, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static af_0 cN(CodedInputStream codedInputStream) {
        return (af_0)GeneratedMessageV3.parseWithIOException(ard, (CodedInputStream)codedInputStream);
    }

    public static af_0 kn(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (af_0)GeneratedMessageV3.parseWithIOException(ard, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public AH aEg() {
        return af_0.aEh();
    }

    public static AH aEh() {
        return arc.aEi();
    }

    public static AH a(af_0 af_02) {
        return arc.aEi().c(af_02);
    }

    public AH aEi() {
        return this == arc ? new AH() : new AH().c(this);
    }

    protected AH cN(GeneratedMessageV3.BuilderParent builderParent) {
        AH aH = new AH(builderParent);
        return aH;
    }

    public static af_0 aEj() {
        return arc;
    }

    public static Parser<af_0> z() {
        return ard;
    }

    public Parser<af_0> getParserForType() {
        return ard;
    }

    public af_0 aEk() {
        return arc;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cN(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aEi();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aEg();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aEi();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aEg();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aEk();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aEk();
    }

    static /* synthetic */ boolean aEl() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(af_0 af_02) {
        return af_02.unknownFields;
    }
}

