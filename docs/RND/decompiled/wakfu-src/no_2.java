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
 * Renamed from nO
 */
public final class no_2
extends GeneratedMessageV3
implements nr_2 {
    private static final long Ps = 0L;
    int an;
    public static final int Pt = 2;
    long nW;
    private byte Y = (byte)-1;
    private static final no_2 Pu = new no_2();
    @Deprecated
    public static final Parser<no_2> Pv = new np_2();

    no_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private no_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new no_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    no_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    case 16: {
                        this.an |= 1;
                        this.nW = codedInputStream.readInt64();
                        continue block11;
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

    public static final Descriptors.Descriptor asN() {
        return nj_2.Pm;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nj_2.Pn.ensureFieldAccessorsInitialized(no_2.class, nq_2.class);
    }

    @Override
    public boolean xk() {
        return (this.an & 1) != 0;
    }

    @Override
    public long xl() {
        return this.nW;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.xk()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(2, this.nW);
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
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.nW);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof no_2)) {
            return super.equals(object);
        }
        no_2 no_22 = (no_2)object;
        if (this.xk() != no_22.xk()) {
            return false;
        }
        if (this.xk() && this.xl() != no_22.xl()) {
            return false;
        }
        return this.unknownFields.equals((Object)no_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + no_2.asN().hashCode();
        if (this.xk()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.xl());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static no_2 co(ByteBuffer byteBuffer) {
        return (no_2)Pv.parseFrom(byteBuffer);
    }

    public static no_2 ck(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (no_2)Pv.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static no_2 dL(ByteString byteString) {
        return (no_2)Pv.parseFrom(byteString);
    }

    public static no_2 ck(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (no_2)Pv.parseFrom(byteString, extensionRegistryLite);
    }

    public static no_2 cm(byte[] byArray) {
        return (no_2)Pv.parseFrom(byArray);
    }

    public static no_2 ck(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (no_2)Pv.parseFrom(byArray, extensionRegistryLite);
    }

    public static no_2 fu(InputStream inputStream) {
        return (no_2)GeneratedMessageV3.parseWithIOException(Pv, (InputStream)inputStream);
    }

    public static no_2 fu(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (no_2)GeneratedMessageV3.parseWithIOException(Pv, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static no_2 fv(InputStream inputStream) {
        return (no_2)GeneratedMessageV3.parseDelimitedWithIOException(Pv, (InputStream)inputStream);
    }

    public static no_2 fv(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (no_2)GeneratedMessageV3.parseDelimitedWithIOException(Pv, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static no_2 ck(CodedInputStream codedInputStream) {
        return (no_2)GeneratedMessageV3.parseWithIOException(Pv, (CodedInputStream)codedInputStream);
    }

    public static no_2 iE(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (no_2)GeneratedMessageV3.parseWithIOException(Pv, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public nq_2 asO() {
        return no_2.asP();
    }

    public static nq_2 asP() {
        return Pu.asQ();
    }

    public static nq_2 a(no_2 no_22) {
        return Pu.asQ().c(no_22);
    }

    public nq_2 asQ() {
        return this == Pu ? new nq_2() : new nq_2().c(this);
    }

    protected nq_2 ck(GeneratedMessageV3.BuilderParent builderParent) {
        nq_2 nq_22 = new nq_2(builderParent);
        return nq_22;
    }

    public static no_2 asR() {
        return Pu;
    }

    public static Parser<no_2> z() {
        return Pv;
    }

    public Parser<no_2> getParserForType() {
        return Pv;
    }

    public no_2 asS() {
        return Pu;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.ck(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.asQ();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.asO();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.asQ();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.asO();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.asS();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.asS();
    }

    static /* synthetic */ boolean bg() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(no_2 no_22) {
        return no_22.unknownFields;
    }
}

