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

public final class oo
extends GeneratedMessageV3
implements or {
    private static final long QH = 0L;
    int an;
    public static final int QI = 1;
    boolean nk;
    public static final int QJ = 2;
    int QK;
    public static final int QL = 3;
    int jq;
    private byte Y = (byte)-1;
    private static final oo QM = new oo();
    @Deprecated
    public static final Parser<oo> QN = new op();

    oo(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private oo() {
        this.nk = true;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new oo();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    oo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block13: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block13;
                    }
                    case 8: {
                        this.an |= 1;
                        this.nk = codedInputStream.readBool();
                        continue block13;
                    }
                    case 16: {
                        this.an |= 2;
                        this.QK = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 24: {
                        this.an |= 4;
                        this.jq = codedInputStream.readInt32();
                        continue block13;
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

    public static final Descriptors.Descriptor avp() {
        return ok.Qz;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ok.QA.ensureFieldAccessorsInitialized(oo.class, oq.class);
    }

    @Override
    public boolean vZ() {
        return (this.an & 1) != 0;
    }

    @Override
    public boolean wa() {
        return this.nk;
    }

    @Override
    public boolean avq() {
        return (this.an & 2) != 0;
    }

    @Override
    public int avr() {
        return this.QK;
    }

    @Override
    public boolean oO() {
        return (this.an & 4) != 0;
    }

    @Override
    public int oP() {
        return this.jq;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.avq()) {
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
            codedOutputStream.writeBool(1, this.nk);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.QK);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(3, this.jq);
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
            n += CodedOutputStream.computeBoolSize((int)1, (boolean)this.nk);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.QK);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.jq);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof oo)) {
            return super.equals(object);
        }
        oo oo2 = (oo)object;
        if (this.vZ() != oo2.vZ()) {
            return false;
        }
        if (this.vZ() && this.wa() != oo2.wa()) {
            return false;
        }
        if (this.avq() != oo2.avq()) {
            return false;
        }
        if (this.avq() && this.avr() != oo2.avr()) {
            return false;
        }
        if (this.oO() != oo2.oO()) {
            return false;
        }
        if (this.oO() && this.oP() != oo2.oP()) {
            return false;
        }
        return this.unknownFields.equals((Object)oo2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + oo.avp().hashCode();
        if (this.vZ()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashBoolean((boolean)this.wa());
        }
        if (this.avq()) {
            n = 37 * n + 2;
            n = 53 * n + this.avr();
        }
        if (this.oO()) {
            n = 37 * n + 3;
            n = 53 * n + this.oP();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static oo cu(ByteBuffer byteBuffer) {
        return (oo)QN.parseFrom(byteBuffer);
    }

    public static oo cq(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (oo)QN.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static oo dR(ByteString byteString) {
        return (oo)QN.parseFrom(byteString);
    }

    public static oo cq(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (oo)QN.parseFrom(byteString, extensionRegistryLite);
    }

    public static oo cs(byte[] byArray) {
        return (oo)QN.parseFrom(byArray);
    }

    public static oo cq(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (oo)QN.parseFrom(byArray, extensionRegistryLite);
    }

    public static oo fG(InputStream inputStream) {
        return (oo)GeneratedMessageV3.parseWithIOException(QN, (InputStream)inputStream);
    }

    public static oo fG(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (oo)GeneratedMessageV3.parseWithIOException(QN, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static oo fH(InputStream inputStream) {
        return (oo)GeneratedMessageV3.parseDelimitedWithIOException(QN, (InputStream)inputStream);
    }

    public static oo fH(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (oo)GeneratedMessageV3.parseDelimitedWithIOException(QN, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static oo cq(CodedInputStream codedInputStream) {
        return (oo)GeneratedMessageV3.parseWithIOException(QN, (CodedInputStream)codedInputStream);
    }

    public static oo iW(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (oo)GeneratedMessageV3.parseWithIOException(QN, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public oq avs() {
        return oo.avt();
    }

    public static oq avt() {
        return QM.avu();
    }

    public static oq b(oo oo2) {
        return QM.avu().d(oo2);
    }

    public oq avu() {
        return this == QM ? new oq() : new oq().d(this);
    }

    protected oq cq(GeneratedMessageV3.BuilderParent builderParent) {
        oq oq2 = new oq(builderParent);
        return oq2;
    }

    public static oo avv() {
        return QM;
    }

    public static Parser<oo> z() {
        return QN;
    }

    public Parser<oo> getParserForType() {
        return QN;
    }

    public oo avw() {
        return QM;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cq(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.avu();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.avs();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.avu();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.avs();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.avw();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.avw();
    }

    static /* synthetic */ boolean fa() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet c(oo oo2) {
        return oo2.unknownFields;
    }
}

