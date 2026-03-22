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
 * Renamed from aR
 */
public final class ar_1
extends GeneratedMessageV3
implements au_2 {
    private static final long fX = 0L;
    public static final int fY = 1;
    long fG;
    public static final int fZ = 2;
    long ga;
    private byte Y = (byte)-1;
    private static final ar_1 gb = new ar_1();
    static final Parser<ar_1> gc = new as_1();

    ar_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ar_1() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ar_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ar_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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

    public static final Descriptors.Descriptor gz() {
        return ae_1.eG;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.eH.ensureFieldAccessorsInitialized(ar_1.class, at_2.class);
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
        if (!(object instanceof ar_1)) {
            return super.equals(object);
        }
        ar_1 ar_12 = (ar_1)object;
        if (this.fD() != ar_12.fD()) {
            return false;
        }
        if (this.gA() != ar_12.gA()) {
            return false;
        }
        return this.unknownFields.equals((Object)ar_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ar_1.gz().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.fD());
        n = 37 * n + 2;
        n = 53 * n + Internal.hashLong((long)this.gA());
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ar_1 t(ByteBuffer byteBuffer) {
        return (ar_1)gc.parseFrom(byteBuffer);
    }

    public static ar_1 t(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ar_1)gc.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ar_1 N(ByteString byteString) {
        return (ar_1)gc.parseFrom(byteString);
    }

    public static ar_1 t(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ar_1)gc.parseFrom(byteString, extensionRegistryLite);
    }

    public static ar_1 t(byte[] byArray) {
        return (ar_1)gc.parseFrom(byArray);
    }

    public static ar_1 t(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ar_1)gc.parseFrom(byArray, extensionRegistryLite);
    }

    public static ar_1 M(InputStream inputStream) {
        return (ar_1)GeneratedMessageV3.parseWithIOException(gc, (InputStream)inputStream);
    }

    public static ar_1 M(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ar_1)GeneratedMessageV3.parseWithIOException(gc, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ar_1 N(InputStream inputStream) {
        return (ar_1)GeneratedMessageV3.parseDelimitedWithIOException(gc, (InputStream)inputStream);
    }

    public static ar_1 N(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ar_1)GeneratedMessageV3.parseDelimitedWithIOException(gc, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ar_1 t(CodedInputStream codedInputStream) {
        return (ar_1)GeneratedMessageV3.parseWithIOException(gc, (CodedInputStream)codedInputStream);
    }

    public static ar_1 af(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ar_1)GeneratedMessageV3.parseWithIOException(gc, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public at_2 gB() {
        return ar_1.gC();
    }

    public static at_2 gC() {
        return gb.gD();
    }

    public static at_2 a(ar_1 ar_12) {
        return gb.gD().c(ar_12);
    }

    public at_2 gD() {
        return this == gb ? new at_2() : new at_2().c(this);
    }

    protected at_2 t(GeneratedMessageV3.BuilderParent builderParent) {
        at_2 at_22 = new at_2(builderParent);
        return at_22;
    }

    public static ar_1 gE() {
        return gb;
    }

    public static Parser<ar_1> z() {
        return gc;
    }

    public Parser<ar_1> getParserForType() {
        return gc;
    }

    public ar_1 gF() {
        return gb;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.t(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.gD();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.gB();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.gD();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.gB();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.gF();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.gF();
    }

    static /* synthetic */ boolean gG() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ar_1 ar_12) {
        return ar_12.unknownFields;
    }
}

