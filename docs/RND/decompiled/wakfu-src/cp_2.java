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
 * Renamed from cp
 */
public final class cp_2
extends GeneratedMessageV3
implements cs_2 {
    private static final long ia = 0L;
    public static final int ib = 1;
    long fG;
    public static final int ic = 2;
    long ga;
    private byte Y = (byte)-1;
    private static final cp_2 id = new cp_2();
    static final Parser<cp_2> ie = new cq_1();

    cp_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private cp_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new cp_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    cp_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block12: while (!bl) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl = true;
                        continue block12;
                    }
                    case 8: {
                        this.fG = codedInputStream.readInt64();
                        continue block12;
                    }
                    case 16: {
                        this.ga = codedInputStream.readInt64();
                        continue block12;
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

    public static final Descriptors.Descriptor mr() {
        return ae_1.fe;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.ff.ensureFieldAccessorsInitialized(cp_2.class, cr_1.class);
    }

    @Override
    public long fD() {
        return this.fG;
    }

    @Override
    public long gA() {
        return this.ga;
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
        if (this.ga != 0L) {
            codedOutputStream.writeInt64(2, this.ga);
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
        if (this.ga != 0L) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.ga);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof cp_2)) {
            return super.equals(object);
        }
        cp_2 cp_22 = (cp_2)object;
        if (this.fD() != cp_22.fD()) {
            return false;
        }
        if (this.gA() != cp_22.gA()) {
            return false;
        }
        return this.unknownFields.equals((Object)cp_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + cp_2.mr().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.fD());
        n = 37 * n + 2;
        n = 53 * n + Internal.hashLong((long)this.gA());
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static cp_2 M(ByteBuffer byteBuffer) {
        return (cp_2)ie.parseFrom(byteBuffer);
    }

    public static cp_2 M(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (cp_2)ie.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static cp_2 as(ByteString byteString) {
        return (cp_2)ie.parseFrom(byteString);
    }

    public static cp_2 M(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (cp_2)ie.parseFrom(byteString, extensionRegistryLite);
    }

    public static cp_2 M(byte[] byArray) {
        return (cp_2)ie.parseFrom(byArray);
    }

    public static cp_2 M(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (cp_2)ie.parseFrom(byArray, extensionRegistryLite);
    }

    public static cp_2 ay(InputStream inputStream) {
        return (cp_2)GeneratedMessageV3.parseWithIOException(ie, (InputStream)inputStream);
    }

    public static cp_2 ay(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cp_2)GeneratedMessageV3.parseWithIOException(ie, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cp_2 az(InputStream inputStream) {
        return (cp_2)GeneratedMessageV3.parseDelimitedWithIOException(ie, (InputStream)inputStream);
    }

    public static cp_2 az(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cp_2)GeneratedMessageV3.parseDelimitedWithIOException(ie, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cp_2 M(CodedInputStream codedInputStream) {
        return (cp_2)GeneratedMessageV3.parseWithIOException(ie, (CodedInputStream)codedInputStream);
    }

    public static cp_2 bk(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cp_2)GeneratedMessageV3.parseWithIOException(ie, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public cr_1 ms() {
        return cp_2.mt();
    }

    public static cr_1 mt() {
        return id.mu();
    }

    public static cr_1 a(cp_2 cp_22) {
        return id.mu().c(cp_22);
    }

    public cr_1 mu() {
        return this == id ? new cr_1() : new cr_1().c(this);
    }

    protected cr_1 M(GeneratedMessageV3.BuilderParent builderParent) {
        cr_1 cr_12 = new cr_1(builderParent);
        return cr_12;
    }

    public static cp_2 mv() {
        return id;
    }

    public static Parser<cp_2> z() {
        return ie;
    }

    public Parser<cp_2> getParserForType() {
        return ie;
    }

    public cp_2 mw() {
        return id;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.M(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.mu();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.ms();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.mu();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.ms();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.mw();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.mw();
    }

    static /* synthetic */ boolean mx() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(cp_2 cp_22) {
        return cp_22.unknownFields;
    }
}

