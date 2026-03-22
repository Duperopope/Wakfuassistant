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

/*
 * Renamed from dC
 */
public final class dc_1
extends GeneratedMessageV3
implements dg_2 {
    private static final long kT = 0L;
    int an;
    public static final int kU = 1;
    boolean kO;
    public static final int kV = 2;
    int kW;
    private byte Y = (byte)-1;
    private static final dc_1 kX = new dc_1();
    @Deprecated
    public static final Parser<dc_1> kY = new dd_2();

    dc_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private dc_1() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new dc_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    dc_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.kO = codedInputStream.readBool();
                        continue block12;
                    }
                    case 16: {
                        this.an |= 2;
                        this.kW = codedInputStream.readInt32();
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

    public static final Descriptors.Descriptor rG() {
        return df_2.jH;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return df_2.jI.ensureFieldAccessorsInitialized(dc_1.class, de_2.class);
    }

    @Override
    public boolean rn() {
        return (this.an & 1) != 0;
    }

    @Override
    public boolean getEnabled() {
        return this.kO;
    }

    @Override
    public boolean rH() {
        return (this.an & 2) != 0;
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
        if (!this.rn()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeBool(1, this.kO);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.kW);
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
            n += CodedOutputStream.computeBoolSize((int)1, (boolean)this.kO);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.kW);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof dc_1)) {
            return super.equals(object);
        }
        dc_1 dc_12 = (dc_1)object;
        if (this.rn() != dc_12.rn()) {
            return false;
        }
        if (this.rn() && this.getEnabled() != dc_12.getEnabled()) {
            return false;
        }
        if (this.rH() != dc_12.rH()) {
            return false;
        }
        if (this.rH() && this.rI() != dc_12.rI()) {
            return false;
        }
        return this.unknownFields.equals((Object)dc_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + dc_1.rG().hashCode();
        if (this.rn()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashBoolean((boolean)this.getEnabled());
        }
        if (this.rH()) {
            n = 37 * n + 2;
            n = 53 * n + this.rI();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static dc_1 aa(ByteBuffer byteBuffer) {
        return (dc_1)kY.parseFrom(byteBuffer);
    }

    public static dc_1 aa(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (dc_1)kY.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static dc_1 aI(ByteString byteString) {
        return (dc_1)kY.parseFrom(byteString);
    }

    public static dc_1 aa(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (dc_1)kY.parseFrom(byteString, extensionRegistryLite);
    }

    public static dc_1 aa(byte[] byArray) {
        return (dc_1)kY.parseFrom(byArray);
    }

    public static dc_1 aa(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (dc_1)kY.parseFrom(byArray, extensionRegistryLite);
    }

    public static dc_1 ba(InputStream inputStream) {
        return (dc_1)GeneratedMessageV3.parseWithIOException(kY, (InputStream)inputStream);
    }

    public static dc_1 ba(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dc_1)GeneratedMessageV3.parseWithIOException(kY, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static dc_1 bb(InputStream inputStream) {
        return (dc_1)GeneratedMessageV3.parseDelimitedWithIOException(kY, (InputStream)inputStream);
    }

    public static dc_1 bb(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dc_1)GeneratedMessageV3.parseDelimitedWithIOException(kY, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static dc_1 aa(CodedInputStream codedInputStream) {
        return (dc_1)GeneratedMessageV3.parseWithIOException(kY, (CodedInputStream)codedInputStream);
    }

    public static dc_1 ca(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dc_1)GeneratedMessageV3.parseWithIOException(kY, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public de_2 rJ() {
        return dc_1.rK();
    }

    public static de_2 rK() {
        return kX.rL();
    }

    public static de_2 a(dc_1 dc_12) {
        return kX.rL().c(dc_12);
    }

    public de_2 rL() {
        return this == kX ? new de_2() : new de_2().c(this);
    }

    protected de_2 aa(GeneratedMessageV3.BuilderParent builderParent) {
        de_2 de_22 = new de_2(builderParent);
        return de_22;
    }

    public static dc_1 rM() {
        return kX;
    }

    public static Parser<dc_1> z() {
        return kY;
    }

    public Parser<dc_1> getParserForType() {
        return kY;
    }

    public dc_1 rN() {
        return kX;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aa(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.rL();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.rJ();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.rL();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.rJ();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.rN();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.rN();
    }

    static /* synthetic */ boolean Y() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(dc_1 dc_12) {
        return dc_12.unknownFields;
    }
}

