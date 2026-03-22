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
 * Renamed from es
 */
public final class es_2
extends GeneratedMessageV3
implements ev_2 {
    private static final long mT = 0L;
    int an;
    public static final int mU = 1;
    ByteString mV;
    public static final int mW = 2;
    ByteString mL;
    private byte Y = (byte)-1;
    private static final es_2 mX = new es_2();
    @Deprecated
    public static final Parser<es_2> mY = new et_2();

    es_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private es_2() {
        this.mV = ByteString.EMPTY;
        this.mL = ByteString.EMPTY;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new es_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    es_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 10: {
                        this.an |= 1;
                        this.mV = codedInputStream.readBytes();
                        continue block12;
                    }
                    case 18: {
                        this.an |= 2;
                        this.mL = codedInputStream.readBytes();
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

    public static final Descriptors.Descriptor vm() {
        return ej_2.mz;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ej_2.mA.ensureFieldAccessorsInitialized(es_2.class, eu_2.class);
    }

    @Override
    public boolean vn() {
        return (this.an & 1) != 0;
    }

    @Override
    public ByteString vo() {
        return this.mV;
    }

    @Override
    public boolean uL() {
        return (this.an & 2) != 0;
    }

    @Override
    public ByteString uM() {
        return this.mL;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.vn()) {
            this.Y = 0;
            return false;
        }
        if (!this.uL()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeBytes(1, this.mV);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeBytes(2, this.mL);
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
            n += CodedOutputStream.computeBytesSize((int)1, (ByteString)this.mV);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeBytesSize((int)2, (ByteString)this.mL);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof es_2)) {
            return super.equals(object);
        }
        es_2 es_22 = (es_2)object;
        if (this.vn() != es_22.vn()) {
            return false;
        }
        if (this.vn() && !this.vo().equals((Object)es_22.vo())) {
            return false;
        }
        if (this.uL() != es_22.uL()) {
            return false;
        }
        if (this.uL() && !this.uM().equals((Object)es_22.uM())) {
            return false;
        }
        return this.unknownFields.equals((Object)es_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + es_2.vm().hashCode();
        if (this.vn()) {
            n = 37 * n + 1;
            n = 53 * n + this.vo().hashCode();
        }
        if (this.uL()) {
            n = 37 * n + 2;
            n = 53 * n + this.uM().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static es_2 aj(ByteBuffer byteBuffer) {
        return (es_2)mY.parseFrom(byteBuffer);
    }

    public static es_2 aj(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (es_2)mY.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static es_2 aS(ByteString byteString) {
        return (es_2)mY.parseFrom(byteString);
    }

    public static es_2 aj(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (es_2)mY.parseFrom(byteString, extensionRegistryLite);
    }

    public static es_2 aj(byte[] byArray) {
        return (es_2)mY.parseFrom(byArray);
    }

    public static es_2 aj(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (es_2)mY.parseFrom(byArray, extensionRegistryLite);
    }

    public static es_2 bs(InputStream inputStream) {
        return (es_2)GeneratedMessageV3.parseWithIOException(mY, (InputStream)inputStream);
    }

    public static es_2 bs(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (es_2)GeneratedMessageV3.parseWithIOException(mY, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static es_2 bt(InputStream inputStream) {
        return (es_2)GeneratedMessageV3.parseDelimitedWithIOException(mY, (InputStream)inputStream);
    }

    public static es_2 bt(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (es_2)GeneratedMessageV3.parseDelimitedWithIOException(mY, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static es_2 aj(CodedInputStream codedInputStream) {
        return (es_2)GeneratedMessageV3.parseWithIOException(mY, (CodedInputStream)codedInputStream);
    }

    public static es_2 cB(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (es_2)GeneratedMessageV3.parseWithIOException(mY, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public eu_2 vp() {
        return es_2.vq();
    }

    public static eu_2 vq() {
        return mX.vr();
    }

    public static eu_2 a(es_2 es_22) {
        return mX.vr().c(es_22);
    }

    public eu_2 vr() {
        return this == mX ? new eu_2() : new eu_2().c(this);
    }

    protected eu_2 aj(GeneratedMessageV3.BuilderParent builderParent) {
        eu_2 eu_22 = new eu_2(builderParent);
        return eu_22;
    }

    public static es_2 vs() {
        return mX;
    }

    public static Parser<es_2> z() {
        return mY;
    }

    public Parser<es_2> getParserForType() {
        return mY;
    }

    public es_2 vt() {
        return mX;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aj(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.vr();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.vp();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.vr();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.vp();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.vt();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.vt();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(es_2 es_22) {
        return es_22.unknownFields;
    }
}

