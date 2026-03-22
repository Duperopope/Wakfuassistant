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

public final class Aj
extends GeneratedMessageV3
implements am_0 {
    private static final long aqh = 0L;
    int an;
    public static final int aqi = 1;
    long Dj;
    public static final int aqj = 2;
    long wf;
    private byte Y = (byte)-1;
    private static final Aj aqk = new Aj();
    @Deprecated
    public static final Parser<Aj> aql = new Ak();

    Aj(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Aj() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Aj();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    Aj(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.Dj = codedInputStream.readInt64();
                        continue block12;
                    }
                    case 16: {
                        this.an |= 2;
                        this.wf = codedInputStream.readInt64();
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

    public static final Descriptors.Descriptor aCl() {
        return zS.apj;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zS.apk.ensureFieldAccessorsInitialized(Aj.class, al_0.class);
    }

    @Override
    public boolean Xh() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Xi() {
        return this.Dj;
    }

    @Override
    public boolean KT() {
        return (this.an & 2) != 0;
    }

    @Override
    public long KU() {
        return this.wf;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.Xh()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.Dj);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt64(2, this.wf);
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.Dj);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.wf);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Aj)) {
            return super.equals(object);
        }
        Aj aj = (Aj)object;
        if (this.Xh() != aj.Xh()) {
            return false;
        }
        if (this.Xh() && this.Xi() != aj.Xi()) {
            return false;
        }
        if (this.KT() != aj.KT()) {
            return false;
        }
        if (this.KT() && this.KU() != aj.KU()) {
            return false;
        }
        return this.unknownFields.equals((Object)aj.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + Aj.aCl().hashCode();
        if (this.Xh()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.Xi());
        }
        if (this.KT()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.KU());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static Aj eu(ByteBuffer byteBuffer) {
        return (Aj)aql.parseFrom(byteBuffer);
    }

    public static Aj cI(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Aj)aql.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Aj ek(ByteString byteString) {
        return (Aj)aql.parseFrom(byteString);
    }

    public static Aj cI(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Aj)aql.parseFrom(byteString, extensionRegistryLite);
    }

    public static Aj cK(byte[] byArray) {
        return (Aj)aql.parseFrom(byArray);
    }

    public static Aj cI(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Aj)aql.parseFrom(byArray, extensionRegistryLite);
    }

    public static Aj gq(InputStream inputStream) {
        return (Aj)GeneratedMessageV3.parseWithIOException(aql, (InputStream)inputStream);
    }

    public static Aj gq(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Aj)GeneratedMessageV3.parseWithIOException(aql, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Aj gr(InputStream inputStream) {
        return (Aj)GeneratedMessageV3.parseDelimitedWithIOException(aql, (InputStream)inputStream);
    }

    public static Aj gr(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Aj)GeneratedMessageV3.parseDelimitedWithIOException(aql, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Aj cI(CodedInputStream codedInputStream) {
        return (Aj)GeneratedMessageV3.parseWithIOException(aql, (CodedInputStream)codedInputStream);
    }

    public static Aj jY(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Aj)GeneratedMessageV3.parseWithIOException(aql, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public al_0 aCm() {
        return Aj.aCn();
    }

    public static al_0 aCn() {
        return aqk.aCo();
    }

    public static al_0 a(Aj aj) {
        return aqk.aCo().c(aj);
    }

    public al_0 aCo() {
        return this == aqk ? new al_0() : new al_0().c(this);
    }

    protected al_0 cI(GeneratedMessageV3.BuilderParent builderParent) {
        al_0 al_02 = new al_0(builderParent);
        return al_02;
    }

    public static Aj aCp() {
        return aqk;
    }

    public static Parser<Aj> z() {
        return aql;
    }

    public Parser<Aj> getParserForType() {
        return aql;
    }

    public Aj aCq() {
        return aqk;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cI(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aCo();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aCm();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aCo();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aCm();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aCq();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aCq();
    }

    static /* synthetic */ boolean pT() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(Aj aj) {
        return aj.unknownFields;
    }
}

