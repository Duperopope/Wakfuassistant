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

public final class Ab
extends GeneratedMessageV3
implements Ae {
    private static final long apS = 0L;
    int an;
    public static final int apT = 1;
    long apU;
    public static final int apV = 2;
    int HC;
    public static final int apW = 4;
    long apX;
    public static final int apY = 5;
    kW Fc;
    public static final int apZ = 6;
    volatile Object aqa;
    private byte Y = (byte)-1;
    private static final Ab aqb = new Ab();
    @Deprecated
    public static final Parser<Ab> aqc = new Ac();

    Ab(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Ab() {
        this.HC = 1;
        this.aqa = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Ab();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    Ab(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block15: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block15;
                    }
                    case 8: {
                        this.an |= 1;
                        this.apU = codedInputStream.readInt64();
                        continue block15;
                    }
                    case 16: {
                        int n2 = codedInputStream.readEnum();
                        ax_0 ax_02 = ax_0.lH(n2);
                        if (ax_02 == null) {
                            builder.mergeVarintField(2, n2);
                            continue block15;
                        }
                        this.an |= 2;
                        this.HC = n2;
                        continue block15;
                    }
                    case 32: {
                        this.an |= 4;
                        this.apX = codedInputStream.readInt64();
                        continue block15;
                    }
                    case 42: {
                        kY kY2 = null;
                        if ((this.an & 8) != 0) {
                            kY2 = this.Fc.aem();
                        }
                        this.Fc = (kW)codedInputStream.readMessage(kW.Hs, extensionRegistryLite);
                        if (kY2 != null) {
                            kY2.h(this.Fc);
                            this.Fc = kY2.aes();
                        }
                        this.an |= 8;
                        continue block15;
                    }
                    case 50: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 0x10;
                        this.aqa = byteString;
                        continue block15;
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

    public static final Descriptors.Descriptor aBB() {
        return zS.apB;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zS.apC.ensureFieldAccessorsInitialized(Ab.class, Ad.class);
    }

    @Override
    @Deprecated
    public boolean aBC() {
        return (this.an & 1) != 0;
    }

    @Override
    @Deprecated
    public long aBD() {
        return this.apU;
    }

    @Override
    public boolean aeU() {
        return (this.an & 2) != 0;
    }

    @Override
    public ax_0 aBE() {
        ax_0 ax_02 = ax_0.lH(this.HC);
        return ax_02 == null ? ax_0.arQ : ax_02;
    }

    @Override
    public boolean oO() {
        return (this.an & 4) != 0;
    }

    @Override
    public long aBF() {
        return this.apX;
    }

    @Override
    public boolean aaz() {
        return (this.an & 8) != 0;
    }

    @Override
    public kW aaA() {
        return this.Fc == null ? kW.aen() : this.Fc;
    }

    @Override
    public lh aaB() {
        return this.Fc == null ? kW.aen() : this.Fc;
    }

    @Override
    public boolean aBG() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public String aBH() {
        Object object = this.aqa;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.aqa = string;
        }
        return string;
    }

    @Override
    public ByteString aBI() {
        Object object = this.aqa;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.aqa = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.aeU()) {
            this.Y = 0;
            return false;
        }
        if (!this.oO()) {
            this.Y = 0;
            return false;
        }
        if (this.aaz() && !this.aaA().isInitialized()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.apU);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeEnum(2, this.HC);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt64(4, this.apX);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeMessage(5, (MessageLite)this.aaA());
        }
        if ((this.an & 0x10) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)6, (Object)this.aqa);
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.apU);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeEnumSize((int)2, (int)this.HC);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt64Size((int)4, (long)this.apX);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeMessageSize((int)5, (MessageLite)this.aaA());
        }
        if ((this.an & 0x10) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)6, (Object)this.aqa);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Ab)) {
            return super.equals(object);
        }
        Ab ab = (Ab)object;
        if (this.aBC() != ab.aBC()) {
            return false;
        }
        if (this.aBC() && this.aBD() != ab.aBD()) {
            return false;
        }
        if (this.aeU() != ab.aeU()) {
            return false;
        }
        if (this.aeU() && this.HC != ab.HC) {
            return false;
        }
        if (this.oO() != ab.oO()) {
            return false;
        }
        if (this.oO() && this.aBF() != ab.aBF()) {
            return false;
        }
        if (this.aaz() != ab.aaz()) {
            return false;
        }
        if (this.aaz() && !this.aaA().equals(ab.aaA())) {
            return false;
        }
        if (this.aBG() != ab.aBG()) {
            return false;
        }
        if (this.aBG() && !this.aBH().equals(ab.aBH())) {
            return false;
        }
        return this.unknownFields.equals((Object)ab.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + Ab.aBB().hashCode();
        if (this.aBC()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.aBD());
        }
        if (this.aeU()) {
            n = 37 * n + 2;
            n = 53 * n + this.HC;
        }
        if (this.oO()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashLong((long)this.aBF());
        }
        if (this.aaz()) {
            n = 37 * n + 5;
            n = 53 * n + this.aaA().hashCode();
        }
        if (this.aBG()) {
            n = 37 * n + 6;
            n = 53 * n + this.aBH().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static Ab es(ByteBuffer byteBuffer) {
        return (Ab)aqc.parseFrom(byteBuffer);
    }

    public static Ab cG(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Ab)aqc.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Ab eh(ByteString byteString) {
        return (Ab)aqc.parseFrom(byteString);
    }

    public static Ab cG(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Ab)aqc.parseFrom(byteString, extensionRegistryLite);
    }

    public static Ab cI(byte[] byArray) {
        return (Ab)aqc.parseFrom(byArray);
    }

    public static Ab cG(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Ab)aqc.parseFrom(byArray, extensionRegistryLite);
    }

    public static Ab gm(InputStream inputStream) {
        return (Ab)GeneratedMessageV3.parseWithIOException(aqc, (InputStream)inputStream);
    }

    public static Ab gm(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Ab)GeneratedMessageV3.parseWithIOException(aqc, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Ab gn(InputStream inputStream) {
        return (Ab)GeneratedMessageV3.parseDelimitedWithIOException(aqc, (InputStream)inputStream);
    }

    public static Ab gn(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Ab)GeneratedMessageV3.parseDelimitedWithIOException(aqc, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Ab cG(CodedInputStream codedInputStream) {
        return (Ab)GeneratedMessageV3.parseWithIOException(aqc, (CodedInputStream)codedInputStream);
    }

    public static Ab jS(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Ab)GeneratedMessageV3.parseWithIOException(aqc, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public Ad aBJ() {
        return Ab.aBK();
    }

    public static Ad aBK() {
        return aqb.aBL();
    }

    public static Ad a(Ab ab) {
        return aqb.aBL().c(ab);
    }

    public Ad aBL() {
        return this == aqb ? new Ad() : new Ad().c(this);
    }

    protected Ad cG(GeneratedMessageV3.BuilderParent builderParent) {
        Ad ad = new Ad(builderParent);
        return ad;
    }

    public static Ab aBM() {
        return aqb;
    }

    public static Parser<Ab> z() {
        return aqc;
    }

    public Parser<Ab> getParserForType() {
        return aqc;
    }

    public Ab aBN() {
        return aqb;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cG(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aBL();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aBJ();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aBL();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aBJ();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aBN();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aBN();
    }

    static /* synthetic */ boolean aBO() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(Ab ab) {
        return ab.unknownFields;
    }
}

