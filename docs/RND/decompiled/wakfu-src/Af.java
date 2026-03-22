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

public final class Af
extends GeneratedMessageV3
implements ai_0 {
    private static final long aqd = 0L;
    int an;
    public static final int aqe = 1;
    long Dj;
    private byte Y = (byte)-1;
    private static final Af aqf = new Af();
    @Deprecated
    public static final Parser<Af> aqg = new ag_0();

    Af(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Af() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Af();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    Af(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 8: {
                        this.an |= 1;
                        this.Dj = codedInputStream.readInt64();
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

    public static final Descriptors.Descriptor aBZ() {
        return zS.apt;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zS.apu.ensureFieldAccessorsInitialized(Af.class, ah_0.class);
    }

    @Override
    public boolean Xh() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Xi() {
        return this.Dj;
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
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Af)) {
            return super.equals(object);
        }
        Af af = (Af)object;
        if (this.Xh() != af.Xh()) {
            return false;
        }
        if (this.Xh() && this.Xi() != af.Xi()) {
            return false;
        }
        return this.unknownFields.equals((Object)af.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + Af.aBZ().hashCode();
        if (this.Xh()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.Xi());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static Af et(ByteBuffer byteBuffer) {
        return (Af)aqg.parseFrom(byteBuffer);
    }

    public static Af cH(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Af)aqg.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Af ej(ByteString byteString) {
        return (Af)aqg.parseFrom(byteString);
    }

    public static Af cH(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Af)aqg.parseFrom(byteString, extensionRegistryLite);
    }

    public static Af cJ(byte[] byArray) {
        return (Af)aqg.parseFrom(byArray);
    }

    public static Af cH(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Af)aqg.parseFrom(byArray, extensionRegistryLite);
    }

    public static Af go(InputStream inputStream) {
        return (Af)GeneratedMessageV3.parseWithIOException(aqg, (InputStream)inputStream);
    }

    public static Af go(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Af)GeneratedMessageV3.parseWithIOException(aqg, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Af gp(InputStream inputStream) {
        return (Af)GeneratedMessageV3.parseDelimitedWithIOException(aqg, (InputStream)inputStream);
    }

    public static Af gp(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Af)GeneratedMessageV3.parseDelimitedWithIOException(aqg, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Af cH(CodedInputStream codedInputStream) {
        return (Af)GeneratedMessageV3.parseWithIOException(aqg, (CodedInputStream)codedInputStream);
    }

    public static Af jV(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Af)GeneratedMessageV3.parseWithIOException(aqg, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ah_0 aCa() {
        return Af.aCb();
    }

    public static ah_0 aCb() {
        return aqf.aCc();
    }

    public static ah_0 a(Af af) {
        return aqf.aCc().c(af);
    }

    public ah_0 aCc() {
        return this == aqf ? new ah_0() : new ah_0().c(this);
    }

    protected ah_0 cH(GeneratedMessageV3.BuilderParent builderParent) {
        ah_0 ah_02 = new ah_0(builderParent);
        return ah_02;
    }

    public static Af aCd() {
        return aqf;
    }

    public static Parser<Af> z() {
        return aqg;
    }

    public Parser<Af> getParserForType() {
        return aqg;
    }

    public Af aCe() {
        return aqf;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cH(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aCc();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aCa();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aCc();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aCa();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aCe();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aCe();
    }

    static /* synthetic */ boolean dM() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(Af af) {
        return af.unknownFields;
    }
}

