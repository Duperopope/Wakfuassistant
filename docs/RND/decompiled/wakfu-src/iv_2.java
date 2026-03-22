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
 * Renamed from iV
 */
public final class iv_2
extends GeneratedMessageV3
implements iy_2 {
    private static final long Aw = 0L;
    int an;
    public static final int Ax = 1;
    int qB;
    public static final int Ay = 2;
    int jq;
    public static final int Az = 3;
    boolean AA;
    public static final int AB = 4;
    boolean AC;
    private byte Y = (byte)-1;
    private static final iv_2 AD = new iv_2();
    @Deprecated
    public static final Parser<iv_2> AE = new iw_2();

    iv_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private iv_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new iv_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    iv_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 8: {
                        this.an |= 1;
                        this.qB = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 16: {
                        this.an |= 2;
                        this.jq = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 24: {
                        this.an |= 4;
                        this.AA = codedInputStream.readBool();
                        continue block14;
                    }
                    case 32: {
                        this.an |= 8;
                        this.AC = codedInputStream.readBool();
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

    public static final Descriptors.Descriptor RT() {
        return iu_2.Ao;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iu_2.Ap.ensureFieldAccessorsInitialized(iv_2.class, ix_2.class);
    }

    @Override
    public boolean AJ() {
        return (this.an & 1) != 0;
    }

    @Override
    public int AK() {
        return this.qB;
    }

    @Override
    public boolean oO() {
        return (this.an & 2) != 0;
    }

    @Override
    public int oP() {
        return this.jq;
    }

    @Override
    public boolean RU() {
        return (this.an & 4) != 0;
    }

    @Override
    public boolean RV() {
        return this.AA;
    }

    @Override
    public boolean RW() {
        return (this.an & 8) != 0;
    }

    @Override
    public boolean RX() {
        return this.AC;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.AJ()) {
            this.Y = 0;
            return false;
        }
        if (!this.oO()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.qB);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.jq);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeBool(3, this.AA);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeBool(4, this.AC);
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.qB);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.jq);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeBoolSize((int)3, (boolean)this.AA);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeBoolSize((int)4, (boolean)this.AC);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof iv_2)) {
            return super.equals(object);
        }
        iv_2 iv_22 = (iv_2)object;
        if (this.AJ() != iv_22.AJ()) {
            return false;
        }
        if (this.AJ() && this.AK() != iv_22.AK()) {
            return false;
        }
        if (this.oO() != iv_22.oO()) {
            return false;
        }
        if (this.oO() && this.oP() != iv_22.oP()) {
            return false;
        }
        if (this.RU() != iv_22.RU()) {
            return false;
        }
        if (this.RU() && this.RV() != iv_22.RV()) {
            return false;
        }
        if (this.RW() != iv_22.RW()) {
            return false;
        }
        if (this.RW() && this.RX() != iv_22.RX()) {
            return false;
        }
        return this.unknownFields.equals((Object)iv_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + iv_2.RT().hashCode();
        if (this.AJ()) {
            n = 37 * n + 1;
            n = 53 * n + this.AK();
        }
        if (this.oO()) {
            n = 37 * n + 2;
            n = 53 * n + this.oP();
        }
        if (this.RU()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashBoolean((boolean)this.RV());
        }
        if (this.RW()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashBoolean((boolean)this.RX());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static iv_2 bk(ByteBuffer byteBuffer) {
        return (iv_2)AE.parseFrom(byteBuffer);
    }

    public static iv_2 bg(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (iv_2)AE.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static iv_2 cc(ByteString byteString) {
        return (iv_2)AE.parseFrom(byteString);
    }

    public static iv_2 bg(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (iv_2)AE.parseFrom(byteString, extensionRegistryLite);
    }

    public static iv_2 bh(byte[] byArray) {
        return (iv_2)AE.parseFrom(byArray);
    }

    public static iv_2 bg(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (iv_2)AE.parseFrom(byArray, extensionRegistryLite);
    }

    public static iv_2 dm(InputStream inputStream) {
        return (iv_2)GeneratedMessageV3.parseWithIOException(AE, (InputStream)inputStream);
    }

    public static iv_2 dm(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iv_2)GeneratedMessageV3.parseWithIOException(AE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static iv_2 dn(InputStream inputStream) {
        return (iv_2)GeneratedMessageV3.parseDelimitedWithIOException(AE, (InputStream)inputStream);
    }

    public static iv_2 dn(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iv_2)GeneratedMessageV3.parseDelimitedWithIOException(AE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static iv_2 bg(CodedInputStream codedInputStream) {
        return (iv_2)GeneratedMessageV3.parseWithIOException(AE, (CodedInputStream)codedInputStream);
    }

    public static iv_2 fs(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iv_2)GeneratedMessageV3.parseWithIOException(AE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ix_2 RY() {
        return iv_2.RZ();
    }

    public static ix_2 RZ() {
        return AD.Sa();
    }

    public static ix_2 a(iv_2 iv_22) {
        return AD.Sa().c(iv_22);
    }

    public ix_2 Sa() {
        return this == AD ? new ix_2() : new ix_2().c(this);
    }

    protected ix_2 bg(GeneratedMessageV3.BuilderParent builderParent) {
        ix_2 ix_22 = new ix_2(builderParent);
        return ix_22;
    }

    public static iv_2 Sb() {
        return AD;
    }

    public static Parser<iv_2> z() {
        return AE;
    }

    public Parser<iv_2> getParserForType() {
        return AE;
    }

    public iv_2 Sc() {
        return AD;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bg(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.Sa();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.RY();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.Sa();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.RY();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Sc();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Sc();
    }

    static /* synthetic */ boolean jh() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(iv_2 iv_22) {
        return iv_22.unknownFields;
    }
}

