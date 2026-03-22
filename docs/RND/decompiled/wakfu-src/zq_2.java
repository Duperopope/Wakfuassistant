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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from zq
 */
public final class zq_2
extends GeneratedMessageV3
implements zt_2 {
    private static final long anQ = 0L;
    int an;
    public static final int anR = 1;
    int anS;
    public static final int anT = 2;
    List<zy_2> anU;
    public static final int anV = 3;
    List<zy_2> anW;
    public static final int anX = 4;
    int anY;
    private byte Y = (byte)-1;
    private static final zq_2 anZ = new zq_2();
    @Deprecated
    public static final Parser<zq_2> aoa = new zr_2();

    zq_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private zq_2() {
        this.anU = Collections.emptyList();
        this.anW = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new zq_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    zq_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block14: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block14;
                    }
                    case 8: {
                        this.an |= 1;
                        this.anS = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 18: {
                        if ((n & 2) == 0) {
                            this.anU = new ArrayList<zy_2>();
                            n |= 2;
                        }
                        this.anU.add((zy_2)codedInputStream.readMessage(zy_2.aox, extensionRegistryLite));
                        continue block14;
                    }
                    case 26: {
                        if ((n & 4) == 0) {
                            this.anW = new ArrayList<zy_2>();
                            n |= 4;
                        }
                        this.anW.add((zy_2)codedInputStream.readMessage(zy_2.aox, extensionRegistryLite));
                        continue block14;
                    }
                    case 32: {
                        this.an |= 2;
                        this.anY = codedInputStream.readInt32();
                        continue block14;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue;
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
            if ((n & 2) != 0) {
                this.anU = Collections.unmodifiableList(this.anU);
            }
            if ((n & 4) != 0) {
                this.anW = Collections.unmodifiableList(this.anW);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor ayh() {
        return zp_2.anM;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zp_2.anN.ensureFieldAccessorsInitialized(zq_2.class, zs_2.class);
    }

    @Override
    public boolean ayi() {
        return (this.an & 1) != 0;
    }

    @Override
    public int ayj() {
        return this.anS;
    }

    @Override
    public List<zy_2> ayk() {
        return this.anU;
    }

    @Override
    public List<? extends zb_2> ayl() {
        return this.anU;
    }

    @Override
    public int aym() {
        return this.anU.size();
    }

    @Override
    public zy_2 ku(int n) {
        return this.anU.get(n);
    }

    @Override
    public zb_2 kv(int n) {
        return this.anU.get(n);
    }

    @Override
    public List<zy_2> ayn() {
        return this.anW;
    }

    @Override
    public List<? extends zb_2> ayo() {
        return this.anW;
    }

    @Override
    public int ayp() {
        return this.anW.size();
    }

    @Override
    public zy_2 kw(int n) {
        return this.anW.get(n);
    }

    @Override
    public zb_2 kx(int n) {
        return this.anW.get(n);
    }

    @Override
    public boolean ayq() {
        return (this.an & 2) != 0;
    }

    @Override
    public int ayr() {
        return this.anY;
    }

    public final boolean isInitialized() {
        int n;
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.ayi()) {
            this.Y = 0;
            return false;
        }
        if (!this.ayq()) {
            this.Y = 0;
            return false;
        }
        for (n = 0; n < this.aym(); ++n) {
            if (this.ku(n).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        for (n = 0; n < this.ayp(); ++n) {
            if (this.kw(n).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        int n;
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.anS);
        }
        for (n = 0; n < this.anU.size(); ++n) {
            codedOutputStream.writeMessage(2, (MessageLite)this.anU.get(n));
        }
        for (n = 0; n < this.anW.size(); ++n) {
            codedOutputStream.writeMessage(3, (MessageLite)this.anW.get(n));
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(4, this.anY);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n;
        int n2 = this.memoizedSize;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        if ((this.an & 1) != 0) {
            n2 += CodedOutputStream.computeInt32Size((int)1, (int)this.anS);
        }
        for (n = 0; n < this.anU.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.anU.get(n)));
        }
        for (n = 0; n < this.anW.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((MessageLite)this.anW.get(n)));
        }
        if ((this.an & 2) != 0) {
            n2 += CodedOutputStream.computeInt32Size((int)4, (int)this.anY);
        }
        this.memoizedSize = n2 += this.unknownFields.getSerializedSize();
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof zq_2)) {
            return super.equals(object);
        }
        zq_2 zq_22 = (zq_2)object;
        if (this.ayi() != zq_22.ayi()) {
            return false;
        }
        if (this.ayi() && this.ayj() != zq_22.ayj()) {
            return false;
        }
        if (!this.ayk().equals(zq_22.ayk())) {
            return false;
        }
        if (!this.ayn().equals(zq_22.ayn())) {
            return false;
        }
        if (this.ayq() != zq_22.ayq()) {
            return false;
        }
        if (this.ayq() && this.ayr() != zq_22.ayr()) {
            return false;
        }
        return this.unknownFields.equals((Object)zq_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + zq_2.ayh().hashCode();
        if (this.ayi()) {
            n = 37 * n + 1;
            n = 53 * n + this.ayj();
        }
        if (this.aym() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.ayk().hashCode();
        }
        if (this.ayp() > 0) {
            n = 37 * n + 3;
            n = 53 * n + this.ayn().hashCode();
        }
        if (this.ayq()) {
            n = 37 * n + 4;
            n = 53 * n + this.ayr();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static zq_2 ek(ByteBuffer byteBuffer) {
        return (zq_2)aoa.parseFrom(byteBuffer);
    }

    public static zq_2 cy(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (zq_2)aoa.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static zq_2 dZ(ByteString byteString) {
        return (zq_2)aoa.parseFrom(byteString);
    }

    public static zq_2 cy(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (zq_2)aoa.parseFrom(byteString, extensionRegistryLite);
    }

    public static zq_2 cA(byte[] byArray) {
        return (zq_2)aoa.parseFrom(byArray);
    }

    public static zq_2 cy(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (zq_2)aoa.parseFrom(byArray, extensionRegistryLite);
    }

    public static zq_2 fW(InputStream inputStream) {
        return (zq_2)GeneratedMessageV3.parseWithIOException(aoa, (InputStream)inputStream);
    }

    public static zq_2 fW(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zq_2)GeneratedMessageV3.parseWithIOException(aoa, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zq_2 fX(InputStream inputStream) {
        return (zq_2)GeneratedMessageV3.parseDelimitedWithIOException(aoa, (InputStream)inputStream);
    }

    public static zq_2 fX(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zq_2)GeneratedMessageV3.parseDelimitedWithIOException(aoa, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zq_2 cy(CodedInputStream codedInputStream) {
        return (zq_2)GeneratedMessageV3.parseWithIOException(aoa, (CodedInputStream)codedInputStream);
    }

    public static zq_2 ju(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zq_2)GeneratedMessageV3.parseWithIOException(aoa, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public zs_2 ays() {
        return zq_2.ayt();
    }

    public static zs_2 ayt() {
        return anZ.ayu();
    }

    public static zs_2 a(zq_2 zq_22) {
        return anZ.ayu().c(zq_22);
    }

    public zs_2 ayu() {
        return this == anZ ? new zs_2() : new zs_2().c(this);
    }

    protected zs_2 cy(GeneratedMessageV3.BuilderParent builderParent) {
        zs_2 zs_22 = new zs_2(builderParent);
        return zs_22;
    }

    public static zq_2 ayv() {
        return anZ;
    }

    public static Parser<zq_2> z() {
        return aoa;
    }

    public Parser<zq_2> getParserForType() {
        return aoa;
    }

    public zq_2 ayw() {
        return anZ;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cy(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.ayu();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.ays();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.ayu();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.ays();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ayw();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ayw();
    }

    static /* synthetic */ boolean cs() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean ju() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean Y() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(zq_2 zq_22) {
        return zq_22.unknownFields;
    }
}

