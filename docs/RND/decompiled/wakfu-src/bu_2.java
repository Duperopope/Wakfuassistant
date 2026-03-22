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
 * Renamed from bu
 */
public final class bu_2
extends GeneratedMessageV3
implements bx_1 {
    private static final long gN = 0L;
    public static final int gO = 1;
    long fG;
    private byte Y = (byte)-1;
    private static final bu_2 gP = new bu_2();
    static final Parser<bu_2> gQ = new bv_1();

    bu_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private bu_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new bu_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    bu_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block11: while (!bl) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl = true;
                        continue block11;
                    }
                    case 8: {
                        this.fG = codedInputStream.readInt64();
                        continue block11;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
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
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor iO() {
        return ae_1.eO;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.eP.ensureFieldAccessorsInitialized(bu_2.class, bw_1.class);
    }

    @Override
    public long fD() {
        return this.fG;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.fG != 0L) {
            codedOutputStream.writeInt64(1, this.fG);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.fG != 0L) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.fG);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bu_2)) {
            return super.equals(object);
        }
        bu_2 bu_22 = (bu_2)object;
        if (this.fD() != bu_22.fD()) {
            return false;
        }
        return this.unknownFields.equals((Object)bu_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + bu_2.iO().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.fD());
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static bu_2 A(ByteBuffer byteBuffer) {
        return (bu_2)gQ.parseFrom(byteBuffer);
    }

    public static bu_2 A(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (bu_2)gQ.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static bu_2 ac(ByteString byteString) {
        return (bu_2)gQ.parseFrom(byteString);
    }

    public static bu_2 A(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (bu_2)gQ.parseFrom(byteString, extensionRegistryLite);
    }

    public static bu_2 A(byte[] byArray) {
        return (bu_2)gQ.parseFrom(byArray);
    }

    public static bu_2 A(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (bu_2)gQ.parseFrom(byArray, extensionRegistryLite);
    }

    public static bu_2 aa(InputStream inputStream) {
        return (bu_2)GeneratedMessageV3.parseWithIOException(gQ, (InputStream)inputStream);
    }

    public static bu_2 aa(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bu_2)GeneratedMessageV3.parseWithIOException(gQ, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bu_2 ab(InputStream inputStream) {
        return (bu_2)GeneratedMessageV3.parseDelimitedWithIOException(gQ, (InputStream)inputStream);
    }

    public static bu_2 ab(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bu_2)GeneratedMessageV3.parseDelimitedWithIOException(gQ, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bu_2 A(CodedInputStream codedInputStream) {
        return (bu_2)GeneratedMessageV3.parseWithIOException(gQ, (CodedInputStream)codedInputStream);
    }

    public static bu_2 aA(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bu_2)GeneratedMessageV3.parseWithIOException(gQ, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public bw_1 iP() {
        return bu_2.iQ();
    }

    public static bw_1 iQ() {
        return gP.iR();
    }

    public static bw_1 a(bu_2 bu_22) {
        return gP.iR().c(bu_22);
    }

    public bw_1 iR() {
        return this == gP ? new bw_1() : new bw_1().c(this);
    }

    protected bw_1 A(GeneratedMessageV3.BuilderParent builderParent) {
        bw_1 bw_12 = new bw_1(builderParent);
        return bw_12;
    }

    public static bu_2 iS() {
        return gP;
    }

    public static Parser<bu_2> z() {
        return gQ;
    }

    public Parser<bu_2> getParserForType() {
        return gQ;
    }

    public bu_2 iT() {
        return gP;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.A(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.iR();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.iP();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.iR();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.iP();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.iT();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.iT();
    }

    static /* synthetic */ boolean iU() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(bu_2 bu_22) {
        return bu_22.unknownFields;
    }
}

